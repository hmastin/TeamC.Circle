public class Circle {
    // the area calculation is radius^2 * pi
    // to prevent overflow, the radius can't be larger than
    // sqrt(Double.MAX_VALUE/Math.PI) or 4.2678378161541536E153
    final double RADIUS_MAX = Math.sqrt(Double.MAX_VALUE/Math.PI)+1E137;
    private double radius;


    void main(String[] args) {
        Circle circle1 = new Circle(RADIUS_MAX);

        System.out.println(Double.MAX_VALUE/Math.PI);
        System.out.println(circle1);
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
        if (radius_In <= 0 || radius_In > RADIUS_MAX) {
            this.radius = 1.0;
        }
        else {
            radius = radius_In;
        }
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


