public class Fifteen {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("STRING AND STRING BUFFER COMPARISION");
        String s1=new String("Hello");
        String s2=new String("Hello");
        System.out.print("string '==': ");
        System.out.println(s1==s2);
        System.out.println("String equals method: "+ s1.equals(s2));

        StringBuffer sb1=new StringBuffer("Hello");
        StringBuffer sb2=new StringBuffer("Hello");
        System.out.print("Stringbuffer '==' : ");
        System.out.println(sb1==sb2);
        System.out.println("String buffer equals method: "+ sb1.equals(sb2));

        System.out.println("----------------------------------");

        StringBuffer sb=new StringBuffer("java ");
        sb.append("script");
        System.out.println(sb);

        StringBuffer sb3=new StringBuffer("universe");
        sb3.reverse();
        System.out.println(sb3);


    }
}
