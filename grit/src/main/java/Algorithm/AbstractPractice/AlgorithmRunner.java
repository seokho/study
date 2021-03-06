package Algorithm.AbstractPractice;

/**
 * Created by odol on 2016. 11. 23..
 */
public class AlgorithmRunner {
    public static void main(String[] args) {
        Algorithm fibonacci = AlgorithmFactory.getAlgorithm(
                new FibonacciFactory(new int[]{10}));
        System.out.println(fibonacci.getResult());

        Algorithm sectionSumMax = AlgorithmFactory.getAlgorithm(
                new SectionSumMaxFactory(new int[]{-7, 4, -3, 6, 3, -8, 3, 5, -2}));
        System.out.println(sectionSumMax.getResult());

        Algorithm transferHexa = AlgorithmFactory.getAlgorithm(
                new TransferFactory(new int[]{450}));
        System.out.println(transferHexa.getResult());

    }
}
