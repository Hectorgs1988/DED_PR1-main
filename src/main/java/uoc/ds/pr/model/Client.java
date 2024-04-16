package uoc.ds.pr.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Client {
    private String id;
    private String name;
    private String surname;
    private List<Reservation> reservations = new ArrayList<>();


    //Constructor

    public Client(String id, String name, String surname, List<Reservation> reservations) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.reservations = reservations;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public Iterator<Reservation> reservations() {
        return reservations.iterator();
    }


    //Getters and Setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
