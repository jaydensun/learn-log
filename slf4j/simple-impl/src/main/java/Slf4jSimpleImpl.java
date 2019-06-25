import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jSimpleImpl {
    private static Logger logger = LoggerFactory.getLogger(Slf4jSimpleImpl.class);

    public static void main(String[] args) {
        logger.info("slf4j simple impl");
    }
}
