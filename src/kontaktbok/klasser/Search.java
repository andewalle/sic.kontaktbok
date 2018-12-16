package kontaktbok.klasser;

import java.util.Iterator;
import java.util.Scanner;

public class Search {
    public void find(){
        List list = new List();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vill du söka på 1. Person eller 2. Företag?");
        int val = sc.nextInt();

        if (val == 1) {
            Iterator<Person> it = list.personList.iterator();
            System.out.println("Skriv in namn för sökning: ");
            String name = sc.next();
            int i = 0;

            while (it.hasNext()){

                Person p = it.next();
                if (p.getName().equalsIgnoreCase(name)){
                    System.out.println(i + ". "+ p.toString());
                    i++;
                }
            }
        }
        if (val == 2) {
            Iterator<Business> it = list.businessList.iterator();
            System.out.println("Skriv in namn för sökning: ");
            String name = sc.next();
            int i = 0;

            while (it.hasNext()){

                Business b = it.next();
                if (b.getName().equalsIgnoreCase(name)){
                    System.out.println(i + ". "+ b.toString());
                    i++;
                }
            }
        }
    }
}