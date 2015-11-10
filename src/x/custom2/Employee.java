package x.custom2;

/**
 * This is one of our base classes. This is similar to HouseBlend in the
 * Starbuzz Coffee example.
 * 
 * @author jlombardo
 */
public class Employee implements Person {
    private String firstName;
    private String lastName;
    private String employeeId;
    
    public Employee(String firstName, String lastName, String id) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmployeeId(id);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

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
