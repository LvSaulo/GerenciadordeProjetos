package GerenciadorDeProjetos.ProjetoOO;

public class Graduando extends Aluno {
    public Graduando(int id, String email, String name, String senha, StatusUser status, int tempo_bolsa, Double valor_bolsa) {
        super(id, email, name, senha, status, tempo_bolsa, valor_bolsa);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}