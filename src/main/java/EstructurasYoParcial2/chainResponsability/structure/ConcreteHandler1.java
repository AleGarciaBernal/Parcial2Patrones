package EstructurasYoParcial2.chainResponsability.structure;

public class ConcreteHandler1 implements IHandler{

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;

    }

    @Override
    public void criteriaHandler(int amount) {
        //Logica de cuando somos responsables de solucionar el problema
        if(amount<100){
            System.out.println("Concrete Handler 1 esta resolviendo el problema "+amount);
        }else {
            next.criteriaHandler(amount);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
