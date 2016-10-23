package masses;

/**
 * @autor Zhenya Symon
 * Class for generating reverse massive
 *
 */
@Fill
public class Reverse_mass extends Base_Mass {
	@Override
	public int[] GetMass(int size) {
		int[] mass = new int[size];
		int j=1;

		for(int i=size-1;i>=0;i--){

			mass[i]=j;
			j++;
		}
		mass[0]=(int) (Math.random()*(size+1));
		return mass;
	}

	@Override
	public String getName() {

		return "Обратный массив";
	}

}