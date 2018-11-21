package ru.dvfu.tabyka.Notebook;

public class Person {         //Запишем поля записной книжки
    private String firstName;
    private String lastName;
    private String middleName;
    private String gender;
    private String email;
    private String[] numberPhones;
    private String[] listAddress;

    public Person(){   //Пустой конструктор
            }
    public Person(String fn, String ln, String mN ){ }   // Конструктор с параметрами Фамилия, Имя и Отчество.
    public void info (){ // Метод вывода на экран информации о контакте.



            }

    public void addPhoneNumber() {  } //Метод добавления

    public void editPhoneNumder() { }   // Метод редактировать

    public void removeNumberPhone() { }  //Метод удаления номера телефона

    public void addAdress() {}   // Метод добавления дресса

    public void editAddress() { } //Метод редактирования адресса

    public void removeAddress() { } // Метод стирания адресс

    public void showAddresses() { }  //Метод показа адресса

    //Сеттеры и геттеры для наших полей


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getListAddress() {
        return listAddress;
    }

    public void setListAddress(String[] listAddress) {
        this.listAddress = listAddress;
    }
    public String[] getNumberPhones() {
        return numberPhones;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setNumberPhones(String[] numberPhones) {
        this.numberPhones = numberPhones;
        }
    }
