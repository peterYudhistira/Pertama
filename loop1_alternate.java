import java.util.Scanner;
import java.util.ArrayList;

//cara yang lebih mudah dipahami, yaitu menggunakan arraylist
public class loop1_alternate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N : ");
        int n = input.nextInt();
        ArrayList<Integer> pascalLine = new ArrayList<Integer>();
        ArrayList<Integer> pascalNext = new ArrayList<Integer>();

        pascalLine.add(1); // perhitungan yang ada penjumlahannya dimulai dari line dibawah 1 1
        pascalLine.add(1);
        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // numbers
            if (i == 0) {
                System.out.println("1 ");
            } else if (i == 1) {
                System.out.println("1 1 ");
            } else {

                pascalNext.add(1); // selalu dimulai angka 1
                for (int j = 0; j < pascalLine.size() - 1; j++) {
                    int nextNum = (pascalLine.get(j) + pascalLine.get(j + 1));
                    pascalNext.add(nextNum);
                }
                pascalNext.add(1); // selalu diakhiri angka 1

                pascalLine.clear();
                for (Integer number : pascalNext) {
                    System.out.print(number + " ");
                    pascalLine.add(number);
                }
                System.out.println();
                pascalNext.clear();
            }
        }
        input.close();
    }
}
