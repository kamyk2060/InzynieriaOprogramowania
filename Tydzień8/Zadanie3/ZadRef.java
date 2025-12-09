package com.company;

public class Main {
    public static void main(String[] args) {
        Figura[] figury = {
            new Trojkat(4, 3, 5),
            new Prostokat(10, 5),
            new Kolo(3)
        };

        for (Figura figura : figury) {
            System.out.println(figura.pobierzOpis() + " wynosi " + figura.obliczPole());
        }
    }
}

abstract class Figura {
    public abstract double obliczPole();
    public abstract String pobierzNazwe();
    
    public String pobierzOpis() {
        return "Pole " + pobierzNazwe();
    }
}

class Prostokat extends Figura {
    private double dlugosc;
    private double szerokosc;
    
    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }
    
    @Override
    public double obliczPole() {
        return dlugosc * szerokosc;
    }
    
    @Override
    public String pobierzNazwe() {
        return "prostokąta";
    }
    
    public double getDlugosc() {
        return dlugosc;
    }
    
    public double getSzerokosc() {
        return szerokosc;
    }
}

class Kolo extends Figura {
    private double promien;
    
    public Kolo(double promien) {
        this.promien = promien;
    }
    
    @Override
    public double obliczPole() {
        return Math.PI * promien * promien;
    }
    
    @Override
    public String pobierzNazwe() {
        return "koła";
    }
    
    public double getPromien() {
        return promien;
    }
}

class Trojkat extends Figura {
    private double bokA;
    private double bokB;
    private double bokC;
    
    public Trojkat(double bokA, double bokB, double bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }
    
    @Override
    public double obliczPole() {
        double p = (bokA + bokB + bokC) / 2;
        return Math.sqrt(p * (p - bokA) * (p - bokB) * (p - bokC));
    }
    
    @Override
    public String pobierzNazwe() {
        return "trójkąta";
    }
    
    public double getBokA() {
        return bokA;
    }
    
    public double getBokB() {
        return bokB;
    }
    
    public double getBokC() {
        return bokC;
    }
}