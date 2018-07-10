package practice10;

import java.util.BitSet;
import java.util.LinkedList;

public class Teacher extends Person{
    private Klass klass;
    private LinkedList<Klass> classes;
    Teacher(int id,String name,int age,LinkedList<Klass> classes){
        super(id,name,age);
        this.classes = new LinkedList<Klass>();
        this.classes=classes;
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
}
