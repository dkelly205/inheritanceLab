import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", "jl070707", 35000.00, "Health and Safety");
    }


    @Test
    public void getName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("jl070707", manager.getNiNumber());
    }

    @Test
    public void getSalary(){
        assertEquals(35000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void getDeptName(){
        assertEquals("Health and Safety", manager.getDeptName());
    }

    @Test
    public void payManagerBonus(){
        assertEquals(350.00, manager.payBonus(), 0.01);
    }

    @Test
    public void raiseManagerSalary(){
        manager.raiseSalary(0.01);
        assertEquals(35350.00, manager.getSalary(), 0.01);
    }

}
