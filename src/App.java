public class App {
    public static void main(String[] args) throws Exception {
        Triangle triangle = new Triangle();
        double area = triangle.calcArea(30, 35);
        System.out.println("Area: " + area);
    }
}
