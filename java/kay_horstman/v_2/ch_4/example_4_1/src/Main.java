import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try (var s = new Socket("time-a.nist.gov", 13);
             var scanner = new Scanner(s.getInputStream())) {
            
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
    }
}
