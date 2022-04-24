import java.util.Scanner;

public class Main {
	static int i2;
	static int i3;
	static int i4;
	Scanner sc;
	
	public void Input() {
		try {
			 sc = new Scanner(System.in);
			 System.out.print("Crie sua Senha: ");
			i2 = sc.nextInt();
	             if((i2 > 9999) || (i2 <=999)) {
				System.out.print("A senha deve ter 4 digitos. Digite novamente! \n");
				Input();
			}else System.out.println("Senha criada com sucesso!\n");
			
		    } catch(Exception e) {
		    	System.out.println("Error: Apenas numeros! Digite novamente!");
		    		Input();
		         }	
	}
	public void Input2() {
		try {
			 sc = new Scanner(System.in);
			i3 = sc.nextInt();
			if(i3 == 1) {
				Input3();
			           } else if((i3 > 1) && (i3<2) || (i3 == 0)){
			        	   System.out.print("Somente as opções 1 ou 2 são validas. \nDigite novamente:");
			        	   Input2();
			           }else if (i3 == 2){
				System.out.println("Obrigado e ate mais!");
			                      }else if ((i3 < 2) || (i3 > 2)) {
			                    	  System.out.print("Somente as opções 1 ou 2 são validas. \nDigite novamente:");
			                    	  Input2();
			                      }
		    } catch(Exception e) {
		    	System.out.print("Error: Apenas numeros inteiros! Digite novamente: ");
		    		Input2();
		                        }	
	}
	public void Input3() {
		try {
			 sc = new Scanner(System.in);
			 System.out.print("Digite sua Senha: ");
			i4 = sc.nextInt();
			if(i4 == i2) {
				System.out.println("Senha confirmada com sucesso!\n");
				System.out.println("Bem vindo Playboyzinho!");
			}else if (i4 != i2){
				System.out.print("Senha errada! Tente novamente: \n");
				Input3();
			}
			
		    } catch(Exception e) {
		    	System.out.println("Error: Apenas numeros inteiros! \nDigite novamente. ");
		    		Input3();
		         }	
	}
	
	

	public static void main(String[] args) {
		Main in = new Main();
		
		System.out.println("Bem vindo ao criador de senhas!\n\n");
		System.out.println("Digite sua senha de 4 digitos entre 0 e 9.");

		in.Input();
		System.out.print("Deseja entrar no sistema agora? Digite 1 para Sim ou 2 para Nao:");
		in.Input2();
	}
	
}