package kontaktbok.klasser.Test;

import kontaktbok.klasser.Company;
import org.junit.jupiter.api.Test;

public class CompanyTest {

    Integer number;

    @Test
    public void testCompanyNumber()
    {
        String input = "0765123456";
        number = numberParsing(input);

        Company company = new Company("Ica", number);
    }

    public Integer numberParsing(String input)
    {
        try {

            number = Integer.parseInt(input);
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println("Invalid number");
        }

        return number;
    }
}
