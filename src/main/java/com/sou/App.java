package com.sou;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Будет создана и выведена на экран структура двух университетов");
        System.out.println("Введите данные первого университета(название, адрес, телефон через запятую)");
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String[] firstUniversityData = input.split(",");

        University firstUniversity = new University(firstUniversityData[0], firstUniversityData[1], firstUniversityData[2]);
        University bstu = new University("БГТУ им. В.Г. Шухова", "г. Белгород, ул. Костюкова 46", "88005553535");

        firstUniversity.addDepartment("Кафедра экономики и организации производства");
        firstUniversity.addDepartment("Кафедра стратегического управления");
        bstu.addDepartment("Кафедра высшей математики");
        bstu.addDepartment("Кафедра иностранных языков");

        firstUniversity.addStudent("Вася Пупкин");
        firstUniversity.addStudent("Коля Иванов");
        firstUniversity.addStudent("Леша Молесников");
        bstu.addStudent("Света Стапанова");
        bstu.addStudent("Миша Котельников");

        firstUniversity.getDepartment("Кафедра экономики и организации производства")
                .addInstructor("Михаил Александрович");
        firstUniversity.getDepartment("Кафедра стратегического управления")
                .addInstructor("Валентин Петрович");
        bstu.getDepartment("Кафедра высшей математики").addInstructor("Елена Николаевна");
        bstu.getDepartment("Кафедра иностранных языков").addInstructor("Александр Иванович");

        System.out.println(firstUniversity);
        System.out.println(bstu);
    }
}
