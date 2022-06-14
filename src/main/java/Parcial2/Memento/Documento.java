package Parcial2.Memento;

public class Documento {

    private String palabras;


    public Documento(String palabras){
        this.palabras=palabras;
    }

    public void showInfo() {
        System.out.println("El documento dice lo siguiente" );
        System.out.println(palabras);
    }


    public String getPalabras() {
        return palabras;
    }

    public void setPalabras(String palabras) {
        this.palabras = palabras;
    }
}
