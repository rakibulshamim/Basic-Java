
// Find the max and min number from a given array.

package DateTime_Function_and_Array;

public class Max_Min_Number_Array {

    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5,6,7,8,9,0};

        int max=numbers[0];
        int min=numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("Max value is: "+max);
        System.out.println("Min value is: "+min);
    }
}
