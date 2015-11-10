package x.custom2;

/**
 * This example is the same as the previous one, but uses interfaces 
 * instead of abstract classes.
 * 
 * @author jlombardo
 */
public class Startup {
    public static void main(String[] args) {
        
        // First, let's create a person object and output it's
        // first name and last name separately
        Person p1 = new Employee("John", "Doe", "5");
        System.out.println("Output from base object: " + p1);
        
        // Now let's decorate the person object so that we can extend
        // what it can do without modifying the Person or Employee class.
        // The additional behavior provides a full name. But here, we're
        // using this new behavior indirectl via the toString() method.
        // See the FullNameDecorator for details.
        p1 = new FullNameDecorator(p1);
        System.out.println("\nOutput from Decorated object: " + p1);
        
        // We can also directly use the new behavior, getFullName(), by
        // casting our person to the decorator that contains the new
        // behavior. But this is more rigid than the previous example.
        FullNameDecorator fnd  = (FullNameDecorator)p1;
        System.out.println("\nOutput from Decorated object: " + fnd.getFullName());
    }
}
