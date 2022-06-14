package Parcial2.Strategy;

import java.util.List;

public class StrategiaPorTitulo implements IStrategy{

    @Override
    public void execute(List<Libro> arr) {
        System.out.println("Se esta ordenando por titulo");

    }
}
