package masses;

import masses.Base_Mass;

import java.util.Arrays;
/**
 * @autor Zhenya Symon
 * Class for generating sorted mass with random last element
 *
 */
@Fill
public class Sorted_with_rnd extends Base_Mass {
	@Override
	public int[] GetMass(int size) {
		int[] mass = new int[size];
		for(int i=0;i<size-1;i++){
			mass[i]=i+1;
		}
		mass[size-1]=(int) (Math.random()*size);

		return mass;
	}

	@Override
	public String getName() {
		return "Cортированный с рандомом";
	}

}