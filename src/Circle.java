public class Circle {
    double radius;

    void main(String[] args) {
        Circle circle1 = new Circle(18);
        Circle circle2 = new Circle();

        System.out.println(circle1);
        System.out.println(circle2);
    }

    public Circle(){
        setRadius(15);
    }

    public Circle(double radiusIn){
        setRadius(radiusIn);
    }

    double getRadius(){
        return radius;
    }

    void setRadius(double radius_In){
        radius = radius_In;
    }

    double calculateDiameter(){
        return getRadius() * 2;
    }

    double calculateCircumference(){
        return 2 * Math.PI * getRadius();
    }

    double calculateArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public String toString() {
        return "\nRadius = " + getRadius() +
                "\nDiameter = " + calculateDiameter() +
                "\nArea = " + calculateArea() +
                "\nCircumference = " + calculateCircumference();
    }
}


