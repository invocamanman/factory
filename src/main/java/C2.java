import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class C2 implements Command {

    private static final Logger logger = LogManager.getLogger(C2.class.getName());

    public void execute() {
        logger.debug("Esto es c2");
    }
}
