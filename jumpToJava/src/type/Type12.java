package type;

import java.util.HashMap;

public class Type12 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people"));

        System.out.println(map.remove("people"));
        System.out.println(map.size());

        System.out.println(map.keySet());
    }
}
