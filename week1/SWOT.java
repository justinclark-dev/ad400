import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

public class SWOT {

    public static void main(String[] args) {

        Map<String, List<String>> perceptions = new LinkedHashMap<String, List<String>>();
        
        List<String> strengths = new ArrayList<String>();
        Collections.addAll(strengths, "Creative", "Love Programming", "Web Development", "Git BASH");

        List<String> weaknesses = new ArrayList<String>();
        Collections.addAll(weaknesses, "Time Wasted on Perfecting", "Distractions", "Public Speaking");

        List<String> opportunities = new ArrayList<String>();
        Collections.addAll(opportunities, "Knowledge", "Understanding", "Growth", "Networking");

        List<String> threats = new ArrayList<String>();
        Collections.addAll(threats, "Open Southern Border", "Terrorism", "Economy", "Inflation");

        perceptions.put("Strengths", strengths);
        perceptions.put("Weaknesses", weaknesses);
        perceptions.put("Opportunities", opportunities);
        perceptions.put("Threats", threats);

        System.out.println("\nSWOT for Justin Clark");
        for (Map.Entry<String, List<String>> perception : perceptions.entrySet()) {
            String key = perception.getKey();
            List<String> value = perception.getValue();

            System.out.println("\n"+ key +": ");
            for (String i : value) {
                System.err.println("   * "+ i);
            }
        }
    }
}
