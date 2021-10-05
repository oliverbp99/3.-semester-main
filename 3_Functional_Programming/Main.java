import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // anonym klasse
        AbstractClass abstactClassImplemented = new AbstractClass() {
            @Override
            public void makeSurrealArt() {

            }
        };

        // implementation of a ()functional inter face
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String firstString, String secondString) {
                return firstString.compareTo(secondString);
            }
        };
        System.out.println(comparator.compare("a", "b"));

        Comparator<String> lamdaComparator = (String firstString, String secondString) -> firstString.compareTo(secondString);
        System.out.println(lamdaComparator.compare("a", "b"));

        Concatenator concat = (firstString, secondString) -> firstString + secondString;

        System.out.println(concat.cat("jan", "jan"));
        /*AbstractClass abstractClassImplemented = new AbstractClass() {
            @Override
            public void makeSurrealArt() {
                System.out.println("Created by dali!");
            }
        };

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String firstString, String secondString) {
                return firstString.compareTo(secondString);
            }
        };

        System.out.println(stringComparator.compare("Hello", "world"));

        Comparator<String> stringComparatorLamda = (String firstString, String secondString) -> firstString.compareTo(secondString);*/
    }
}
