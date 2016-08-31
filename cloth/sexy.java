import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        int[] a = getnumArr();
        System.out.println(a[0] - a[1] <= 0 ? 0 : a[0] - a[1]);
    }
    private static int[] getnumArr() throws Exception {
        String[] s = input.readLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) arr[i] = Integer.parseInt(s[i]);
        return arr;
    }
}
