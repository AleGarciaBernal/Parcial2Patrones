package Parcial2.Strategy;

import java.util.List;

public class StrategiaPorCategoria implements IStrategy{
    @Override
    public void execute(List<Libro> arr) {
        System.out.println("Se esta ordenando por Categoria");
    }
}
