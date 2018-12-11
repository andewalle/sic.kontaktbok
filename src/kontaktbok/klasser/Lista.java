package kontaktbok.klasser;

import java.util.ArrayList;
import java.util.Iterator;

public class Lista {

    ArrayList list = new ArrayList(Personer);

    public void sökObjekt(){

        Iterator<Personer> it = list.iterator();
        int i = 1;

        while (it.hasNext()){
            System.out.println(i +". "+it.next().toString());
            i++;
        }
    }
}
