package EstructurasYoParcial2.command.structure;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<ICommand>commands=new ArrayList<>();

    public Invoker(){}//constructor

    public void addCommands(ICommand c){
        commands.add(c);

    }
    //Metodo para iterar todos los comandos guardados

    public void correrComandos(){
        for (ICommand command:commands) {
            command.execute();
        }
        commands.clear();
    }
}
