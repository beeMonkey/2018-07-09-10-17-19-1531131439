package practice08;

public class Teacher extends Person{
    private Klass klass;
    Teacher(int id,String name,int age,Klass klass){
        super(id,name,age);
        this.klass=klass;
    }
    Teacher(int id,String name,int age){
        super(id,name,age);
    }
    public String introduce() {
        if(this.klass==null)return super.introduce()+" I am a Teacher. I teach No Class.";
        return super.introduce()+" I am a Teacher. I teach Class 2.";
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduceWith(Student student) {
        if(this.klass.getNumber()==student.getKlass().getNumber())return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
    }
}
