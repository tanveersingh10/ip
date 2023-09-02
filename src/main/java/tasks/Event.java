package tasks;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {

    private LocalDateTime fromTime;
    private LocalDateTime toTime;

    public Event(String taskName, LocalDateTime fromTime, LocalDateTime toTime) {
        super(taskName);
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    public Event(String taskName, boolean done, LocalDateTime fromTime, LocalDateTime toTime) {
        super(taskName, done);
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm");
        String formattedFromTime = fromTime.format(formatter);
        String formattedToTime = toTime.format(formatter);

        return "[E]" + super.toString() + " (from: " + formattedFromTime + " to: " + formattedToTime + ")";
    }

}