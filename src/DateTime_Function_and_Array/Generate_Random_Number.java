
//  Write a program to generate random number from 1 to 10 but print by its alphabetical version.
//  suppose random number is 3. But it will print Three. Each time you will press enter,
//  it will generate new random numbers from 1-10 and will show its alphabetical version.

package DateTime_Function_and_Array;

import java.util.Scanner;


public class Generate_Random_Number {

    public static void main(String[] args) {

            
        while (true){

                int min = 1;
                int max = 10;

                double Random = Math.random()*(max-min);

                switch ((int) Random){

                    case 1:
                        System.out.println("One \n");
                        break;

                    case 2:
                        System.out.println("Two \n");
                        break;

                    case 3:
                        System.out.println("Three \n");
                        break;

                    case 4:
                        System.out.println("Four \n");
                        break;

                    case 5:
                        System.out.println("Five \n");
                        break;

                    case 6:
                        System.out.println("Six \n");
                        break;

                    case 7:
                        System.out.println("Seven \n");
                        break;

                    case 8:
                        System.out.println("Eight \n");
                        break;

                    case 9:
                        System.out.println("Nine \n");
                        break;

                    case 10:
                        System.out.println("Ten \n");
                        break;
                }

                Scanner keyIn = new Scanner(System.in);
                System.out.print("Press the enter key to continue \n");
                keyIn.nextLine();
        }
    }
}
