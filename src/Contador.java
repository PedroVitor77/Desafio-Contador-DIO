import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o Primeiro parametro: ");
        int parametroUm = sc.nextInt();
        System.out.print("Digite o segundo parametro: ");
        int parametroDois = sc.nextInt();

        try{
            contar(parametroUm,parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

    }
    static void contar(int parametroUm,int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("O segundo parametro nao pode ser maior que o primeiro");
        }
        for (int i = 1;i<=(parametroDois - parametroUm); i++){
            System.out.println("Imprimindo o numero " +i);
        }
    }
}