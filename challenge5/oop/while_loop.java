package challenge2.oop;

public class while_loop {
    public static void main(String[] args) throws InterruptedException {
        int countdown = 10;

        System.out.println("🚀 Rocket Launch Countdown!");

        while (countdown >= 0) {
            System.out.println("T-minus " + countdown + " seconds...");
            Thread.sleep(1000); // Wait 1 second
            countdown--;
        }

        System.out.println("Liftoff! 🚀🔥");
    }
}

