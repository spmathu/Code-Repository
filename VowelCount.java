public class VowelCount
 {
    public static void main(String[] args) {
        char[] letters = {'h','e','l','l','o'};
        int count = 0;

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' ||
                letters[i] == 'o' || letters[i] == 'u') {
                System.out.println( i);
                count++;
            }
        }
System.out.println("Total vowels: " + count);
    }
}