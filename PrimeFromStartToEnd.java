
public class PrimeFromStartToEnd {
 public static void main(String[] args) {
        for(int i=10;i<=100;i++){
              boolean isPrime=true;
              for (int num= 2; num<i; num++) {
            if (i%num== 0) {
                isPrime= false;
                break;
                     }
              }
        
if(isPrime){
       System.out.println("The prime numbers are : "+i);
}
        }
}
       

 }

       