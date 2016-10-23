package masses;

/**
 * Abstract class wich give the behavior for all mass-generating classes
 */
public abstract class Base_Mass {
	/**
	 *
	 * @param size size of the generated massive
	 * @return integer massive
     */
	public abstract int[] GetMass(int size);
	/**Method which return the name of the massive*/
	public abstract String getName();
}
