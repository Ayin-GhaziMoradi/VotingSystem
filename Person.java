public class Person {
    private String firstName;
    private String lastName;

    /**
     * Person Constructor
     * @param firstName person's first name (string)
     * @param lastName person's last name (string)
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     *
     * @return person's first name as a string
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return person's last name as a string
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * get person's full name
     * @return person's full name as a String
     */
    public String toString(){
        return (getFirstName() + " " + getLastName());
    }
}
