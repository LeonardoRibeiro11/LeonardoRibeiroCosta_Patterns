package adapter;

public class Application {
    private final Logger logger;

    public Application(Logger logger){
        this.logger = logger;
    }

    public void run(){
        logger.info("iniciando aplicação");
        logger.error("falha ao conectar no banco");
    }
}
