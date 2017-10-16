import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class C3 implements Command {

    private static final Logger logger = LogManager.getLogger(C3.class.getName());

    public void execute() {
        logger.debug("Esto es c3");
    }
}
