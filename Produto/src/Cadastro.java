import java.util.Scanner;

public class Cadastro {
	public static void main(String args[]) {
		Produto lista[] = new Produto[5];
		int posicao;
		Scanner teclado = new Scanner(System.in);
		posicao = 0;

		do {
			try {
				System.out.println("---Posicao" + posicao);
				Produto p = new Produto();
				System.out.println("Digite o ID do Produto");
				int id = Integer.parseInt(teclado.nextLine());
				p.setId(id);
				System.out.println("Digite o nome do produto");
				String nome = teclado.nextLine();
				p.setNome(nome);
				System.out.println("Digite os detalhes do produto");
				String detalhe = teclado.nextLine();
				p.setDetalhes(detalhe);
				System.out.println("Digite o preço do produto");
				float preco = Float.parseFloat(teclado.nextLine());
				p.setPreco(preco);
				System.out.println("Digite a quantidade do estoque");
				float qtdEstoque = Float.parseFloat(teclado.nextLine());
				p.setPreco(qtdEstoque);

				posicao++;
			} catch (Exception ex) {
				System.out.println("----> Ops ... erro ao cadastrar");
				System.out.println("Motivo:" + ex.getMessage());

			}
		} while (posicao < 5);

		for (Produto p2 : lista) {
			System.out.println(p2);
		}

	}
}