package deleteit;

public class Main {
    public static void main(String[] args) {
        String pathway = "grr*appp**hicsz*";
        String clearedPathway = clearPathway(pathway);
        System.out.println(clearedPathway);

    }

    private static String clearPathway(String pathway) {
        StringBuilder nonAsteriods = new StringBuilder();

        for(int i = 0; i<pathway.length(); i++) {
            char curr = pathway.charAt(i);
            if(curr == '*') {
                // Delete last non-asteriod
                if(nonAsteriods.length() > 0) {
                    nonAsteriods.deleteCharAt(nonAsteriods.length() - 1);
                }
            } else {
                nonAsteriods.append(curr);
            }
        }
        return nonAsteriods.toString();
    }
}
