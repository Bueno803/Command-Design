/**
 * The ThirtySecCommand class is a 'command' that sets the stopwatch to run for
 * thirty seconds when ran
 * Implements Command interface and implements the execute method
 */
public class ThirtySecCommand implements Command {

    private StopWatch stopWatch;

     /**
     * A ThirtySecCommand method which constructs an object instance of type StopWatch 
     * @param watch the stopwatch
     */
    public ThirtySecCommand(StopWatch watch) {
        this.stopWatch = watch;
    }

    /**
     * Sets the stopwatch to run for five minutes.
     */
    @Override
    public void execute() {
        stopWatch.countDownThirtySec();
    }
}