import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;

public class DatabaseManager {
    private Nitrite db;
    private ObjectRepository<Cliente> clienteRepo;
    private ObjectRepository<DVD> dvdRepo;
    private ObjectRepository<FitaVHS> fitaRepo;
    private ObjectRepository<Streaming> streamingRepo;
    private ObjectRepository<Locacao> locacaoRepo;

    public DatabaseManager() {
        this.db = Nitrite.builder()
                .filePath("locadora.db")
                .openOrCreate("admin", "admin123");
        
        this.clienteRepo = db.getRepository(Cliente.class);
        this.dvdRepo = db.getRepository(DVD.class);
        this.fitaRepo = db.getRepository(FitaVHS.class);
        this.streamingRepo = db.getRepository(Streaming.class);
        this.locacaoRepo = db.getRepository(Locacao.class);
    }

    public ObjectRepository<Cliente> getClienteRepo() {
        return clienteRepo;
    }

    public ObjectRepository<DVD> getDvdRepo() {
        return dvdRepo;
    }

    public ObjectRepository<FitaVHS> getFitaRepo() {
        return fitaRepo;
    }

    public ObjectRepository<Streaming> getStreamingRepo() {
        return streamingRepo;
    }

    public ObjectRepository<Locacao> getLocacaoRepo() {
        return locacaoRepo;
    }

    public void close() {
        if (db != null && !db.isClosed()) {
            db.close();
        }
    }
}
