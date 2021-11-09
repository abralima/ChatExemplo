import java.util.HashMap;
import java.util.Map;
 
public class SalaChat implements SalaChatM {
 
    private Map<String, Usuario> usersMap = new HashMap<>();
 
    @Override
    public void enviarMsg(String msg, String userId) 
    {
        Usuario u = usersMap.get(userId);
        u.receber(msg);
    }
 
    @Override
    public void addUsuario(Usuario user) {
        this.usersMap.put(user.getId(), user);
    }
}