package a02polymorphismdemo2;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    public void  keepPet(Dog dog,String something){
        //年龄为30岁的老王养了一只黑颜色的2岁的宠物
        System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的宠物");
        //宠物在吃骨头
        dog.eat(something);
    }
    public void  keepPet(Cat cat,String something){
        //年龄为25岁的老李养了一只灰颜色的3岁的宠物
        System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的宠物");
        cat.eat(something);
    }
}
