import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Event event1 = new Event(1, "Julebord", "Rockheim", "TIHLDE", "middag", 202111041800L);
        Event event2 = new Event(2, "Juleball", "Rockheim", "TIHLDE", "ball", 202111071800L);
        Event event3 = new Event(3, "Fest", "Samfundet", "Samfundet", "fest", 202112032000L);
        Event event4 = new Event(4, "Fest med Eric", "hos meg", "Eric", "fest", 202112052100L);
        Event event5 = new Event(5, "Kodekveld", "hos meg", "Eric", "koding", 202112071300L);

        EventRegister register = new EventRegister();
        register.registerEvent(event1);
        register.registerEvent(event2);
        register.registerEvent(event3);
        register.registerEvent(event4);
        register.registerEvent(event5);

        System.out.println(register.toString());

        System.out.println("---------------------\nDato: 2021 11 04 18:00");
        ArrayList<Event> funnedeArrangementer = register.findEventsGivenTime(202111041800L);
        System.out.println(EventRegister.eventsToString(funnedeArrangementer));

        System.out.println("---------------------\nSortert etter dato:");
        ArrayList<Event> sorterteArrangementer = register.getEventsSortedByTime();
        System.out.println(EventRegister.eventsToString(sorterteArrangementer));

        System.out.println("---------------------\nSortert etter sted:");
        sorterteArrangementer = register.getEventsSortedByPlace();
        System.out.println(EventRegister.eventsToString(sorterteArrangementer));

        System.out.println("---------------------\nSortert etter type:");
        sorterteArrangementer = register.getEventsSortedByType();
        System.out.println(EventRegister.eventsToString(sorterteArrangementer));

        System.out.println("---------------------\nI desember:");
        funnedeArrangementer = register.findEventsBetweenTimes(202112000000L, 202112310000L);
        System.out.println(EventRegister.eventsToString(funnedeArrangementer));
    }
}
