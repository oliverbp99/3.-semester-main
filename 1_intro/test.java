import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        /*Systemos.out.println(8);
        Systemos.out.println("hej");
        Systemos.out.println(6.00);
        Systemos.out.println(true);
        Systemos.out.println('a');*/

        Systemos.out.println(new Word("hej"));

        String[] ord = new String[5];
        ArrayList<Word> ord1 = new ArrayList<>();

        ord[0] = "hey";
        ord[1] = "med";
        ord[2] = "dig";
        ord[3] = "ti";
        ord[4] = "hi";

        Systemos.out.println(ord);

        ord1.add(new Word("hey"));
        ord1.add(new Word("du"));

        Systemos.out.println(ord1);
    }
}