package classes;

public class Candidate {
    private String name;
    private int age;
    private int votes;

    public Candidate(String name, int age, int votes) {
        this.name = name;
        this.age = age;
        this.votes = votes;
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

    public int getVotes() {
        return this.votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public Candidate name(String name) {
        this.name = name;
        return this;
    }

    public Candidate age(int age) {
        this.age = age;
        return this;
    }

    public Candidate votes(int votes) {
        this.votes = votes;
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", votes='" + getVotes() + "'" +
            "}";
    }



}
