

public class Main 
{
    public static void main(String[] args) 
    {
        SalaChat chatroom = new SalaChat();
         
        Usuario usuario1 = new ChatUsuario(chatroom,"1", "Abraao");
        Usuario usuario2 = new ChatUsuario(chatroom,"2", "Arthur");
        Usuario usuario3 = new ChatUsuario(chatroom,"3", "Gadelha");
        Usuario usuario4 = new ChatUsuario(chatroom,"4", "POO");
         
        chatroom.addUsuario(usuario1);
        chatroom.addUsuario(usuario2);
        chatroom.addUsuario(usuario3);
        chatroom.addUsuario(usuario4);
 
        usuario1.enviar("Salve Arthur", "2");
        usuario2.enviar("Digai meu Brother", "1");
        usuario3.enviar("POO, eu ensino você na Ufersa", "4");
        usuario4.enviar("Gadelha, somos uma dupla e tanto", "3");
    }
}