package practice06;

public class Teacher extends Person{
    private int klass;
    Teacher(String name,int age,int klass){
        super(name,age);
        this.klass=klass;
    }
    Teacher(String name,int age){
        super(name,age);
    }
    public String introduce() {
        if(this.klass==0)return super.introduce()+" I am a Teacher. I teach No Class.";
        return super.introduce()+" I am a Teacher. I teach Class 2.";
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
