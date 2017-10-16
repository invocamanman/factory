public class Factory {

    private static Factory factory;

    private static Factory getInstance(){

        if(factory == null){

            factory = new Factory();

        }

        return factory;

    }

    private Class getCommand(String class){



    }

}
