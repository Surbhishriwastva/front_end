package STRING;

public class palindrome {
    public static boolean ispalindrome(String name) {
        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // question
    public static float getshortestpath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 's') {
                y--;
            } else if (dir == 'n') {
                y++;
            } else if (dir == 'w') {
                x--;
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String args[]) {
        String name = "noon";
        // System.out.println(ispalindrome(name));
        String path = "wneenesennn";
        System.out.println(getshortestpath(path));
    }

}
