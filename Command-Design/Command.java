package command;

/**
 * Represents a command that can be executed
 * Classes that implement the Command interface must
 * implement the execute method
 */
public interface Command {
    /**
     * Executes the command
     */
    public void execute();
}
