package aparelho;

import aparelho.aparelhotelefonico.TelefoneIntfc;
import aparelho.navegadorinternet.NavegadorIntf;
import aparelho.reprodutormusical.ReproducaoInterface;

public class AparelhoPrincipal1 implements ReproducaoInterface, TelefoneIntfc, NavegadorIntf {


  @Override
  public void tocar() {
    System.out.println("Tocando a música.");
  }

  @Override
  public void pausar() {
    System.out.println("Pause");
  }

  @Override
  public void selecionarMusica(String nome) {
    System.out.println(nome + " selecionada");
  }

  @Override
  public void ligar(int numero) {
    System.out.println("Calling  " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Ligação Atendida.");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Correio de voz.");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo a página.");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando página.");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página.");
  }
}
