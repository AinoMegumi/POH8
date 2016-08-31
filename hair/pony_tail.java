import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            String[] s = input.readLine().split(" ");
            if (s[0].equals(s[1])) counter++;
        }
        System.out.println(counter >= 3 ? "OK" : "NG");
    }
}
