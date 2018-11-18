package ru.dvfu.tabyka.Notebook;

public class Main {
    public static void main(String[] args) {
        Person kolya = new Person("Николай ", "Пулев", "Владимирович");
        kolya.info();    //Метод вывода информации (Фамилии,имени и отчества) пользователя заданных конструктором.

        //Введём данные о пользователях через сеттеры и выведем на экран через геттеры.
        kolya.setGender("мужской");
        kolya.setEmail("kolay34@mil.ru");
        kolya.setNumberPhones("8-950-564-98-45");
        kolya.setListAddress("Болотная 68");
        System.out.println(kolya.getGender());
        System.out.println(kolya.getEmail());
        System.out.println(kolya.getNumberPhones());
        System.out.println(kolya.getListAddress());


        Person valay = new Person("Валентина", "Пушкина","Сергеевна");
        valay.info();  //Метод вывода информации (Фамилии,имени и отчества) пользователя

        //Введём данные о пользователях через сеттеры и выведие на экран через геттеры.
        valay.setGender("женский");
        valay.setEmail("valay234gmail.com");
        valay.setNumberPhones("8-904-589-21-23");
        valay.setListAddress("Захарова 23");
        System.out.println(valay.getGender());
        System.out.println(valay.getEmail());
        System.out.println(valay.getNumberPhones());
        System.out.println(valay.getListAddress());


        Person katya=new Person("Екатерина", "Кобанова", "Витальевна");
        katya.info(); //Метод вывода информации (Фамилии,имени и отчества) пользователя

        //Введём данные о пользователях через сеттеры и выведем на экран через геттеры.
        katya.setGender("женский");
        katya.setEmail("kobanova92@mail.ru");
        katya.setNumberPhones("8-988-564-42-12");
        katya.setListAddress("Калинина 123");
        System.out.println(katya.getGender());
        System.out.println(katya.getEmail());
        System.out.println(katya.getNumberPhones());
        System.out.println(katya.getListAddress());


        Person vitalya= new Person("Виталий","Колпачков","Сергеевич");
        vitalya.info(); //Метод вывода информации (Фамилии,имени и отчества) пользователя


        //Введём данные о пользователях через сеттеры и выведем на экран через геттеры.
        vitalya.setGender("мужской");
        vitalya.setEmail("vital52@mail.ru");
        vitalya.setNumberPhones("8-967-988-16-46");
        vitalya.setListAddress("Бакланвоа 21");
        System.out.println(vitalya.getGender());
        System.out.println(vitalya.getEmail());
        System.out.println(vitalya.getNumberPhones());
        System.out.println(vitalya.getListAddress());


        Person dima= new Person("Дмитрий", "Табыйка","Владимирович");
        dima.info();    //Метод вывода информации (Фамилии,имени и отчества) пользователя

        //Введём данные о пользователях через сеттеры и выведем на экран через геттеры.
        dima.setGender("мужской");
        dima.setEmail("toba92@mail.ru");
        dima.setListAddress("Верхнепортовая 76(А)., кв.20 ");
        dima.setNumberPhones("8-950-291-23-36");
        System.out.println(dima.getGender());
        System.out.println(dima.getEmail());
        System.out.println(dima.getNumberPhones());
        System.out.println(dima.getListAddress());
    }
   /* public String toString(){
        return*/

    }







