package FML;

import java.util.Scanner;

public class awsmdudeCode1 {
 
    public static char[] vowels = {'a', 'e', 'o', 'u', 'i'};
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
 
        if (1 <= times && times <= 20) {
            String[] inputs = new String[times];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = scanner.nextLine();
            }
            System.out.println(ratio(inputs)+" "+vowelCounter(ratio(inputs))+"/"+letterCounter(ratio(inputs)));
        }
    }
 
    public static boolean isVowel(char c) {                   // проверява дали е гласната
        c = Character.toLowerCase(c);
 
        for (char d : vowels) {
            if (c == d)
                return true;
        }
        return false;
    }
 
    public static int vowelCounter(String a) {               //калкулира гласните
        char[] box = a.toCharArray();
        int vowelCounter = 0;
        for (int i = 0; i < box.length; i++) {
            if (isVowel(box[i])) {
                vowelCounter++;
            }
        }
        return vowelCounter;
    }
 
    public static int letterCounter(String b) {             //калкулира букбите
        int letterCounter = 0;
        for (int i = 0; i < b.length(); i++) {
            letterCounter++;
        }
        return letterCounter;
    }
 
    public static String ratio(String [] a){               //главната проверка
        String output = a[0];
        for (int i = 1; i < a.length; i++) {
            if (vowelCounter(a[i]) > vowelCounter(output) && letterCounter(a[i]) < letterCounter(output)){
                output = a[i];
            } if (vowelCounter(a[i]) == vowelCounter(output) && letterCounter(a[i]) == letterCounter(output) || vowelCounter(a[i]) == 0 && vowelCounter(output) ==0 || letterCounter(a[i]) == letterCounter(output)){
                output = theLongest(a);
            }
        }
        return output;
    }
 
    public static String theLongest(String[] a){          //най-дългата дума
        String output = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > output.length()){
                output = a[i];
            }
        }
        return output;
    }
}