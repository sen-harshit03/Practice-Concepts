package switchexp;

import java.util.List;

/**
 * Switch statement vs Switch Expression
 *
 * Statement doesn't care about completeness but expression does.
 * That being said if we don't include default in the expression, it won't compile.
 *
 * The above statement is partially true, in case using switch expression in enums, we have covered all the cases then
 * we don't have to write the default.
 *
 * In general, it's not a good practice to write default in such cases. By default compiler adds one for you which throws
 * a runtime exception.
 */
public class GradeSimulator {
    public static void main(String[] args) {
        List.of(100, 98, 87, 75, 64, 52, 45)
                .stream()
                .map(GradeSimulator::calculateGradeUsingSwitchExpression)
                .forEach(System.out::println);
    }

    private static String calculateGradeUsingSwitchExpression(int score) {
        String grade = switch (score / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> {
                System.out.println("This student is failed");
                yield "F";  // yield to 'return' from switch expression
            }
        };

        return "The grade of score " + score + " is " + grade;

    }

    private static String calculateGradeUsingSwitchStatement(int score) {

        String grade = "F";

        switch (score/10) {
            case 10, 9: grade = "A";
            break;
            case 8: grade = "B";
            break;
            case 7: grade = "C";
            break;
            case 6: grade = "D";
            break;
            default: grade = "F";
        }
        return "The grade of score " + score + " is " + grade;

    }



    private static String calculateGradeUsingIfElse(int score) {
        String grade = "F";
        if (score >= 90) {
            grade = "A";
        } else {
            if (score >= 80) {
                grade = "B";
            } else {
                if (score >= 70) {
                    grade = "C";
                } else {
                    if (score >= 60) {
                        grade = "D";
                    } else {
                        grade = "F";
                    }
                }
            }
        }

        return "The grade of score " + score + " is " + grade;
    }
}

