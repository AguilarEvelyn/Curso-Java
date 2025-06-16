import java.util.Scanner;

public class Shop {

    static final double PACKET_PRICE = 20;

    static int getDataByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vendes paquetes de pantalones y camisetas a %s EU \n", PACKET_PRICE);
        System.out.println("Dime el numero de paquetes de pantalones");
        int packets = scanner.nextInt();
        System.out.println("");
        return packets;

    }

    public static void main(String[] args) {
        int numPackets = getDataByScanner();
        System.out.println(numPackets);
        double discount = 0.15;
        int shippingByPacket = 0;

        if (numPackets < 5) {
            System.out.println("Numero de paquetes insuficiente");
            return;
        } else if (numPackets < 10) {
            discount = 0.05;
            shippingByPacket = 10;
        } else if (numPackets < 20) {
            discount = 0.1;
            shippingByPacket = 5;

        }

        // Valid6ara los casos 2,3 y 4
        double total = numPackets * PACKET_PRICE; // 100
        double finalDiscount = total * discount; // 10% -> 10
        double totalShipping = numPackets * shippingByPacket;
        double finalTotal = total - finalDiscount + totalShipping;

        System.out.println("""
                   Numero de paquetes %s
                precio total del producto %s
                Descuento aplicado %s
                Gasto de envió %s
                ---------------------------
                TOTAL %s


                        """.formatted(numPackets, total, finalDiscount, totalShipping, finalTotal));

    }

}
