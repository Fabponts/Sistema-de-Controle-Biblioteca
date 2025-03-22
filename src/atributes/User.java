package atributes;

public class User {
    private String name;
    private int registerNumber;
    private boolean borrowedBooks;

    public User(){
    }

    public User(String name, int registerNumber){
        this.name = name;
        this. registerNumber = registerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }
    public String toString(){
        return "User created succesfully!" + "\n" + "Welcome to our Library " + getName();
    }
}

