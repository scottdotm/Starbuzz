package x.custom1;

/**
 * This is the super class type for all of our base classes. Remember,
 * base classes are the things to be decorated. So in the Starbuzz Coffe
 * example the things to be decorated were the various Beverages. Here, it's
 * various types of Persons.
 * 
 * @author jlombardo
 */
public abstract class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This is the method that we'll use to provided the new behavior through
     * the Decorator Pattern. Through the magic of polymorphism we can
     * alter the implementation in our decorators to do various things. This
     * is similar to the way the cost() method was modified in the Starbuzz
     * Coffee example.
     * 
     * @return description of person
     */
    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
    
}
