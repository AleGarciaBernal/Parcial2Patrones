package Parcial2.Strategy;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {

    private List<Libro> listaLibros=new ArrayList<>();
    IStrategy strategy;


    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void addLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public void execute() {
        strategy.execute(listaLibros);
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public IStrategy getStrategy() {
        return strategy;
    }
}
