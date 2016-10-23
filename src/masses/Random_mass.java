package masses;

/**
 * @autor Zhenya Symon
 * Class for generating massive with random elements
 *
 */
@Fill
public class Random_mass extends Base_Mass{

	public int[] GetMass (int size) {
		int[] mass = new int[size];
		for(int i=0;i<size;i++) {
			mass[i] = (int) (Math.random() * 100);

		}
		return mass;
	}

	@Override
	public String getName() {
		return "Cлучайный массив";
	}
}
