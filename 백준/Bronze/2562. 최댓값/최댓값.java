import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;

        for (int i = 0; i < 9; i++) {
            list.add(Integer.valueOf(br.readLine()));
            if(a < list.get(i)){
                a = list.get(i);
            }
        }
        
        bw.write(a + "\n");
        bw.write((list.indexOf(a) + 1)+ "");
        bw.flush();
    }
}
