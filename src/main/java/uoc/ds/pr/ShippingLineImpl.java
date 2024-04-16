package uoc.ds.pr;

import java.util.Date;

import edu.uoc.ds.adt.sequential.LinkedList;
import edu.uoc.ds.adt.sequential.List;
import edu.uoc.ds.traversal.Iterator;
import uoc.ds.pr.exceptions.*;
import uoc.ds.pr.model.*;
import uoc.ds.pr.util.DSArray;
import uoc.ds.pr.util.DSLinkedList;
import uoc.ds.pr.util.OrderedVector;


public class ShippingLineImpl implements ShippingLine {

    @Override
    public void addShip(String id, String name, int nArmChairs, int nCabins2, int nCabins4, int nParkingLots, int unLoadTimeinMinutes) {

    }

    @Override
    public void addRoute(String id, String beginningPort, String arrivalPort) {

    }

    @Override
    public void addClient(String id, String name, String surname) {

    }

    @Override
    public void addVoyage(String id, Date departureDt, Date arrivalDt, String idShip, String idRoute) throws ShipNotFoundException, RouteNotFoundException, ParkingFullException, NoAcommodationAvailableException {

    }

    @Override
    public void reserve(String[] clients, String idVoyage, AccommodationType accommodationType, String idVehicle, double price) throws ClientNotFoundException, VoyageNotFoundException, ParkingFullException, NoAcommodationAvailableException, MaxExceededException, ReservationAlreadyExistsException {

    }

    @Override
    public void load(String idClient, String idVoyage, Date dt) throws LoadingAlreadyException, ClientNotFoundException, VoyageNotFoundException, ReservationNotFoundException {

    }

    @Override
    public Iterator<Reservation> unload(String idVoyage) throws VoyageNotFoundException {
        return null;
    }

    @Override
    public int unloadTime(String idVehicle, String idVoyage) throws LandingNotDoneException, VoyageNotFoundException, VehicleNotFoundException {
        return 0;
    }

    @Override
    public Iterator<Reservation> getClientReservations(String idClient) throws NoReservationException {
        return null;
    }

    @Override
    public Iterator<Reservation> getVoyageReservations(String idVoyage) throws NoReservationException {
        return null;
    }

    @Override
    public Iterator<Reservation> getAccommodationReservations(String idVoyage, AccommodationType accommodationType) throws NoReservationException {
        return null;
    }

    @Override
    public Client getMostTravelerClient() throws NoClientException {
        return null;
    }

    @Override
    public Route getMostTraveledRoute() throws NoRouteException {
        return null;
    }

    /**
     * @param id
     *********************************************************************************/
    @Override
    public Ship getShip(String id) {
        return null;
    }

    @Override
    public Route getRoute(String idRoute) {
        return null;
    }

    @Override
    public Client getClient(String id) {
        return null;
    }

    @Override
    public Voyage getVoyage(String id) {
        return null;
    }

    @Override
    public int numShips() {
        return 0;
    }

    @Override
    public int numRoutes() {
        return 0;
    }

    @Override
    public int numClients() {
        return 0;
    }

    @Override
    public int numVoyages() {
        return 0;
    }
}
