package sprinTask1.db;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Student> students = new ArrayList<>();
    private static long id = 2L;
    static {
        students.add(new Student(1L,"Akimzhan","Sharipuly",91,"F"));
    }
    public static ArrayList<Student> getStudents(){
        for (Student s : students) {
            if (s.getExam()>=90) s.setMark("A");
            else if (s.getExam()>=75) s.setMark("B");
            else if (s.getExam()>=60) s.setMark("C");
            else if (s.getExam()>=50) s.setMark("D");
            else s.setMark("F");
        }
        return students;
    }

    public static void addStudents(Student student){
        student.setId(id);
        id++;
        students.add(student);
    }

}
