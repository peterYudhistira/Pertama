import java.util.Scanner; // diperlukan untuk membaca input.

public class loop1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N :");
        int n = input.nextInt();

        for (int i=1; i<=n; i++){

            int C = 1; // used to represent C(line, i)
            for (int j = 1; j <= i; j++){
         
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (i - j) / j;
            }
            System.out.println();
        }
        input.close();
    }
}

/*
isi dalam loop mengambil dari rumus penentuan koefisien binomial newton :
product(i=1, k){(n + 1 - i)/i}, dimana n adalah urutan baris.
jika ingin tahu lebih lanjut, lihat di sini :
https://www.geeksforgeeks.org/pascal-triangle/ ---> metode ketiga
https://en.wikipedia.org/wiki/Binomial_coefficient ---> bagian Multiplicative Formula

*/

