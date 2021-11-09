public class ChatUsuario extends Usuario {
     
  public ChatUsuario(SalaChatM room, String id, String name) {
      super(room, id, name);
  }

  @Override
  public void enviar(String msg, String userId) {
      System.out.println(this.getName() + " :: Enviando a Mensagem : " + msg);
      getMediator().enviarMsg(msg, userId);
  }

  @Override
  public void receber(String msg) {
      System.out.println(this.getName() + " :: Recebendo a Mensagem : " + msg);
  }

}