
package gerenciamento;


public class Start {
    
    public static void main(String[] args) {
        
        Presidente presidente = new Presidente("Asdrubal Leôncio Correa", "381.597.942-07", 20000.00, 101);
        Secretaria secretaria1 = new Secretaria("Fátima", "155.036.169-44", 1200.00, 201);
        Secretaria secretaria2 = new Secretaria("Ana", "926.876.340-00", 1200.00, 202);
        Vendedor vendedor1 = new Vendedor("João", "755.119.696-05", 1800.00, 301, 120D);
        Vendedor vendedor2 = new Vendedor("Vanessa", "063.935.289-82", 2500.00, 302, 300D);
        Vendedor vendedor3 = new Vendedor("Carlos", "880.338.835-45", 1800.00, 303, 450D);
        Cliente cliente1 = new Cliente("Marcos", "123.408.275-66", "Marquinhos", "123456");
        Cliente cliente2 = new Cliente("Joana", "153.199.983-25", "Joaninha", "987654");
        Cliente cliente3 = new Cliente("Elisa", "277.997.215-70", "Elis", "segredo");
        Cliente cliente4 = new Cliente("Lucas", "266.803.027-73", "Luca", "teste");
        
        presidente.exibeDados();
        System.out.println("Salário Anual + 13º = " + presidente.calculaSalarioAnual());
        System.out.println("______________________________________________________");
        secretaria1.exibeDados();
        System.out.println("______________________________________________________");
        secretaria2.exibeDados();
        System.out.println("Salário Anual + 13º = " + secretaria2.calculaSalarioAnual());
        System.out.println("______________________________________________________");
        vendedor1.exibeDados();
        System.out.println("Valor Salário + Comissão = " + vendedor1.salarioMesComComissao());
        System.out.println("______________________________________________________");
        vendedor2.exibeDados();
        System.out.println("Valor Salário + Comissão = " + vendedor2.salarioMesComComissao());
        System.out.println("______________________________________________________");
        vendedor3.exibeDados();
        System.out.println("Valor Salário + Comissão = " + vendedor3.salarioMesComComissao());
        System.out.println("______________________________________________________");
        cliente1.exibeDados();
        System.out.println("______________________________________________________");
        cliente2.exibeDados();
        System.out.println("______________________________________________________");
        cliente3.exibeDados();
        System.out.println("______________________________________________________");
        cliente4.exibeDados();
        System.out.println("Verificação de senha: " + cliente4.verificarSenha("teste"));
        System.out.println("______________________________________________________");
        
        
    }
  
}
  
