import java.util.HashMap;

public class Factory {
    HashMap<String, Command> mapa;
    private static Factory factory = null;


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

        return new C1();
    }

}
