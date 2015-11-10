package x.custom1;

/**
 * This is one of our base classes. This is similar to HouseBlend in the
 * Starbuzz Coffee example.
 * 
 * @author jlombardo
 */
public class Employee extends Person {
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
    
}
