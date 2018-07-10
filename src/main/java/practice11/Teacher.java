package practice11;

import java.util.BitSet;
import java.util.LinkedList;

public class Teacher extends Person implements JoinClassListener{
    private Klass klass;
    private LinkedList<Klass> classes;
    
    Teacher(int id,String name,int age,LinkedList<Klass> classes){
        super(id,name,age);
        this.classes = classes;
        for(int i=0; i<classes.size();i++) {
            classes.get(i).registerJoinListener(this);
        }
    }
    
    Teacher(int id,String name,int age){
        super(id,name,age);
    }
    
    public String introduce() {
        if(this.classes==null)return super.introduce()+" I am a Teacher. I teach No Class.";
        else {
            int length=classes.size();
            String result="";
            for(Klass klass:classes){
                result+=klass.getNumber()+", ";
            }
            result=result.substring(0,result.length()-2);
            return super.introduce() + " I am a Teacher. I teach Class "+result+".";
        }
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduceWith(Student student) {
        for (Klass klass:classes ) {
            if(student.getKlass().getNumber()==klass.getNumber())
                return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }

    public LinkedList<Klass> getClasses() {
        return this.classes;
    }

    public boolean isTeaching(Student student) {
        return this.classes.contains(student.getKlass());
    }

    @Override
    public void saySomeoneJoinClass(Student student, Integer number) {
    	if(student.equals(student.getKlass().getLeader())) {
    		System.out.print("I am " + this.getName() + ". I know " + student.getName() + " become Leader of Class " + number + ".\n");
    	} else {
    		System.out.print("I am " + this.getName() + ". I know " + student.getName() + " has joined Class " + number + ".\n");
    	}
        
    }
}
