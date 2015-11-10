package x.custom1;

/**
 * This is a decorator implementation of the general contract. Notice that
 * we override the way toString() works. This is how a decorator adds new
 * behavior, without the need to modify the classes being decorated. What
 * we'll be decorating are Person objects. (see the Person property).
 * 
 * @author jlombardo
 */
public class FullNameDecorator extends AbstractPersonDecorator {
    private Person decoratedPerson;
    
    public FullNameDecorator(Person p) {
        decoratedPerson = p;
    }
    
    public String getFullName() {
        return decoratedPerson.getFirstName() + " " +
                decoratedPerson.getLastName();
    }
    
    @Override
    public String toString() {
        return getFullName(); 
    }
}
