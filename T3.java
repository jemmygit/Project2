package Project2;
/*
Reverse a String: Write a function to reverse a given string. For example,
given the input "Hello", the output should be "olleH".

 */
public class T3 {
    public static void main(String[] args) {
        String revers = "Hello";
        for (int i = revers.length()-1; i>=0; i--) {
            System.out.print(revers.charAt(i)+"");
        }
    }
}
