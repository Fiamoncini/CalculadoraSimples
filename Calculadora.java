import java.util.Scanner;

public class Calculadora {

    public Calculadora(){
        Scanner s = new Scanner(System.in);
        System.out.println("Qual operação deseja fazer?: ");
        System.out.println("1: Adição");
        System.out.println("2: Subtração");
        System.out.println("3: Multiplicação");
        System.out.println("4: Divisão");
        int escolha = s.nextInt();
        if (escolha > 0 && escolha < 5) {
            System.out.print("Digite o primeiro número: ");
            float num = s.nextFloat();
            System.out.print("Digite o segundo número: ");
            float num2 = s.nextFloat();
            contas(escolha, num, num2);
        } else{
            System.out.println("Escolha uma das 4 opções!");
        }
        s.close();
}


    public void contas(int escolha, float num, float num2){
        switch (escolha) {
            case 1:
            System.out.println("Resultado: "+(num + num2));
                break;
            case 2:
            System.out.println("Resultado: "+(num - num2));
                break;
            case 3:
            System.out.println("Resultado: "+(num * num2));
                break;
            case 4:
            System.out.println("Resultado: "+(num / num2));
                break;
        }
    }


    public static void main(String[] args) {
        new Calculadora();
    }
}