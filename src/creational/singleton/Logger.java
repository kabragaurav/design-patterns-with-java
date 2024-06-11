import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Logger {
    PrintStream writer;

    private static Logger logger = new Logger();

    private Logger() {
        LocalDateTime now = LocalDateTime.now();
        String name = "logFile_" + now;

        try {
            writer = new PrintStream(name);
            System.out.println("File created");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.exit(0);
        } 
    }

    public void writeMessage(String msg) {
        writer.println(msg);
    }

    public static Logger getLogger() {
        return logger;
    }
}
