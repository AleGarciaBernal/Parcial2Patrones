package EstructurasYoParcial2.chainResponsability.structure;

public interface IHandler { //3 metodos

    //que nos permita ir al siguiente responsable
    //el criterio
    //uno que defina el siguiente responsable

    void setNext(IHandler handler);
    void criteriaHandler(int amount);//cambia el argumento dependiendo el problema
    IHandler next();


}
