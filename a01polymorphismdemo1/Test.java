package a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象

        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        s.show();

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(28);
        t.show();

        administrator a = new administrator();
        a.setName("王五");
        a.setAge(38);

        register(s);
        register(t);
        register(a);
    }
    public static void register(Person p){
        p.show();
    }
}
