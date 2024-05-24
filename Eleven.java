import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter  the elements in the array: ");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();  
        }
        int currentValue=-1;
        int currentLength=0;
        int longestValue=-1;
        int longestLength=0;

        for(int i=0;i<size;i++){
            if(arr[i]==currentValue){
                currentLength++;
            }
            else{
                currentValue=arr[i];
                currentLength=1;
            }
            if(currentLength>longestLength){
                longestLength=currentLength;
                longestValue=currentValue;
            }
        }
        System.out.println("longest series value"+ longestValue );
        System.out.println("longest series length"+ longestLength);
       
    }
}
