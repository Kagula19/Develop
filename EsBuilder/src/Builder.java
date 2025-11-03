public class Builder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Builder setFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }
    public Builder setLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public Person build(){
        return new Person(firstName, lastName, 0, "");
    }
}

