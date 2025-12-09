package z21;

import java.util.ArrayList;
import java.util.List;

public class Z21 {
    public static void main(String[] args) {
        List<Produkt> produkty = new ArrayList<>();
        
        produkty.add(new Produkt("bułka", 0.50, 0.05));
        produkty.add(new Produkt("ananas", 4.77, 0.08));
        produkty.add(new Produkt("pepsi", 3.21, 0.22));
        
        for (Produkt produkt : produkty) {
            System.out.println(produkt.pobierzOpis());
        }
    }
}

/**
 * Klasa reprezentująca produkt w sklepie internetowym
 */
class Produkt {
    private String nazwa;
    private double cenaNetto;
    private double stawkaVAT;
    
    /**
     * Konstruktor tworzący nowy produkt
     * 
     * @param nazwa nazwa produktu
     * @param cenaNetto cena netto produktu
     * @param stawkaVAT stawka VAT (np. 0.23 dla 23%)
     */
    public Produkt(String nazwa, double cenaNetto, double stawkaVAT) {
        this.nazwa = nazwa;
        this.cenaNetto = cenaNetto;
        this.stawkaVAT = stawkaVAT;
    }
    
    /**
     * Oblicza cenę brutto produktu
     * 
     * @return cena brutto
     */
    public double obliczCeneBrutto() {
        return cenaNetto * (1 + stawkaVAT);
    }
    
    /**
     * Oblicza wartość podatku VAT dla produktu
     * 
     * @return wartość podatku VAT
     */
    public double obliczWartoscVAT() {
        return cenaNetto * stawkaVAT;
    }
    
    /**
     * Zwraca tekstowy opis produktu z jego cenami
     * 
     * @return sformatowany opis produktu
     */
    public String pobierzOpis() {
        return String.format("%s - cena netto: %.2f zł, stawka VAT: %.0f%%, cena brutto: %.2f zł, VAT: %.2f zł",
                nazwa, cenaNetto, stawkaVAT * 100, obliczCeneBrutto(), obliczWartoscVAT());
    }
    
    // Gettery dla pól klasy
    public String getNazwa() {
        return nazwa;
    }
    
    public double getCenaNetto() {
        return cenaNetto;
    }
    
    public double getStawkaVAT() {
        return stawkaVAT;
    }
}