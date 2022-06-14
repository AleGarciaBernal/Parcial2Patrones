package EstructurasYoParcial2.state.structure;


public class Context {//persona, auto, etc

    private String at1;
    private String at2;
    private IState state=new ConcreteState1();

    public Context(){}

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

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void request(){
        this.state.handle();
    }
}
