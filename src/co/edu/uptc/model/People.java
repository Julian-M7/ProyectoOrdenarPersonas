package co.edu.uptc.model;

public class People {
    String name;
    String lastName;


    public People() {
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "" +
            " name='" + name + "'" +
            ", lastName='" + lastName + "'" +
            "";
    }
    
}
