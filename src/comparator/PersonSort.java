package comparator;

import java.util.Comparator;

public class PersonSort {
    public static void main(String[] args) {

        // sort first by lastname, then firstname and then by age

        Comparator<Person> personComparator = Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getFirstName)
                .thenComparing(Person::getAge).reversed();

        Person p1 = new Person("Vishal" ,"Siroha", 18);
        Person p2 = new Person("Harshit" ,"Sen", 19);

        personComparator.compare(p1, p2);


    }
}
