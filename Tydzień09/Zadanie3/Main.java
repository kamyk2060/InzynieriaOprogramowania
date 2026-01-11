//UWAGA: Proszę nie korzystać z domyślnych klas Javy związanych z listami :) 

public class Main {

    public static void main(String[] args) {
    //Tworzymy listę kandydatów do tronu UK
    osoba PK=new osoba("ksiaze Walii", "Karol");
    osoba PW=new osoba("ksiaze Cambridge", "Wilhelm");
    osoba PG=new osoba("ksiaze", "Gorge");
    osoba PK1=new osoba("ksiezniczka", "Karolina");

    listaOsob KandydaciDoTronu= new listaOsob(PK);
    KandydaciDoTronu.dodajKolejnaOsobe(PW);
    KandydaciDoTronu.dodajKolejnaOsobe(PG);
    KandydaciDoTronu.dodajKolejnaOsobe(PK1);
    //W czym jest problem: otóż teraz można wykonać coś takiego jak w dwóch poniższych liniach (tzn. dodać do listy osób obiekt klasy element)
    //element X=new element();
    //KandydaciDoTronu.addElement(X);
    //Oczywiście zakomentowany kod powyżej spowoduje później błąd rzutowania (choć sam kod się wykona), ale nie jest dobrze,
    //by w ogóle klasa listaOsob miała możliwość dodania do spisu obiektu nie będącego osobą (a teraz się da). Proszę pomyśleć
    //jak to poprawić


    osoba temp=KandydaciDoTronu.getPierwszaOsoba();
    while(temp!=null)
    {
        System.out.println(temp.toString());
        temp=(osoba)temp.getNastepny();
    }

    }
}

class element
{
    private element nastepny;
    public element getNastepny()
    {
        return nastepny;
    }
    public void setNastepny(element iNastepny)
    {
        nastepny=iNastepny;
    }
}

class LinkedList
{
    private element first;
    private element last;

    LinkedList(element iFirst)
    {
        first=iFirst;
        last=iFirst;
    }

    public element getFirst()
    {
        return  first;
    }

    public void addElement(element iNowy)
    {
        last.setNastepny(iNowy);
        last=iNowy;
    }
}

class osoba extends element
{
    private String imie;
    //private String nazwisko;     //to w sumie bez sensu :)
    private String tytul;

    public osoba(String iTytul, String iImie)
    {
        tytul=iTytul;
        imie=iImie;
    }

    @Override
    public String toString() {
        return tytul+"  "+imie;
    }
}

class listaOsob extends  LinkedList
{
    public listaOsob(osoba pierwszaOsoba)
    {
        super(pierwszaOsoba);
    }

    public void dodajKolejnaOsobe(osoba nowaOsoba)
    {
        addElement(nowaOsoba);
    }

    public osoba getPierwszaOsoba()
    {
        return (osoba)getFirst();
    }
}

