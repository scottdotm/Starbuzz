package x.custom2;

/**
 * This is the super class type for all of our base classes. Remember,
 * base classes are the things to be decorated. So in the Starbuzz Coffe
 * example the things to be decorated were the various Beverages. Here, it's
 * various types of Persons.
 * 
 * Notice that we switched to an interface and the decorator pattern
 * still works.
 * 
 * @author jlombardo
 */
public interface Person {

    public abstract String getFirstName();

    public abstract void setFirstName(String firstName);

    public abstract String getLastName();

    public abstract void setLastName(String lastName);

    /**
     * This is the method that we'll use to provided the new behavior through
     * the Decorator Pattern. Through the magic of polymorphism we can
     * alter the implementation in our decorators to do various things. This
     * is similar to the way the cost() method was modified in the Starbuzz
     * Coffee example.
     * 
     * @return description of person
     */
    public abstract String toString();
    
    
}
