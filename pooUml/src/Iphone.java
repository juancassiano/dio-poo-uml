import interfaces.INavegadorDeInternet;
import interfaces.IReprodutorDeMusica;
import interfaces.ITelefone;

public class Iphone implements ITelefone, INavegadorDeInternet, IReprodutorDeMusica{
       String numero;
       
       public Iphone(String numero) {
        this.numero = numero;
    }

    @Override
    public void selecionarMusica(String musica) {
    System.out.println("Selecionando musica: " + musica);
        
    }

    @Override
    public void tocarMusica() {
    System.out.println("Tocando musica");
        
    }

    @Override
    public void pausarMusica() {
    System.out.println("Musica pausada");
        
    }

    @Override
    public void exibirPagina() {
    System.out.println("Exibindo pagina web");
        
    }

    @Override
    public void adicionarNovaPagina() {
    System.out.println("Adicionando nova pagina");
        
    }

    @Override
    public void atualizarPagina() {
    System.out.println("Atualizando pagina");
        
    }

    @Override
    public void ligar(String numeroTelefone) {
        System.out.println("Ligando para o numero: " + numeroTelefone);
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
        
    }

    @Override
    public void correioDeVoz() {
    System.out.println("Iniciando correo de voz");
        
    }
}
