package com.company;

public class Main {
    public static void main(String[] args) {
        Departament ksiegowosc = new Departament("ksiegowosc", "Jan Nowak");
        Pracownik pracownik1 = new Pracownik("Adam", "Kowalski", ksiegowosc);
        
        // Zamiast: System.out.println(pracownik1.depart.kierownik);
        System.out.println(pracownik1.getKierownikDepartamentu());
        System.out.println(pracownik1.getNazwaDepartamentu());
    }
}

class Pracownik {
    private String imie;
    private String nazwisko;
    private Departament departament;

    public Pracownik(String imie, String nazwisko, Departament departament) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.departament = departament;
    }

    // Gettery dla danych pracownika
    public String getImie() {
        return imie;
    }
    
    public String getNazwisko() {
        return nazwisko;
    }
    
    // Metody ukrywające delegata (Departament)
    public String getKierownikDepartamentu() {
        return departament.getKierownik();
    }
    
    public String getNazwaDepartamentu() {
        return departament.getNazwa();
    }
    
    public Departament getDepartament() {
        return departament;
    }
}

class Departament {
    private String nazwa;
    private String kierownik;

    public Departament(String nazwa, String kierownik) {
        this.nazwa = nazwa;
        this.kierownik = kierownik;
    }
    
    public String getNazwa() {
        return nazwa;
    }
    
    public String getKierownik() {
        return kierownik;
    }
    
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    
    public void setKierownik(String kierownik) {
        this.kierownik = kierownik;
    }
}