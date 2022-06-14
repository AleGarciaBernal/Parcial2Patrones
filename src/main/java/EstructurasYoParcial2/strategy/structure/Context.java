package EstructurasYoParcial2.strategy.structure;

public class Context {

    private String at1;
    private String at2;

    private IStrategy strategy;

    public Context(String at1, String at2) {
        this.at1 = at1;
        this.at2 = at2;
    }

    public String getAt1() {
        return at1;
    }

    public void setAt1(String at1) {
        this.at1 = at1;
    }

    public String getAt2() {
        return at2;
    }

    public void setAt2(String at2) {
        this.at2 = at2;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void met1(){}

    public void execute(){
        strategy.execute();
    }


    //su propia logica
}
