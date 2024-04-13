import java.util.*;
@SuppressWarnings("unused")
public class Org{
    int Empid;
    String Empname;
    int Empsalary;
    String EmpDesignation;
    Org(int Empid,String Empname){
        this.Empid=Empid;
        this.Empname=Empname;
    }
    Org(int Empid,String Empname,int Empsalary,String EmpDesignation){
        this.Empid=Empid;
        this.Empname=Empname;
        this.Empsalary=Empsalary;
        this.EmpDesignation=EmpDesignation;

    }
    void printdetails(){
        System.out.println("Empid:"+ Empid) ;
        System.out.println("Empname:"+ Empname);
        System.out.println("Empsalary:"+ Empsalary);
        System.out.println("EmpDesignation:"+ EmpDesignation);
        System.out.println();

     }


    
    public static void main(String args[]){
        Org Emp1= new Org(101,"sathish",125,"ceo");
        Org Emp2= new Org(201,"nithish",225,"manager");

        Org Emp3= new Org(301,"srikanth",325,"HR");

        Org Emp4= new Org(401,"lokesh",425,"tester");
        Org Emp5= new Org(501,"akhil" ,525,"designer");

        Emp1.printdetails();
        Emp2.printdetails();
        Emp3.printdetails();
        Emp4.printdetails();
        Emp5.printdetails();
        


    }

}