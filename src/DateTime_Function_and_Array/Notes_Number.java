
// Find the number of notes from input amount in given array [1000,500,100,50,20,10,5,2]

package DateTime_Function_and_Array;

import java.util.Scanner;

public class Notes_Number {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount:");
        int amount = input.nextInt();

        int[] notes={1000,500,100,50,20,10,5,2};
        int[] count=new int[8];


        for(int i=0; i<notes.length; i++){
            if (amount >= notes[i]) {
                count[i] = amount / notes[i];
                amount = amount - count[i] * notes[i];
            }
        }

        for (int i = 0; i < 8; i++) {
            if (count[i] != 0) {
                System.out.println("Total Number Of "+notes[i]+" Taka Notes : "+count[i]);
            }
        }
    }
}
