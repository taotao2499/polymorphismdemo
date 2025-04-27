package a01polymorphismdemo1;

public class Student extends Person{
    @Override
    public void show() {
        System.out.println("学生"+getName()+","+getAge());
    }
}
