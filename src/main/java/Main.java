import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String msg = "Uga buga! Uga baga! Muga duga! Kokoto makoto? Privet!";
        List<String> dictionary = createdictionary(msg);
        for (String word : dictionary) {
            System.out.println(word);
        }
    }

    private static List<String> createdictionary(String msg) {
        return Arrays.stream(msg.split("[ ,.!?]")).
                map((w) -> w.toLowerCase()).
                distinct().
                sorted().
                collect(Collectors.toList());
    }
}
