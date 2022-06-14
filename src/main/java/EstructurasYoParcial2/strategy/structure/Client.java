package EstructurasYoParcial2.strategy.structure;

public class Client {

    public static void main(String []args){

        Context context=new Context("tiendita","de ropa");

        context.setStrategy(new ConcreteStrategy3());
        context.execute();


    }
}
