/**
 * An representation of an event.
 * 
 * @author Eric Bieszczad-Stie
 */
public class Event {
    private int number;
    private String name;
    private String place;
    private String host;
    private String type;
    private long time;

    /**
     * Creates a new Event object. 
     * 
     * @param number  The number of the event.
     * @param name  The name of the event.
     * @param place  Where the event takes place.
     * @param host  The name of the host of the event.
     * @param type  A word or short string that explains the type of event.
     * @param time  The time of the event formatted (YYYYMMDDHHMMSS).
     */
    public Event(int number, String name, String place, String host, String type, long time) {
        this.number = number;
        this.name = name;
        this.place = place;
        this.host = host;
        this.type = type;
        this.time = time;
    }

    /**
     * Get the time of the event. The long returned is formatted YYYYMMDDHHMMSS.
     * 
     * @return the start time of the event.
     */
    public long getTime() {
        return time;
    }

    /**
     * Get the place of the event.
     * 
     * @return the place of the event.
     */
    public String getPlace() {
        return place;
    }

    /**
     * Get the string description of the type of the event.
     * 
     * @return the event type.
     */
    public String getType() {
        return type;
    }

    /**
     * Get the time of the event as a string object in a human readable format.
     * 
     * @return the time of the event in the format "DD/MM/YYYY HH:MM".
     */
    public String getTimeAsString() {
        String timeAsString = Long.toString(this.time);
        String year = timeAsString.substring(0, 4);
        String month = timeAsString.substring(4, 6);
        String day = timeAsString.substring(6, 8);
        String hour = timeAsString.substring(8, 10);
        String minute = timeAsString.substring(10, 12);
        return String.join("/", day, month, year) + " " + hour + ":" + minute;
    }

    @Override
    public String toString() {
        String returnString = "Arrangement " + this.number + ": " + this.name + " (" + this.type + ")";
        returnString += " arrangert av " + this.host + ". Sted og tid: " + this.place + " - " + getTimeAsString();
        return returnString;
    }
}
