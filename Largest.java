import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int position=0;
        while(position < 5){
            numbers[position] = sc.nextInt();
            position++;
        }

        int largestNumber = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largestNumber){
                largestNumber=numbers[i];
            }
        }

        System.out.println(largestNumber);

    }

}