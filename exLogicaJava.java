import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exLogicaJava {
    public static void main(String[] args) throws Exception {
        Scanner n = new Scanner(System.in);
        Scanner atv = new Scanner(System.in);
        
        //Constantes
        int ATIVIDADE;
        int ATIVIDADE2;
        int ATIVIDADE3;
        int ATIVIDADE4;
        int SELEC;
        
        //Formatador de data
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date data = new Date();
       
        //estrutura de repetição DoWhile e Switch case
        do { 
            System.out.println(">> SEJA BEM VINDO AO CATÁLOGO DE EXERCICIOS DE LOGICA.JAVA <<");
            System.out.println();
            System.out.println("SELECIO OS CASES");
            System.out.println("(1) LOGICA SIMPLES");
            System.out.println("(2) LOGICA COM ESTRUTURA DE REPETIÇÃO E OPERADORES RELACIONAIS");
            System.out.println("(3) LOGICA INTERMEDIARIOS E AVANÇADOS");
            System.out.println("(0) FINALIZAR");
            System.out.println();
            System.out.print("SELECIONE O CATÁLOGO: ");
            SELEC = n.nextInt();

            switch (SELEC){
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
                    System.out.println("(0) VOLTAR PARA O INICIO");
                    System.out.println();
                    System.out.print("SELECIONE O EXERCICIO: ");
                    ATIVIDADE = n.nextInt();
                    System.out.println("<>=====================================<>");

                    switch (ATIVIDADE){
                        case 1:
                            System.out.println("- CALCULO DA ÁREA DO QUADRADO -");
                            
                            //Entrada
                            System.out.print("Digite o valor da área: ");
                            Double area = atv.nextDouble();
                            
                            //processo
                            Double resultado = area * area;
                            
                            //Saida
                            System.out.print("Valor da área: " + resultado);
                        break;
                        case 2: 
                            System.out.println("- CÁLCULO DA ÁREA DO RETÂNGULO -");

                            //Entrada
                            System.out.print("Digite o valo da base: ");
                            Double b1 = atv.nextDouble();
                            System.out.print("Digite o valor da altura: ");
                            Double a1 = atv.nextDouble();

                            //processo
                            Double resultado2 = b1 * a1;
                            System.out.println();

                            //Saida
                            System.out.print("Valor da área: " + resultado2);
                        break;
                        case 3: 
                            System.out.println("- VALOR FINAL DA VENDA DE COCOS -");

                            //Constante
                            int VALORCOCO = 5;

                            //Entrada
                            System.out.print("Registre a quantidade de cocos vendidos: ");
                            int quant = atv.nextInt();
                            
                            //Processo
                            int valorTotal = VALORCOCO * quant;
                            System.out.println();

                            //Saida
                            System.out.println("Valor do coco = R$ 5,00");
                            System.out.println("Quantidade total de cocos vendidos: " + quant);
                            System.out.println();
                            System.out.println("Valor total: R$" + valorTotal +",00");
                        break;
                        case 4: 
                            System.out.println("- CONVERSÃO DE HORAS PARA MINUTOS -");

                            //Entrada
                            System.out.println("Digite a quantida de horas que deseja converter: ");
                            Double hrs = atv.nextDouble();

                            //processo
                            Double conversao = hrs * 60;

                            //Saida
                            System.out.println("Resultado da conversão de horas paras minutos: " + conversao);
                        break;
                        case 5:
                            System.out.println("- VALOR DO INGRESSO -");
                            
                            //constante
                            Double VALORINTEIRO = 77.50;
                            Double VALORMEIA = 38.75;

                            //entrada
                            System.out.print("Quantidade de ingressos vendidos (INTEIRA): ");
                            int ingreInteira = atv.nextInt();
                            System.out.print("Quantidade de ingressos vendidos (MEIA): ");
                            int ingreMeia = atv.nextInt();
                            
                            //processo
                            int totalVendidos = ingreInteira + ingreMeia;
                            Double valorTotalIngre = (ingreInteira * VALORINTEIRO) + (ingreMeia * VALORMEIA);

                            //Saida
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

                            //entrada
                            System.out.print("Informe a distância entre as cidades: ");
                            Double distan = atv.nextDouble();
                            
                            //proceso
                            Double velocidadeTrem = 100.0;
                            Double converDistancia = distan / velocidadeTrem;

                            //Saida
                            System.out.println("Sua viagem vai durar " + converDistancia + "horas");
                        break;
                        case 7:
                            System.out.println(">>>> DURAÇÃO DA VIAGEM EM HORAS <<<<");
                            System.out.println("");

                            //Entrada
                            System.out.print("Dias de viagem: ");
                            int Dias = atv.nextInt();
                            System.out.print("Horas de viagem: ");
                            int horas = atv.nextInt();
                            
                            //Processo
                            int horasDia = 24 * Dias;
                            int totalHoras = horasDia + horas;

                            //Saida
                            System.out.println("<>----------------------------------<>");
                            System.out.println("Total de horas: " + totalHoras + ":00");
                        break;
                        case 8:
                            System.out.println(">>> VALOR TOTAL DO PEDIDO <<<");
                            System.out.println();

                            //Entrada
                            System.out.println("--CARDAPIO--");
                            System.out.println("(1) Prato 1 = R$ 10,00");
                            System.out.println("(2) Prato 2 = R$ 13,00");
                            System.out.println("<>-----------------------------------<>");

                            //Processo
                            Double prato1 = 10.0;
                            Double prato2 = 13.0;
                            Double entrega = 7.0;

                            //Entrada2
                            System.out.print("Quantos Prato 1 deseja: ");
                            int p1 = atv.nextInt();
                            System.out.print("Quantos Prato 2 deseja: ");
                            int p2 = atv.nextInt();

                            //processo2
                            double totalP1 = prato1 * p1;
                            double totalP2 = prato2 * p2;
                            double valorTotalVendas = (totalP1 + totalP2) + entrega;

                            //Saida
                            System.out.println("Valor total da compra: R$" +  valorTotalVendas);
                        break;
                        case 9:
                            System.out.println(">>>> REAJUSTE SALÁRIAL <<<<");
                            System.out.println();

                            //Entrada
                            System.out.print("Digite salário atual: ");
                            Double salAtual = atv.nextDouble();
                            System.out.print("Digite a porcentagem para reaguste: ");
                            Double porcen = atv.nextDouble();

                            //Processo
                            Double porcentagem = porcen / 100;
                            double valorPorcen = salAtual * porcentagem;
                            Double salAjustado = salAtual + valorPorcen;

                            //Saida
                            System.out.println("<>------------------------------------<>");
                            System.out.print("Salário Aumentado: R$" + salAjustado);
                        break;
                        case 10:
                            System.out.println("VALOR TOTAL DE ARRECADAÇÃO");
                            System.out.println();
                            
                            //para toda constante "final"
                            final Double PERCENTUALMAIS = 1.5;

                            //Entrada
                            System.out.println("Olá Sindico(a) digite as informações.");
                            System.out.print("Quantidade de apartamentos:");
                            int quantAps = atv.nextInt();
                            System.out.print("Valor da taxa do condominio convencional: R$");
                            Double valorTaxa = atv.nextDouble();
                            System.out.print("Valor da taxa extra: R$");
                            Double valorTaxaExtra = atv.nextDouble();

                            //Processo
                            Double somatorioTotal  = (((valorTaxa * PERCENTUALMAIS) + valorTaxaExtra) * quantAps);
                            System.out.println();

                            //Saida
                            System.out.println("Valor total a ser arrecadado: R$" + somatorioTotal);
                        break;
                        //SE COLOCAR O DEFAULT DENTRO DO DOWHILE, ELE NÃO EXECUTA O DOWHILE.
                        //default: 
                            //System.out.println(">>OBRIGADO POR USAR O SISTEMA, VOLTE SEMPRE.<<");
                        //atv.close();
                    }
                }while(ATIVIDADE!=0); 
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
                    System.out.println("(7) DESCONTO DO SALÁRIO");
                    System.out.println("(8) DIA ÚTIL OU FINAL DE SEMANA");
                    System.out.println("(9) FAIXA ETÁRIA");
                    System.out.println("(10) DECRETAÇÃO DE FERIADO");
                    System.out.println("(11) BLOQUEIO DE ESTRADA");
                    System.out.println("(12) TRABALHANDO COM STRING");
                    System.out.println();
                    System.out.println("ATIVIDADES COM ESTRUTURA REPET. E CHAR ");
                    System.out.println("(13) VALOR DO IMPOSTO");
                    System.out.println("(14) VALOR MENSALIDADE");
                    System.out.println("(15) LER DOIS NUMEROS");
                    System.out.println("(16) QUINZENA DO MÊS");
                    System.out.println("(0) VOLTAR PARA O INICIO ");
                    System.out.println();
                    System.out.print("SELECIONE O EXERCICIO: ");
                    ATIVIDADE2 = n.nextInt();

                    switch(ATIVIDADE2){
                        case 1:
                            System.out.println("RENDA FAMILIAR");
                            System.out.println("<>--------------------------<>");
                            
                            //Constante
                            Double SALARIOMINIMO = 1320.00;
                            
                            //Entrada
                            System.out.print("Digite dua renda familiar: R$");
                            Double salarioFamiliar = atv.nextDouble();
                            System.out.println("<>--------------------------<>");

                            //Processo e saida(If e Else)
                            if(salarioFamiliar < SALARIOMINIMO){
                                System.out.println("Renda familiar é menor que salario minimo.");
                            }else{
                                System.out.println("Salario familiar é maior que salario minimo.");
                            }
                                System.out.println("<>--------------------------<>");
                        break;
                        case 2:
                            System.out.println("SECULO 20");
                            
                            //Entrada
                            System.out.print("Digite o Ano: ");
                            int ANO = atv.nextInt();

                            //Processo e Saida (If e else)
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

                            //Entrada
                            System.out.print("Numero: ");
                            int numero = atv.nextInt();
                            System.out.println("<>--------------------------<>");

                            //Processo e saida com if dentro de if (if encadeado)
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

                            //Entrada
                            System.out.print("Digite o numero do mês: ");
                            int nMes = atv.nextInt();
                            
                            //Processo e Saida (If)
                            if(nMes <= 0 || nMes > 12){
                                System.out.println(" Mês é negativo;");
                            }
                            System.out.println("<>--------------------------<>");
                        break;
                        case 5:
                            System.out.println("DESCONTO NA COMPRA");
                            System.out.println("<>--------------------------<>");
                            
                            //Entrada
                            System.out.println("SISTEMA DE GERENCIAMENTO");
                            System.out.println();
                            System.out.print("Insira o valor da compra: ");
                            Double valorCompra = atv.nextDouble();
                            
                            //Processo
                            Double valorDesconto = valorCompra * 0.10;
                            Double valorCompraDesconto = valorCompra - valorDesconto;
                            System.out.println();
                            
                            //Saida (If e else)
                            if(valorCompra > 1000){
                                //para paresntar 2 casas decimais (PRINTF em seguida %2.f e apresentar a variável com virgula) /n <- é para pular linha. 
                                System.out.println("Valor do Desconto: R$" + valorDesconto);
                                System.out.println("Valor da compra com o desconto aplicado: R$" + valorCompraDesconto);
                            }else{
                                System.out.println("Valor do desconto: R$"+ valorDesconto);
                                System.out.println("Valor da compra: R$" + valorCompra);
                            }
                            System.out.println();
                        break;
                        case 6:
                            System.out.println("TITULO DE ELEITOR");
                            System.out.println("<>--------------------------<>");

                            //Entrada
                            System.out.print("Insira sua idade: ");
                            int idade = atv.nextInt();

                            //Processo
                            int converIdadeMeses = idade * 12;

                            //Processo e Saida (If e else)
                            System.out.println();
                            if(idade >= 18 && idade <= 70){
                                System.out.print("Insira numero do titulo de eleitor: ");
                            }
                            
                            //Saida
                            System.out.println("Sua idade em meses: " + converIdadeMeses);
                        break;
                        case 7: 
                            System.out.println("DESCONTO DO SALÁRIO");
                            System.out.println("<>--------------------------<>");
                            
                            //Constantes
                            Double DESCONTO_MAIOR = 200.0;
                            Double DESCONTO_MENOR = 100.0;

                            //Processo
                            System.out.print("Insira seu salário: ");
                            Double salarioBruto = atv.nextDouble();
                            //declarar a várial "Global" acima de if e else se a mesma variával recebe dois ou mais valores.
                            Double desconto;
                            if(salarioBruto <= 3000){
                               desconto = salarioBruto - DESCONTO_MENOR;
                            }else{
                               desconto = salarioBruto - DESCONTO_MAIOR;
                            }

                            //Saida
                            System.out.println("Salario liquido com desconto aplicado: R$" + desconto);
                        break;
                        case 8: 
                            System.out.println(" DIA ÚTIL OU FINAL DE SEMANA");
                            System.out.println("<>--------------------------<>");
                            
                            //Para pular linhas dentro de uma String (\n)
                            System.out.println("Domingo = Dia 1 \n Segunda = Dia 2 \n Terça = Dia 3 \n Quarta = Dia 4 \n Quinta = Dia 5 \n Sexta = Dia 6 \n Sábado = Dia 7");

                            //Entrada
                            System.out.println("Insira o número de um dia da semana: ");
                            int diaSemana = atv.nextInt();
                            
                            //Processo e Saida (If e else)
                            if(diaSemana == 1 || diaSemana == 7){
                                System.out.println("Dia da semana inserido é um final de semana");
                            }else{
                                System.out.println("Dia da semana inserido é dia útil.");
                            }
                        break;
                        case 9:
                            System.out.println("FAIXA ETÁRIA");
                            System.out.println("<>--------------------------<>");
                             //Entrada
                            System.out.print("Insira sua idade: ");
                            int idadee = atv.nextInt();
                            System.out.println();

                            //Processo e Saida (If e else)
                            System.out.println("Classificação de faixa etária:");
                            if (idadee <= 14) {
                                System.out.println("Criança / Adoslecente");
                            }else 
                            if (idadee >= 15 && idadee <= 24) {
                                System.out.println("Jovem");
                            }else{
                                System.out.println("Adulto");
                            }
                        break;
                        case 10: 
                            System.out.println("DECRETAÇÃO DE FERIADO");
                            System.out.println("<>--------------------------<>");

                            System.out.println(" >< SISTEMA DO DEPARTAMENTO ><");
                            
                            //Entrada
                            System.out.print("Insira a dia: ");
                            int dia1 = atv.nextInt();
                            System.out.print("Insira a temperatura: ");
                            Double temp = atv.nextDouble();
                            
                            System.out.println();
                            //Processo e saida (If)
                            if(dia1 == 1 || temp < 0){
                                System.out.println("* FERIADO DECRETADO *");
                            }
                        break;
                        case 11:
                            System.out.println("BLOQUEIO DE ESTRADA");
                             System.out.println("<>--------------------------<>");
                            System.out.println("SISTEMA");

                            //Entrada
                            System.out.println("Temperatura do dia: ");
                            Double temperaturaDia = atv.nextDouble();
                            System.out.println("Temperatura Méia: ");
                            Double temperaturaMedia = atv.nextDouble();

                            //Processo e Saida (If e else)
                            if(temperaturaDia < temperaturaMedia){
                                System.out.println("* ESTRADA BLOQUEADA *");
                            }else{
                                if(temperaturaDia < 0 && temperaturaMedia < 0){
                                     System.out.println("* ESTRADA BLOQUEADA *");
                                }else{
                                     System.out.println("* ESTRADA LIBERADA *");
                                }
                            }
                        break;
                        case 12: 
                            System.out.println("TRABALHANDO COM STRING");
                             System.out.println("<>--------------------------<>");
                            System.out.println("SISTEMA");
                            System.out.println();
                            
                            //Entrada
                            System.out.println("Insira o nome: ");
                            String name = atv.nextLine();
                            System.out.println("Insira idade: ");
                            int idade1 = atv.nextInt();
                            
                            //Processo e Saida (IF e else)
                            if(idade1 < 12){
                                System.out.println("Procure um pediatra");
                            }else 
                            if (idade1 <= 50){
                                System.out.println("Procure clínica geral");
                            }else {
                                System.out.println("Procure um geriatra");
                            }
                            System.out.println("Sr(a) "+ name);
                        break;
                        case 13:
                            System.out.println("VALOR DO IMPOSTO");
                            System.out.println("<>--------------------------<>");
                            System.out.println("SISTEMA");
                            
                            //Entrada
                            //tipo P = 25% & S = 5%
                            System.out.print("Insira o valor do produto: R$");
                            Double valor2 = atv.nextDouble();
                            System.out.print("Insira o tipo do produto: (P/S)");
                            char tipo = atv.next().charAt(0);
                            
                            //Process
                            double IMPOSTOMAIOR = valor2 * 0.25;
                            double IMPOSTOMENOR = valor2 * 0.05;

                            //Processo e saida (If e else)
                            if(tipo == 'p' ||  tipo == 'P'){
                                System.out.println("R$" + IMPOSTOMAIOR);
                            } 
                            if(tipo == 's' ||  tipo == 'S'){
                                System.out.println("R$" + IMPOSTOMENOR);
                            }
                        break;
                        case 14:
                            System.out.println("VALOR DA MENSALIDADE");
                            System.out.println("<>--------------------------<>");
                            System.out.println("SISTEMA ESCOLAR");
                            System.out.println();

                            //Entrada
                            System.out.println("INSIRA O TIPO DE BOLSA DO ALUNO");
                            System.out.println("(T) TOTAL");
                            System.out.println("(P) PARCIAL (50%)");
                            System.out.println("(X) SEM BOLSA");
                            System.out.print("SELECIONE:");
                            char bolsaEscolar = atv.nextLine().charAt(0);
                            System.out.println();

                            //Entrada2
                            System.out.print("INSIRA O VALOR DA MENSALIDADE: ");
                            double valorMensalidade = atv.nextDouble();
                            System.out.println();
                           
                            //Sempre colocar o Scanner(atv) para não recber o valor de cima 
                            atv.nextLine();

                            //Entrada3
                            System.out.println("INSIRA O TURNO DO ALUNO");
                            System.out.println("(M) Manhã");
                            System.out.println("(N) Noite");
                            System.out.print("SELECIONE:");
                            char turno = atv.nextLine().charAt(0);
                            
                            //Processo
                            double BOLSA50 = (valorMensalidade / 2) - valorMensalidade;
                            double DESCONTOMANHA = (valorMensalidade * 0.2) - valorMensalidade;
                            Double BOLSA70 = (valorMensalidade * 0.7) - valorMensalidade;

                            //Processo e Saida (If e else)
                            if (bolsaEscolar == 't' || bolsaEscolar == 'T'){
                                System.out.println("> Aluno tem 100% de desconto <");
                                System.out.println();
                                System.out.println("VALOR DA MENSALIDADE: R$0,00");
                            //Quando tiver duas condiões de CHAR no if como temos em P e X colocar () para o processo de comparação so ocorrer dentro dos parenteses.
                            }else 
                            if( (bolsaEscolar == 'p' || bolsaEscolar == 'P') && (turno == 'M' ||  turno == 'm')){
                                System.out.println("> Aluno tem 70 % de desconto <");
                                System.out.println();
                                System.out.println("VALOR DA MENSALIDADE: R$" + BOLSA70);
                            }else 
                            if(bolsaEscolar == 'p' || bolsaEscolar == 'P'){
                                System.out.println("> Aluno tem 50% de desconto <");
                                System.out.println();
                                System.out.println("VALOR DA MENSALIDADE: R$" + BOLSA50);
                            }else 
                            if ((bolsaEscolar == 'x' || bolsaEscolar == 'X') && (turno == 'M' || turno == 'm')){
                                System.out.println("> Aluno tem 20% de desconto <");
                                System.out.println();
                                System.out.println("VALOR MENSALIDADE: R$" + DESCONTOMANHA);
                            }else{
                                System.out.println("> Não há desconto <");
                                System.out.println();
                                System.out.println("VALOR DA MENSALIDADE: R$" + valorMensalidade);
                            }
                        break;
                        case 15: 
                            System.out.println("LER DOIS NUMEROS");
                            System.out.println("<>--------------------------<>");

                            //Entrada
                            System.out.println("INSIRA O DIVIDENDO: ");
                            Double dividendo = atv.nextDouble();
                            System.out.println("INSIRA O DIVISOR: ");
                            Double divisor = atv.nextDouble();

                            //Processo e Saida
                            if(divisor == 0){
                                System.out.println("=----------------------------=");
                                System.out.println("IMPOSÍVEL FAZER A DIVISÃO POR 0");
                                System.out.println("=----------------------------=");
                            }else{
                                double calculo = dividendo / divisor;
                                System.out.println("=----------------------------=");
                                System.out.println("RESULTADO: " + calculo);
                            }
                        break;
                        case 16:
                            System.out.println("> QUINZENA DO MÊS <");
                            System.out.println("<>--------------------------<>");

                            //Entrada
                            System.out.print("INSIRA O DIA: ");
                            int diaMes = atv.nextInt();

                            //Processo e saida (If e else)
                            if(diaMes == 1 || diaMes ==15){
                                System.out.println("=----------------------------="); 
                                System.out.println("Dia "+ diaMes + " é o inicio de uma quinzena do mês.");
                            }else{
                                System.out.println("Dia" + diaMes + "não é inicio de quinzena.");
                            }
                    }    
                }while(ATIVIDADE2!=0);
            break;
            case 3:  
                do {
                    System.out.println("<>=====================================<>");
                    System.out.println(">>> ATIVIDADE LOG.JAVA.INTERMEDIARIOS E AVANÇADOS. <<<");
                    System.out.println();
                    System.out.println("(1) REGISTRO DE HORA EXTRA");
                    System.out.println("(2) REGISTRO DE FLUXO");
                    System.out.println("(3) INDICADOR DE AVALIAÇÃO");
                    System.out.println("(4) DESCONTO DOS ITENS");
                    System.out.println("(0) VOLTAR PARA O INICIO");
                    System.out.println();
                    System.out.print("SELECIONE: ");
                    ATIVIDADE3 = n.nextInt();
                    
                    switch(ATIVIDADE3){
                        case 1:
                            System.out.println("HORAS EXTRAS");
                            System.out.println("<>--------------------------<>");

                            //Entrada
                            System.out.println("SELECIONE TURNO: ");
                            System.out.println("(M) Manhã");
                            System.out.println("(T) Tarde");
                            System.out.println("(N) Noite");
                            System.out.println();
                            System.out.print("INSIRA: ");
                            //toUpperCase() <= método para deixar todas as letrtas inseridas em maiusculo facilitando o "if else"
                            char turno = atv.nextLine().charAt(0);

                            //Entrada2
                            System.out.println("INSIRA HORA [0 ~ 22]: ");
                            int horas = atv.nextInt();

                            //Processo e saida (if e else)
                            if((turno == 'm' || turno == 'M') && (horas < 6) ||
                               (turno == 'n' || turno == 'N') && (horas >= 22)){
                                System.out.println();
                                System.out.println("HORA EXTRA");
                            }else{
                                System.out.println();
                                System.out.println("HORA NORMAL");
                            }
                        atv.nextLine();
                        break;
                        case 2:
                            System.out.println("REGISTRO DE FLUXO");
                            System.out.println("<>--------------------------<>");

                            //Entrada
                            System.out.println("INSIRA O DIA ANTERIOR: ");
                            int diaAnterior = atv.nextInt();
                            System.out.println("INSIRA O DIA ATUAL");
                            int diaAtual = atv.nextInt();
                            System.out.println();

                            //Saida1
                            System.out.print("REGISTO DE DIAS: " + diaAnterior + ", " + diaAtual + " = ");

                            //processo e saida2 
                            if(diaAnterior > diaAtual){
                                System.out.println("NOVO MÊS");
                            }else{ 
                                System.out.println("MESMO MÊS");
                            }
                        atv.nextLine();
                        break;
                        case 3:
                            System.out.println("INDICADOR DE AVALIAÇÃO");
                            System.out.println("<>--------------------------<>");

                            //Entrada1
                            //frequência mínima = 75%
                            System.out.print("INSIRA A PERCENTUAL DE FREQUÊNCIA DO ALUNO: ");
                            int frequencia = atv.nextInt();
                            System.out.println();
                            atv.nextLine();

                            //Entrada2 com estrutura de decisão
                            System.out.println("AVALIAÇÃO #1");
                            System.out.println("(A) Aprovado");
                            System.out.println("(B) Média");
                            System.out.println("(C) Reprovado");
                            System.out.print("SELECIONE: ");
                            char ava1 = atv.nextLine().toUpperCase().charAt(0);
                            
                            System.out.println();

                            //Entrada3 com estrutura de decisão
                            System.out.println("AVALIAÇÃO #2");
                            System.out.println("(A) Aprovado");
                            System.out.println("(B) Média");
                            System.out.println("(C) Reprovado");
                            System.out.print("SELECIONE: ");
                            char ava2 = atv.nextLine().toUpperCase().charAt(0);
                            System.out.println();

                            //Processo1 + entrada 4 + saida1 
                            if(frequencia < 75){
                                System.out.println("REPROVADO POR FALTA...");
                            }else
                            if (ava1 == 'C' && ava2 == 'C'){
                                System.out.println("REPROVADO");
                            }else 
                            if((ava1 == 'A' || ava1 == 'B') && (ava2 == 'A' || ava2 == 'B')){
                                System.out.println("APROVADO");
                            }else{
                                System.out.println("INSIRA A NOTA DA SEGUNDA CAHAMDA: ");
                                System.out.println("(A) Aprovado");
                                System.out.println("(B) Média");
                                System.out.println("(C) Reprovado");
                                System.out.print("SELECIONE: ");
                                char notaFinal = atv.nextLine().toUpperCase().charAt(0);
                                System.out.println();
                            
                            //Processo2 e Saida
                                if(notaFinal == 'A' || notaFinal == 'B'){
                                    System.out.println("APROVADO NA FINAL");
                                } else{
                                    System.out.println("REPROVADO");
                                }
                            }
                        break;
                        case 4:
                            System.out.println("DESCONTO DOS ITENS");
                            System.out.println("<>--------------------------<>");
                            
                            //Entrada1
                            System.out.print("ITEM 1: ");
                            int item1 = atv.nextInt();
                             System.out.print("ITEM 2: ");
                            int item2 = atv.nextInt();
                             System.out.print("ITEM 3: ");
                            int item3 = atv.nextInt();
                            
                            System.out.println();

                            //Entrada2
                            System.out.print("ENSIRA O VALOR PRODUTO 1: R$");
                            double valor1 = atv.nextDouble();
                            System.out.print("ENSIRA O VALOR PRODUTO 2: R$");
                            double valor2 = atv.nextDouble();
                            System.out.print("ENSIRA O VALOR PRODUTO 3: R$");
                            double valor3 = atv.nextDouble();
                            atv.nextLine();

                            //Processo
                            int totalItens = item1 + item2 + item3;
                            double totalVenda = (item1 * valor1) + (item2 * valor2) + (item3 * valor3);
                            double valorDesconto = (totalVenda * 0.1);

                            //Processo e saida
                            if(((item1 >= 10) && (item2 >= 10)) ||
                                ((item3 >= 10) && (item2 >= 10)) ||
                                ((item2 >= 10) && (item3 >= 10))){
                                
                                    System.out.println(">> GANHOU 10% DE DESCONTO NO VALOR TOTAL <<");
                                    System.out.println();
                                    System.out.println("TOTAL DE ITENS VENDIDOS: " + totalItens);
                                    System.out.printf("VALOR DO DESCONTO: R$ %.2f\n", valorDesconto);
                                    System.out.printf("VALOR TOTAL COM DESCONTO APLICADO: R$ %.2f", valorDesconto - totalVenda);
                                    System.out.println();
                            }else{
                                System.out.println("TOTAL DE ITENS VENDIDOS: " + totalItens);
                                System.out.printf("VALOR TOTAL: R$ %.2f", totalVenda);
                            }

                        atv.nextLine();
                        break;
                    }

                } while (ATIVIDADE3 != 0);
            break;
        }
        } while (SELEC != 0);
    } 
    
}
