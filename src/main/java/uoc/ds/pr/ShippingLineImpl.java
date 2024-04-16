package uoc.ds.pr;

import java.util.Date;

import edu.uoc.ds.adt.sequential.LinkedList;
import edu.uoc.ds.adt.sequential.List;
import edu.uoc.ds.traversal.Iterator;
import uoc.ds.pr.exceptions.*;
//import uoc.ds.pr.model.*;
import uoc.ds.pr.model.Ship;
import uoc.ds.pr.model.Route;
import uoc.ds.pr.model.Voyage;
import uoc.ds.pr.model.Client;
import uoc.ds.pr.model.Reservation;
import uoc.ds.pr.util.DSArray;
import uoc.ds.pr.util.DSLinkedList;
import uoc.ds.pr.util.OrderedVector;
import java.util.Map;
import java.util.HashMap;


public class ShippingLineImpl implements ShippingLine {
    private Map<String, Ship> ships = new HashMap<>();
    private Map<String, Route> routes = new HashMap<>();
    private Map<String, Client> clients = new HashMap<>();
    private Map<String, Voyage> voyages = new HashMap<>();

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
    public void addVoyage(String id, Date departureDt, Date arrivalDt, String idShip, String idRoute)
            throws ShipNotFoundException, RouteNotFoundException, ParkingFullException, NoAcommodationAvailableException {
        Ship ship = ships.get(idShip);
        if (ship == null) {
            throw new ShipNotFoundException("Ship with ID " + idShip + " not found.");
        }

        Route route = routes.get(idRoute);
        if (route == null) {
            throw new RouteNotFoundException();
        }

        // Aquí podrías verificar si hay espacio suficiente en el barco para el tipo de acomodación especificado
        // y lanzar las excepciones ParkingFullException o NoAcommodationAvailableException si es necesario


        Voyage voyage = new Voyage(id, departureDt, arrivalDt, ship, route); // Esto creo que sera por en la clase Voyage he añadido atributos y actualizado el constructor
        voyages.put(id, voyage);
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
