package uoc.ds.pr.model;

public class ParkingReservation extends Reservation {
    private String idVehicle;
    private int unLoadTimeInMinutes;

    //public Reservation(Voyage voyage, List<Client> clients, boolean hasParkingLot)
    public ParkingReservation(String id, Voyage voyage, String idVehicle, int unLoadTimeInMinutes) {
        super(id, voyage);  // Suponiendo que Reservation tiene un constructor que acepta estos parámetros
        this.idVehicle = idVehicle;
        this.unLoadTimeInMinutes = unLoadTimeInMinutes;
    }

    // Getters y Setters
    public String getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(String idVehicle) {
        this.idVehicle = idVehicle;
    }

    public int getUnLoadTimeInMinutes() {
        return unLoadTimeInMinutes;
    }

    public void setUnLoadTimeInMinutes(int unLoadTimeInMinutes) {
        this.unLoadTimeInMinutes = unLoadTimeInMinutes;
    }
}
