package kontaktbok.klasser.Test;

import kontaktbok.klasser.Person;

public class PersonTest {

    public static void main(String[] args) {

        String input;
        Integer number;
        String email;


        Person person = null;


        System.out.println("Test 1: Number");

        input = "g708123455";
        number = null;

        try {

            number = Integer.parseInt(input);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println(nfe.getMessage());
        }

        try {
            person = new Person("Jesper", "Hansson", number);
            System.out.println("Test for invalid inputs failed - no exception thrown");
        }
        catch(IllegalArgumentException iae){

            System.out.println("Test successful!");
            System.out.println(iae.getMessage());
        }

        assert person != null : "Create person error";

        if(person != null) {

            System.out.println(person);
            System.out.println();
        }

        System.out.println();
        input = "0708123455";
        number = null;

        System.out.println(input);

        try {

            number = Integer.parseInt(input);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println(nfe.getMessage());
        }

        try {
            person = new Person("Jesper", "Hansson", number);
            System.out.println("Test for invalid inputs failed - no exception thrown");
        }
        catch(IllegalArgumentException iae){

            System.out.println("Test successful!");
            System.out.println(iae.getMessage());
        }

        assert person != null : "Create person error";

        if(person != null) {

            System.out.println(person);
            System.out.println();
        }






        System.out.println();
        System.out.println("Test 2: Email");

        Person person2 = null;
        email = "h.hanssongmail.com";

        System.out.println(email);

        try {
            person2 = new Person("Helena", "Hansson", email);
            System.out.println("Test for invalid inputs failed - no exception thrown");
        }
        catch(IllegalArgumentException iae){

            System.out.println("Test successful!");
            System.out.println(iae.getMessage());
        }

        assert person2 != null : "Create-person error";

        if(person2 != null) {

            System.out.println(person2);
            System.out.println();
        }

        System.out.println();
        person2 = null;
        email = "h.hansson@gmail.com";

        System.out.println(email);

        try {
            person2 = new Person("Helena", "Hansson", email);
            System.out.println("Test for invalid inputs failed - no exception thrown");
        }
        catch(IllegalArgumentException iae){

            System.out.println("Test successful!");
            System.out.println(iae.getMessage());
        }

        assert person2 != null : "Create-person error";

        if(person2 != null) {

            System.out.println(person2);
            System.out.println();
        }


        

        System.out.println();
        System.out.println("Test 3:");

        input = "0709645599";
        number = 0;

        try {

            number = Integer.parseInt(input);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("The number is in the wrong format");
        }

        Person person3 = new Person("Robin", "Hansson", number, "robin-hansson@hotmail.com");
        assert person3 != null : "Create person error";

        if(!person3.getFirstName().equals("Robin"))
        {
            System.out.println("First-name did not save correctly");
        }
        else if(!person3.getLastName().equals("Hansson"))
        {
            System.out.println("Last-name did not save correctly");
        }
        else if(!person3.getEmail().equals("robin-hansson@hotmail.com"))
        {
            System.out.println("Email did not save correctly");
        }
        else if(!person3.getPhoneNumber().equals(input))
        {
            System.out.println("Phone-number did not save correctly");
        }


        if(person3 != null) {

            System.out.println(person3);
            System.out.println();
        }
    }
}
