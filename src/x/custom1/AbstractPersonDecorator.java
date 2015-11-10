package x.custom1;

/**
 * This is the general contract for all Person decorators. It basically
 * says all decorator implementations MUST have the methods declared below.
 * 
 * @author jlombardo
 */
public abstract class AbstractPersonDecorator extends Person {
    
    public abstract String getFullName();
    
    public abstract String toString();
    
}
