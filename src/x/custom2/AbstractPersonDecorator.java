package x.custom2;

/**
 * This is the general contract for all Person decorators. It basically
 * says all decorator implementations MUST have the methods declared below.
 * 
 * Notice that we switched to an interface and the decorator pattern
 * still works.
 * 
 * @author jlombardo
 */
public interface AbstractPersonDecorator extends Person {
    
    public abstract String getFullName();
    
    public abstract String toString();
    
}
