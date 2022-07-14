import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {


    @Test
    public void addTest() {
        Afisha afisha = new Afisha();
        afisha.add("Bladshot");
        afisha.add("Vpered");
        afisha.add("Hotel Belgrad");
        String[] actual = afisha.findAll();
        String[] expected = {"Bladshot", "Vpered", "Hotel Belgrad"};
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void lastTest() {
        Afisha afisha = new Afisha();
        afisha.add("Bladshot");
        afisha.add("Vpered");
        afisha.add("Hotel Belgrad");
        String[] actual = afisha.findLast();
        String[] expected = {"Hotel Belgrad", "Vpered", "Bladshot"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void limitTest() {
        Afisha afisha = new Afisha(2);
        afisha.add("Bladshot");
        afisha.add("Vpered");
        afisha.add("Hotel Belgrad");
        String[] actual = afisha.findAll();
        String[] expected = {"Bladshot", "Vpered", "Hotel Belgrad"};
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void limitMinTest() {
        Afisha afisha = new Afisha();
        afisha.add("Bladshot");
        afisha.add("Vpered");
        afisha.add("Hotel Belgrad");
        afisha.add("Four");
        afisha.add("Five");
        afisha.add("Six");
        afisha.add("Seven");
        afisha.add("Eight");
        afisha.add("Nine");
        afisha.add("Ten");
        afisha.add("Eleven");
        String[] actual = afisha.findLast();
        String[] expected = {"Eleven", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Hotel Belgrad", "Vpered"};
        Assertions.assertArrayEquals(expected, actual);


    }


}
