package br.utfpr.gof.singleton.carrinho;

public class CarrinhoDeComprasSingleton {
    private int contador = 0;

    private static CarrinhoDeComprasSingleton instancia;

    //construtor privado
    private CarrinhoDeComprasSingleton(){
        this.setContador(this.getContador() +1);
    }

    //método para verificação e retorno da instancia precisa set static
    public static CarrinhoDeComprasSingleton getInstance(){
        //verifica se já possui uma instancia criada
        //ou seja, verifica se for igual a nulo
        if(instancia == null){
            //caso for nulo, nao existe instancias
            //declara uma nova instancia da classe
            instancia = new CarrinhoDeComprasSingleton();
        }

        //caso nao seja nulo, ou seja, já possua uma instancia iniciada
        //retorna essa instancia
        return instancia;
    }

    public int getContador(){
        return this.contador;
    }

    public void setContador(int contador){
        this.contador = contador;
    }

    public  void addItem(String item){
        System.out.println("Número de instancias (CarrinhoDeCompras): " + this.getContador());
        System.out.println("------------------------------------");
        System.out.println("Item adicionado: " + item);
        System.out.println("------------------------------------");

    }
}
