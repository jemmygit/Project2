package Project2;
/*
Write a program to swap 2 String without a temporary variable?
 */
public class T1 {
    public static void main(String[] args) {
        String Name1 = "Hello ";
        String Name2 = "World";
        System.out.println("Without Swapping "+Name1+" "+Name2);
        System.out.println("After Swap ***********");
        Name1=Name1+Name2;
        Name2=Name1.substring(0,Name1.length()-Name2.length());
        Name1=Name1.substring(Name2.length());
        System.out.println(Name1+" "+ Name2);

    }
}
