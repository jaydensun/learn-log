import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jNoImpl {
    private static Logger logger = LoggerFactory.getLogger(Slf4jNoImpl.class);

    public static void main(String[] args) {
        logger.info("slf4j no impl");
    }
}
