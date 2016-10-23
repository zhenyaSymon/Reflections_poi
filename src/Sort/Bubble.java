package Sort;

/**
 * Class for realization "bubble sort"
 */
@SortMethod
public class Bubble implements ISort{

	public double Sort(int[]arr) {
        long start = System.nanoTime();
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;

            }
        }
    }
        long end = System.nanoTime();
        long traceTime = end-start;
        return traceTime;
    }

    @Override
    public String getName() {
        return "Пузырь";
    }

}

	
	

