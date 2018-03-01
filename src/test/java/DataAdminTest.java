import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataAdminTest {

    DataAdmin dataAdmin;

    @Before
    public void before(){
        dataAdmin = new DataAdmin("Tina", "JL000000", 30000.00);
    }

    @Test
    public void getName(){
        assertEquals("Tina", dataAdmin.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("JL000000", dataAdmin.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(30000.00, dataAdmin.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary(){
        dataAdmin.raiseSalary(0.01);
        assertEquals(30300.00, dataAdmin.getSalary() , 0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(300.00, dataAdmin.payBonus(), 0.01);
    }
}
