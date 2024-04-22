import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("1" + "\n" + "0");
        bw.flush();
        bw.close();
    }
}