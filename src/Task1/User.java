package Task1;

import java.util.Objects;

public class User {
    private int age;
    private String name;
    private String login;
    private String password;

    public User(int age, String name, String login, String password) {
        this.age = age;
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SystemUser{\n" +
                "\tage=" + age +
                ", \n\tname='" + name + '\'' +
                ", \n\tlogin='" + login + '\'' +
                ", \n\tpassword='" + password + '\'' +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User that)) return false;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(login, that.login) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, login, password);
    }
}
