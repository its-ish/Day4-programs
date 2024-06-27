import java.util.Scanner;
public class Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] characters = input.toCharArray();
        int counter=0;
        for(char ch: characters) {
            if (Character.isDigit(ch)) {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}