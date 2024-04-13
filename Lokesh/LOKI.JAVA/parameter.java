import java.util.*;
@SuppressWarnings("unused")
public class Satish{
    static int variable;
    int a;
    int b;
    public Satish() {
        System.out.println("defult constructor is called");
    }
    public void m1(int num1){
        System.out.println("m1 is callled with parameters " +num1);

    }
    public void m2(int num2){
        System.out.println("m2 is called with parameters"+ num2 );
    }


    public static void main(String args[]){
        Satish obj=new Satish();
        obj.a=10;
        obj.b=15;
        obj.m1(obj.a);
        obj.m2(obj.b);

    }
}