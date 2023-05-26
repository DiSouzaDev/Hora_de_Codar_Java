import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //Ex 1
    String planeta = "Plutão";
    System.out.println(planeta);

    //Ex 2
    System.out.println("Qual o seu nome?");
    Scanner pergunta1 = new Scanner(System.in);
    String nome = pergunta1.nextLine();
    System.out.println("Olá " + nome);

    //Ex 3
    System.out.println("Escreva seu nome:");
    Scanner scan = new Scanner(System.in);
    String nome = scan.nextLine();

    System.out.println("Escreva sua idade:");
    Scanner scans = new Scanner(System.in);
    String idade = scans.nextLine();

    System.out.println("Olá " + nome + ", sua idade é de " + idade + " anos.");

    //Ex 4 Calcular Áreas
    //Retângulo
    System.out.println("Informe o valor da base do retângulo:");
    Scanner scan = new Scanner(System.in);
    int base = scan.nextInt();

    System.out.println("Informe o valor da altura do retângulo:");
    Scanner scans = new Scanner(System.in);
    int altura = scans.nextInt();

    System.out.println("O valor da área é de " + base * altura);

    //Quadrado
    System.out.println("Informe o valor do lado do quadrado:");
    Scanner scan = new Scanner(System.in);
    int lado = scan.nextInt();

    System.out.println("O valor da área é de " + lado * lado);

    //Losango
    System.out.println("Informe o valor da diagonal maior do losango:");
    Scanner scan = new Scanner(System.in);
    int diag_maior = scan.nextInt();

    System.out.println("Informe o valor da diagonal menor do losango:");
    Scanner scans = new Scanner(System.in);
    int diag_menor = scans.nextInt();

    System.out.println("O valor da área é de " + (diag_maior * diag_menor)/2 );

    //Trapézio
    System.out.println("Informe o valor da base maior do trapézio:");
    Scanner scan = new Scanner(System.in);
    double base_maior = scan.nextDouble();

    System.out.println("Informe o valor da base menor do trapézio:");
    double base_menor = scan.nextDouble();

    System.out.println("Informe o valor da altura do trapézio:");
    double altura = scan.nextDouble();

    System.out.println("O valor da área é de " + ((base_maior + base_menor)*altura)/2 );

    //Paralelogramo
    System.out.println("Informe o valor da base do paralelogramo:");
    Scanner scan = new Scanner(System.in);
    double base = scan.nextDouble();

    System.out.println("Informe o valor da altura do paralelogramo:");
    double altura = scan.nextDouble();

    System.out.println("O valor da área é de " + base * altura);

    //Triângulo
    System.out.println("Informe o valor da base do triângulo:");
    Scanner scan = new Scanner(System.in);
    int base = scan.nextInt();

    System.out.println("Informe o valor da altura do triângulo:");
    Scanner scans = new Scanner(System.in);
    int altura = scans.nextInt();

    System.out.println("O valor da área é de " + (base * altura)/2);

    //Círculo
    System.out.println("Informe o valor da base do triângulo:");
    Scanner scan = new Scanner(System.in);
    int raio = scan.nextInt();

    System.out.println("O valor da área é de " + 3*raio*raio);
    
    //Ex 5
    System.out.println("Escreva um valor:");
    Scanner scan = new Scanner(System.in);
    int numero_usuario = scan.nextInt();

    if(numero_usuario < 0){
      System.out.println("O número é negativo.");
    }else if(numero_usuario > 0){
      System.out.println("O número é positivo.");
    }else{
      System.out.println("O número é zero.");
    }

    //Ex 6
    System.out.println("Informe o primeiro valor:");
    Scanner scan = new Scanner(System.in);
    int val1 = scan.nextInt();
    System.out.println("Informe o segundo valor:");
    int val2 = scan.nextInt();
    System.out.println("Informe o terceiro valor:");
    int val3 = scan.nextInt();
    
    if(val1 > val2 && val1 > val3){
      System.out.println("O maior valor é o primeiro.");
    }else if(val1 < val2 && val2 > val3){
      System.out.println("O maior valor é o segundo.");
    }else{
      System.out.println("O maior valor é o terceiro.");
    }

    //Ex 6.1
    System.out.println("Informe o primeiro valor:");
    Scanner scan = new Scanner(System.in);
    int val1 = scan.nextInt();
    System.out.println("Informe o segundo valor:");
    int val2 = scan.nextInt();
    System.out.println("Informe o terceiro valor:");
    int val3 = scan.nextInt();
    System.out.println("Informe o quarto valor:");
    int val4 = scan.nextInt();

    System.out.println("O maior valor é " + Math.max(val1, Math.max(val2, Math.max(val3, val4))));

    //Ex 7
    System.out.println("Informe o primeiro valor:");
    Scanner scan = new Scanner(System.in);
    int val1 = scan.nextInt();
    System.out.println("Informe o segundo valor:");
    int val2 = scan.nextInt();
    System.out.println("Informe o terceiro valor:");
    int val3 = scan.nextInt();
    
    if (val1 < val2 && val1 < val3) {
      System.out.println("A soma é " + (val2 + val3));
    } else if (val1 > val2 && val2 < val3) {
      System.out.println("A soma é " + (val1 + val3));
    } else {
      System.out.println("A soma é " + (val1 + val2));
    }

    //Ex 7.1
    int[] valores;
    System.out.println("Informe o primeiro valor:");
    Scanner scan = new Scanner(System.in);
    valores = scan.nextInt();
    int a = scan.nextInt();
    System.out.println("Informe o segundo valor:");
    int b = scan.nextInt();
    System.out.println("Informe o terceiro valor:");
    int c = scan.nextInt();
    System.out.println("Informe o quarto valor:");
    int d = scan.nextInt();
    System.out.println("Informe o quinto valor:");
    int e = scan.nextInt();
    
    int maiorValor = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
    int segMaior = Math.min(a, Math.max(b, Math.max(c, Math.max(d, e))));
    
    System.out.println("A soma dos dois maiores valores é " + (maiorValor + segMaior));

    //Ex 8
    System.out.println("Informe o primeiro valor:");
    Scanner scan = new Scanner(System.in);
    double val1 = scan.nextDouble();

    System.out.println("Informe o segundo valor:");
    double val2 = 1;
    val2 = scan.nextInt();
    while (val2 <= 0) {
      System.out.println("Informe um valor maior que zero!");
      val2 = scan.nextDouble();
    }

    System.out.println("A divisão resulta em: " + val1 / val2);

    //Ex 9
    int valorUsuario = 0;
    System.out.println("Escreva 10 valores:");
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      valorUsuario += scan.nextInt();
    }

    System.out.println("A média dos valores é " + (valorUsuario / 10));

    //Ex 10
    int notaAluno = 0;
    System.out.println("Escreva 4 notas");
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
      notaAluno += scan.nextInt();
    }

    double notaFinal = notaAluno / 4;
    if (notaFinal < 6) {
      System.out.println("A média das notas é " + notaFinal + " - Aluno reprovado! Estude mais na próxima.");
    } else {
      System.out.println("A média das notas é " + notaFinal + " - Aluno aprovado! Parabéns!");
    }

    //Ex 11
    System.out.println("Começando contagem:");
    int contagem = 31;
    for (int i = 0; i < 30; i++) {
      contagem -= 1;
      System.out.println(contagem);
    }

    System.out.println("Explosão");

    //Ex 12
    int contagem = 11;
    for (int i = 0; i < 10; i++) {
      contagem -= 1;
      System.out.println(contagem);
    }

    // Ex 13
    System.out.println("Informe o primeiro número:");
    Scanner scan = new Scanner(System.in);
    int val1 = scan.nextInt();

    System.out.println("Informe o segundo número:");
    int val2 = scan.nextInt();

    System.out.println("A média dos valores é " + (val1 + val2) / 2);


    for (int i = val2; i >= val1; i--) {
      val2 -= 1;
      System.out.println(val2);
    }

    // val2 -= 1;
    // while (val2 > val1){
    //   System.out.println(val2);
    //   val2 -= 1;
    // }

    //Ex 14
    double notaAluno = 0;
    int aluno_reprovado = 0;
    
    System.out.println("Escreva 2 notas:");
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 2; i++) {
    notaAluno += scan.nextDouble();
    }
    
    double notaFinal = notaAluno / 2;
    if (notaFinal < 6.5) {
    System.out.println("A média das notas é " + notaFinal + " - Aluno reprovado! Estude mais na próxima.");
      // System.exit(0);
    } else {
    System.out.println("A média das notas é " + notaFinal + " - Aluno aprovado! Parabéns!");
      aluno_reprovado += 1;
      // System.exit(0);
    }
    System.out.println("Deseja calcular outra média?");
    String resposta = scan.nextLine();
    
    if(resposta == "S"){
      System.out.println("Chegou");
      main();
    }else if(resposta == "N"){
      System.out.println("A quantidade de alunos reprovados é de " + aluno_reprovado);
      System.exit(0);
    }else{
      System.out.println("Digite um valor valor válido!");
    }
  }
}
