package EstructurasYoParcial2.iterator.structure;

public class Client {

    public static void main(String []args){

        ConcreteAggregateA bancoUnion=new ConcreteAggregateA();
        bancoUnion.add("Jose1");
        bancoUnion.add("Jose2");
        bancoUnion.add("Jose3");
        bancoUnion.add("Jose4");
        bancoUnion.add("Jose5");
        //bancoUnion.add("Jose6");

        ConcreteAggregateB bancoBisa=new ConcreteAggregateB();
        bancoBisa.add("Maria1");
        bancoBisa.add("Maria2");
        bancoBisa.add("Maria3");
        bancoBisa.add("Maria4");
        bancoBisa.add("Maria5");

        Iterator iterator;

        iterator=bancoUnion.createIterator();

        while (iterator.hasNext()){
            String cliente=(String) iterator.next();
            System.out.println("Banco Union:"+ cliente);
        }

        iterator=bancoBisa.createIterator();

        while (iterator.hasNext()){
            String cliente=(String) iterator.next();
            System.out.println("Banco Bisa:"+ cliente);
        }








        }
}
