import java.util.Comparator;

public class Student implements Comparable {
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

    private int age;
    private int rollNo;
    private String collegeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Student(String name, int age, int rollNo, String collegeName) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.collegeName = collegeName;
    }

    @Override
    public int compareTo(Object o) {
        return this.rollNo - ((Student) o).getRollNo();
    }
}

class CompareStudentByNameDesc implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}


