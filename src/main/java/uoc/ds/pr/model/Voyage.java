package uoc.ds.pr.model;
import java.util.Date;

public class Voyage {
    private String id;
    private Date departureDt;
    private Date arrivalDt;
    private Ship ship;
    private Route route;
    private int totalArmChairs;
    private int reservedArmChairs;
    private int totalCabin2;
    private int reservedCabin2;
    private int totalCabin4;
    private int reservedCabin4;
    private int totalParkingSlots;
    private int reservedParkingSlots;

    public Voyage(String id, Date departureDt, Date arrivalDt, Ship ship, Route route,
                  int totalArmChairs, int totalCabin2, int totalCabin4, int totalParkingSlots) {
        this.id = id;
        this.departureDt = departureDt;
        this.arrivalDt = arrivalDt;
        this.ship = ship;
        this.route = route;
        this.totalArmChairs = totalArmChairs;
        this.totalCabin2 = totalCabin2;
        this.totalCabin4 = totalCabin4;
        this.totalParkingSlots = totalParkingSlots;
        this.reservedArmChairs = 0;
        this.reservedCabin2 = 0;
        this.reservedCabin4 = 0;
        this.reservedParkingSlots = 0;
    }


    //Getters and Setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDepartureDt() {
        return departureDt;
    }

    public void setDepartureDt(Date departureDt) {
        this.departureDt = departureDt;
    }

    public Date getArrivalDt() {
        return arrivalDt;
    }

    public void setArrivalDt(Date arrivalDt) {
        this.arrivalDt = arrivalDt;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getTotalArmChairs() {
        return totalArmChairs;
    }

    public void setTotalArmChairs(int totalArmChairs) {
        this.totalArmChairs = totalArmChairs;
    }

    public int getReservedArmChairs() {
        return reservedArmChairs;
    }

    public void setReservedArmChairs(int reservedArmChairs) {
        this.reservedArmChairs = reservedArmChairs;
    }

    public int getTotalCabin2() {
        return totalCabin2;
    }

    public void setTotalCabin2(int totalCabin2) {
        this.totalCabin2 = totalCabin2;
    }

    public int getReservedCabin2() {
        return reservedCabin2;
    }

    public void setReservedCabin2(int reservedCabin2) {
        this.reservedCabin2 = reservedCabin2;
    }

    public int getTotalCabin4() {
        return totalCabin4;
    }

    public void setTotalCabin4(int totalCabin4) {
        this.totalCabin4 = totalCabin4;
    }

    public int getReservedCabin4() {
        return reservedCabin4;
    }

    public void setReservedCabin4(int reservedCabin4) {
        this.reservedCabin4 = reservedCabin4;
    }

    public int getTotalParkingSlots() {
        return totalParkingSlots;
    }

    public void setTotalParkingSlots(int totalParkingSlots) {
        this.totalParkingSlots = totalParkingSlots;
    }

    public int getReservedParkingSlots() {
        return reservedParkingSlots;
    }

    public void setReservedParkingSlots(int reservedParkingSlots) {
        this.reservedParkingSlots = reservedParkingSlots;
    }


    //Otros metodos mas

    public int numParkingLots() {
        return totalParkingSlots;
    }
    public int getAvailableArmChairs() {
        return totalArmChairs - reservedArmChairs;
    }

    public int getAvailableCabin2() {
        return totalCabin2 - reservedCabin2;
    }

    public int getAvailableCabin4() {
        return totalCabin4 - reservedCabin4;
    }

    public int getAvailableParkingSlots() {
        return totalParkingSlots - reservedParkingSlots;
    }


}
