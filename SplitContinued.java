import java.util.Arrays;
import java.util.Scanner;
public class SplitContinued {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split("[-]");
        int[] numbers = new int[arr.length];
        int position=0;
        for(String str:arr){
            numbers[position++]=Integer.parseInt(str);
        }
        Arrays.sort(numbers);
        System.out.println(numbers[arr.length-1]);
    }
}