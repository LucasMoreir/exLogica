import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exLogicaJava {
    public static void main(String[] args) throws Exception {
        Scanner n = new Scanner(System.in);
        Scanner atv = new Scanner(System.in);
        
        int atividade;
        int atividade2;
        int selec;
        
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date data = new Date();
       
        do { 
            System.out.println(">> SEJA BEM VINDO AO CATÁLOGO DE EXERCICIOS DE LOGICA.JAVA <<");
            System.out.println();
            System.out.println("SELECIO OS CASES");
            System.out.println("(1) LOGICA SIMPLES");
            System.out.println("(2) LOGICA COM ESTRUTURA DE REPETIÇÃO E OPERADORES RELACIONAIS");
            System.out.println("(0) FINALIZAR");
            System.out.println();
            System.out.print("SELECIONE O CATÁLOGO: ");
            selec = n.nextInt();

            switch (selec){
            case 1: 
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
                    System.out.println("(7) DURAÇÃO DE HORAS DE VIAGEM");
                    System.out.println("(8) VALOR TOTAL DO PEDIDO");
                    System.out.println("(9) REAJUSTE SALÁRIAL");
                    System.out.println("(10) PREVISÃO DE ARRECADAÇÃO");
                    System.out.println("(0) SAIR");
                    System.out.println();
                    System.out.print("SELECIONE O EXERCICIO: ");
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

                            System.out.print("Informe a distância entre as cidades: ");
                            Double distan = atv.nextDouble();
                            
                            Double velocidadeTrem = 100.0;
                            Double converDistancia = distan / velocidadeTrem;

                            System.out.println("Sua viagem vai durar " + converDistancia + "horas");
                        break;
                        case 7:
                            System.out.println(">>>> DURAÇÃO DA VIAGEM EM HORAS <<<<");
                            System.out.println("");
                            System.out.print("Dias de viagem: ");
                            int Dias = atv.nextInt();
                            System.out.print("Horas de viagem: ");
                            int horas = atv.nextInt();
                            
                            int horasDia = 24 * Dias;
                            
                            int totalHoras = horasDia + horas;
                
                            System.out.println("<>----------------------------------<>");
                
                            System.out.println("Total de horas: " + totalHoras + ":00");
                        break;
                        case 8:
                            System.out.println(">>> VALOR TOTAL DO PEDIDO <<<");
                            System.out.println();
                
                            System.out.println("--CARDAPIO--");
                            System.out.println("(1) Prato 1 = R$ 10,00");
                            System.out.println("(2) Prato 2 = R$ 13,00");
                            System.out.println("<>-----------------------------------<>");
                
                            Double prato1 = 10.0;
                            Double prato2 = 13.0;
                            Double entrega = 7.0;
                
                            System.out.print("Quantos Prato 1 deseja: ");
                            int p1 = atv.nextInt();
                            System.out.print("Quantos Prato 2 deseja: ");
                            int p2 = atv.nextInt();
                
                            double totalP1 = prato1 * p1;
                            double totalP2 = prato2 * p2;
                            double valorTotalVendas = (totalP1 + totalP2) + entrega;
                
                            System.out.println("Valor total da compra: R$" +  valorTotalVendas);
                        break;
                        case 9:
                            System.out.println(">>>> REAJUSTE SALÁRIAL <<<<");
                            System.out.println();
                
                            System.out.print("Digite salário atual: ");
                            Double salAtual = atv.nextDouble();
                            System.out.print("Digite a porcentagem para reaguste: ");
                            Double porcen = atv.nextDouble();
                
                            Double porcentagem = porcen / 100;
                            double valorPorcen = salAtual * porcentagem;
                            Double salAjustado = salAtual + valorPorcen;
                            System.out.println("<>------------------------------------<>");
                            System.out.print("Salário Aumentado: R$" + salAjustado);
                        break;
                        case 10:
                            System.out.println("VALOR TOTAL DE ARRECADAÇÃO");
                            System.out.println();
                        //para toda constante "final"
                            final Double PERCENTUALMAIS = 1.5;

                            System.out.println("Olá Sindico(a) digite as informações.");
                            System.out.print("Quantidade de apartamentos:");
                            int quantAps = atv.nextInt();
                            System.out.print("Valor da taxa do condominio convencional: R$");
                            Double valorTaxa = atv.nextDouble();
                            System.out.print("Valor da taxa extra: R$");
                            Double valorTaxaExtra = atv.nextDouble();

                            Double somatorioTotal  = (((valorTaxa * PERCENTUALMAIS) + valorTaxaExtra) * quantAps);
                            System.out.println();


                            System.out.println("Valor total a ser arrecadado: R$" + somatorioTotal);
                        break;
                        //SE COLOCAR O DEFAULT DENTRO DO DOWHILE, ELE NÃO EXECUTA O DOWHILE.
                        //default: 
                            //System.out.println(">>OBRIGADO POR USAR O SISTEMA, VOLTE SEMPRE.<<");
                        //atv.close();
                    }
                }while(atividade!=0); 
            break;
            case 2:
                do{
                    System.out.println("<>=====================================<>");
                    System.out.println(">>> ATIVIDADE LOG.JAVA.ESTRUTURA REPET. <<<");
                    System.out.println();
                    System.out.println("(1) RENDA FAMILIAR");
                    System.out.println("(2) SECULO 20");
                    System.out.println("(3) NUMEROS POSITIVOS OU NEGATIVOS");
                    System.out.println("(4) NUMERO DO MÊS");
                    System.out.println("(5) DESCONTO NA COMPRA");
                    System.out.println("(6) TITULO DE ELEITOR");
                    System.out.println("(7) DESCONTO DO PLANO DE SAÚDE");
                    System.out.println("(8) DIA ÚTIL OU FINAL DE SEMANA");
                    System.out.println("(9) FAIXA ETÁRIA");
                    System.out.println("(10) rascunho");
                    System.out.println("(0) SAIR ");
                    System.out.println();
                    System.out.print("SELECIONE O EXERCICIO: ");
                    atividade2 = n.nextInt();

                    switch(atividade2){
                        case 1:
                            System.out.println("RENDA FAMILIAR");
                            System.out.println("<>--------------------------<>");
                            final Double SALARIOMINIMO = 1320.00;

                            System.out.print("Digite dua renda familiar: R$");
                            Double salarioFamiliar = atv.nextDouble();
                            System.out.println("<>--------------------------<>");

                            if(salarioFamiliar < SALARIOMINIMO){
                                System.out.println("Renda familiar é menor que salario minimo.");
                            }else{
                                System.out.println("Salario familiar é maior que salario minimo.");
                            }
                                System.out.println("<>--------------------------<>");
                        break;
                        case 2:
                            System.out.println("SECULO 20");
                            
                            System.out.print("Digite o Ano: ");
                            int ANO = atv.nextInt();

                            System.out.println("<>--------------------------<>");
                            if( ANO >= 1901 && ANO <= 2000){
                                System.out.println("O Ano está no Século 20");
                            }else{
                                System.out.println("Ano está no século 21");
                            }
                        break;
                        case 3:
                            System.out.println("NUMEROS POSITIVOS OU NEGATIVOS");
                            System.out.println("<>--------------------------<>");
                            System.out.print("Numero: ");
                            int numero = atv.nextInt();
                            System.out.println("<>--------------------------<>");
                            //if dentro de if (if encadeado)
                            if(numero>0){
                                System.out.println("Positivo");
                            }else{
                                if(numero==0){
                                    System.out.println("Neutro");
                                }else{
                                    System.out.println("Negativo");
                                }   
                            }
                            System.out.println("<>--------------------------<>");
                        break;
                        case 4:
                            System.out.println("NUMERO DO MÊS");
                            System.out.println("<>--------------------------<>");

                            System.out.print("Digite o numero do mês: ");
                            int nMes = atv.nextInt();
                        
                            if(nMes <= 0 || nMes > 12){
                                System.out.println(" Mês é negativo;");
                            }
                            System.out.println("<>--------------------------<>");
                        break;
                        case 5:
                            System.out.println("DESCONTO NA COMPRA");
                            System.out.println("<>--------------------------<>");

                            System.out.println("SISTEMA DE GERENCIAMENTO");
                            System.out.println();
                            System.out.print("Insira o valor da compra: ");
                            Double valorCompra = atv.nextDouble();

                            Double valorDesconto = valorCompra * 0.10;
                            Double valorCompraDesconto = valorCompra - valorDesconto;
                            System.out.println();

                            if(valorCompra > 1000){
                                //para paresntar 2 casas decimais (PRINTF em seguida %2.f e apresentar a variável com virgula)
                                System.out.printf("Valor do Desconto: R$%.2f", valorDesconto);
                                System.out.println();
                                System.out.println("Valor da Compra com o desconto aplicado: R$" + valorCompraDesconto);
                            }
                        break;
                        case 6:
                            System.out.println("TITULO DE ELEITOR");
                            System.out.println("<>--------------------------<>");

                            System.out.print("Insira sua idade: ");
                            int idade = atv.nextInt();

                            int converIdadeMeses = idade * 12;

                            System.out.println();
                            if(idade >= 18 && idade <= 70){
                                System.out.print("Insira numero do titulo de eleitor: ");
                                int titulo = atv.nextInt();
                            }
                            System.out.println();
                            System.out.println("Sua idade em meses: " + converIdadeMeses);
                        break;
                        case 7: 
                            System.out.println("DESCONTO DO PLANO DE SAÚDE");
                            System.out.println("<>--------------------------<>");

                            System.out.print("Insira seu salário: ");
                            Double salarioBruto = atv.nextDouble();

                            Double descontoA = salarioBruto - 100.0;
                            Double descontoB = salarioBruto - 200.0;

                            System.out.println();
                            if(salarioBruto <= 3000){
                                System.out.println("Salário com desconto aplicado: R$" + descontoA);
                            } if(salarioBruto > 3000){
                                System.out.println("Salário com desconto aplicado: R$" + descontoB);
                            }
                        break;
                        case 8: 
                            System.out.println(" DIA ÚTIL OU FINAL DE SEMANA");
                            System.out.println("<>--------------------------<>");
                            
                            //Para pular linhas dentro de uma String (\n)
                            System.out.println("Domingo = Dia 1 \n Segunda = Dia 2 \n Terça = Dia 3 \n Quarta = Dia 4 \n Quinta = Dia 5 \n Sexta = Dia 6 \n Sábado = Dia 7");

                            System.out.println("Insira o número de um dia da semana: ");
                            int diaSemana = atv.nextInt();
                            
                            System.out.println();
                            if(diaSemana == 1 || diaSemana == 7){
                                System.out.println("Dia da semana inserido é um final de semana");
                            }if(diaSemana >= 2 && diaSemana <= 6){
                                System.out.println("Dia da semana inserido é dia útil.");
                            }
                        break;
                        case 9:
                            System.out.println("FAIXA ETÁRIA");
                            System.out.println("<>--------------------------<>");

                            System.out.print("Insira sua idade: ");
                            int idadee = atv.nextInt();
                            System.out.println();

                            System.out.println("Classificação de faixa etária:");
                            if (idadee <= 14) {
                                System.out.println("Criança / Adoslecente");
                            }if (idadee >= 15 && idadee <= 24) {
                                System.out.println("Jovem");
                            }if (idadee >= 25) {
                                System.out.println("Adulto");
                            }
                        break;
                    }    
                }while(atividade2!=0);
            break;  
        }
        } while (selec != 0);
    } 
    
}
