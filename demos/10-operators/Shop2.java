import java.util.Scanner;

public class Shop2 {
    // Asignamos dos constantes para declara , pantalones y camisetas.
    static final double TROUSER_PRICE = 16; // pantalones
    static final double SHIRTS_PRINCE = 22; // camisetas

    static int[] getDataByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vendes paquetes de pantalones y camisetas a  %s EU \n", TROUSER_PRICE);
        System.out.printf("Vendes paquetes de pantalones y camisetas a  %s EU \n", SHIRTS_PRINCE);//
        System.out.println("Dime el numero de paquetes de pantalones");
        int packetsTrouser = scanner.nextInt();
        System.out.println("Dime el numero de paquetes de camisetas");
        int packetsShirts = scanner.nextInt();

        System.out.println("");
        int[] result = { packetsTrouser, packetsShirts };
        return result;
        // return new int[] {packetsTrouser,packetsShirts};

    }

    public static void main(String[] args) {
        int[] numPackets = getDataByScanner();

        int numPacketsTrousers = numPackets[0];
        int numPacketsShirt = numPackets[1];
        int numPacketsTotal = numPacketsTrousers + numPacketsShirt;

        double discount = 0.15;
        int shippingByPacket = 0;
        double promotion = 0;

        if (numPacketsTotal < 5) {
            System.out.println("Numero de paquetes insuficiente");
            return;
        } else if (numPacketsTotal < 10) {
            discount = 0.05;
            shippingByPacket = 10;
        } else if (numPacketsTotal < 20) {
            discount = 0.1;
            shippingByPacket = 5;

        }

        // Valid6ara los casos 2,3 y 4
        double total = numPacketsShirt * SHIRTS_PRINCE + numPacketsTrousers * TROUSER_PRICE; // 100
        double finalDiscount = total * discount; // 10% -> 10
        double totalShipping = numPacketsTotal * shippingByPacket;
        double finalPrince = total - finalDiscount + totalShipping;

        if (total >= 1000) {
            promotion = total * 0.10;
            finalPrince = finalPrince - promotion;

            System.out.println("""
                    paquetes  de pantalones  %d
                    paquetes de camisetas %d
                    numero de paquetes total %d
                    -----------------------------
                    precio total del producto %.2f EU
                    Descuento aplicado        %.2f EU
                    Gasto de envió            %.2f EU
                    -----------------------------------
                    PROMOCIÓN
                    Descuento                  %.2f EU
                    ------------------------------------
                    TOTAL                     %.2f EU


                            """.formatted(numPacketsTrousers, numPacketsShirt,
                    numPacketsTotal, total, finalDiscount, totalShipping,
                    promotion, finalPrince));

        } else {
            double amoutToPromotion = 1000 - total;

            System.out.println("""
                     paquetes  de pantalones  %d
                     paquetes de camisetas %d
                     numero de paquetes total %d
                     -----------------------------
                     precio total del producto %.2f EU
                     Descuento aplicado        %.2f EU
                     Gasto de envió            %.2f EU
                     -----------------------------------
                     PROMOCIÓN NO APLICADA
                    Cantidad que falta                  %.2f EU
                     ------------------------------------
                     TOTAL                     %.2f EU


                             """.formatted(numPacketsTrousers, numPacketsShirt,
                    numPacketsTotal, total, finalDiscount, totalShipping,
                    amoutToPromotion, finalPrince));

        }
    }

}
