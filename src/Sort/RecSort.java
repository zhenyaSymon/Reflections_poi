package Sort;
/**
 * Class for realization "quick sort"
 */
@SortMethod
public class RecSort implements ISort {
    public void qSort(int[] array, int l, int r) {
        int i = l;
        int j = r;
        int x = array[l + (int) (Math.random() * (r - l + 1))];
        while (i <= j) {
            while (array[i] < x) {
                i++;
            }
            while (array[j] > x) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (l < j) {
            qSort(array, l, j);
        }
        if (i < r) {
            qSort(array, i, r);
        }
    }

    @Override
    public double Sort(int[] arr) {
        // TODO Auto-generated method stub

        long start = System.nanoTime();
        qSort(arr, 0, arr.length - 1);
        long end = System.nanoTime();
        long traceTime = end - start;


        return traceTime;
    }

    @Override
    public String getName() {
        return "Рекурсивная";
    }


}
