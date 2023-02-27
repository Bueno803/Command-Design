package command;

/**
 * The OneMinCommand class which simulates a clock counting down from one minute.
 * @author Caleb Brunson
 */
public class OneMinCommand implements Command {

    private StopWatch stopWatch;

     /**
     * A OneMinCommand method which constructs an object instance of type StopWatch 
     * @param watch the stopwatch
     */
    public OneMinCommand(StopWatch watch) {
        this.stopWatch = watch;
    }

    /**
     * Sets the stopwatch to run for five minutes.
     */
    @Override
    public void execute() {
        stopWatch.countDownOneMin();
    }
}