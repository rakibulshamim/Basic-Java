
// Write a program to find if any element is duplicate. If duplicate, show the value.

package DateTime_Function_and_Array;

import java.util.ArrayList;

public class Duplicate_Element {

    public static void main(String[] args) {

        String[] numbers={"1","2","3","3","4","5","5","6","7","8","8","9","0"};
        //String[] numbers={"1","2","3","4","5","6","7","8","9","0"};

        ArrayList<String> count = new ArrayList<String>();
        boolean found = false;

        for (int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i].equals(numbers[j])){
                    found = true;
                    count.add(numbers[j]);
                }
            }
        }
        if(found) {
            System.out.println("Duplicate elements found in the array: ");
            for (String s : count) System.out.print(s + "\n");
        }
        else {
            System.out.println("Duplicate elements not found in the array");
        }
    }

}
