package Project2;
/*
Create a method to count how many vowels are present in a string
“documentation”
 */
public class T6 {
    public static void main(String[] args) {
        String str = "documentation";
        int noOfVowels=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c=='a'|| c=='e' ||c=='i'|| c=='o'||c=='u'){
                noOfVowels++;
            }
        }
        System.out.println(noOfVowels);
    }
}
