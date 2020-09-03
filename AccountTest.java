import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		
		Account a = new Account(); //constroi um objeto de conta e armazena em 'a'
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Entre um nome para a conta:	");
		String name = input.nextLine();
		a.setName(name); //armazenar o 'name' na conta 'a'
		
		//imprime o resultado da getName
		System.out.println("o nome na conta e:	"+ a.getName());
	}
}