import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;
import uk.org.lidalia.sysoutslf4j.context.SysOutOverSLF4J;

public class AllLogback {
    static {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();

        SysOutOverSLF4J.sendSystemOutAndErrToSLF4J();
    }

    private static java.util.logging.Logger julLogger = java.util.logging.Logger.getLogger(AllLogback.class.getName());
    private static Log jclLogger = LogFactory.getLog(AllLogback.class);
    private static org.apache.log4j.Logger log4jLogger = org.apache.log4j.LogManager.getLogger(AllLogback.class);
    private static org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger(AllLogback.class);
    private static Logger log4j2Logger = LogManager.getLogger(AllLogback.class);

    public static void main(String[] args) {
        julLogger.info("julLogger ...");
        jclLogger.info("jclLogger ...");
        log4jLogger.info("log4jLogger ...");
        slf4jLogger.info("slf4jLogger ...");
        log4j2Logger.info("log4j2Logger ...");

        System.out.println("system out ...");
    }
}
