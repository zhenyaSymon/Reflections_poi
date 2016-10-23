package Sort;
/**
 * Class for realization "swap sort"
 */
@SortMethod
public class SwapSort implements ISort{

	public double Sort(int[] arr) {
		long start = System.nanoTime();
	    for(int i = 1; i < arr.length; i++){
	        int currElem = arr[i];
	        int prevKey = i - 1;
	            while(prevKey >= 0 && arr[prevKey] > currElem){
	                arr[prevKey+1] = arr[prevKey];
	                arr[prevKey] = currElem;
	                prevKey--;
	            }
	    }
		long end = System.nanoTime();
		long traceTime = end-start;
		return traceTime;
	}

	@Override
	public String getName() {
		return "Вставкой";
	}

}
