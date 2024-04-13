import java.util.*;
class testCollection7{
    public static void main(String args[]){
        LinkedList<String>al=new LinkedList<String>();
        al.add("srikanth");
        al.add("akhil");
        al.add("lokesh");
        al.add("satish");
        Iterator<String>itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        
        }
    }
}