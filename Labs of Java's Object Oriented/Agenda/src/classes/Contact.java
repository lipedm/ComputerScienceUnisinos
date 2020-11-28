package classes;

public class Contact {
    private String name;
    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Contact name(String name) {
        this.name = name;
        return this;
    }

    public Contact number(int number) {
        this.number = number;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", number='" + getNumber() + "'" + "}";
    }

    public int compareTo(Contact p) {
        if (this.number > p.getNumber()) {
            return -1;
        } else if (this.number < p.getNumber()) {
            return 1;
        }
        return 0;
    }

}
