// https://github.com/netology-code/javaqa2-homeworks/blob/main/OOP_PRINCIPLES.md
package ru.netology.classes;

public class Main {
    public static void main(String[] args) { // создаем класс main для демонстрации работы обектов запроса на сервер

        Post post = new Post();              // создаем обьект post
                                             // далее обращаемся через обьект post к его полям
        post.name = "Иван";                  // заполняем обьект post данными, задаем значения полям
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();       // ??? Создаем дополнительный обьект (получится обьект в обьекте)

        post.birthday.day = 13;               // добавляем значения поля birthday
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}
