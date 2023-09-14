import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String empty = "";

        boolean isEmpty = empty.length() == 0;
        System.out.println(empty.isEmpty());
        System.out.println(empty.isBlank());

        LocalDate birthday = LocalDate.of(1986, 4, 15);

        String blank = " \t \n ";
        System.out.println(blank.isBlank());
        int age = 55;
        String name = "Дмитрий";
        String surName = "Петров";
        String personInfo = name + ' ' + surName + " - " + birthday;

        System.out.println(personInfo);

        String managerName = "Василий";
        String  customerName = "Васи".concat("лий");
        System.out.println(managerName.equals(customerName));


    }
}
