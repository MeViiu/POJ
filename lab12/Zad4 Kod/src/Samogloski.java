import java.util.HashMap;
import java.util.Map;

public class Samogloski {
    public static Map<Character, Integer> zliczSamogloski(String tekst) {
        Map<Character, Integer> wystapienia = new HashMap<>();
        tekst = tekst.toLowerCase();
        for (char c : tekst.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                wystapienia.put(c, wystapienia.getOrDefault(c, 0) + 1);
            }
        }
        return wystapienia;
    }
}
