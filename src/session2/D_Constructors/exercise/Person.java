package session2.D_Constructors.exercise;


import feedback.Feedback;

/**
 * Exercise:
 *  * Now a Person can have a first name, a last name and, optionally, a middle name.
 *  a) Create two constructors for this class.
 *      * A constructor to create Person objects with middle name.
 *      * A constructor to create Person objects without middle name.
 *  b) Add a method that return true/false to indicate if the person has or does not have a middle name.
 *  c) Add a method that outputs the person's information as a string formatted as:
 *      * E.g. ”Anders, Madsen” if there is no middle name.
 *      * E.g. ”Anders, M., Madsen” if there is a middle name.
 **/
class Person {
    String firstName;
    String middleName;
    String lastName;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    Person(String f, String m, String l) {
        this.firstName = f;
        this.middleName = m;
        this.lastName = l;
    }

    Person(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    boolean hasmiddleName() {
        return this.middleName == null;
    }

    String information() {
        if (hasmiddleName()) {
            return this.firstName + " " + this.lastName + "" + " has no middle name";
        }
        else{
            return this.firstName + " "+ this.middleName.charAt(0)+ ". " + this.lastName + " has a middle name";
        }
    }


    public static void main(String[] args) {

    Person p1 = new Person( "Anders", "Hans", "Madsen");
    Person p2 = new Person( "Christian", "Larsen");

    System.out.println(p1.information());
    System.out.println(p2.information());

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/


        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_D_Constructors", I_did_finish, I_did_understand, comment);


    }
}
