public class CarMain {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Car car1= new Car("Toyota", 'S', 5, 4, "Verde", true);
        Car car2= new Car("Ford", 'C', 2, 2, "Negro", false);

        
       System.out.printf("Coche 1: Marca: %s | Tipo: %c | Asiento: %d | Puertas: %d | Color: %s | Automático: %b%n",
        car1.brand,
        car1.type,
        car1.numSeats,
        car1.numDors,
        car1.color,
        car1.isAuto);

        System.out.printf("Coche 2: Marca: %s | Tipo: %c | Asiento: %d | Puertas: %d | Color: %s | Automático: %b%n",
        car2.brand,
        car2.type,
        car2.numSeats,
        car2.numDors,
        car2.color,
        car2.isAuto);
    }
    
}
