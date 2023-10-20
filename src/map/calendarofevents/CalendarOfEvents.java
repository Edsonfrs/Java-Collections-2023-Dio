package map.calendarofevents;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

import static java.time.Month.*;

public class CalendarOfEvents {

    private Map<LocalDate, Event> eventsMap;

    public CalendarOfEvents() {
        this.eventsMap = new HashMap<>();
    }

    public void addEventsToCalendar(LocalDate date, String name, String attraction){
        Event event = new Event(name, attraction);
        eventsMap.put(date, event);
    }

    public void displayCalendarOfEvents(){
        Map<LocalDate, Event> eventsTreeMap = new TreeMap<>(eventsMap);
        System.out.println(eventsTreeMap);
    }

    public void getNextEvent() {
        LocalDate currentDate = LocalDate.now();
        LocalDate nextDate = null;
        Event nextEvent = null;
        Map<LocalDate, Event> eventsTreeMap = new TreeMap<>(eventsMap);
        for(Map.Entry<LocalDate, Event> entry : eventsTreeMap.entrySet()) {
            if (entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate))  {
                nextDate = entry.getKey();
                nextEvent = entry.getValue();
                System.out.println("Next event: " + nextEvent);
                System.out.println("Date: " + nextDate);
                break;
            }
        }
    }

    public static void main(String[] args) {
        CalendarOfEvents calendarOfEvents = new CalendarOfEvents();

        calendarOfEvents.addEventsToCalendar(LocalDate.of(2023, OCTOBER, 15), "Event 1", "Atracttion 1");
        calendarOfEvents.addEventsToCalendar(LocalDate.of(2023, NOVEMBER, 10), "Event 2", "Atracttion 2");
        calendarOfEvents.addEventsToCalendar(LocalDate.of(2023, DECEMBER, 6), "Event 3", "Atracttion 3");
        calendarOfEvents.addEventsToCalendar(LocalDate.of(2020, JULY, 7), "Event 4", "Atracttion 4");
        calendarOfEvents.addEventsToCalendar(LocalDate.of(2023, DECEMBER, 12), "Event 5", "Atracttion 5");
        calendarOfEvents.addEventsToCalendar(LocalDate.of(2023, NOVEMBER, 9), "Event 6", "Atracttion 6");

        calendarOfEvents.displayCalendarOfEvents();

        calendarOfEvents.getNextEvent();


    }


}
