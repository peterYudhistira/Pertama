import java.util.Scanner; // diperlukan untuk membaca input.

public class javaFundamentals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //membuat sebuah objek scanner untuk membaca input.
        String namaDepan;
        String namaBelakang;
        double tinggiBadan;
        int tahunLahir;
        String alamat;
        int kodePos;

        // nama depan
        System.out.print("Nama depan : "); // print saja tidak akan membuat newline.
        namaDepan = input.next(); // untuk string yang tidak dibatasi spasi, lebih aman menggunakan ini.

        // nama belakang
        System.out.print("Nama belakang : ");
        namaBelakang = input.next();

        // tinggi badan
        System.out.print("Tinggi badan : ");
        tinggiBadan = input.nextDouble();

        // tahun lahir
        System.out.print("Tahun lahir : ");
        tahunLahir = input.nextInt();

        // alamat
        input.nextLine(); // nextInt(), nextDouble(), next(), dsb. menangkap input, dan untuk membedakan input satu dengan input lainnya menggunakan \n (nextline). Nextline ditangkap disini karena...
        System.out.print("Alamat : ");
        alamat = input.nextLine(); //... karena perintah input.nextLine() menangkap baris berikutnya. Jika tidak ada buffer seperti diatas, isi alamat adalah "" yang disisakan oleh input pada tahunLahir.

        // kode pos
        System.out.print("Kode pos : ");
        kodePos = input.nextInt();

        System.out.println("Nama saya " + namaDepan + " " + namaBelakang);
        System.out.println("Saya lahir tahun " + tahunLahir + ", tinggi badan saya " + tinggiBadan);
        System.out.println("Saya tinggal di " + alamat + ", kode posnya " + kodePos);

        input.close();
    }
}
