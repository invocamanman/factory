
import org.apache.logging.log4j.*;


public class C1 implements Command {

    private static final Logger logger = LogManager.getLogger(C1.class.getName());

    public void execute() {
        logger.debug("Esto es c1");
    }
}
