package info.rori.lunchbox.api.v1.repository;

import info.rori.lunchbox.api.v1.model.LunchProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Stellt Beispieldaten für Mittagsanbieter bereit.
 */
public class LunchProviderRepository {

    private static List<LunchProvider> list = new ArrayList<>();

    static {
        list.add(new LunchProvider(1, "Schweinestall", "Neubrandenburg"));
        list.add(new LunchProvider(2, "Hotel am Ring", "Neubrandenburg"));
        list.add(new LunchProvider(3, "AOK Cafeteria", "Neubrandenburg"));
        list.add(new LunchProvider(4, "Suppenkulttour", "Neubrandenburg"));
        list.add(new LunchProvider(5, "Bistro \"Salt 'n' pepper\"", "Berlin Springpfuhl"));
    }

    public List<LunchProvider> findAll() {
        return list;
    }

    public LunchProvider findById(int id) {
        return list.stream().filter(x -> x.id == id).findFirst().orElse(null);
    }
}
