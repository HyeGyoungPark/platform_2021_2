public class School {
    private String name;
    private int limit;

    private Student[] students;
    private int studentCount;

    public School(String sch, int lim){
        this.name = sch;
        this.limit = lim;
        students = new Student[limit];
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

        for (int i = 0; i < studentCount; i++) {
            if((name.equals(students[i].getName())) && schYear == students[i].getYear()) {
                foundStudent = students[i];
                break;
            }
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
        students[studentCount++] = newStu;
        System.out.println("");
    }

}

