import java.util.Scanner;
public class Concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String combinedstr;
        combinedstr = a;
        combinedstr += b;
        combinedstr += c;
        System.out.println(combinedstr);
    }
}