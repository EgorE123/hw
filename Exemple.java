import java.io.StringWriter;

public class Exemple {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        changeString(str);
        System.out.println(str);
    }

    public static void changeString(StringBuilder str) {
        str.append("world");
    }
}
