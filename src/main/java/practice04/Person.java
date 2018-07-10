package practice04;

public class Person {
    private String name;
    private int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String introduce(){
        return this.basicIntroduce();
        //return String.format("My name is %s. I am %d years old.",this.name, this.age);
    }
    public String basicIntroduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }
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
}