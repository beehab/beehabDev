package school.definitions;

import school.business.PERSON;
import school.business.junior_high;

import java.util.Scanner;

public  class JuniorHighData extends PERSON  implements junior_high {

    @Override
    public void teachSubject() {

    }

    @Override
    public void teachBranch() {

    }

    @Override
    public void removePerson(PERSON p) {

    }

    @Override
    public void enroll(Student s) {
        Scanner scanner = new Scanner(System.in);

        // ask the name of the student
        System.out.print("Enter student name: ");
        String name = scanner.next();

        // ask the last name
        System.out.print("Enter student last name: ");
        String lastName = scanner.next();

        System.out.println(name + " " + lastName + " is enrolled in junior high");
    }



    public void removePerson() {

    }

    public String toString(){
        return "name: " + name + "\n" +
                "age: " + age  + "\n" +
                "grade: " + gradeLevel;
    }
}


