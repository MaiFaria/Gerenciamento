
package gerenciamento;


public abstract class Pessoa {
    protected String nome;
    protected String documento;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public abstract void exibeDados();

}
