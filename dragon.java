import java.util.Arrays;
public class dragon {
    public static void main(String[] args) {
        int[] knight = { 4,3,1,2,8,6,9,7,10,11,12,13,14,15,16,17 };
        int[] dragon = { 7,2,4,6,8,1,3,4 };
        Arrays.sort(knight);
        Arrays.sort(dragon);
        int indeksDragon = 0;
        int power = 0;
        for (int x : knight){
            if (indeksDragon < dragon.length){
                if (x >= dragon[indeksDragon]){
                    power += x;
                    indeksDragon++;
                }
            }
        }
        if (indeksDragon == dragon.length){
            System.out.println("Minimum power : " + power);
        } else {
            System.out.println("Knight Fall");
        }
    }
}
