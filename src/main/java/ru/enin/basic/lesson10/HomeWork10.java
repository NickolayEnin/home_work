package ru.enin.basic.lesson10;

public class HomeWork10 {
    public static void main(String[] args) {
        User[] users = {
                new User("Enin", "Nickolay", "Nickolaevich", 1994, "eninqwert@gmail.com"),
                new User("Voshodov", "Vadim", "Igorevich", 1995, "voshod@mail.ru"),
                new User("Voshodov", "Daniil", "Igorevich", 1973, "perec@mail.ru"),
                new User("Semenov", "Igor", "Alexandrovich", 1960, "sema@mail.ru"),
                new User("Ivanov", "Retr", "Alexandrovich", 1965, "vanya@mail.ru"),
                new User("Ziyech", "Hakim", "Ibragimovich", 1973, "salam@mail.ru"),
                new User("Semak", "Sergey", "Bogdanovich", 1980, "semak@mail.ru"),
                new User("Werner", "Timo", "Illarionovich", 1986, "timooo@mail.ru"),
                new User("Sarr", "Malang", "Didievich", 1960, "sarr@mail.ru"),
                new User("Enina", "Tina", "Igorevna", 1994, "tina@mail.ru")
        };
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() >= 40) {
                count++;
            }
        }
        System.out.println("Пользователей старше 40 лет = " + count);
        Box box = new Box("red", 20, true);

        box.put("ball", 10);
        box.unPut();
        box.info();
        box.setColor("black");
        box.info();


    }

}
