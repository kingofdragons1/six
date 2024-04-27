import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого пользователя:");
        String name1 = scanner.nextLine();
        System.out.println("Введите возраст первого пользователя:");
        int age1 = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        User user1 = new User(name1, age1);

        System.out.println("Введите имя второго пользователя:");
        String name2 = scanner.nextLine();
        System.out.println("Введите возраст второго пользователя:");
        int age2 = scanner.nextInt();
        User user2 = new User(name2, age2);

        User youngerUser = user1.getAge() < user2.getAge() ? user1 : user2;
        System.out.println(youngerUser);
    }
}

class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", возраст " + age + " лет";
    }
}
