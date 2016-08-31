import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    private static int currentMax, nextRanking;
    public static void main(String[] args) throws Exception {
        currentMax = 0;
        nextRanking = 1; 
        Input input = new Input();
        String[] s = input.getString();
        int[] card = new int[s.length];
        for(int i = 0; i < s.length; i++) card[i] = input.changeStringToNum(s[i]);
        int[] ranking = new int[s.length];
        while(!allZero(card)){
            chooseRanking(card, ranking);
        }
        for(int i : ranking) System.out.println(i);
    }
    private static void chooseRanking(int[] card, int[] ranking) {
        int maxCard = checkMaxCard(card);
        for(int i = 0; i < card.length; i++, maxCard = checkMaxCard(card)){
            if (card[i] == 0) continue;
            if (currentMax < card[i]) {
                currentMax = card[i];
                ranking[i] = nextRanking;
                card[i] = 0;
                nextRanking++;
            }
            if (currentMax >= maxCard) currentMax = 0;
        }
    }
    private static int checkMaxCard(int[] card){
        int max = 0;
        for(int i : card) if (max <= i) max = i;
        return max;
    }
    private static boolean allZero(int[] card){
        for(int i : card) if (i != 0) return false;
        return true;
    }
}
class Input {
    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public String[] getString() throws IOException {
        return input.readLine().split(" ");
    }
    public int changeStringToNum(String s) throws NumberFormatException {
        if (s.equals("J")) return 9;
        else if (s.equals("Q")) return 10;
        else if (s.equals("K")) return 11;
        else if (s.equals("A")) return 12;
        else if (s.equals("2")) return 13;
        else return Integer.parseInt(s) - 2;
    }
}
