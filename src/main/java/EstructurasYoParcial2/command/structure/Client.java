package EstructurasYoParcial2.command.structure;

public class Client {

    public static void main(String []args){

        Receiver r=new Receiver();

        ConcreteCommand1 c1=new ConcreteCommand1(r);
        ConcreteCommand2 c2=new ConcreteCommand2(r);
        ConcreteCommand3 c3=new ConcreteCommand3(r);

        Invoker invoker=new Invoker();

        invoker.addCommands(c1);
        invoker.addCommands(c2);
        invoker.addCommands(c3);
        invoker.addCommands(c2);

        invoker.correrComandos();



    }
}

