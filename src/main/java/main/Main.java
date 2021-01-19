package main;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        // since we are asking for stuff, we will need to be able to receive data
        // thus, it makes sense to add a scanner to start
        Scanner kb = new Scanner(System.in);


        // Establish contact with user and the premise
        // Then, determine who the user is
        String userName;
        System.out.println("Hi, there! I need your help to do my homework. But, where are my manners, who am I speaking too?");
        System.out.print("Your name: ");
        userName = kb.nextLine();
        System.out.println("Awesome. Hey, " + userName + " , I hope you are well, and thank you for agreeing to help. Let's begin!");

        // ask for 5 numbers
        System.out.println("For homework, I need to run some tests on numbers. Can you give me five numbers?");



        // All in one for loop #2
        int[] intArrayLoop = new int[5];
        int intSum = 0;
        int intProd = 1;
//        int scroll = 0;
        int maxNum = 0;
        int minNum = 1000000; // please someone tell me a better way to do this lmao
                              // keep in mind, collections.max isn't an option in this case

        for (int i = 0; i < intArrayLoop.length; i++) {
            intArrayLoop[i] = kb.nextInt();
        }
//        for (int i = 0; i < intArrayLoop.length; i++) {
//            if(intArrayLoop[i] == intSum) {
//                scroll++;
//            }
//        }
        for (int ints : intArrayLoop) {
            intSum = intSum + ints;
        }
        for (int ints : intArrayLoop) {
            intProd = intProd * ints;
        }
        for (int ints : intArrayLoop) {
            if (ints > maxNum) {
                maxNum = ints;
            }
        }
        for (int ints : intArrayLoop) {
            if (ints < minNum) {
                minNum = ints;
            }
        }

        //Number call
        System.out.println("So, your sum should be: " +intSum);
        System.out.println("Also, your product should be: " +intProd);
        System.out.println("Hopefully max num: " + maxNum);
        System.out.println("Hopefully min num: " + minNum);

        // Car call
        HashMap<String, String> availableCars = CarMap.initCarStock();
        CarMap.customerQuery(availableCars);








    }
}







        // store them in an array
//        List<Integer> integerList = new ArrayList<>();
//        integerList.add(numberOne);
//        integerList.add(numberTwo);
//        integerList.add(numberThree);
//        integerList.add(numberFour);
//        integerList.add(numberFive);
//        System.out.println("Here are the numbers you gave me.");
//        System.out.println(integerList);

//        // All in one for loop
//        int product = 1;
//        System.out.println("Enter each array element, one by one.");
//            for(int i=0; i<5; i++){
//        integerList.set(i, kb.nextInt());
//        product = product * integerList.get(i);}
//        System.out.println("Elements of the array are: " + integerList);

        // find: sum, product, largest, and least
//        int intSum = integerList.;
//        System.out.println("This should be your sum: " + intSum);
//     }
//    }






//    int numberOne = 0;
//        int numberTwo = 0;
//        int numberThree = 0;
//        int numberFour = 0;
//        int numberFive = 0;
//
//            // First Number
//            System.out.print("First number: ");
//            numberOne = kb.nextInt();
//            System.out.println("Okay, number " + numberOne + ", got it.");
//
//            // Second Number
//            System.out.print("Second number: ");
//            numberTwo = kb.nextInt();
//            System.out.println("Okay, number " + numberTwo + ", got it.");
//
//            // Third Number
//            System.out.print("Third number: ");
//            numberThree = kb.nextInt();
//            System.out.println("Okay, number " + numberThree + ", got it.");
//
//            // Fourth Number
//            System.out.print("Fourth number: ");
//            numberFour = kb.nextInt();
//            System.out.println("Okay, number " + numberFour + ", got it.");
//
//            // Fifth Number
//            System.out.print("Fifth number: ");
//            numberFive = kb.nextInt();
//            System.out.println("Okay, number " + numberFive + ", got it.");

//System.out.println("Just to confirm, your numbers are " + numberOne + " and " + numberTwo + " and " + numberThree + " and " + numberFour + " and " + numberFive);
// hard coded string way to confirm

