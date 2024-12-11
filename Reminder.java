public class Reminder {
    private Event event;
    private String time;
    private String message;

    // Constructor
    public Reminder(Event event, String time, String message) {
        this.event = event;
        this.time = time;
        this.message = message;
    }

    // Getters and Setters
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // You can add methods to send reminders or format reminder messages.
}
