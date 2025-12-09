//UWAGA: Proszę nie korzystać z domyślnych klas Javy związanych z listami :) 

public class Main {

    public static void main(String[] args) {
        //Tworzymy listę kandydatów do tronu UK
        osoba PK = new osoba("ksiaze Walii", "Karol");
        osoba PW = new osoba("ksiaze Cambridge", "Wilhelm");
        osoba PG = new osoba("ksiaze", "Gorge");
        osoba PK1 = new osoba("ksiezniczka", "Karolina");

        listaOsob KandydaciDoTronu = new listaOsob(PK);
        KandydaciDoTronu.dodajKolejnaOsobe(PW);
        KandydaciDoTronu.dodajKolejnaOsobe(PG);
        KandydaciDoTronu.dodajKolejnaOsobe(PK1);

        // Teraz poniższy kod NIE zadziała, bo listaOsob przyjmuje tylko osoby
        // element X = new element();
        // KandydaciDoTronu.addElement(X); // błąd kompilacji

        osoba temp = KandydaciDoTronu.getPierwszaOsoba();
        while (temp != null) {
            System.out.println(temp.toString());
            temp = temp.getNastepny();
        }
    }
}

class element<T> {
    private T nastepny;

    public T getNastepny() {
        return nastepny;
    }

    public void setNastepny(T iNastepny) {
        nastepny = iNastepny;
    }
}

class LinkedList<T> {
    private T first;
    private T last;

    LinkedList(T iFirst) {
        first = iFirst;
        last = iFirst;
    }

    public T getFirst() {
        return first;
    }

    public void addElement(T iNowy) {
        // Upewniamy się, że last jest typu element, aby wywołać setNastepny
        if (last instanceof element) {
            ((element) last).setNastepny(iNowy);
        }
        last = iNowy;
    }
}

class osoba extends element<osoba> {
    private String imie;
    private String tytul;

    public osoba(String iTytul, String iImie) {
        tytul = iTytul;
        imie = iImie;
    }

    @Override
    public String toString() {
        return tytul + "  " + imie;
    }
}

class listaOsob extends LinkedList<osoba> {
    public listaOsob(osoba pierwszaOsoba) {
        super(pierwszaOsoba);
    }

    public void dodajKolejnaOsobe(osoba nowaOsoba) {
        addElement(nowaOsoba);
    }

    public osoba getPierwszaOsoba() {
        return getFirst();
    }
}