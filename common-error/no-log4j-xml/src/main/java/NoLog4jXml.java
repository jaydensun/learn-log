import org.apache.log4j.Logger;

public class NoLog4jXml {
    private static Logger logger = Logger.getLogger(NoLog4jXml.class);

    public static void main(String[] args) {
        logger.info("no log4j xml");
    }
}
