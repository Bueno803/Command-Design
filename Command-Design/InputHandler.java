import java.util.HashMap; // import the HashMap class

/**
 * Responsible for handling user input and executing
 * the appropriate command
 */
public class InputHandler {

    private HashMap<String, Command> commands = new HashMap<String, Command>();

    /**
     * Constructs new FiveMinCommand object with stopwatch
     * Creates new instances of the ThirtySecCommand, OneMinCommand, and
     * FiveMinCommand classes and adds them to the commands HashMap
     * 
     * @param watch the stopwatch
     */
    public InputHandler(StopWatch watch) {
        ThirtySecCommand thirtyCom = new ThirtySecCommand(watch);
        OneMinCommand oneCom = new OneMinCommand(watch);
        FiveMinCommand fiveCom = new FiveMinCommand(watch);
        commands.put("30", thirtyCom);
        commands.put("1", oneCom);
        commands.put("5", fiveCom);
    }

    /**
     * Checks if the given input string corresponds to a valid command
     * in the commands HashMap.
     * 
     * @param data the input string
     * @return true if input corresponds to command, false otherwise
     */
    public boolean inputEntered(String data) {
        if (commands.containsKey(data)) {
            commands.get(data).execute();
            return true;
        }
        return false;
    }

}