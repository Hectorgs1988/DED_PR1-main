package uoc.ds.pr.model;
import java.util.List;
import uoc.ds.pr.ShippingLine;
import java.util.ArrayList;
//import java.util.Iterator;
import edu.uoc.ds.traversal.Iterator;


public class Reservation {
    private Voyage voyage;
    private List<Client> clients;  // Lista de clientes que participan en esta reserva
    private boolean hasParkingLot;
    private ShippingLine.AccommodationType accommodationType;

    //Constructor

    public Reservation(Voyage voyage, List<Client> clients, boolean hasParkingLot) {
        this.voyage = voyage;
        this.clients = new ArrayList<>();
        this.hasParkingLot = hasParkingLot;
    }


    //Getters and Setters

    public Voyage getVoyage() {
        return voyage;
    }

    public void setVoyage(Voyage voyage) {
        this.voyage = voyage;
    }

    public List<Client> getClients() {
        return clients;
    }

    /*public Iterator<Client> getClients() {
        return clients.iterator();
    }*/

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public boolean isHasParkingLot() {
        return hasParkingLot;
    }

    public void setHasParkingLot(boolean hasParkingLot) {
        this.hasParkingLot = hasParkingLot;
    }

    //Otros metodos
    public int numClients() {
        return clients.size();
    }

    public boolean hasParkingLot() {
        return hasParkingLot;
    }

    public ShippingLine.AccommodationType getAccommodationType() {
        return accommodationType;
    }

    public edu.uoc.ds.traversal.Iterator<Client> clients() {
        return null;
    }

    public String getIdVehicle() {
        return null;
    }
}
