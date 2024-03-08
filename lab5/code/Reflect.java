public class Reflect {
    static String reflectString(String str) {
        String out = "";
        out += str;
        out += " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            out += str.charAt(i);
        }
        return out;
    }
}