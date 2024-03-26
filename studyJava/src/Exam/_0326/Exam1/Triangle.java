package Exam._0326.Exam1;

public class Triangle implements Shape{ // 정삼각형일때
    private double base;
    private double length;
    public Triangle() {
    }
    public Triangle(double base, double length) {
        this.base = base;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return base * length * 0.5;
    }

    @Override
    public double calculatePerimeter() {
        return base * 3;
    }
}
