import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoSlf4jImpl {
    private static Logger logger = LoggerFactory.getLogger(NoSlf4jImpl.class);

    public static void main(String[] args) {
        logger.info("no slf4j impl");
    }
}
