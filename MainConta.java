package contaBanco;

public class MainConta {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Ricardo");
        p1.abrirConta("CC");

        Conta p2 = new Conta();
        p2.setNumConta(2222);
        p2.setDono("Roberta");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.sacar(150);
        p1.fecharConta();


        p1.estadoAtual();
        p2.estadoAtual();

    }
}
