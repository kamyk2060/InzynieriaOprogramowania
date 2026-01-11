/*
Wyobraźmy sobie że tworzymy aplikację dla małych dzieci, ma ona odtwarzać głosy wybranych zwierząt. 
Przyjmijmy taki oto uproszczony kod. Proszę go zrefaktoryzować, by był łatwiejszy w rozwoju (e.g. dodawanie nowych zwierząt). 
 */

package javaapplication4;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tomek
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<zwierze> zwierzeta= new ArrayList<zwierze>();
        zwierze Kot=new zwierze();
        Kot.N="kot";
        Kot.G=zwierze.KOT;
        Kot.I="Mruczek";
        zwierzeta.add(Kot);
        
        zwierze Pies=new zwierze();
        Pies.N="Pies";
        Pies.G=zwierze.PIES;
        Pies.I="Burek";
        zwierzeta.add(Pies);

        zwierze Krowa=new zwierze();
        Krowa.N="Krowa";
        Krowa.G=zwierze.KROWA;
        Krowa.I="Milka";
        zwierzeta.add(Krowa);

        zwierze owca=new zwierze();
        owca.N="owca";
        owca.G=zwierze.OWCA;
        owca.I="Dolly";
        zwierzeta.add(owca);     

        for(zwierze Z : zwierzeta)
        {
            dajGlos(Z);
        }
}

    static void dajGlos(zwierze Z)
    {            
            if(Z.G==1)
            {  
                System.out.println(Z.N+" "+Z.I+" robi "+ " miauuuu ");
            }
            if(Z.G==2)
            {  
                System.out.println(Z.N+" "+Z.I+" robi "+ " chauu ");
            }
            if(Z.G==3)
            {  
                System.out.println(Z.N+" "+Z.I+" robi "+ " muuu ");
            }
            if(Z.G==4)
            {  
                System.out.println(Z.N+" "+Z.I+" robi "+ " beee ");
            }
    } 

}

class zwierze
{
    final static int KOT=1;
    final static int PIES=2;
    final static int KROWA=3;
    final static int OWCA=4;
    public String N; //Nazwa
    public int G; //Gatunek 
    public String I;//Imie
 }


