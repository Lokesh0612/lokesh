import java.util.ArrayList;
class Dot{
    int lafoot;
    Dot (int lafoot){
        this.lafoot=lafoot;
    }
    public static void main(String args []){
        ArrayList<Dot>list=new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(new Dot(i));
        }
        for(Dot obj:list){
            System.out.println("object ID:" +obj.lafoot);
        }

    }
}