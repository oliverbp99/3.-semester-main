import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public MethodReference(String content){
        System.out.println(content);
    }

    public static void outStaticVersion(String content){
        System.out.println(content);
    }

    public void out(String content){
        System.out.println(content);
    }

    public static void main(String[] args) {
        List<String> greetings = Arrays.asList("Hello world", "Godmorgen");

        //greetings.forEach((greeting) -> System.out.println(greeting));

        //greetings.forEach(MethodReference::outStaticVersion);
        //greetings.forEach(new MethodReference()::out);
        //greetings.forEach(MethodReference::new);

        greetings.forEach(System.out::println);
    }
}
