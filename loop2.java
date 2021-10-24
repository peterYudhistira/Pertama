import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Angka pertama : ");
        int number1 = input.nextInt();
        System.out.print("Angka kedua : ");
        int number2 = input.nextInt();
        leastEvenFactors(number1, number2);
        input.close();
    }

    public static int evenFactors(int number){
        int factors = 0;

        for (int i=1; i<=number; i++){
            if(number % i == 0 && i%2 == 0){
               factors++; 
            }
        }
        return factors;
    }

    public static void leastEvenFactors(int number1, int number2){
        int evenFactor1 = evenFactors(number1);
        int evenFactor2 = evenFactors(number2);
        if(evenFactor1 > evenFactor2){
            System.out.println( number1 + " memiliki faktor genap terbanyak.");
        }
        else if (evenFactor1 < evenFactor2){
            System.out.println( number2 + " memiliki faktor genap terbanyak.");

        }
        else{
            System.out.println(number1 + " dan " + number2 + " memiliki faktor genap yang sama banyaknya.");
        }
        
    }
}
