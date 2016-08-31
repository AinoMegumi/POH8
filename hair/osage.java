import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(input.readLine()) * 60,
                track = Integer.parseInt(input.readLine());
        int i = length, j = 0;
        for(; j < track && i > 0; i -= Integer.parseInt(input.readLine()), j++) {}
        if (i < 0) System.out.println(j - 1);
        else System.out.println("OK");
    }
}
