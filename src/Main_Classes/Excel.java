package Main_Classes;

import Sort.ISort;
import Sort.Reflect;
import masses.Base_Mass;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class for result sort and importing data to excel
 *
 * Created by Zhenya on 12.11.2015.
 */
public class Excel {/*
    public static void ImportToExcel(int size ) throws IOException {
        ArrayList<ISort> i = null;
        ArrayList<Base_Mass> k = null;
        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("mySheet");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Zhenya\\worksapce_NetCracker\\Symon_lab01\\my.xls");
        try {
            k = Reflect.MassFinder();
            i = Reflect.SortFinder();
            Row row = sheet.createRow(0);
            Cell SIZE = row.createCell(0);
            SIZE.setCellValue(Integer.toString(size));
            for(int j= 0;j<i.size();j++){
                Row row1 = sheet.createRow(j+1);
            //    Cell sortName = row1.createCell(0);
           //     sortName.setCellValue(i.get(j).getName());
                for(int f=0;f<k.size();f++) {
                    Cell MassName = row.createCell(f+1);
                    MassName.setCellValue(k.get(f).getName());
                    Cell time = row1.createCell(f+1);
                    time.setCellValue(i.get(j).Sort(k.get(f).GetMass(size)));
                }
            }
            wb.write(fos);
            fos.close();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }



    }*/

    /**
     * Sort the list of the massives which made in {@link Reflect#MassFinder()} by list of the sort methods from {@link Reflect#SortFinder()} and importing the data to the excel
     * @param a - size of first mass
     * @param b - size of second mass
     * @param c - size of third mass
     * @throws IOException
     */
    public static void NewSortExcel(int a, int b, int c) throws IOException {
        int[] sizes = {a, b, c};
        ArrayList<ISort> i = null;
        ArrayList<Base_Mass> k = null;
        Workbook wb = new HSSFWorkbook();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Zhenya\\worksapce_NetCracker\\Symon_lab01\\my(v2).xls");
        try {
            k = Reflect.MassFinder();
            i = Reflect.SortFinder();
            for (int j = 0; j < i.size(); j++) {
                Sheet sheet = wb.createSheet(i.get(j).getName());
                for (int f = 0; f < k.size(); f++) {
                    if (f == 0) {
                        Row row = sheet.createRow(0);
                        Cell masssize1 = row.createCell(1);
                        masssize1.setCellValue(Integer.toString(a));
                        Cell masssize2 = row.createCell(2);
                        masssize2.setCellValue(Integer.toString(b));
                        Cell masssize3 = row.createCell(3);
                        masssize3.setCellValue(Integer.toString(c));
                    }
                    Row row1 = sheet.createRow(f + 1);
                    Cell massname = row1.createCell(0);
                    massname.setCellValue(k.get(f).getName());
                    for (int m = 0; m < sizes.length; m++) {
                        Cell time = row1.createCell(m + 1);
                        time.setCellValue(i.get(j).Sort(k.get(f).GetMass(sizes[m])));
                    }
                }

            }

            wb.write(fos);
            fos.close();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

