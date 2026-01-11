package javaapplication1;

import java.util.ArrayList;
import java.util.List;

public class MainFile {
    public static void main(String[] args) {
        List<Trojkat> trojkaty = new ArrayList<>();
        trojkaty.add(new Trojkat(10, 12));
        trojkaty.add(new Trojkat(4, 5));
        trojkaty.add(new Trojkat(1, 3));
        trojkaty.add(new Trojkat(7, 2));
        trojkaty.add(new Trojkat(3, 6));
        
        for (Trojkat trojkat : trojkaty) {
            System.out.println(trojkat);
        }
    }
}