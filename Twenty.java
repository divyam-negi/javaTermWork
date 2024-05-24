import java.util.Scanner;
import java.util.Arrays;

class Twenty{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter  the elements in the array: ");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();  
        }
        Arrays.sort(arr);
        int second_max=arr[size-2];
        int second_min=arr[1];
        double average=(double)(second_max+second_min)/2;
        System.out.println("The average is: "+average);

    }
}