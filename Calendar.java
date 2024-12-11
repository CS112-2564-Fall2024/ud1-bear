import java.util.ArrayList;

public class Calendar {
    private ArrayList<Event> events;

    // Constructor
    public Calendar() {
        this.events = new ArrayList<>();
    }

    // Methods to add and retrieve events
    public void addEvent(Event event) {
        this.events.add(event);
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    // You can add more methods like getEventDetails(), getUpcomingEvents(), etc.
}
