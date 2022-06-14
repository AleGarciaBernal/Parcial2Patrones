package EstructurasParcial1.estructuras.builder.structure;

public class Client {

    public static void main(String[]args){

        Director director=new Director();
        ConcreteBuilder1 p1=new ConcreteBuilder1();

        director.setBuilder(p1);
        director.buildProduct();
        Product product=director.getProduct();
        product.showInfo();


    }
}
