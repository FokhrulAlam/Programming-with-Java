/**
 * We will create a student list here.
 */
package studentlistdemo;

public class Student {
    String studentName;
    static String className = "Fifth Grade";
    int studentID;
    Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }
}
