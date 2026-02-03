public class Circle {
    double radius, diameter, circumference, area, chord_len;

    void main(String[] args) {
        Circle myCircle = new Circle(15);
        System.out.println(myCircle.toString());
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
        String circleInfo;
        StringBuilder sb = new StringBuilder();
        sb.append("Radius = " + getRadius());
        sb.append("\nDiameter = " + calculateDiameter());
        sb.append("\nArea = " + calculateArea());
        sb.append("\nCircumference = " + calculateCircumference());
        circleInfo = sb.toString();
        return circleInfo;
    }
}


