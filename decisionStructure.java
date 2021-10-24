import java.util.Scanner;

public class decisionStructure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double tes, praktikum, uts, uas, nilaiAkhir; // deklarasi semacam ini diperbolehkan

        //tes, bobot : 20%
        System.out.print("Nilai tes : ");
        tes = input.nextDouble();

        //praktikum, bobot : 20%
        System.out.print("Nilai praktikum : ");
        praktikum = input.nextDouble();

        //uts, bobot : 30%
        System.out.print("Nilai UTS : ");
        uts = input.nextDouble();

        //uas, bobot : 30%
        System.out.print("Nilai UAS : ");
        uas = input.nextDouble();

        //total
        nilaiAkhir = 0.2 * tes + 0.2 * praktikum + 0.3 * uts + 0.3 * uas;

        

        char grade;
        //masuk ke percabangan
        if (nilaiAkhir >= 86){
            grade = 'A';
        }
        else if (76 <= nilaiAkhir && nilaiAkhir <= 85){
            grade = 'B';
        }
        else if (66 <= nilaiAkhir && nilaiAkhir <= 75){
            grade = 'C';
        }
        else if (56 <= nilaiAkhir && nilaiAkhir <= 65){
            grade = 'D';
        }
        else{
            grade = 'E';
        }
        System.out.println("Nilai akhir : " +  nilaiAkhir + ", Grade : " + grade);
        input.close();
    }
}
