import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array 1
        System.out.print("Panjang array 1 : ");
        int n = input.nextInt();
        int[] array1 = new int[n];

        System.out.println("Isi array 1 : ");
        for (int i=0; i<n; i++){
            array1[i] = input.nextInt();
        }

        // array 2
        System.out.print("Panjang array 2 : ");
        n = input.nextInt();

        int[] array2 = new int[n];
        System.out.println("Isi array 2 : ");
        for (int i=0; i<n; i++){
            array2[i] = input.nextInt();
        }

        //tambahkan, masukkan dalam array baru
        //menurut array yang lebih pendek
        n = Math.min(array1.length, array2.length);
        int[] arrayResult = new int[n];
        
        System.out.println("Array hasil : ");
        for (int i = 0; i<n; i++){
            arrayResult[i] = array1[i] + array2[i];
            System.out.print(arrayResult[i] + " ");
        }
        System.out.println();
        input.close();
    }

}
