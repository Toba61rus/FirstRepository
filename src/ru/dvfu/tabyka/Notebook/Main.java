package ru.dvfu.tabyka.Notebook;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList(2);
        list.add();
        for (int i=0; i<list.size(); i++);


        Person kolya = new Person("Николай ", "Пулев", "Владимирович");
        System.out.println(kolya.toString()); //Метод вывода информации (Фамилии,имени и отчества) пользователя заданных конструктором.

    //Введём данные о пользователях через сеттеры и выведем на экран через геттеры.
        { kolya.setGender("мужской");
        kolya.setEmail("kolay34@mil.ru");
        String [ ] address = {"Мохнатова 12"};
        kolya.setListAddress(address);
        String [] phones = {"8-950-564-98-45"};
        kolya.setNumberPhones(phones);
        System.out.println(kolya.getGender());
        System.out.println(kolya.getEmail());
        System.out.println(phones.toString());
        System.out.println(address.toString());}


        {Person valay = new Person("Валентина", "Пушкина","Сергеевна");
       //Метод вывода информации (Фамилии,имени и отчества) пользователя
            System.out.println(valay.toString());

        //Введём данные о пользователях через сеттеры и выведие на экран через геттеры.
        valay.setGender("женский");
        valay.setEmail("valay234gmail.com");
        String [] phones ={"8-904-589-21-23"};
        valay.setNumberPhones(phones);
        String [] address = {"Захарова 32"};
        valay.setListAddress(address);
        System.out.println(valay.getGender());
        System.out.println(valay.getEmail());
            System.out.println(phones);
            System.out.println(address);}



        {Person katya=new Person("Екатерина", "Кобанова", "Витальевна");
        //Метод вывода информации (Фамилии,имени и отчества) пользователя
            System.out.println(katya.toString());

        //Введём данные о пользователях через сеттеры и выведем на экран через геттеры.
        katya.setGender("женский");
        katya.setEmail("kobanova92@mail.ru");
        String [] phones ={"8-988-564-42-12"};
        katya.setNumberPhones(phones);
        String [] adress = {"Калинина 123"};
        katya.setListAddress(adress);
        System.out.println(katya.getGender());
        System.out.println(katya.getEmail());
            System.out.println(phones);
            System.out.println(adress);}



        Person vitalya= new Person("Виталий","Колпачков","Сергеевич");
       //Метод вывода информации (Фамилии,имени и отчества) пользователя
        System.out.println(vitalya.toString());


        //Введём данные о пользователях через сеттеры и выведем на экран через геттеры.
        vitalya.setGender("мужской");
        vitalya.setEmail("vital52@mail.ru");
        String [] phones = {"8-967-988-16-46"};
        vitalya.setNumberPhones(phones);
        String [] address = {"Бакланова 21"};
        vitalya.setListAddress(address);
        System.out.println(vitalya.getGender());
        System.out.println(vitalya.getEmail());
        System.out.println(phones);
        System.out.println(address);}


        {Person dima= new Person("Дмитрий", "Табыйка","Владимирович");
           //Метод вывода информации (Фамилии,имени и отчества) пользователя
            System.out.println(dima.toString());

        //Введём данные о пользователях через сеттеры и выведем на экран через геттеры.

        dima.setGender("мужской");
        dima.setEmail("toba92@mail.ru");
        String [] address ={"Верхнепортовая 76(А)., кв.20 "};
        dima.setListAddress(address);
        String [] phones ={"8-950-291-23-36"};
        dima.setNumberPhones(phones);
        System.out.println(dima.getGender());
        System.out.println(dima.getEmail());
        System.out.println(address);
        System.out.println(phones);}

    }









