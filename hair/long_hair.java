import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.parseInt(input.readLine()) % 7 == 0 ? "lucky" : "unlucky");
    }
}
