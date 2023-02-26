import java.util.HashMap; // import the HashMap class

public class InputHandler {

    private HashMap<String, Command> commands = new HashMap<String, Command>();

    public InputHandler(StopWatch watch) {
        ThirtySecCommand thirtyCom = new ThirtySecCommand(watch);
        OneMinCommand oneCom = new OneMinCommand(watch);
        FiveMinCommand fiveCom = new FiveMinCommand(watch);
        commands.put("30", thirtyCom);
        commands.put("1", oneCom);
        commands.put("5", fiveCom);
    }

    public boolean inputEntered(String data) {
        if (commands.containsKey(data)) {
            return true;
        }
        return false;
    }

}
