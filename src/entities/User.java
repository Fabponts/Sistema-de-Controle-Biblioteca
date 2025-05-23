package entities;

import java.util.Objects;

public class User {
    private String name;
    private Integer registerNumber;

    public User(){
    }

    public User(String name, Integer registerNumber){
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

    public void setRegisterNumber(Integer registerNumber) {
        this.registerNumber = registerNumber;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Register Number: ").append(getRegisterNumber()).append("/n");
        stringBuilder.append("Name: ").append(getName()).append("/n");
        return stringBuilder.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(registerNumber, user.registerNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(registerNumber);
    }
}

