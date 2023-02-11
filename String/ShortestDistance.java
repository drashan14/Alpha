import java.lang.Math;

public class ShortestDistance {
    public static void main(String[] args) {
        String s = "WNEENESENNN";
        int x1 = 0;
        int y1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                x1 = x1 - 1;
            } else if (s.charAt(i) == 'E') {
                x1 = x1 + 1;
            } else if (s.charAt(i) == 'S') {
                y1 = y1 - 1;
            } else if (s.charAt(i) == 'N') {
                y1 = y1 + 1;
            }
        }
        double sum = (x1 - 0) * (x1 - 0) + (y1 - 0) * (y1 - 0);
        System.out.println(sum);
        double displacement = Math.sqrt(sum);
        System.out.println(displacement);

    }
}
