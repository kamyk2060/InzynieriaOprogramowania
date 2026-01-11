import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperStos stos = new SuperStos();
        
        stos.push("hello");
        stos.push(124);
        stos.push("world");
        stos.push(4335);

        System.out.println(stos.pop2()); // 4335
        System.out.println(stos.pop2()); // world
        System.out.println(stos.pop2()); // 124
        System.out.println(stos.pop2()); // hello

        System.out.println("dalej");
        stos.push("hello");
        stos.push(124);
        stos.push("world");
        stos.push(4335);

        // stos.clear(); // NIEDOZWOLONE - kompozycja chroni przed niepożądanymi operacjami

        System.out.println(stos.pop2()); // 4335
        System.out.println(stos.pop2()); // world
        System.out.println(stos.pop2()); // 124
        System.out.println(stos.pop2()); // hello
    }
}

class SuperStos {
    // Kompozycja zamiast dziedziczenia
    private List<Object> lista = new ArrayList<>();
    
    public void push(Object x) {
        lista.add(x);
    }
    
    public Object pop2() {
        if (lista.size() < 2) {
            return null;
        } else {
            Object x = lista.get(lista.size() - 2);
            lista.remove(lista.size() - 2);
            return x;
        }
    }
}