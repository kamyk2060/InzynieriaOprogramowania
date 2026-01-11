//ukrycie delegata
package com.company;

public class Main {

    public static void main(String[] args) {
	departament ksiegowosc= new departament("ksiegowosc","Jan Nowak");
        pracownik pracownik1= new pracownik("Adam","Kowalski",ksiegowosc);
        System.out.println(pracownik1.depart.kierownik);

    }
}


class pracownik
{
    String imie;
    String nazwisko;
    departament depart;

    pracownik(String iImie, String iNazwisko, departament iDepartament)
    {
            imie=iImie;
            nazwisko=iNazwisko;
            depart=iDepartament;
    }

}

class departament
{
    String nazwa;
    String kierownik;

    departament(String iNazwa,String iKierownik)
    {
        nazwa=iNazwa;
        kierownik=iKierownik;
    }

}