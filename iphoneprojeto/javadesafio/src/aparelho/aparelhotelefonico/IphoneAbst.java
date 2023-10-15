package aparelho.aparelhotelefonico;

public abstract class IphoneAbst implements IphoneInt{

  @Override
  public void ligar(int numero) {
    System.out.println("Fazendo ligação" + numero);
  }

  @Override
  public void atender() {
    System.out.println("ligação atendida");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Correio de voz.");
  }
}
