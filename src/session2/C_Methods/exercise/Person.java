package session2.C_Methods.exercise;
import feedback.Feedback;

/**
 * Start from Person class in A_ClassesAndObjects.
 *     - Add a method that returns whether the person is or not under the legal age (18 years old).
 *     - Add a method that returns a string formatted as ”Anders, Madsen, 28, Above Legal Age”
 */
class Person {

    String firstName;
    String lastName;
    int age;

    boolean legalAge(){
        return this.age>= 18;
    }
    String information(){
        String out = this.firstName + ", " + this.lastName + ", " + this.age + ", ";
        if(this.legalAge()){
            out += "Above legal age";
            return out;
        }
        else{
           return out +=  "Not above legal age";
        }
    }

    public static void main(String[] args) {

        //Create the object
        Person person = new Person();
        person.firstName="Anders";
        person.lastName = "Madsen";
        person.age=28;
        System.out.println(person.information());
        //String out = person.toStringOutput();
        //System.out.println(out);


        Person person2 = new Person();
        person2.firstName="Andres";
        person2.lastName = "Masegosa";
        person2.age=41;
        System.out.println(person2.information());
        //String out2 = person2.toStringOutput();
        //System.out.println(out2);

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/


        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_C_Methods", I_did_finish, I_did_understand, comment);


    }

}
