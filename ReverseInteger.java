/*reverse integer wihtout using any library
 * 
 * Algorithm for a given number of elements 54321
 * 1. num % 10
 * 2. remainder * 10 + remainder
 * 3. num / 10
 */

public class ReverseInteger {
    public static void main(String[] args) {
        reverse(54321); //-ve numbers also work
    }

    static int reverse(int num){
        long reversed =0;
        while(num !=0){
            int temp = num % 10;
            reversed = reversed * 10 + temp;
            num /= 10;
        }
        System.out.println("Reversed: " + reversed);
        return num;
    }


    // static int reverse(int num) {
    //     long reversed = 0;
    //     while(num != 0){
    //         reversed = reversed * 10 + num % 10; // step 1
    //         num /= 10 ;// step 2
    //         if(reversed > Integer.MAX_VALUE || reversed < Integer.MAX_VALUE){
    //             return 0;
    //         }
    //     }
    //     System.out.print(num);
    //     return num;
    // }

}