package Sort;
/**
 * Class for realization "merge sort"
 */
@SortMethod
public class MergeSort  implements ISort{

	public double Sort(int[] arr){
		long start = System.nanoTime();
		MSort(arr, 0, arr.length);
		long end = System.nanoTime();
		long traceTime = end-start;
		return traceTime;
	}

	@Override
	public String getName() {
		return "Cлияние";
	}

	public void MSort(int[] a, int low, int high) {
	        if (low + 1 < high) {
	            int mid = (low + high) >>> 1;
	           MSort(a, low, mid);
	           MSort(a, mid, high);
	 
	            int size = high - low;
	            int[] b = new int[size];
	            int i = low;
	            int j = mid;
	            for (int k = 0; k < size; k++) {
	                if (j >= high || i < mid && a[i] < a[j]) {
	                    b[k] = a[i++];
	                } else {
	                    b[k] = a[j++];
	                }
	            }
	            System.arraycopy(b, 0, a, low, size);
	        }
	        
	    }

	

}
