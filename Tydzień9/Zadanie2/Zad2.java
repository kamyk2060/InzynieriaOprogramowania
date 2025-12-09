/*
Wyobraźmy sobie sytuację, w której modelujemy system do monitorowania ile prac dyplomowych studentów ma dany
nauczyciel akademicki (robimy tu pewne uproszczenia do sytuacji rzeczywistej).
Są dwa rodzaje prac: magisterskie i doktorskie. Pracę magisterską może prowadzić każdy nauczyciel akademicki.
Pracę doktorską tylko profesor.
 */

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	 Student S1=new Student();
	 Student S2=new Student();
	 Student S3=new Student();
	 Doktorant D1=new Doktorant();
	 Doktorant D2=new Doktorant();

	 NauczycielAkademicki N1=new NauczycielAkademicki();
	 Profesor P1=new Profesor();

	 N1.dodajStudenta(S1);
	 N1.dodajStudenta(S2);
	 P1.dodajStudenta(S3);
	 P1.dodajStudenta(D1);

	 N1.dodajStudenta((D2)); //upss to nie powinno być możliwe prace doktorskie mogą prowadzić tylko profesorowie
        // Proszę to jakoś poprawić. Na razie możemy pominąć problem, że dany student może być wpisany do kilku nauczycieli na raz.

    }

}

class Student
{
    int ID;

}

class Doktorant extends  Student
{

}

class NauczycielAkademicki
{
    private Vector prowadzeniStudenci;
    NauczycielAkademicki()
    {
       prowadzeniStudenci=new Vector();
    }

    void dodajStudenta(Student prowadzonyStudent)
    {
        prowadzeniStudenci.add(prowadzonyStudent);
    }
}

class Profesor extends  NauczycielAkademicki
{

}
