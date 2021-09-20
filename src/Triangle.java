public class Triangle {
    private double base;
    private double height;

    public double calcArea() {
        return base * height / 2;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
