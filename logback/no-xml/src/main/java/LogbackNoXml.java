import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackNoXml {
    private static Logger logger = LoggerFactory.getLogger(LogbackNoXml.class);

    public static void main(String[] args) {
        logger.info("logback no xml");
    }
}
