import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1. Hitung luas segitiga (tipe int)");
            System.out.println("2. Hitung luas segitiga (tipe double)");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1: {
                    System.out.println("=== HITUNG LUAS SEGITIGA (TIPE INT) ===");
                    System.out.println("Input Alas dan Tinggi : ");
                    int alas = scanner.nextInt();
                    int tinggi = scanner.nextInt();
                    System.out.println("nilai Alas anda : "+ alas+ "\nnilai Tinggi anda : "+tinggi);
                    Segitiga<Integer> segitigaInt = new Segitiga<>(alas, tinggi);
                    System.out.println("Luas segitiga: " + segitigaInt.getResultAsInt());
                    break;
                }
                case 2: {
                    System.out.println("=== HITUNG LUAS SEGITIGA (TIPE DOUBLE) ===");
                    System.out.println("Input Alas dan Tinggi : ");
                    double alas = scanner.nextDouble();
                    double tinggi = scanner.nextDouble();
                    System.out.println("nilai Alas anda : "+ alas+ "\nnilai Tinggi anda : "+tinggi);
                    Segitiga<Double> segitigaDouble = new Segitiga<>(alas, tinggi);
                    System.out.println("Luas segitiga: " + segitigaDouble.getResultAsDouble());
                    break;
                }
                case 3: {
                    System.out.println("Terima kasih");
                    System.exit(0);
                }
                default: {
                    System.out.println("Menu tidak tersedia");
                    break;
                }
            }

            System.out.println();
        }
    }
}