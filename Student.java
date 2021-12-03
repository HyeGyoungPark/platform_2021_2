import java.util.Objects;

public class Student {
    private String name;
    private int year;

    public Student(String stuName, int schYear){
        this.name = stuName;
        this.year = schYear;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }

    public String toString() {
        String str = Integer.toString(year);
        return "["+name+", "+str+"학년]";
    }

    public boolean equals(Object o){
        Student stud = (Student) o;
        return (name.equals(stud.name) && year==stud.year);
    }

    public int hashCode() {return Objects.hash(name,year); }
}
