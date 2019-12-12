package studentlistdemo;

import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Create a LinkedList of type Student
         */
        LinkedList<Student> studentList = new LinkedList<Student>();
        /**
         * create objects from Student to put them into LinkedList
         */
        Student fokhrul = new Student(1,"Fokhrul");
        Student alam = new Student(2, "Alam");
        /**
         * Add the objects to the list
         */
        studentList.add(fokhrul);
        studentList.add(alam);
        /**
         * print the list and include the class name also
         */
        for (Student student : studentList){
            System.out.println(student.studentID+"\t"+student.studentName+"\t"+Student.className);
        }

    }
}
