package Parcial2.Strategy;

import EstructurasYoParcial2.strategy.structure.ConcreteStrategy3;

public class Client {

    public static void main(String[]args) {

        BaseDeDatos bd = new BaseDeDatos();

        Libro l1 = new Libro(2, "MobyDick", "Drama");
        Libro l2 = new Libro(5, "Alabama", "Musical");
        Libro l3 = new Libro(1, "SherlockHolmes", "Suspenso");

        bd.setStrategy()



        //context.setStrategy(new ConcreteStrategy3());
        //context.execute();

    }
}
