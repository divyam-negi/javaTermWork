import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter x: ");
int x = sc.nextInt();
System.out.println("enter y: ");
int y = sc.nextInt();
System.out.println("enter n: ");
int n = sc.nextInt();
double sum = 0.0;
for (int i = 1; i <= n; i++) {
    sum += (Math.pow(x, 2*i-1) / Math.pow(y, 2*i));
}
System.out.println(sum);
}
}