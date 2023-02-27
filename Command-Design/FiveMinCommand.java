/**
 * The FiveMinCommand class is a 'command' that sets the stopwatch to run for
 * five minutes when ran
 * Implements Command interface and implements the execute method
 */
public class FiveMinCommand implements Command {

    private StopWatch stopWatch;

    /**
     * A FiveMinCommand method which constructs an object instance of type StopWatch 
     * @param watch the stopwatch
     */
    public FiveMinCommand(StopWatch watch) {
        this.stopWatch = watch;
    }

    /**
     * Sets the stopwatch to run for five minutes.
     */
    @Override
    public void execute() {
        stopWatch.countDownFiveMin();
    }
}