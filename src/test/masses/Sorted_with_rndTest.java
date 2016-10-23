package masses;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zhenya on 24.11.2015.
 */
public class Sorted_with_rndTest {

    @Test
    public void testGetMass() throws Exception {
        Sorted_with_rnd arr = new Sorted_with_rnd();
        int[] a = arr.GetMass(10);
        for (int i = 1; i < a.length - 1; i++) {
            assertTrue(((a[i - 1] + 1) == a[i]) || ((a[a.length - 1] + 1) != a[a.length])); ;


        }

    }


}