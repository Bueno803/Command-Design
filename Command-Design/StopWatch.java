import java.util.concurrent.TimeUnit;

/**
 * The StopWatch class provides a simple stopwatch that can be used to time
 * different intervals
 */
public class StopWatch {

    /**
     * Constructs new StopWatch object
     */
    public StopWatch() {

    }

    /**
     * Starts a one-minute countdown on this StopWatch object.
     */
    public void countDownOneMin() {
        for (int i = 60; i > 0; i--) {
            System.out.print("00:");
            try {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println(i);
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Starts a five-minute countdown on this StopWatch object.
     */
    public void countDownFiveMin() {
        for (int i = 600; i > 0; i--) {
            try {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println(i);
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
        }
    }

    /**
     * Starts a thirty-second countdown on this StopWatch object.
     */
    public void countDownThirtySec() {
        for (int i = 30; i > 0; i--) {
            try {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println(i);
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
        }

    }

}