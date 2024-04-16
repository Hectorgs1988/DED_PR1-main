package uoc.ds.pr.model;

public class Client {
    private String id;
    private String name;
    private String surname;

    //Constructor

    public Client(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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
}