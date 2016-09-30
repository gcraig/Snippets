public class ConsoleProgressPercent {

    public static void main(String... args) {

        System.out.println("Ready? ... Go\n");

        for (int i = 0; i < 10_000_000; i++) {
            System.out.print("Progress ... " + i + "%\r");
        }
    }
}

