
package gerenciamento;

public class Presidente extends Funcionario {
    
    public Presidente() {
    }
        
    public Presidente(String nome, String documento, double salario, int ramal) {
        this.nome = nome;
        this.documento = documento;
        this.salario = salario;
        this.ramal = ramal;
    }
    
    @Override
    public void exibeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Documento: " + this.documento);
        System.out.println("Cargo na Empresa: " + "Presidente");
    }
}

