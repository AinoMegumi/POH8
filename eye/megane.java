import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arr = makeArr(Integer.parseInt(input.readLine()));
        System.out.println(arr.get(arr.size() / 2));
    }
    private static ArrayList<Integer> makeArr(int size) throws Exception {
        ArrayList<Integer> arr = new ArrayList<Integer>(size);
        String[] s = input.readLine().split(" ");
        for (int i = 0; i < size; i++) arr.add(Integer.parseInt(s[i]));
        Collections.sort(arr);
        return arr;
    }
}
