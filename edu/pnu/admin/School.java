package edu.pnu.admin;
import edu.pnu.admin.Student;
import edu.pnu.collection.GenericList;


public class School {
    private String name;
    private int limit;

    private int studentCount;
    private GenericList<Student> studentss = new GenericList<Student>();
    private Student[] students = new Student[100];

    @SuppressWarnings("unchecked")
    public School(String sch, int lim){
        this.name = sch;
        this.limit = lim;
        studentCount = 0;
    }

    public String toString() {
        String msg = "\nSchool Name: " + name + " Student Count: " + studentCount + "\n";
        for (int i = 0; i < studentCount; i++) {
            msg += "\t" + students[i] + "\n";
        }
        return msg;
    }

    public Student findStudent(String name, int schYear){
        Student foundStudent = null;
        Student want = new Student(name, schYear);

        for (int i = 0; i < studentCount; i++) {
            if(want.equals(students[i])) {
                foundStudent = students[i];
                break;
            }
            System.out.println("");
        }
        System.out.println("");
        return foundStudent;
    }

    public void removeAllStudent() {
        for(int i=0; i<studentCount; i++){
            students[i] = null;
        }
        studentCount = 0;
        System.out.println("");
    }

    public void addStudent(Student newStu) {
        //int add, clear,data,size,get,ADD, FIND CLEAR LIST QUIT INVALID T add clear data DEFAULT_SIZE ADD FIND CLEAR LIST QUIT INVALID T add clear data DEFAULT_SIZE;
        students[studentCount++] = newStu;
        System.out.println("");
    }

}
