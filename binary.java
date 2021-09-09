import java.util.Scanner;
public class binary {
    public static void main(String[] args) {
        int a, awal, akhir, jumlah, search, tengah, array[];
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        jumlah = masuk.nextInt();
        array = new int[jumlah];

        System.out.println("Masukkan " + jumlah + " list angka anda dibawah ini: ");

        for (a=0; a<jumlah; a++)
            array[a] = masuk.nextInt();
        System.out.print("Masukkan nilai yang ingin ditemukan: ");
        search = masuk.nextInt();

            awal = 0;
            akhir = jumlah-1;
            tengah = (awal + akhir)/2;

            while(awal <= akhir){
                if(array[tengah] < search)
                awal = tengah + 1;
                else if (array[tengah] == search){
                    System.out.println("Angka " + search + " ditemukan berada di index ke-" + (tengah + 1) + "\n");
                    break;
            } else {
                akhir = tengah - 1;
                tengah = (awal + akhir)/2;
                }
            }
        if (awal > akhir) {
            System.out.println("Data tidak ditemukan");
        }

    masuk.close();
    }
}
