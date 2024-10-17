public class Person {
    int age;
    String name;

    void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    void modify(Person person){
        person.name = "Iris";   //修改对象的名称
    }
    void setName(String name) {
        name = name;    //出现重名时，优先使用作用域最接近的，这里实际上是将方法参数的局部变量name赋值为本身
    }
}
