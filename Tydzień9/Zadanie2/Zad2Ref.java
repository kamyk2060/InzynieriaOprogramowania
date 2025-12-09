import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();
        Student S3 = new Student();
        Doktorant D1 = new Doktorant();
        Doktorant D2 = new Doktorant();

        NauczycielAkademicki N1 = new NauczycielAkademicki();
        Profesor P1 = new Profesor();

        N1.dodajStudenta(S1);
        N1.dodajStudenta(S2);
        P1.dodajStudenta(S3);
        P1.dodajStudenta(D1);
        
        // To rzuci wyjątek - nauczyciel nie może mieć doktoranta
        N1.dodajStudenta(D2);
    }
}

class Student {
    int ID;
}

class Doktorant extends Student {
}

class NauczycielAkademicki {
    private Vector prowadzeniStudenci;
    
    NauczycielAkademicki() {
        prowadzeniStudenci = new Vector();
    }

    void dodajStudenta(Student prowadzonyStudent) {
        // SPRAWDZENIE: czy to nie jest doktorant
        if (prowadzonyStudent instanceof Doktorant) {
            System.out.println("BŁĄD: Tylko profesor może prowadzić doktorantów!");
            return; // Nie dodajemy
        }
        
        prowadzeniStudenci.add(prowadzonyStudent);
        System.out.println("Dodano studenta");
    }
}

class Profesor extends NauczycielAkademicki {
    @Override
    void dodajStudenta(Student prowadzonyStudent) {
        // Profesor może dodawać WSZYSTKICH, więc nie sprawdzamy        
    }
}