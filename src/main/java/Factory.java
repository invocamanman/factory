import java.util.HashMap;
import org.apache.logging.log4j.*;

public class Factory {
    HashMap<String, Command> mapa;
    private static Factory factory = null;
    private static final Logger logger = LogManager.getLogger(Factory.class.getName());



    private Factory(){

        mapa= new HashMap<String, Command>();




    }

    public static Factory getInstance(){
        if(factory == null) {
            factory = new Factory();
        }
        return factory;
    }

    public Command getCommand(String pCommand){
        Command cmd = mapa.get(pCommand);

        if(cmd == null) {
            cmd = loadClass(pCommand);
            mapa.put(pCommand, cmd);
        }

        return cmd;

    }

    private Command loadClass(String pCommand) {

        Command com = null;
        try {
            Class clas = Class.forName(pCommand);
            com = (Command)clas.newInstance();


        }
        catch(ClassNotFoundException e){

            logger.error("no existeix");
        }
        catch(InstantiationException e){

            logger.error("erooor");
        }
        catch(IllegalAccessException e){

            logger.error("erooor");

        }
        return com;
    }

}
