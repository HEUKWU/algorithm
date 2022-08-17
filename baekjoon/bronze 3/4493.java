import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int win1 = 0;
        int win2 = 0;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                String[] arr = br.readLine().split(" ");
                if (arr[0].equals("S")) {
                    if (arr[1].equals("R")) {
                        win2++;
                    } else if (arr[1].equals("P")) {
                        win1++;
                    } else if (arr[1].equals("S")){
                        win1++;
                        win2++;
                    }
                } else if (arr[0].equals("R")) {
                    if (arr[1].equals("S")) {
                        win1++;
                    } else if (arr[1].equals("P")) {
                        win2++;
                    } else if (arr[1].equals("R")){
                        win1++;
                        win2++;
                    }
                } else if (arr[0].equals("P")) {
                    if (arr[1].equals("S")) {
                        win2++;
                    } else if (arr[1].equals("R")) {
                        win1++;
                    } else if (arr[1].equals("P")){
                        win1++;
                        win2++;
                    }
                }
            }
            if (win1 > win2) {
                System.out.println("Player 1");
            } else if (win1 < win2) {
                System.out.println("Player 2");
            } else if (win1 == win2){
                System.out.println("TIE");
            }
            win1 = 0;
            win2 = 0;
        }
    }
}
