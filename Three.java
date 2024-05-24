import java.util.Scanner;

public class Three{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter string one: ");
        String s1=sc.nextLine();
        System.out.println("enter string two: ");
        String s2=sc.nextLine();
        String[] result=check(s1,s2);
        System.out.println("Modified String 1: " + result[0]);
        System.out.println("Modified String 2: " + result[1]);
    }
    public static String[]  check(String str1,String str2){
        char duplicate=0;
        for(int i=0;i<str1.length();i++){
            char c=str1.charAt(i);
            if(str1.indexOf(c) != str1.lastIndexOf(c) && str2.indexOf(c) != -1 && str2.indexOf(c)!= str2.lastIndexOf(c)){
                duplicate=c;
                break;
            }
        }
    
        if(duplicate !=0){
            str1 = str1.replace(Character.toString(duplicate), "");
            str2 = str2.replace(Character.toString(duplicate), "");
        }
        return new String[]{str1,str2};
    }
}



