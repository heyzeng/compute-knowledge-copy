package Java.chapter07.src.main.java.extra;

import Java.chapter07.src.main.java.extra.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Tom";
        student.age = 100;

        String say = student.say();
        System.out.println(say);


        String ss = new Student().say();
        System.out.println(ss);
    }
}
