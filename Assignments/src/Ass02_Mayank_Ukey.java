// This is Assignment No. 2

import java.util.Scanner;
public class Ass02_Mayank_Ukey {
    static int check(String sentence, String word){
        String str[] = sentence.split(" ");
        int count = 0;
        for (int i=0; i<str.length; i++){
            if(word.equals(str[i])){
                count++;
            }
        }
        return count;
    }
    static String[] initProductNames(String[] product, int size){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all the products: ");
        for (int i=0; i<size; i++){
            product[i] = sc.next();
        }
        return product;
    }

    static boolean isPresent(String[] product, String word){
        for (int i=0; i<product.length; i++){
            if(word.equals(product[i])){
                return true;
            }
        }
        return false;
    }

    static int findPosition(int num, int[] nums){
        for (int i=0; i<nums.length; i++){
            if(nums[i]==num){
                return i;
            }
        }
        return -1;
    }

    static void swap(String x, String y){
        String temp = x;
        x = y;
        y = temp;
    }
    static String makeReverse(String para){
        int low, high;
        String arr[] = para.split(" ");
        for (int i=0; i<arr.length; i++){
            low = 0;
            high = arr[i].length()-1;
            while(low<high){
                swap(arr[low], arr[high]);
                low++;
                high--;
            }
        }
        String str= "";
        for (int i=0; i<arr.length; i++){
            str += arr[i];
        }
        return str;
    }

    static String findAndReplace(String sen){
        Scanner sc = new Scanner(System.in);
        String str[] = sen.split(" ");
        String wordToReplace, replacingWord;
        System.out.println("Enter which word to replace: ");
        wordToReplace = sc.next();
        System.out.println("Enter word to replace: ");
        replacingWord = sc.next();
        for (int i=0; i<str.length; i++){
            if(str[i]==wordToReplace){
                str[i] = replacingWord;
            }
        }
        String str1 = "";
        for (int i=0; i<str.length; i++){
            str1 += str[i];
        }
        return str1;
    }

    static int[] findPrime(){
        Scanner sc = new Scanner(System.in);
        int start, end;
        System.out.println("Enter the start: ");
        start = sc.nextInt();
        System.out.println("Enter the end: ");
        end = sc.nextInt();
        int size = end-start;
        int arr[];
        arr = new int[size];
        int j = 0;
        for(int i=start; i<=end; i++){
            if(i%2==0 || i%3==0 || i%5==0 || i%7==0){
                j++;
                continue;
            }
            else{
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Find the number of occurences of a given word in a sentence: ");
            System.out.println("2. Check if the keyword present in product name: ");
            System.out.println("3. Find the avaialability of a given number in list: ");
            System.out.println("4. Reverse the sequence of letters in each word of a paragraph: ");
            System.out.println("5. Replace the string: ");
            System.out.println("6. Function to print the array contents: ");
            System.out.println("7. Funtion to write the various combinations of the entered string: ");
            System.out.println("8. Character array: ");
            System.out.println("9. Exit.");
            choice = sc.nextByte();

            switch(choice){
                case 1:
                    String sentence, word;
                    System.out.println("Enter sentence: ");
                    sentence = sc.nextLine();
                    System.out.println("Enter word: ");
                    word = sc.next();
                    int res = check(sentence, word);
                    System.out.println("The count of entered word is: "+res);
                    break;

                case 2:
                    byte size;
                    String []product;
                    System.out.println("Enter the number of products: ");
                    size = sc.nextByte();
                    product = new String[size];
                    product = initProductNames(product, size);
                    String key;
                    System.out.println("Enter the word: ");
                    word = sc.next();
                    boolean isPre = isPresent(product, word);
                    if(isPre){
                        System.out.println("The keyword is present in the product list.");
                    }
                    else{
                        System.out.println("Keyword is not present in the product list.");
                    }
                    break;

                case 3:
                    int number, listSize;
                    int[] nums;
                    System.out.println("Enter size of the list: ");
                    listSize = sc.nextInt();
                    nums = new int[listSize];
                    System.out.println("Enter number: ");
                    number = sc.nextInt();
                    int pos = findPosition(number, nums);
                    if(pos!=-1) {
                        System.out.println("The number is present at index: "+pos);
                    }
                    else{
                        System.out.println("The number is not present in the list.");
                    }
                    break;

                case 4:
                    String para;
                    System.out.println("Enter your paragraph: ");
                    para = sc.next();
                    String reverse = makeReverse(para);
                    System.out.println(reverse);
                    break;

                case 5:
                    String sen;
                    System.out.println("Enter string: ");
                    sen = sc.next();
                    String sen1 = findAndReplace(sen);
                    System.out.println("After replacement: "+sen1);
                    break;

                case 6:
                    int arr[] = findPrime();
                    for (int i=0; i<arr.length; i++){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                    break;
            }
        } while (choice < 9);

        System.out.println("You're out of the program.");
        sc.close();
    }
}