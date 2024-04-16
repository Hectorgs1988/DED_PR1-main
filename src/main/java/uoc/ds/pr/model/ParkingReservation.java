package uoc.ds.pr.model;
import java.util.List;
import uoc.ds.pr.ShippingLine;

public class ParkingReservation extends Reservation {
    private String idVehicle;
    private int unLoadTimeInMinutes;


    public ParkingReservation(Voyage voyage, List<Client> clients, boolean hasParkingLot, ShippingLine.AccommodationType accommodationType, String idVehicle, int unLoadTimeInMinutes) {
        super(voyage, clients, hasParkingLot);
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
