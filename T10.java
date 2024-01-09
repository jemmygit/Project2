package Project2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/*
How can you remove all duplicates from ArrayList?
 */
public class T10 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(35);
        numbers.add(10);
        numbers.add(40);
        numbers.add(10);
        numbers.add(10);
        numbers.add(30);
        List<Integer> uniqueNumbers=removeDuplicates(numbers);
        System.out.println("List with the duplicates removed "+uniqueNumbers);
    }
    public static List<Integer>removeDuplicates(List<Integer>numbers){
        HashSet<Integer> uniqueSet=new HashSet<>(numbers);

        List<Integer>uniqueNumbers=new ArrayList<>(uniqueSet);
        return uniqueNumbers;
    }
}
