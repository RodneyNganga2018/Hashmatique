import java.util.HashMap;
import java.util.Set;

public class HashMatique {
    public static void main(String[] args) {
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("Swim Good", "Frank Ocean lyrics here...");
        tracklist.put("Crack Rock", "Song about drugs ruining lives");
        tracklist.put("Biking", "Tyler the Creator Lyrics here...");
        tracklist.put("Sing About Me When I'm Gone", "Kendrick speaking here...");

        Set<String> keys = tracklist.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(tracklist.get(key));
        }
    }
}