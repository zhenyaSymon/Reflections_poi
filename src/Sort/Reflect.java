package Sort;

import masses.Base_Mass;
import masses.Fill;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.Set;

/**
 * Class for searching mass-generators and sort methods
 * Created by Zhenya on 10.11.2015.
 *
 */
public class Reflect {
    /**
     * Add the objects of all classes with {@link SortMethod} annotation
     * @return list which contain all sort methods from the program
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static  ArrayList<ISort> SortFinder() throws IllegalAccessException,InstantiationException{ //detect all sort methods
        Reflections reflections = new Reflections("Sort");
       Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(SortMethod.class);
        ArrayList<ISort> AllSorts =new ArrayList<ISort>();
        for(Class<?> sort : annotated){
            AllSorts.add((ISort)(sort.newInstance()));
        }
        return AllSorts;

    }

    /**
     * Add the objects of all classes with {@link masses.Fill} annotation
     * @return list which contain all mass-generators from the program
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static ArrayList<Base_Mass> MassFinder() throws IllegalAccessException,InstantiationException{ //detect all mass generators
        Reflections reflections = new Reflections("masses");
        Set<Class<?>> fillers = reflections.getTypesAnnotatedWith(Fill.class);
        ArrayList<Base_Mass> AllMasses =new ArrayList<Base_Mass>();
            for(Class<?> mass : fillers ){
                AllMasses.add((Base_Mass)(mass.newInstance()));
            }
        return AllMasses;
    }
}
