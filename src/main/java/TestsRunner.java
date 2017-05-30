import Generators.Generator;
import Sorters.Sorter;
import org.reflections.Reflections;

import java.util.Set;

public class TestsRunner {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Reflections reflections = new Reflections();
        Set<Class<? extends Generator>> generatorSet = reflections.getSubTypesOf(Generator.class);
        Set<Class<? extends Sorter>> sorterSet = reflections.getSubTypesOf(Sorter.class);
        for (Class<? extends Sorter> sorter : sorterSet) {
            for (Class<? extends Generator> generator : generatorSet) {
                Sorter sortObj = sorter.newInstance();
                Generator generatorObj = generator.newInstance();
                for (int i = 10; i <= 10_000; i *= 10) {
                    long start = System.nanoTime();
                    sortObj.sort(generatorObj.generate(i));
                    long end = System.nanoTime();
                    System.out.println("SorterName: " + sorter.getName() + " GeneratorName: " + generator.getName() +
                            " Size: " + i + " Time:" + (end - start));
                }
            }
            System.out.println();
        }
    }
}