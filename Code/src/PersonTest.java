public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        /*int a = 3;
        int b = 2;
        p.swap(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        p.name = "小明";     //先在外面修改一次
        p.modify(p);        //调用方法再修改一次
        System.out.println(p.name);    //请问最后name会是什么？*/
        p.setName("小明");
        System.out.println(p.name);
    }
}
