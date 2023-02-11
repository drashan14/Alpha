import java.util.ArrayList;

public class StringComphresion {
    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        ArrayList List1 = new ArrayList();
        String s = "ab";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            List.add(count);
        }
        int limit = 0;
        for (int i = 0; i < s.length(); i++) {

            if (!List1.contains(s.charAt(i))) {
                List1.add(s.charAt(i));
                if (List.get(limit) > 1) {
                    List1.add(List.get(limit));
                }
                limit++;

            }
        }
        for (int i = 0; i < List1.size(); i++) {
            s1 =s1 + List1.get(i);
        }
        System.out.println(s1);
    }
}
