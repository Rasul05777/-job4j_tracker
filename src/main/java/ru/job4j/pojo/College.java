package ru.job4j.pojo;
import java.util.Date;
import ru.job4j.pojo.Student;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Хизриев Магомедрасул Заурович");
        student.setGroup(4);
        student.setReceipt(new Date());

        System.out.println("ФИО : " + student.getFullName() + ", группа : " + student.getGroup() + ", дата поступления : " + student.getReceipt());
    }
}

