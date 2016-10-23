package masses;

/**
		* @autor Zhenya Symon
		* Class for generating sorted  massive
		*
		*/
@Fill
public class Sorted_mass extends Base_Mass {
	@Override
	public int[] GetMass(int size) {
		int[] mass = new int[size];
		for (int i = 0; i < size; i++) {
			mass[i] = i + 1;

		}
		return mass;
	}

	@Override
	public String getName() {

		return "Cортированный массив";
	}


}