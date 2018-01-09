package moneycalculator.control;

/**
 * @author Michael Bueno
 */
public interface Command {
    
    String name();
    void execute();
}
