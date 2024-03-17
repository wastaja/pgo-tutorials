import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zadanie1();

    }

    public static void Zadanie1() {

        System.out.println("Input a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if(number > 0 ){
            System.out.println("The number is positive!");
        }else if(number == 0 ){
            System.out.println("The value equals to 0!");
        }else{
            System.out.println("The number is negative!");
        }


    }
}




