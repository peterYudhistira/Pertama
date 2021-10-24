import java.io.*; // untuk bufferedreader
import java.util.*; //untuk scanner dan exception

public class fileAndErrorHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader stringInput = new BufferedReader(r);

        int counter = 0;
        Boolean good = false;
        while (good == false) {
            try {
                System.out.print("Angka : ");
                int n = input.nextInt();
                // add buffer here

                System.out.print("Save ke file : ");
                String filename = stringInput.readLine();

                PrintWriter outputFile = new PrintWriter(filename);

                // looping here
                int offset = 0;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        outputFile.print(j + offset);
                        if (j == i) {
                            offset += j;
                            outputFile.println();
                        } else {
                            outputFile.print(" ");
                        }

                    }
                }

                outputFile.close();
                good = true;
            } catch (FileNotFoundException e) {
                System.out.println("Nama file tidak ditemukan.");
            } catch (InputMismatchException e) {
                System.out.println("Input tidak sesuai! Masukkan integer.");
                input.nextLine(); // karena Scanner.next() tidak menangkap \n, \n akan ditangkap oleh scanner
                                  // berikutnya. untuk menghindari rusaknya program, ditangkap disini.
            } catch (IOException e) {
                System.out.println("IO Exception");
            }
            finally{
                counter++;
                System.out.println(counter + " iterasi dilakukan.");
                System.out.println();
            }
        }
        input.close(); 
    }
}

// 