import java.util.ArrayList;

public class Systemos {

    public static class out{
        public static void println(int content){
            System.out.println(content);
        }

        public static void println(String content){
            System.out.println(content);
        }

        public static void println(double content){
            System.out.println(content);
        }

        public static void println(boolean content){
            System.out.println(content);
        }

        public static void println(char content){
            System.out.println(content);
        }

        public static void println(Word word){
            System.out.println(word);
        }

        public static void println(String[] ord){
            for (String s : ord){
                System.out.println(s + " ");
            }
        }

        public static void println(ArrayList<Word> ord1) {
            System.out.println(ord1);
        }
    }
}
