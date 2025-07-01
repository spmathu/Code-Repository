public class Pyramid {
    public static void main(String[] args) {
        
        int num =5;
        for(int row=0;row<num;row++){
        for(int j=0;j<num-row;j++){
            System.out.print(" ");
        }
for(int i=0;i<=row;i++){
    System.out.print("* ");
}
System.out.println();
    }
    
    }
}
