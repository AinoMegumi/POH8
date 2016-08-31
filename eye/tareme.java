import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] s = input.readLine().split(" ");
        System.out.println(Integer.parseInt(s[0]) >= Integer.parseInt(s[1]) ? "OK" : "NG");
    }
}
