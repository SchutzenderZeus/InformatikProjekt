public class Quiz {//Text adventure mit Quiz


    static int points = 3;

    public static void main(String[] args) {
        waitMilliseconds(1000);
        System.out.print("Hello");
        makePoints(500, " ~???");
        waitMilliseconds(1000);
        System.out.print("\nYou have a choice to make");
        makePoints(500, " ~???");
        System.out.print("\n\nWould you like to"
                        + "\n a) Leave your House"
                        + "\n b) Go upstairs"
                        + "\n c) Wait");



    }



    public static void waitMilliseconds(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void makePoints(int millis1, String str) {
        for (int i = 0; i < points; i++){
            waitMilliseconds(millis1);
            System.out.print(".");
        }
        waitMilliseconds(millis1);
        System.out.print(str);
    }


}

