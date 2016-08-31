import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine()),
            b = Integer.parseInt(input.readLine());
        for (int i = 0; i < a; i++) System.out.print(i == b - 1 ? "+" : "-");
        System.out.println();
    }
}
