import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner n = new Scanner(System.in);
        Scanner atv = new Scanner(System.in);
        int atividade;
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            Date data = new Date();

        System.out.println("SUA ATIVIDADE FOI INCIADA " + data);
        do{ 
            System.out.println("<>=====================================<>");       
            System.out.println(">>> EXERCICIOS LOG.JAVA <<<");
            System.out.println();
            System.out.println("(1) CALCULO DA ÁREA DO QUADRADO");
            System.out.println("(2) CÁLCULO DA ÁREA DO RETÂNGULO");
            System.out.println("(3) VALOR FINAL DA VENDA DE COCOS");
            System.out.println("(4) CONVERSÃO DE HORAS PARA MINUTOS");
            System.out.println("(5) VALOR DO INGRESSO");
            System.out.println("(6) CONVERSÃO DA VELOCIDADE DE UM TREM");
            System.out.println("(0) SAIR");
            System.out.println();
            System.out.print("Digite o número do exercicio: ");
                atividade = n.nextInt();
            System.out.println("<>=====================================<>");

            switch (atividade){
                case 1:
                    System.out.println("- CALCULO DA ÁREA DO QUADRADO -");
                    
                    System.out.print("Digite o valor da área: ");
                        Double area = atv.nextDouble();
                    
                    Double resultado = area * area;

                    System.out.print("Valor da área: " + resultado);
                break;
                case 2: 
                    System.out.println("- CÁLCULO DA ÁREA DO RETÂNGULO -");

                    System.out.print("Digite o valo da base: ");
                        Double b1 = atv.nextDouble();
                    System.out.print("Digite o valor da altura: ");
                        Double a1 = atv.nextDouble();

                    Double resultado2 = b1 * a1;
                    System.out.println();
                    System.out.print("Valor da área: " + resultado2);
                break;
                case 3: 
                    System.out.println("- VALOR FINAL DA VENDA DE COCOS -");

                    int valorCoco = 5;

                    System.out.print("Registre a quantidade de cocos vendidos: ");
                        int quant = atv.nextInt();
                    
                    int valorTotal = valorCoco * quant;
                    System.out.println();
                    System.out.println("Valor do coco = R$ 5,00");
                    System.out.println("Quantidade total de cocos vendidos: " + quant);
                    System.out.println();
                    System.out.println("Valor total: R$" + valorTotal +",00");
                break;
                case 4: 
                    System.out.println("- CONVERSÃO DE HORAS PARA MINUTOS -");

                    System.out.println("Digite a quantida de horas que deseja converter: ");
                        Double hrs = atv.nextDouble();

                    Double conversao = hrs * 60;

                    System.out.println("Resultado da conversão de horas paras minutos: " + conversao);
                break;
                case 5:
                    System.out.println("- VALOR DO INGRESSO -");

                    Double valorInteiro = 77.50;
                    Double valorMeia = 38.75;

                    System.out.print("Quantidade de ingressos vendidos (INTEIRA): ");
                        int ingreInteira = atv.nextInt();
                    System.out.print("Quantidade de ingressos vendidos (MEIA): ");
                        int ingreMeia = atv.nextInt();
                    
                    int totalVendidos = ingreInteira + ingreMeia;
                    Double valorTotalIngre = (ingreInteira * valorInteiro) + (ingreMeia * valorMeia);

                    System.out.println();
                    System.out.println("Valor do ingresso(INTEIRA) = R$ 77,50");
                    System.out.println("Valor do ingresso(MEIA) = R$ 38,75");
                    System.out.println();
                    System.out.println("Quantidade total de ingressos vendidos: " + totalVendidos);
                    System.out.println();
                    System.out.println("Valor total apurado: R$" + valorTotalIngre);
                break;
                case 6:
                    System.out.println("- CONVERSÃO DA VELOCIDADE DE UM TREM -");

                    System.out.print("Informe a distâncias entre as cidades: ");
                        Double distan = atv.nextDouble();
                    
                    Double velocidadeTrem = 100.0;
                    Double converDistancia = distan / velocidadeTrem;

                    System.out.println("Sua viagem vai durar " + converDistancia + "horas");
                break;
                default: 
                
                    System.out.println(">>OBRIGADO POR USAR O SISTEMA, VOLTE SEMPRE.<<");
            }
        } while (atividade!=0);

    }
}
