class Signal extends Thread {
    String color;

    Signal(String color) {
        this.color = color;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(color + " Signal");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class TrafficSignal {
    public static void main(String[] args) {

        Signal red = new Signal("RED");
        Signal yellow = new Signal("YELLOW");
        Signal green = new Signal("GREEN");

        red.start();

        try {
            red.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        yellow.start();

        try {
            yellow.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        green.start();
    }
}
