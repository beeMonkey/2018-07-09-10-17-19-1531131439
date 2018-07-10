package practice11;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id ;
    }


    @Override
    public int hashCode() {

        return Objects.hash(name, age, id);
    }

    Person(int id, String name, int age){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    public String introduce(){
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