import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Fourteen {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>();
        vector.add(113);
        vector.add(34);
        vector.add("abc");
        vector.add(94);
        vector.add(12);
        vector.add("mm");
        Set<Character> uniqueDigits = new HashSet<>();

        for (Object obj : vector) {
            if (obj instanceof Integer) {
                String str = String.valueOf(obj);
                for (char ch : str.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        uniqueDigits.add(ch);
                    }
                }
            }
        }
        StringBuilder output = new StringBuilder();
        for (char digit : uniqueDigits) {
            output.append(digit);
        }
        
        System.out.println("Output string: " + output.toString());
    }
}




    
