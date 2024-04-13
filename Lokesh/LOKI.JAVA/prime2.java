class prime{

    public static void main(String args[]){
        int a=5,i;
        int sum=0;
        for(i=1;i<=5;i++){
            if(a%i==0){
                sum=sum+1;

            }
        }
        if(sum==2){
            System.out.println("prime");
        
        
        }
        else{
            System.out.println("not prime");
        }    

        }
    
}