package br.utfpr.gof.factoryMethodCoffe;
/**
 * 1) Imagine uma situação onde tem-se um sistema para registrar pedidos de cafés em uma
 * cafeteria. Considere que existem três opções de café disponíveis e para ter acesso aos preços
 * de cada um, é preciso instanciar um pedido de acordo com a opção desejada. Aplique o padrão
 * factory method para criar os objetos.
 *
 * a) Crie uma classe base e três classes derivando dela, referentes às opções de café disponíveis.
 *
 * b) Crie uma classe factory que fará a decisão de qual subclasse retornar de acordo com um
 * parâmetro passado ao método factory. Um método getCafe() pode ser o método factory dessa
 * classe.
 *
 * c) Crie uma classe Main que irá testar a solicitação de pedido das três opções de café, fazendo
 * uso da factory criada, apresentando o pedido realizado e o preço correspondente.
 */
public class Main {
    public static void main(String[] args) {
        //cria a fábrica
        //responsável por implementar os métodos
        CoffeFactory factory_c = new CoffeFactoryConcrete();
        System.out.println("Coffe Mocha");

        //Instancia a classe passando a fábrica concreta,
        // que vai resolver de acordo com a classe passada e implementar o método da fabrica "original" (classe abstrata)
        Coffe mocha = factory_c.createCoffe("MOCHA");
        //depois de criado o método pela fábrica concreta
        //chama o método da classe
        System.out.println(mocha.getPrice());
        System.out.println("Coffe Cappuccino");
        Coffe cappuccino = factory_c.createCoffe("CAPPUCCINO");
        System.out.println(cappuccino.getPrice());
        System.out.println("Coffe Caipirinha");
        Coffe coffeCaipirinha = factory_c.createCoffe("CAPPUCCINO");
        System.out.println(coffeCaipirinha.getPrice());
    }
}
