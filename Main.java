import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       /* 1.Write a program that prints the numbers from 1 to 100 such that:
        If the number is a multiple of 3, you need to print "Fizz" instead of that
        number. If the number is a multiple of 5, you need to print "Buzz" instead of that
        number.If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
        instead of that number.*/

//        for(int i=1;i<=100;i++){
//            if(i%3==0 && i%5==0){
//                System.out.println("FizzBuzz "+i);
//            }else if (i%3==0){
//                System.out.println("Fizz "+i);
//            } else if (i%5==0) {
//                System.out.println("Buzz "+i);
//            }
//        }




        /*Ex2.Write a Java program to reverse a string. */

//        String revSentence = "" ;
//        System.out.print("Please write a sentence to reverse : ");
//        String theString = input.nextLine();
//        for (int i = theString.length()-1; i>=0 ;i--){
//            revSentence += theString.charAt(i);
//        }
//        System.out.printf("%nReverse sentence : %s",revSentence);






        /*Ex3.Write a program to find the factorial value of any number entered
          through the keyboard.*/

//        System.out.println("Please enter a number to find its factorial : ");
//        int number = input.nextInt();
//        long factorial = 1;
//        int i = 1;
//        while (i <= number){
//            factorial *= i;
//            i++;
//        }
//        System.out.printf("A factorial of %d is %d .", number, factorial);





        /*Ex4.Two numbers are entered through the keyboard. Write a program to find
          the value of one number raised to the power of another.*/

//        System.out.print("Please enter the base number: ");
//        int base = input.nextInt();
//        System.out.print("Please enter the exponent: ");
//        int exponent = input.nextInt();
//        int power = 1;
//        for (int i = 0; i < exponent; i++) {
//            power *= base;
//        }
//        System.out.printf("%d to the power %d equals %d ", base, exponent,power);






        /*5.Write a program that reads a set of integers, and then prints the sum of
            the even and odd integers.*/

//        System.out.print("Please enter the count of numbers : ");
//        int count = input.nextInt();
//
//        int evenNumber = 0;
//        int oddNumber = 0;
//
//        System.out.printf("Enter %d numbers : ",count);
//
//        for (int i = 0; i < count; i++) {
//            int number = input.nextInt();
//
//            if (number % 2 == 0) {
//                evenNumber += number;
//            } else {
//                oddNumber += number;
//            }
//        }
//        System.out.println("Sum of even numbers is : " +evenNumber );
//        System.out.println("Sum of odd numbers is : " +oddNumber );






        /*Ex6.Write a program that prompts the user to input a positive integer. It
          should then output a message indicating whether the number is a prime
          number. */

//        System.out.print("Please enter a positive integer: ");
//        int number = input.nextInt();
//        int count =0;
//            for (int i = 1; i <= number; i++) {
//                if (number % i == 0) {
//                    count++;
//                }
//            }
//            if(count==2) {
//                System.out.println(number + " is a prime number.");
//            }else System.out.println(number + " is not a prime number.");






        /*Ex7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
          another for loop to print the days (Days 1 -7) for each week. */

//        for (int week=1; week<=4 ; week++){
//            System.out.println("Week "+week);
//            for (int day=1 ; day<=7 ; day++)
//                System.out.println("Day "+day);
//        }





        /*Ex8.Write a program thats check if the word is a palindrome or not. hint: A
        string is said to be a palindrome if it is the same if we start reading it from
        left to right or right to left.*/

//        String revString= "" ;
//        System.out.println("please write a word: ");
//        String theString = input.nextLine();
//        for (int i = theString.length()-1; i>=0 ;i--){
//            revString += theString.charAt(i);
//        }
//        if (theString.equals(revString)) {
//            System.out.printf("%n%s palindrome", revString);
//        }else System.out.printf("%n%s not a palindrome", revString);



    }
}