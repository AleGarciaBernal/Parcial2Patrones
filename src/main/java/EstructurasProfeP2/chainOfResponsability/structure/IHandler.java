package EstructurasProfeP2.chainOfResponsability.structure;

public interface IHandler {

    void setNext(IHandler handler);
    void criteriaHandler(int amount);
    IHandler next();
}
