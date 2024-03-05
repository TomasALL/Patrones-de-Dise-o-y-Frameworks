package bdd_singleton;

public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única del controlador de la base de datos del hotel
        HotelDatabaseController controller = HotelDatabaseController.getInstance();

        // Reservar una habitación
        controller.bookRoom("Suite");
    }
}
