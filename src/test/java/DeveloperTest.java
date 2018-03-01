import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Danny", "JL0000111", 24000.00);
    }

    @Test
    public void getName(){
        assertEquals("Danny", developer.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("JL0000111", developer.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(24000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(240.00, developer.payBonus(), 0.01);
    }

    @Test
    public void raiseSalary(){
        developer.raiseSalary(0.01);
        assertEquals(24240.00, developer.getSalary(), 0.01);
    }

    @Test
    public void setName(){
        developer.setName("Dave");
        assertEquals("Dave", developer.getName());
    }

//    @Test
//    public void nameCannotBeNull(){
//        developer.setName("");
//        assertEquals("", developer.getName());
//    }
}
