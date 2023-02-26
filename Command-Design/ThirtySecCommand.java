public class ThirtySecCommand implements Command {

    private StopWatch stopWatch;

    public ThirtySecCommand(StopWatch watch) {
        this.stopWatch = watch;
    }

    @Override
    public void execute() {
        stopWatch.countDownThirtySec();
    }
}
