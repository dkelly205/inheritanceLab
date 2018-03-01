import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Robert", "JL111111", 50000.00, "Finance", 200000.00);
    }

    @Test
    public void getName(){
        assertEquals("Robert", director.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("JL111111", director.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(50000.00, director.getSalary(), 0.01);
    }

    @Test
    public void getDeptName(){
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void getBudget(){
        assertEquals(200000.00, director.getBudget(), 0.01);
    }

    @Test
    public void payDirectorBonus(){
        assertEquals(500.00, director.payBonus(), 0.01);
    }

    @Test
    public void raiseDirectorSalary(){
        director.raiseSalary(0.01);
        assertEquals(50500.00, director.getSalary(), 0.01);
    }
}
