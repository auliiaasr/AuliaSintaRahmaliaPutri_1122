import java.util.Scanner;
public class prima {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka:");
        int angka = input.nextInt();
        boolean prima = true;
        
        for(int index=2; index<=angka/2; index++){
            if(angka%index ==0){
                prima = false;
                break;

            }
        }

        if(prima && ((angka > 0 )&&(angka != 1)))
            System.out.println(angka+ " adalah bilangan prima");
        else
            System.out.println(angka+ " bukan bilangan prima");
    
    input.close();

    }
}
