import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogFileAnalyzer {

    public static void main(String[] args) {

        String fileName = "sample.log";

        int infoCount = 0;
        int warningCount = 0;
        int errorCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {

                if (line.contains("INFO")) {
                    infoCount++;
                }
                else if (line.contains("WARNING")) {
                    warningCount++;
                }
                else if (line.contains("ERROR")) {
                    errorCount++;
                }
            }

            br.close();

            System.out.println("\nLOG FILE ANALYSIS RESULT");
            System.out.println("------------------------");
            System.out.println("INFO messages    : " + infoCount);
            System.out.println("WARNING messages : " + warningCount);
            System.out.println("ERROR messages   : " + errorCount);

        } catch (IOException e) {
            System.out.println("Error reading log file!");
        }
    }
}
