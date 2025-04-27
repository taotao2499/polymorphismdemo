package a02polymorphismdemo2;

public class Test {
/*    定义Person类，
//饲养员
    属性
    姓名，年龄
    行为：
    keepPet(Dog dog,String something)方法
    功能：喂养宠物狗，something表示喂养的东西
    行为：
    keepPet(Cat cat,String something)方法
    功能：喂养宠物猫，something表示喂养的东西
    生成空参有参构造，set和get方法
4.定义测试类(完成以下打印效果):
    keepPet(Dog dog,String somethind)方法打印内容如下:
    年龄为30岁的老王养了一只黑颜色的2岁的宠物
2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
    keepPet(Cat cat,String somethind)方法打印内容如下：
    年龄为25岁的老李养了一只灰颜色的3岁的宠物
3岁的灰颜色的猫眯着眼睛侧着头吃鱼*/
public static void main(String[] args) {

    Dog dog = new Dog("黑", 2);
    Cat cat = new Cat("灰", 3);
    Person person = new Person("老王", 30);
    person.keepPet(dog, "骨头");
    person.keepPet(cat, "鱼");
}
}
