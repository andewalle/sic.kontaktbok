package kontaktbok.klasser;

import java.util.ArrayList;
import java.util.Iterator;

    public class List {
        ArrayList<Person> personList = new ArrayList<Person>();
        public void listPerson(){

            Iterator<Person> it = personList.iterator();
            int i = 1;
            while (it.hasNext()){
                System.out.println(i +". "+it.next().toString());
                i++;
            }
        }
        ArrayList<Business> businessList = new ArrayList<Business>();

        public void listBusiness(){

            Iterator<Business> itc = businessList.iterator();
            int i = 1;
            while (itc.hasNext()){
                System.out.println(i + ". " + itc.next().toString());
                i++;
            }
        }
    }

