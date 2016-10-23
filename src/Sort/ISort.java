package Sort;
/**
 * Interface for giving behavior to all classes which make a sort
 * @autor Zhenya Symon
 *
 */
public interface ISort {
	/**
	 *
	 * @param arr massive from the list which generated in {@link Reflect#MassFinder()} ()}
	 * @return method's run time
     */
	public double Sort(int []arr);
	/**
	 * Method which return the name of sorting method
	 */
	public String getName();
}
