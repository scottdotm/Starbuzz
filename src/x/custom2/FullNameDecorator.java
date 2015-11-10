package x.custom2;

/**
 * This is a decorator implementation of the general contract. Notice that
 * we override the way toString() works. This is how a decorator adds new
 * behavior, without the need to modify the classes being decorated. What
 * we'll be decorating are Person objects. (see the Person property).
 * 
 * @author jlombardo
 */
public class FullNameDecorator implements AbstractPersonDecorator {
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

    public String getFirstName() {
        return decoratedPerson.getFirstName();
    }

    public void setFirstName(String firstName) {
        decoratedPerson.setFirstName(firstName);
    }

    public String getLastName() {
        return decoratedPerson.getLastName();
    }

    public void setLastName(String lastName) {
        decoratedPerson.setFirstName(lastName);
    }
}
