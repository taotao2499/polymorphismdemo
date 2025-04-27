package a01polymorphismdemo1;

public class administrator extends Person{
    @Override
    public void show() {
        System.out.println("管理员"+getName()+","+getAge());
    }
}
