package hwLesson31;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Circle circle1 = new Circle(4);


        Shape rect = new Rectangler(7,10);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

       Shape[] shapes = {circle,rect,circle1};
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("total shape is "+shapeCalculator.totalSquare(shapes));
    }
}
