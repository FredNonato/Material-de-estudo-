import java.util.Scanner; //sempre imports na primeira linha

public class Main {
    public static void main(String[] args) {
//IF,ELSE
//1
        /*
        Scanner sc = new Scanner(System.in);
        float valor_compra;
        System.out.println("qual valor da sua compra?");
        valor_compra = sc.nextFloat();
        if (valor_compra>=100){
            float valor_compraF = valor_compra - valor_compra*0.1f;//o uso do f ao final para explicitar que é um float e nao um double
            System.out.println("você possui direito ao desconto de 10%, ficando valor final igual a:"+valor_compraF);}
        else {System.out.println("você não possui direito ao desconto");
        */

//IF,ELSE IF, ELSE
//1
        /*
        Scanner sc = new Scanner(System.in);
        int categoriaCliente;
        System.out.println("Qual sua pontuação?");
        categoriaCliente = sc.nextInt();
        if (categoriaCliente>=85){System.out.println("Cliente Premium");}
        else if (categoriaCliente>=50){System.out.println("Cliente Regular");}//uso de else if para mais de uma condição
        else{System.out.println("Cliente Comum");}
        */
//2
        /*
        int meta = 1000;
        double vendaIndividual;
        Scanner sc = new Scanner(System.in);
        System.out.println("qual foi o valor total vendido por você esse mês?");
        vendaIndividual = sc.nextDouble();
        if (vendaIndividual>=meta){System.out.println("Excelente Desempenho");}
        else if (vendaIndividual>=meta*0.9){System.out.println("Muito Bom Desempenho");}
        else if (vendaIndividual>=meta*0.8){System.out.println("Bom Desempenho");}
        else if (vendaIndividual>=meta*0.61){System.out.print("Desempenho Satisfatorio");}
        else{System.out.println("Desempenho Insatisfatorio");}
        */

//OPERADOR TERNARIO
//1
        /*
        int velocidade = 100;
        System.out.println((velocidade <= 80) ? "dentro do limite" : "fora do limite");
         */
//2
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("qual cor o semaforo esta?");
        String cor = sc.nextLine();
        System.out.println((cor.equals("vermelho")) ? "parar" : (cor.equals("verde")) ? "avançar" : (cor.equals("amarelo")) ? "atenção" : "");
         */

//SWITCH CASE
//1
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("qual o ultimo digito da sua placa?");
        int placaF = sc.nextInt();
        switch (placaF){
            case 0,9:
                System.out.println("Seu rodizio é na Sexta-Feira");
                break; //sempre colocar o break ao final de cada case, para não chamar todos os proximos casos
            case 1,2:
                System.out.println("Seu rodizio é na Segunda-Feira");
                break;
            case 3,4:
                System.out.println("Seu rodizio é na Terça-Feira");
                break;
            case 5,6:
                System.out.println("Seu rodizio é na Quarta-Feira");
                break;
            case 7,8:
                System.out.println("Seu rodizio é na Quinta-Feira");
                break;
            default: //default por ser o ultimo a ser chamado nao precisa obrigatoriamente do break
                System.out.println("valor inválido");
        }
         */
//FOR
//1
        /*
        int[] vendasSemana = {35, 42, 28, 50, 31, 47, 39};
        int precoHamburguer = 10;
        int valorSemanal = 0;
        for (int i = 0; i < vendasSemana.length; i++){ //foi criado um sistema que percorre cada item da lista vendasSemana some o valor multiplicado pelo preço do item ao valor total
            valorSemanal += vendasSemana[i]*precoHamburguer;}
        System.out.println("O valor final total vendido da semana é: "+valorSemanal);
         */
//2
        /*
        String[] itens = {
                "Hambúrguer Clássico",
                "Cheeseburguer Especial",
                "X-Bacon Supremo",
                "Veggie Burguer",
                "Batata Frita Média",
                "Batata Frita com Cheddar",
                "Nuggets (8 unidades)",
                "Refrigerante Lata",
                "Suco Natural 300ml",
                "Milkshake Chocolate"
        };

        double[] precos = {
                10.00,
                12.50,
                14.00,
                11.00,
                7.00,
                9.50,
                10.00,
                5.00,
                6.50,
                12.00
        };
        for (int i = 0; i < itens.length; i++){
            System.out.printf("%d. %-30s R$ %.2f%n", i+1, itens[i] , precos[i]);}
            //se atente ao uso do "f" ao final do print para o sistema entender o uso da formatação dentro do ()
         */

//WHILE
//1
        /*
        double[] vendasDoDia = {
                25.00, 18.50, 32.00, 10.00, 22.75,
                15.00, 40.00, 12.50, 28.00, 19.90,
                35.00, 16.00, 27.50, 21.00, 30.00
        };
        int contagem = 0;
        float valorF = 0;
        while (contagem< vendasDoDia.length){
            valorF += vendasDoDia[contagem]; //o uso de 'contagem como valor do indice a ser percorrido a cada soma, facilita e diminui o codigo
        contagem++;}
            System.out.println("o valor final do dia é:"+valorF);
         */
//2
        /*
        String[] pedidosPendentes = {"pedido 1",
        "pedido 2",
        "pedido 3",
        "pedido 4"};
        int pedidosEntregues = 0;
        while (pedidosEntregues<pedidosPendentes.length){
            System.out.println("pedido entregue"+ pedidosPendentes[pedidosEntregues]);
            pedidosEntregues++;}
        System.out.printf("Todos os pedidos entregues");
         */

//DO WHILE
//1
        /*
        int numeroSecreto = 444;
        int tentativa;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("qual numero acha que é?");
            tentativa = sc.nextInt();
        }
        while (tentativa != numeroSecreto); //foi criado um sistema de tentativas infinitas para descobrir um numero
         */
//2
        /*
        Scanner sc = new Scanner(System.in);
        String opcao;
        String[] estoque = {};
        do {
            System.out.println("1- Cadastrar item," +
                    "2 - Sair");
            opcao = sc.nextLine(); //esboço inicial do que seria um sistema de cadastramento de itens
        }while (opcao != "2" );
         */
    }
    }


