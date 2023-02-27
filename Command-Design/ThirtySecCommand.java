package command;

/**
 * The ThirtySecCommand class is a 'command' that sets the stopwatch to run for
 * thirty seconds when ran
 * Implements Command interface and implements the execute method
 */
public class ThirtySecCommand implements Command {

    private StopWatch stopWatch;

     /**
     * Constructs new FiveMinCommand object with stopwatch 
     * 
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