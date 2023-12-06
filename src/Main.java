import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> citta = new HashMap<>();
        citta.put("AG", "Agrigento");
        citta.put("AN", "Ancona");

        System.out.println("citta: " + citta);

        Map<String, String> citta2 = new HashMap<>(Map.of("BO", "Bologna", "BZ", "Bolzano"));

        System.out.println("citta2: " + citta2);

        Map<String, String> citta3 = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>("AQ", "L'Aquila"),
                new AbstractMap.SimpleEntry<>("LT", "Latina")
        ));
        System.out.println("citta3: " + citta3);
    }
}
