package Sort;

import masses.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Zhenya on 24.11.2015.
 */
public class RecSortTest {

    @Test
    public void testSort() throws Exception {
        int[]test =new int[10];
        ArrayList<Base_Mass> arrayList = new ArrayList<>();
        Base_Mass sorted = new Sorted_mass();
        Base_Mass sortedWithRnd = new Sorted_with_rnd();
        Base_Mass reverse_mass = new Reverse_mass();
        Base_Mass random = new Random_mass();
        arrayList.add(sorted);
        arrayList.add(sortedWithRnd);
        arrayList.add(reverse_mass);
        arrayList.add(random);
        for (int i = 0; i < arrayList.size(); i++) {
            RecSort rs = new RecSort();
            int[] sortedtest = arrayList.get(i).GetMass(10);
            rs.Sort(sortedtest);

            for(int j=1;j<sortedtest.length;j++){
                assertTrue(sortedtest[j-1]<=sortedtest[j]);
            }


        }
    }
}