package gerenciamento;


public class Vendedor extends Funcionario {
        
    private double comissao;
    
    public Vendedor() {
    }
    
    public Vendedor(String nome, String documento, double salario, int ramal, double comissao) {
        this.nome = nome;
        this.documento = documento;
        this.salario = salario;
        this.ramal = ramal;
        this.comissao = comissao;
    }
    
    public double salarioMesComComissao() {
        return this.salario + this.comissao;
    }
    

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    @Override
    public void exibeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Documento: " + this.documento);
        System.out.println("Cargo na Empresa: " + "Vendedor");
    }
}
