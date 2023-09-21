package session2.Exercises.Exercise1;

class Rectangle {
    double width;
    double length;

    Rectangle(double w, double l) {
        this.width = w;
        this.length = l;
    }

    String circumferenceandArea() {
        double circumference = this.length * 2 + this.width * 2;
        double area = this.width * this.length;
        String out = "Rectangle \n Area: " + area + "\nCircumference: " + circumference;
        return out;
    }

    public static void main(String[] args) {
        Square s1 = new Square(5);
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(5, 4);

        // Call circumferenceandArea on instances and print the results
        System.out.println(s1.circumferenceandArea());
        System.out.println(c1.circumferenceandArea());
        System.out.println(r1.circumferenceandArea());
    }

}
