package edu.calvin.cs262;

/**
 * A Player class (POJO) for the player relation
 *
 * @author kvlinden
 * @version summer, 2016
 */
class Player {

    private int id;
    private String emailaddress, name;

    @SuppressWarnings("unused")
    Player() { /* a default constructor, required by Gson */ }

    Player(int id, String emailaddress, String name) {
        this.id = id;
        this.emailaddress = emailaddress;
        this.name = name;
    }

    @SuppressWarnings("unused")
    public int getId() {
        return id;
    }

    @SuppressWarnings("unused")
    public String getEmailaddress() {
        return emailaddress;
    }

    @SuppressWarnings("unused")
    public String getName() {
        return name;
    }

    @SuppressWarnings("unused")
    public void setId(int id) {
        this.id = id;
    }

    @SuppressWarnings("unused")
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }

}
