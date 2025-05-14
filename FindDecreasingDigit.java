import java.io.*;
import java.util.*;

class ToDoExercise {
    public static void main(String[] args) {
        System.out.println("-----Exercise-----");
    }
}

class SumOfUniqueDigits{

    static int findSum(int num){
        boolean[] seen=new boolean[10];
        int sum=0;
        int rem;

        while(num!=0){
            rem=num%10;
            if(!seen[rem]){
                sum+=rem;
                seen[rem]=true;
            }
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();
        System.out.println(findSum(num));
    }
}



public class FindDecreasingDigit {

    
    static int findFirstDecreasingIndex(char[] digits) {
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        return i; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String number = sc.next();
        char[] digits = number.toCharArray();

        int index = findFirstDecreasingIndex(digits);

        if (index == -1) {
            System.out.println("No decreasing digit found.");
        } else {
            System.out.println(index);
        }
    }
}



class SwapDigits {

    static void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String number = sc.next();
        char[] digits = number.toCharArray();

        int i = 2; 
        int j = 5; 

        System.out.println("Before swap: " + String.valueOf(digits));

        swap(digits, i, j);

        System.out.println("After swap: " + String.valueOf(digits));
    }
}



class MostFrequentWordFinder {
    public static void main(String[] args) {
        String fileName = "Example.txt"; 
        HashMap<String, Integer> wordCount = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); 

                for (String word : words) {
                    word = word.toLowerCase(); 
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
            reader.close();

            String mostFrequentWord = null;
            int maxCount = 0;
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mostFrequentWord = entry.getKey();
                    maxCount = entry.getValue();
                }
            }

            System.out.println("Most Frequent Word: " + mostFrequentWord);
            System.out.println("Count: " + maxCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
