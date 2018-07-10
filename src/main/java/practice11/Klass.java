package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentsOfKlass = new ArrayList<Student>();
    private ArrayList<JoinClassListener> joinClassListenerList =new ArrayList<JoinClassListener>();
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
            notifyTeacherSomeoneJoinClass(leader);
        }
        else{
            System.out.print("It is not one of us.\n");  
        }
    }

    public Student getLeader() {
        return this.leader;
    }

    public void registerJoinListener(JoinClassListener joinClassListener){
        joinClassListenerList.add(joinClassListener);
    }
    
    public void notifyTeacherSomeoneJoinClass(Student student){
        for(int i = 0;i<joinClassListenerList.size();i++){
            joinClassListenerList.get(i).saySomeoneJoinClass(student,this.number);
        }
    }

    public void appendMember(Student student) {
        student.change(this);
        this.studentsOfKlass.add(student);
        notifyTeacherSomeoneJoinClass(student);
    }

	@Override
	public String toString() {
		return "Klass [number=" + number + ", leader=" + leader + ", studentsOfKlass=" + studentsOfKlass
				+ ", joinClassListenerList=" + joinClassListenerList + "]";
	}


}
