package Task1;

public class Main {
    public static void main(String[] args) {
        User user = new User(10,"Viki", "login23@mail.ru", "password1111");
        User user2 = new User(10,"Viki", "login23@mail.ru", "password1111");
        System.out.println(user);
        System.out.println(user2);
        System.out.println(user.equals(user2));

    }
}