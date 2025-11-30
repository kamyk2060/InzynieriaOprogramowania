package javaapplication1;

public class Trojkat {
    private double a;
    private double h;
    
    public Trojkat(double a, double h) {
        this.a = a;
        this.h = h;
    }
    
    public double getA() { return a; }
    public double getH() { return h; }
    public double getPole() { return 0.5 * a * h; }
    
    @Override
    public String toString() {
        return String.format("podstawa: %.1f wysokość: %.1f pole: %.1f", a, h, getPole());
    }
}