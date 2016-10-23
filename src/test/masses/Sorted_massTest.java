package masses;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zhenya on 22.11.2015.
 */
public class Sorted_massTest {

    @Test
    public void testGetMass() throws Exception {
        Sorted_mass arr = new Sorted_mass();
        int[] mass = arr.GetMass(10);
        for(int i=1;i<mass.length;i++){
            assertEquals(mass[i-1]+1,mass[i]);
        }
    }
}