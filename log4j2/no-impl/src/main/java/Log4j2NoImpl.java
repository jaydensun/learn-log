import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2NoImpl {
    private static Logger logger = LogManager.getLogger(Log4j2NoImpl.class);

    public static void main(String[] args) {
        logger.info("log4j2 no impl");
        logger.error("log4j2 no impl error");
    }
}
