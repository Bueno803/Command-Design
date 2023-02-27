package command;

/**
 * The OneMinCommand class is a 'command' that sets the stopwatch to run for
 * one minute when ran
 * Implements Command interface and implements the execute method
 */
public class OneMinCommand implements Command {

    private StopWatch stopWatch;

     /**
     * Constructs new FiveMinCommand object with stopwatch 
     * 
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