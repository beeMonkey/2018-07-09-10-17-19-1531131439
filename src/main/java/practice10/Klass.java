package practice10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentsOfKlass;
    Klass(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class "+this.number;
    }

    public boolean equal(Klass klass){
        return this.getNumber()== klass.getNumber();
    }

    public void assignLeader(Student leader) {
        if(this.equal(leader.getKlass())){
            this.leader=leader;
        }
        else{
            System.out.print("It is not one of us.\n");     //在输出的时候要注意
        }
    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student student) {
        student.change(this);
        studentsOfKlass = new ArrayList<Student>();
        this.studentsOfKlass.add(student);
    }

}
