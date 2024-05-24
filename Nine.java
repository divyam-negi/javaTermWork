import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int digitCount = 0;
        
        // Count the number of digits
        while(temp != 0){
            temp /= 10;
            digitCount++;
        }
        
        // Create an array to store the digits
        int[] digitArray = new int[digitCount];
        temp = num;

        // Store digits in the array
        for(int i = digitCount - 1; i >= 0; i--){
            digitArray[i] = temp % 10;
            temp /= 10;
        }

        // Print the array before reversing
        System.out.println("Original Array: ");
        for(int i = 0; i < digitArray.length; i++){
            System.out.print(digitArray[i] + " ");
        }
        System.out.println(); 
        
        for(int i = 0; i < digitArray.length / 2; i++){
            int tempVar = digitArray[i];
            digitArray[i] = digitArray[digitArray.length - 1 - i];
            digitArray[digitArray.length - 1 - i] = tempVar;
        }

        System.out.println("Reversed Array: ");
        for(int i = 0; i < digitArray.length; i++){
            System.out.print(digitArray[i] + " ");
        }

        System.out.println();

        System.out.println("Elements that remain the same after reversing: ");
        for(int i = 0; i < digitArray.length; i++){
            if(digitArray[i] == digitArray[digitArray.length - 1 - i]){
                System.out.print(digitArray[i] + " ");
            }
        }
    }
}



