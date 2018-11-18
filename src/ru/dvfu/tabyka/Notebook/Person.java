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
    public Person(String fn, String ln, String mN ){

    }
    public void info (){ // Метод вывода на экран информации о контакте.
        System.out.println(getFirstName());
        System.out.println(getLastName());
        System.out.println(getMiddleName());
        /*getGender();
        getEmail();
        getNumberPhones();
        getListAddress();*/
    }
    //Внесём методы

    public void addPhoneNumber() {  } //Метод добавления

    public void editPhoneNumder() { }   // Метод редактировать

    public void removeNumberPhone() { }  //Метод удаления номера телефона

    public void addAdress() {}   // Метод добавления дресса

    public void editAddress() { } //Метод редактирования адресса

    public void removeAddress() { } // Метод стирания адресс

    public void showAddresses() { }  //Метод показа адресса

    //Сеттеры и геттеры для наших полей
  public String getFirstName() {
            return firstName;
        }

        public void setFirstName ( ) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName() {
            this.lastName = lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName() {
            this.middleName = middleName;

    }

    public String getGender() {
        return gender;
    }

    public void setGender() {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public String[] getNumberPhones() {
        return numberPhones;
    }

    public void setNumberPhones() {
        this.numberPhones = numberPhones;
    }

    public String[] getListAddress() {
        return listAddress;
    }

    public void setListAddress() {
        this.listAddress = listAddress;
    }


}
