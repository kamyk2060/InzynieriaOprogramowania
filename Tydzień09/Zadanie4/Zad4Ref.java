package javaapplication4;

import java.util.ArrayList;
import java.util.List;

public class JavaApplication4 {

    public static void main(String[] args) {
        List<Zwierze> zwierzeta = new ArrayList<>();
        
        Zwierze kot = new Kot("Mruczek");
        Zwierze pies = new Pies("Burek");
        Zwierze krowa = new Krowa("Milka");
        Zwierze owca = new Owca("Dolly");
        
        zwierzeta.add(kot);
        zwierzeta.add(pies);
        zwierzeta.add(krowa);
        zwierzeta.add(owca);
        
        for (Zwierze z : zwierzeta) {
            z.dajGlos();
        }
    }
}

// Interfejs lub klasa abstrakcyjna dla wszystkich zwierząt
abstract class Zwierze {
    protected String imie;
    protected String nazwa;
    
    public Zwierze(String nazwa, String imie) {
        this.nazwa = nazwa;
        this.imie = imie;
    }
    
    // Metoda abstrakcyjna - każde zwierzę musi ją zaimplementować
    public abstract void dajGlos();
    
    public String toString() {
        return nazwa + " " + imie;
    }
}

// Specyficzne klasy dla każdego typu zwierzęcia
class Kot extends Zwierze {
    public Kot(String imie) {
        super("kot", imie);
    }
    
    @Override
    public void dajGlos() {
        System.out.println(nazwa + " " + imie + " robi miauuuu");
    }
}

class Pies extends Zwierze {
    public Pies(String imie) {
        super("pies", imie);
    }
    
    @Override
    public void dajGlos() {
        System.out.println(nazwa + " " + imie + " robi chauu");
    }
}

class Krowa extends Zwierze {
    public Krowa(String imie) {
        super("krowa", imie);
    }
    
    @Override
    public void dajGlos() {
        System.out.println(nazwa + " " + imie + " robi muuu");
    }
}

class Owca extends Zwierze {
    public Owca(String imie) {
        super("owca", imie);
    }
    
    @Override
    public void dajGlos() {
        System.out.println(nazwa + " " + imie + " robi beee");
    }
}