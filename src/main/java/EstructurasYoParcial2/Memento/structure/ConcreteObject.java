package EstructurasYoParcial2.Memento.structure;

public class ConcreteObject {  //Objeto del que guardo copias, tesis etc.

    private String at1;
    private String at2;
    private String at3;
    private String state;  //representa el estado

    //EL OBEJETO PUEDE TENER SU PROPIA LOGICA

    public ConcreteObject(String at3, String state){
        this.at3=at3;
        this.state=state;
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

    public String getAt3() {
        return at3;
    }

    public void setAt3(String at3) {
        this.at3 = at3;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void showInfo(){
        System.out.println("Soy: "+ at3 +" en el estado "+ state);
    }
}
