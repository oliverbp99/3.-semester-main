import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 7, 1);

        int sum = numbers.stream().mapToInt(number -> number).sum();
        System.out.println(sum);

        int sumParallelized = numbers.parallelStream().mapToInt(number -> number).sum();

        System.out.println(sumParallelized);

        double averageTemp = numbers.parallelStream().mapToInt(number -> number).average().getAsDouble();
        System.out.println(averageTemp);

        List<Integer> squareNumbers = numbers.stream().map(number -> number * number).collect(Collectors.toList());
        System.out.println(squareNumbers);

        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());

        System.out.println(evenNumbers);

        List<Integer> oddNumbers = numbers.stream().filter(number -> number % 2 == 1).collect(Collectors.toList());

        System.out.println(oddNumbers);

        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());

        IntSummaryStatistics summary = numbers.parallelStream().mapToInt(number -> number).summaryStatistics();
        System.out.println(summary);
    }
}
