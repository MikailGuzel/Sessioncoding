package session2.Exercises.Exercise1;

class Square {
    double width;

    Square(double w) {

        this.width = w;
    }

    String circumferenceandArea() {
        double circumference = this.width * 4;
        double area = this.width * this.width;
        String out = "Square \n Area: " + area + "\nCircumference: " + circumference;
        return out;
    }
}
