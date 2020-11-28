package classes;

public class Patient implements Comparable<Patient> {
    private String name;
    private int age;



    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Patient name(String name) {
        this.name = name;
        return this;
    }

    public Patient age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", age='" + getAge() + "'" + "}";
    }

    public int compareTo(Patient p) {
        if (this.age > p.getAge()) {
            return -1;
        } else if (this.age < p.getAge()) {
            return 1;
        }
        return 0;
    }

}
