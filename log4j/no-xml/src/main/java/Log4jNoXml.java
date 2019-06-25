import org.apache.log4j.Logger;

public class Log4jNoXml {
    private static Logger logger = Logger.getLogger(Log4jNoXml.class);

    public static void main(String[] args) {
        logger.info("log4j no xml");
    }
}
