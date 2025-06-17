
public class NumToAlp {
    public static void main(String[] args) {
        int i=10;
        if (i >= 1 && i <= 26) {
            char alph = (char) ('A' + i - 1);
            System.out.println("Alphabet is : " + alph);
        } else {
            System.out.println("Enter a valid number between 1 and 26.");
        }
    }
}
