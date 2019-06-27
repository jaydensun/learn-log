import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

public class AllLog4j2 {
    static {
        System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");
    }
    private static java.util.logging.Logger julLogger = java.util.logging.Logger.getLogger(AllLog4j2.class.getName());
    private static Log jclLogger = LogFactory.getLog(AllLog4j2.class);
    private static org.apache.log4j.Logger log4jLogger = org.apache.log4j.LogManager.getLogger(AllLog4j2.class);
    private static org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger(AllLog4j2.class);
    private static Logger log4j2Logger = LogManager.getLogger(AllLog4j2.class);

    public static void main(String[] args) {
        julLogger.info("julLogger ...");
        jclLogger.info("jclLogger ...");
        log4jLogger.info("log4jLogger ...");
        slf4jLogger.info("slf4jLogger ...");
        log4j2Logger.info("log4j2Logger ...");
    }
}
