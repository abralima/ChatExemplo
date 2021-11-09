public abstract class Usuario
{
    private SalaChatM mediator;
     
    private String id;
    private String name;
     
    public Usuario(SalaChatM room, String id, String name){
        this.mediator = room;
        this.name = name;
        this.id = id;
    }
     
    public abstract void enviar(String msg, String userId);
    public abstract void receber(String msg);
 
    public SalaChatM getMediator() {
        return mediator;
    }
 
    public String getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
}