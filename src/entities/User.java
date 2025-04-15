package entities;

public class User {
    private String name;
    private int registerNumber;


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
}

