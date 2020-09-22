
package gerenciamento;


public class Cliente extends Pessoa{
    
    private String usuario;
    private String senha;
    
    public Cliente() {
    }
    
    public Cliente(String nome, String documento, String usuario, String senha) {
        this.nome = nome;
        this.documento = documento;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }
     
    public boolean verificarSenha(String senha) {
        if (this.senha.equals(senha)) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Documento: " + this.documento);
    }
    
    
    
}
