package ru.dvfu.tabyka.Notebook;public class Person {         //Запишем поля записной книжки    private String firstName;    private String lastName;    private String middleName;    private String gender;    private String email;    private String[] numberPhones;    private String[] listAddress;    public Person() {   //Пустой конструктор    }    public Person(String fn, String ln, String mn) {    }    public String getFirstName() {        return firstName;    }    public void setFirstName(String firstName) {        this.firstName = firstName;    }    public String getLastName() {        return lastName;    }    public void setLastName(String lastName) {        this.lastName = lastName;    }    public String getMiddleName() {        return middleName;    }    public void setMiddleName(String middleName) {        this.middleName = middleName;    }    public String getGender() {        return gender;    }    public void setGender(String gender) {        this.gender = gender;    }    public String getEmail() {        return email;    }    public void setEmail(String email) {        this.email = email;    }    public String[] getNumberPhones() {        return numberPhones;    }    public void setNumberPhones(String[] numberPhones) {        this.numberPhones = numberPhones;    }    public String[] getListAddress() {        return listAddress;    }    public void setListAddress(String[] listAddress) {        this.listAddress = listAddress;    }}