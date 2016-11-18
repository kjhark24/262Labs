package kjh46calvin.homework2;

/**
 * Weather forecast object (POJO), one per day, based on openweathermap's RESTful API.
 * Based on Deitel's WeatherViewer app (chapter 17).
 *
 * @author deitel
 * @author kvlinden
 * @author Kyle Harkema
 *         updated for lab6 of cs262 at calvin college
 * @version spring, 2017
 */
public class Player {

    private final int id;
    private final String name;
    private final String email;

    public Player(int id, String name, String email) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public String getId() {
        return "" + id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

}
