package practice08;

public class Klass {
    private int number;
    private Student leader;
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
    }

    public Student getLeader() {
        return this.leader;
    }
}
