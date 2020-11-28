package classes;

public class Call {
    private int number;

    public Call() {
    }

    public Call(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Call number(int number) {
        this.number = number;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " number='" + getNumber() + "'" +
            "}";
    }




}
