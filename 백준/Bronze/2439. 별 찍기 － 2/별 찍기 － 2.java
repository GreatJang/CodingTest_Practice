import java.io.*;
import java.util.*;

public class Main {
    static int A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        A = Integer.parseInt(br.readLine());
        StringBuilder B = new StringBuilder();
        for(int j = 0; j<A; j++){
            B.append(" ");
        }
        for(int i = A; i>0; i--){
            B.setCharAt(i-1, '*');
            bw.write(B + "\n");
        }
        bw.flush();
        bw.close();
    }
}
