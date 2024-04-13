class Student{
    int rollno;
    String name;
    boolean att;
    Student(int x,String y){
        this.rollno=x;
        this.name=y;

    }
    
    
    void attendence(boolean b){
        this.att=b;
    }
}
    
class st{
    private static final String Sathish = null;

    public static void main(String args []){
        Student s1=new Student(1,Sathish);
        System.out.println(s1);  
        s1.attendence(true);
        System.out.println(s1.att);
    }
}