package session2.Exercises.Exercise1;

public class Circle {
    double radius;
   Circle(double r){
           this.radius = r;
   }
    String circumferenceandArea(){
        double circumference = this.radius*3.14*2;
        double area = this.radius*this.radius*3.14;
        String out = "Circle \n Area: " + area + "\nCircumference: " + circumference;
        return out;
    }
}

