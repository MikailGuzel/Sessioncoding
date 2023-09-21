package session2.A_ClassesAndObjects.exercise;

import feedback.Feedback;

/**
 * a) Write a class to represent a person. A person has a first name, last name, and an age.
 * b) Write code that create a person object and outputs the person's information as a string
 * formatted as ”Anders, Madsen, 28”
 */
public class Person {
    int age;
    String firstName;
    String lastName;
    public static void main(String[] args) {


        Person Anders = new Person();
        Anders.age = 28;
        Anders.firstName = "Anders";
        Anders.lastName = "Madsen";

        System.out.println(Anders.firstName + ", " + Anders.lastName + ", " + Anders.age);


        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_A_Classes", I_did_finish, I_did_understand, comment);

    }

}
