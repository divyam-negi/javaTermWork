import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        String subsequence="";
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);

            if(Character.isLetter(currentChar)){
                subsequence+=currentChar;
            }
            else{
                if(subsequence.length()>=3){
                    System.out.println(subsequence);
                }
                subsequence="";
            }
        }
        if(subsequence.length()>=3){
            System.out.println(subsequence);
        }
    }
}
