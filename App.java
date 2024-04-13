abstract class Apple{
    abstract void m1();
    void m2(){
        System.out.println("santhoor");
    }
}
class Sec extends Apple{
    void m1(){
        System.out.println("123");

    }
}
public class App{
    public static void main(String args[]){
        Sec obj =new Sec();
        obj.m1();
        obj.m2();
    }
}