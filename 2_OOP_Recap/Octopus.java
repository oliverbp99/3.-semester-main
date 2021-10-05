import java.util.Random;

public class Octopus extends Animal{
    Random rand = new Random();
    private static final int min = 1;
    private static final int max = 10;

    @Override
    public String move(){
        return "Swish swosh";
    }

    public void makeDoActivity(){
        while (true){
            try {
                String activity = selectActivity();
                System.out.println(activity);
                if (activity.equals("Mate")){
                    System.out.println("Otto is a horny beast");
                    GameOfOctopus gameThread = new GameOfOctopus();
                    gameThread.start();
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String selectActivity(){
        String activity;

        int randomNumber = rand.nextInt(max) + min;

        switch (randomNumber) {
            case 1: activity = "Eat";
                break;
            case 2: activity = "Mate";
                break;
            case 3: activity = "Sleep";
                break;
            case 4, 5: activity = "Jet Ink";
                break;
            default: activity = move();
        }

        return activity;
    }

    /*public String activity(int x){
        if (x == 1){
            return "Dance";
        }else if (x == 2){
            return "jump";
        }else if (x == 3){
            return "walk";
        }else if (x == 4){
            return "spit";
        }else if (x == 5){
            return "orale";
        }else if (x == 6){
            return "bango";
        }
        return "lol";
    }*/
}
