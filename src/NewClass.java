
import java.awt.List;
import java.util.ArrayList;

public class NewClass {

    public static void main(String[] args) {
        int x = 1;
        int n = 6;
        int y = 1;
        while (n > 2) {
            x = x + y;
            y = x - y;
            n--  ;
        }
        System.out.println(x);
    }

}
