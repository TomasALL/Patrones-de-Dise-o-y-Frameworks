package bdd_singleton;

public class HotelDatabaseController {
    // Instancia única de la clase
    private static HotelDatabaseController instance;

    // Constructor privado para evitar la creación de instancias desde fuera
    private HotelDatabaseController() {}

    // Método para obtener la instancia única
    public static synchronized HotelDatabaseController getInstance() {
        if (instance == null) {
            instance = new HotelDatabaseController();
        }
        return instance;
    }

    // Método para simular la reserva de una habitación
    public void bookRoom(String roomType) {
        System.out.println("Reservando una habitación de tipo: " + roomType + "...");
        // Aquí iría el código para interactuar con la base de datos y realizar la reserva
    }
}
