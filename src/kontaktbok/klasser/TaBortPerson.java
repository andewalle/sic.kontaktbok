package kontaktbok.klasser;

public class TaBortPerson {
    public static void taBort(Personer p){
        for(int i = 0; i < lista.length; i++) {
            if (lista.get(i).equals(p)) {
                lista.remove(i);
            }
        }
    }

    public static void taBort(int i){
        lista.remove(i);
    }

    public static void taBortViaNamn(String s){
        for(int i = 0; i < lista.length; i++) {
            if (lista.get(i).getNamn().equals(s)) {
                lista.remove(i);
            }
        }
    }

    public static void taBortViaNummer(Personer p){
        for(int i = 0; i < lista.length; i++) {
            if (lista.get(i).getNummer().equals(s)) {
                lista.remove(i);
            }
        }
    }
}
