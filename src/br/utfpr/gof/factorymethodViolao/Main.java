
package br.utfpr.gof.factorymethodViolao;

/*
 Um sistema de consulta de preços de instrumentos musicais. 
 Considerem que existem várias marcas de violão e para ter 
acesso aos preços de cada uma, é preciso instanciar um violão da marca.
Use um factory method para retornar o tipo de violão desejado.
 */
public class Main {
    public static void main(String[] args) {
        ViolaoFactory fabrica = new ViolaoFactoryConcreto();
        System.out.println("Giannini");
        Violao g = fabrica.calcularPreco("Giannini");
        System.out.println(g.getPreco());
        System.out.println("Eagle");
        Violao e = fabrica.calcularPreco("Eagle");
        System.out.println(e.getPreco());
        System.out.println("Tagima");
        Violao t = fabrica.calcularPreco("Tagima");
        System.out.println(t.getPreco());
    }
}
