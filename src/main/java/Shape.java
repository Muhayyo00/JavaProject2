
public interface Shape {
    double calculateArea(double n);
    double calculatePerimeter(double n);
}
class Circle implements Shape{
    static double pi=3.14159;
    @Override
    public double calculateArea(double radius) {
        return pi*(radius*radius);
    }
    @Override
    public double calculatePerimeter(double radius) {
        return 2*pi*radius;}}

class Square implements Shape{
@Override
 public double calculateArea(double side){
    return side*side;
}
public double calculatePerimeter(double side){
    return 4*side;
}

    public static void main(String[] args) {
        Circle circle=new Circle();
        double circleArea=circle.calculateArea(4);
        double circlePerimeter=circle.calculatePerimeter(4);
        System.out.println("The area of a circle is "+circleArea);
        System.out.println("The perimeter of a circle is "+circlePerimeter);

        Square square=new Square();
        double squareArea=square.calculateArea(4);
        double squarePerimeter=square.calculatePerimeter(4);
        System.out.println("The area of a square is "+squareArea);
        System.out.println("The perimeter of a square is "+squarePerimeter);

    }}