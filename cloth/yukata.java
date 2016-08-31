import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        Input input = new Input();
        final int inOrOutTime = input.getnum();
        Pair[] arr = new Pair[inOrOutTime];
        for (int i = 0; i < inOrOutTime; i++) arr[i] = input.getInfo();
        int cost = 0;
        int temp = 0;
        for (int i = 0; i <= 24; i++) {
            if (i > 0) {
                if (temp > 0) {
                    cost += 2;
                    temp--;
                }
                else cost++;
            }
            for(Pair j : arr) if (i == j.clock) temp += j.tempUp;
        }
        System.out.println(cost);
    }
}
class Pair {
    public int clock, tempUp;
    public Pair(String clock, String inOrOut) throws IOException, NumberFormatException {
        this.clock = Integer.parseInt(clock);
        if (!inOrOut.equals("in") && !inOrOut.equals("out")) throw new IOException();
        this.tempUp = inOrOut.equals("in") ? 5 : 3;
    }
}
class Input {
    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public int getnum() throws IOException, NumberFormatException {
        return Integer.parseInt(this.input.readLine());
    }
    public Pair getInfo() throws IOException, NumberFormatException {
        String[] s = this.input.readLine().split(" ");
        return new Pair(s[0], s[1]);
    }
}
