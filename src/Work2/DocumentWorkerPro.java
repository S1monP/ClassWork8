package Work2;

public class DocumentWorkerPro extends DocumentWorker {
    @Override
    public void EditDoc() {
        System.out.println("Документ отредактирован");
    }

    @Override
    public void SaveDoc() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
