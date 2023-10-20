package map.calendarofevents;

public class Event {
    private String name;
    private String attraction;

    public Event(String name, String attraction) {
        this.name = name;
        this.attraction = attraction;
    }

    public String getName() {
        return name;
    }

    public String getAttraction() {
        return attraction;
    }

    @Override
    public String toString() {
        return  " name: " + name + " attraction:" + attraction + "\n"
                ;
    }
}
