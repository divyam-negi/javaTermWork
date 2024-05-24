import java.util.Scanner;
public class Seventeen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string: ");
        String str=sc.nextLine();
        int[] freq=new int[256];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
        int max1=0;
        int max2=0;
        char result='\0';

        for(int i=0;i<freq.length;i++){
            if(freq[i]>freq[max1]){
                max2=max1;
                max1=i;
            }
            else if(freq[i]>freq[max2] && freq[i]!=freq[max1]){
                max2=i;
            }
        }
        result=(char) max2;

        if(result !='\0'){
            System.out.println("second most frequency is: "+result);
        }

    }
    
}
