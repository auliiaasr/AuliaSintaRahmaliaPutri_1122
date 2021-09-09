import java.util.ArrayList;
public class ganjilgenap {
    public static void main(String[] args){
        String bilangan [] = {"1","2","3","123124235","43641235436236","2634645856295803463","138246093486289507235", 
        "32894702358729356237598275","1928309127482365834759870","10927389015678329650198364076302576",
        "109749283652093786523","5","1","7","4","2390975189365823765","2839572803652780356","9840912370928365726",
        "983407629365028765","23870592863508726","38267502983640187365","8974309857239857235","238970918635280375235", 
        "283657235689236502365","325896209867203765023523","2385720698270498732535",
        "2835720938572093857209835726","235872098375209385723985235"};
        int bilangan1 [] = new int[bilangan.length];
        ArrayList<String> ganjil = new ArrayList<String>();
        ArrayList<String> genap = new ArrayList<String>();

        for (int i=0; i<bilangan.length; i++){
            bilangan1[i]= Integer.parseInt(bilangan[i].substring(bilangan[i].length() - 1)); 
        }

        System.out.println("Bilangan genap: ");
        for (int i=0; i<bilangan.length; i++){
            if (bilangan1[i] % 2 == 0) {
                genap.add(bilangan[i]);
                System.out.print(bilangan[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil :  ");
        for (int i=0; i<bilangan.length; i++){
            if (bilangan1[i] % 2 == 1){
                ganjil.add(bilangan[i]);
                System.out.print(bilangan[i] + " ");
            }
        }      
    }
}
