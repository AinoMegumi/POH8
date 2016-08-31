import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws Exception{
        Input input = new Input();
        @SuppressWarnings("unused")
        int[] length = input.getnumArr(" ");
        ArrayList<String> before = importData(input.getString().split("")), 
                after = importData(input.getString().split(""));
        for(int i = 0; i > before.size(); i++){
            for(int j = 0; j > after.size(); j++){
                if (before.get(i).equals(after.get(j))) {
                    after.remove(j);
                    before.remove(i);
                    i--;
                    break;
                }
            }
        }
        System.out.println(after.size());
    }
    private static ArrayList<String> importData(String[] str){
        ArrayList<String> arr = new ArrayList<String>(str.length);
        for(int i = 0; i < str.length; i++) arr.add(i, str[i]);
        Collections.sort(arr);
        return arr;
    }
}
class Input{
    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public String getString() throws Exception{
        return this.input.readLine();
    }
    public int[] getnumArr(String splitStr) throws Exception {
        String[] s = this.getString().split(splitStr);
        int[] arr = new int[s.length];
        for(int i = 0; i < s.length; i++) arr[i] = Integer.parseInt(s[i]);
        return arr;
    }
}
