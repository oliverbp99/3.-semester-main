import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpringStream {
    public static void main(String[] args) {
        List<String> coolWords = Arrays.asList("Yo", "Guobin", "ok", "ok", "ok", "");

        List<String> onlyWords = coolWords.stream().filter(word -> !word.isEmpty()).collect(Collectors.toList());

        System.out.println(onlyWords);

        long vocabulary = coolWords.stream().filter(word -> word.length() > 0).distinct().count();
        System.out.println(vocabulary);

        String sentence = coolWords.parallelStream().filter(word -> !(word.equals(""))).collect(Collectors.joining(" "));

        System.out.println(sentence);

    }
}
