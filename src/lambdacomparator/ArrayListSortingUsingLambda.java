package lambdacomparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortingUsingLambda {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("AAVaibhav", "Diwan", 81),
                new Student("Ramesh", "Sharma", 35),
                new Student("Suresh", "Sharma", 56)
        );
        Comparator<Student> firstNameComparator = (o1, o2) ->
                o1.getFirstName().compareTo(o2.getFirstName());
        studentList.sort(firstNameComparator);
        System.out.println("sorted by firstname");
        for (Student student : studentList) {
            System.out.println(student);
        }


        studentList.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        System.out.println("sorted by lastname");
        for (Student student : studentList) {
            System.out.println(student);
        }

        studentList.sort((o1, o2) -> Integer.compare(o2.getRollNo(), o1.getRollNo()));
        System.out.println("sorted by roll no");
        for (Student student : studentList) {
            System.out.println(student);
        }




    }
}
