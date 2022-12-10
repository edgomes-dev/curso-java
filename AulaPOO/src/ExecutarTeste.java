import java.math.BigDecimal;

public class ExecutarTeste {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1l);
		produto1.setNome("Módulo Orientação Objetos");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setId(2l);
		produto2.setNome("Módulo de spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(300));
		
		Produto produto3 = new Produto();
		produto3.setId(3l);
		produto3.setNome("Módulo de Angular 8");
		produto3.setValor(BigDecimal.valueOf(100));
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Formação Java");
		venda.setEnderecoEntrega("Entregue pelo E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Edson Gomes");
		//venda.setValortotal(BigDecimal.valueOf(197.00));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.getListaProdutos().add(produto3);
		
		for (Produto produto : venda.getListaProdutos()) {
			System.out.println("Descrição Produto: " + produto);
		}
		
		System.out.println("Descrição venda: " + venda );
		
	}
}
