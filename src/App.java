public class App {
    public static void main(String[] args) throws Exception {
        Triangle triangle = new Triangle();
        triangle.setBase(30);
        triangle.setHeight(35);
        double area = triangle.calcArea();
        System.out.println("Area: " + area);
    }
}
