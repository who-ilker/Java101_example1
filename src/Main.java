import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        int num, sumNum = 0;

        do{
            System.out.print("Enter a number: ");
            num = inp.nextInt();
            if (num % 4 == 0)
                sumNum += num;
        }while (num % 2 == 0);

        System.out.println("Sum of numbers matching the condition: "+sumNum);

    }
}