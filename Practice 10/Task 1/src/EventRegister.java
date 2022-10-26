import java.util.ArrayList;

/**
 * Register for events. This class has the functionality to register events, and
 * search for events based on different criteria. The class also has methods to
 * return all the events in the register sorted by different criteria.
 * 
 * @author Eric Bieszczad-Stie
 */
public class EventRegister {
    private ArrayList<Event> events;

    public EventRegister() {
        this.events = new ArrayList<Event>();
    }

    /**
     * Add a new event to the events register.
     * 
     * @param event  The event to add in the register.
     */
    public void registerEvent(Event event) {
        this.events.add(event);
    }

    /**
     * Find all events given a place.
     * 
     * @param place  The place to search for.
     */
    public ArrayList<Event> findEventsGivenPlace(String place) {
        ArrayList<Event> foundEvents = new ArrayList<Event>();

        for (Event event : this.events) {
            if (event.getPlace().equalsIgnoreCase(place)) {
                foundEvents.add(event);
            }
        }

        return foundEvents;
    }

    /**
     * Find all events that match a given time.
     * 
     * @param time  The time the events need to match.
     * @return the events that match the given time.
     */
    public ArrayList<Event> findEventsGivenTime(long time) {
        ArrayList<Event> foundEvents = new ArrayList<Event>();

        for (Event event : this.events) {
            long eventTime = event.getTime();
            if (eventTime == time) {
                foundEvents.add(event);
            }
        }

        return foundEvents;
    }

    /**
     * Find all events that occur within a start time and an end time. The boundaries are inclusive,
     * meaning that an event that occurs at the start time or the end time will be included in the
     * result.
     * 
     * @return all events that occur within the given time frame.
     */
    public ArrayList<Event> findEventsBetweenTimes(long startTime, long endTime) {
        ArrayList<Event> foundEvents = new ArrayList<Event>();

        for (Event event : this.events) {
            long eventTime = event.getTime();
            if (eventTime >= startTime && eventTime <= endTime) {
                foundEvents.add(event);
            }
        }
        return foundEvents;
    }

    /**
     * Get all events sorted by time.
     * 
     * @return all events in the register, sorted by time.
     */
    public ArrayList<Event> getEventsSortedByTime() {
        ArrayList<Event> sortedEvents = new ArrayList<Event>(this.events);
        sortedEvents.sort((event1, event2) -> Long.compare(event1.getTime(), event2.getTime()));
        return sortedEvents;
    }

    /**
     * Get all events sorted by place.
     * 
     * @return all events in the register, sorted by place.
     */
    public ArrayList<Event> getEventsSortedByPlace() {
        ArrayList<Event> sortedEvents = new ArrayList<Event>(this.events);
        sortedEvents.sort((event1, event2) -> event1.getPlace().compareTo(event2.getPlace()));
        return sortedEvents;
    }

    /**
     * Get all events sorted by type.
     * 
     * @return all events in the register, sorted by type.
     */
    public ArrayList<Event> getEventsSortedByType() {
        ArrayList<Event> sortedEvents = new ArrayList<Event>(this.events);
        sortedEvents.sort((event1, event2) -> event1.getType().compareTo(event2.getType()));
        return sortedEvents;
    }

    /**
     * A string representation of a list of events.
     * 
     * @param events  The list of events to represent as a string.
     * @return a string representation of the given list of events.
     */
    public static String eventsToString(ArrayList<Event> events) {
        String returnString = "";
        for (Event event : events) {
            returnString += event.toString() + "\n";
        }
        return returnString.substring(0, returnString.length()-1);
    }

    @Override
    public String toString() {
        String returnString = "";
        for (Event event : this.events) {
            returnString += event.toString() + "\n";
        }
        return returnString.substring(0, returnString.length()-1);
    }
}
