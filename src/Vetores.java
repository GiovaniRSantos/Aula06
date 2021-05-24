import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int quantidadeAlunos = 0;
		System.out.println("Digite a quantidade de alunos na turma:");
		quantidadeAlunos = leitor.nextInt();
		
		double totalConsumo = 0; // ZERANDO
		
		for ( int i = 0; i < quantidadeAlunos; i++ ) {
			int numeroAluno = i + 1; // TODO
			System.out.println("Por favor, digite o consumo do " + numeroAluno +  "º aluno");
			double valorConsumo = leitor.nextDouble();
			System.out.println("O aluno " + numeroAluno + " consumiu R$ " + valorConsumo);
			totalConsumo += valorConsumo;
		}
		
		
		System.out.println("Total: " + totalConsumo);
		
		leitor.close();
		
	}
}
