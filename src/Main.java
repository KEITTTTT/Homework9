import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String phone = "+987 811-7111";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 10) {
            throw new RuntimeException("Телефон слишком длинный ");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий ");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79878117111";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех ");
        } else {
            System.out.println("Неудача ");
        }
        task1();task2();task3();
    }

    public static void task1() {
        //Задача 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2(){
        String fullName = "Ivanov Ivan Ivanovich";
        String fullName2 = fullName.toUpperCase();
            System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);
    }

    public static void task3(){
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        fullName = fullName.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + fullName);

    }

}