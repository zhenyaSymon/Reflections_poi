package Main_Classes;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 *
 *
 * Created by Zhenya on 25.11.2015.
 */
public class ExcelTest {

    @Test
    public void testNewSortExcel() throws Exception {
        File file = new File("C:\\Users\\Zhenya\\worksapce_NetCracker\\Symon_lab01\\my(v2).xls");
        assertTrue(file.length() != 0);

    }
}