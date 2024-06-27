import java.util.Scanner;
public class Stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            str.append(sc.nextLine());
        }

    }
}