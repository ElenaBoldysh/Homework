public class TriangleArea {
    public static double area(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
        double p = (a + b + c) / 2; // полупериметр
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
