import java.io.*;

public class Main {
    static char[][] A = new char[5][15];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<A.length; i++){
            String st = br.readLine();
            for(int j=0; j<st.length(); j++){
                A[i][j] = st.charAt(j);
            }
        }

        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(A[j][i] == '\0' || A[j][i] == ' '){
                    continue;
                }
                bw.write(A[j][i]);
            }
        }
        bw.flush();
    }
}
