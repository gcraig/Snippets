public class ConsoleProgressPercent {

    public static void main(String[] args) {

        System.out.println("Ready? ... Go");

        System.out.println();

        for (int i = 0; i < 10000000; i++) {
            System.out.print("Progress ... " + i + "%\r");
        }
    }
}

