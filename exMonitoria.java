import java.util.Scanner;

public class exMonitoria {
    public static void main (String[] args) throws Exception{
       Scanner n = new Scanner(System.in);
       Scanner selec = new Scanner(System.in);

       int LISTAEXERCICIO1;

       System.out.println("LISTA DE EXERCICIO DA MONITORIA");
       System.out.println("(1) MÉDIA DE 2 NOTAS");
       System.out.println("(2) MOSTRAR IDADE REFERENTE AO ANO");
       System.out.println("(3) DESCONTO DO PRODUTO");
       System.out.println("(4) CONVERSÃO DE TEMPERATURA C ~ F");
       System.out.println("=== ESTRUTUTRAS CONDICIONAIS ===");
       System.out.println("(5) LEIA DOIS NUMEROS");
       System.out.println("(6) CALCULO DO IMC");
       System.out.println("(7) VALOR DA VENDA");
       System.out.println("(8) IDADE E PESO PASCIENTE");
       System.out.println("(9) NECESSIDADES NUTRICIONAIS");
       System.out.println("(0) SAIR");
       LISTAEXERCICIO1 = selec.nextInt();

       do {
            switch (LISTAEXERCICIO1) {
                case 1:
                    System.out.println(">>> MÉDIA DE 2 NOTAS <<<");

                    System.out.println("SISTEMA DE GERENCIAMENTO ESCOLAR");

                    //entrada
                    System.out.println("Insira nota 1: ");
                    double NOTA1 = n.nextDouble();
                    System.err.println("Insira a nota 2: ");
                    double NOTA2 = n.nextDouble();

                    //processo
                    double MEDIA = NOTA1 / NOTA2;

                    //saida
                    System.out.println("Nota 1: " + NOTA1);
                    System.out.println("Nota 2: " + NOTA2);
                    System.out.println();
                    System.out.println("Média do aluno: " + MEDIA);
                    
                break;
                case 2:
                    System.out.println(">>> MOSTRAR IDADE REFERENTE AO ANO <<<");
                    
                    //variáveis globais
                    int ANOATUAL, ANONASCIMENTO, IDADE, IDADE28;

                    //entrada
                    System.out.println("Insira o ano de nascimento: ");
                    ANONASCIMENTO = n.nextInt();
                    System.out.println();
                    System.out.println("Insira o ano atual: ");
                    ANOATUAL = n.nextInt();
                    System.out.println(); 
                   
                    //processo
                    IDADE = ANONASCIMENTO - ANOATUAL;
                    IDADE28 = IDADE + 5;

                    //saida
                    System.out.println("Idade: "+ IDADE);
                    System.out.println();
                    System.out.println("Idade em 2028: "+ IDADE28);
                break;
                case 3:
                    System.out.println(">>> DESCONTO DO PRODUTO <<<");
                    System.out.println();
                    
                    //variáveis globais
                    double VALORPRODUTO, DESCONTO;

                    //entrada
                    System.out.println("Insira o valor do produto: R$");
                    VALORPRODUTO = n.nextDouble();

                    //processo
                    DESCONTO = VALORPRODUTO * 0.09;

                    //saida
                    System.out.printf("Valor do produto: R$ %.2f" + VALORPRODUTO);
                    System.out.println("Valor com Desconto inserido: R$ %.2f"+ DESCONTO);
                break;
                case 4:
                    System.out.println(">>> CONVERSÃO DE TEMPERATURA C ~ F <<<");
                    System.out.println();

                    //Vairáveis globais
                    double CELCIUS, FAHRENHEIT;

                    //entrada
                    System.out.println("Insira o valor em C : ");
                    CELCIUS = n.nextDouble();

                    //processo
                    FAHRENHEIT = ((9 * CELCIUS) / 5) + 32;
                    
                    //Saida
                    System.out.println("TEMPERATURA EM CELCIUS: "+ CELCIUS);
                    System.out.println("TEMPERATURA EM FAHRENHEIT: "+ FAHRENHEIT);
                break;
                case 5:
                    System.out.println(">>> LEIA DOIS NUMEROS <<<");

                    //entrada
                    System.out.println("Insira numero 1: ");
                    int NUMERO1 = n.nextInt();

                    System.out.println("Insira numero 2: ");
                    int NUMERO2 = n.nextInt();

                    System.out.println();

                    //processo e saida
                    if (NUMERO1 == NUMERO2){
                        System.out.println("NUMEROS INSERIDOS SÃO IGUAIS.");
                    }else 
                    if(NUMERO1 != NUMERO2){
                            System.out.println("NUMEROS INSERIDOS: 1= "+NUMERO1 +" 2= "+NUMERO2);
                            
                            int SOMA = NUMERO1 + NUMERO2;

                            System.out.println("SOMA DOS NUMEROS: "+ SOMA);       
                    }else
                     if((NUMERO1 > NUMERO2)&&(NUMERO2 > NUMERO1)){
                        System.out.println("Numeros em ordem crescente: "+NUMERO1 + NUMERO2);
                    }else
                     if((NUMERO1 < NUMERO2)&&(NUMERO2 < NUMERO1)){
                        System.out.println("Numeros em ordem decrescente: "+NUMERO1 + NUMERO2);
                    }else

                break;

            }
       } while (LISTAEXERCICIO1 != 0);
    }
}
