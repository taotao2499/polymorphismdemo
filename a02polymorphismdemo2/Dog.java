package a02polymorphismdemo2;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }
    public void lookHome(){
        System.out.println("狗在看家");
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死的抱住"+something+"猛吃");
    }
}
