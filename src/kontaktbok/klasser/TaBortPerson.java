package kontaktbok.klasser;

public class TaBortPerson {
    public static void taBort(Personer p){
        for(int i = 0; i < lista.length; i++) {
            if (lista.get(i).equals(p)) {
                lista.remove();
            }
        }
    }

    public static void taBort(int i){
        lista.remove(i);
    }
}
