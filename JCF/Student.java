package JavaCollectionFramework;

import java.util.Objects;

public class Student {

    public int rollNo;
    public String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
//agr same value ko ek baar print karana he to mujhe in dono ko override karna padega barna same thing 3 baar print ho jaayegi
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    public Student(int rollNo , String name) {
        this.rollNo = rollNo;
        this.name = name;

    }


}
