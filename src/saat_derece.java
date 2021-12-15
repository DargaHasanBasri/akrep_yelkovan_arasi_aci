import java.util.Scanner;
public class saat_derece {
    public static void main(String[] args) {
        int saat, dakika, top1, top2, aradaki_aci;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lutfen tek basamakli saat değerini iki hane şeklinde giriniz : \n(ör: 00, 01, 02, 03, 04, 05, 06, 07, 08, 09)");
        System.out.print("Lutfen saat giriniz : ");
        saat = girdi.nextInt();
        System.out.println("Lutfen tek basamakli dakika değerini iki hane şeklinde giriniz :\n(ör: 00, 01, 02, 03, 04, 05, 06, 07, 08, 09)");
        System.out.print("Lutfen dakika giriniz : ");
        dakika = girdi.nextInt();
        top1 = dakika * 6; // dakikanin taradigi aci
        if(saat > 0 && saat < 12){
            top2 = saat * 5 * 6; // akrebin taradigi aci
            aradaki_aci = Math.abs(top1 - top2);
            System.out.println("Akrep ile yelkovan arasındaki açı : " + aradaki_aci);
        } else if(saat > 12 && saat < 24) {
            top2 = Math.abs((12 - saat) * 5 * 6);
            aradaki_aci = Math.abs(top1 - top2);
            System.out.println("Akrep ile yelkovan arasındaki açı : " + aradaki_aci);
        } else if (saat == 12 || saat == 24 || saat == 00) {
            aradaki_aci = top1;
            System.out.println("Akrep ile yelkovan arasındaki açı : " + aradaki_aci);
        } else if( (saat == 12 && dakika == 00) || (saat == 24 && dakika == 00) ) {
            aradaki_aci = 0;
            System.out.println("Akrep ile yelkovan arasındaki açı : " + aradaki_aci);
        }
    }
}
