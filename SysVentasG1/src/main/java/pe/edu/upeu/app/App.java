package pe.edu.upeu.app;

import pe.edu.upeu.strategy.Context;
import pe.edu.upeu.strategy.OperationAdd;
import pe.edu.upeu.strategy.OperationMultiply;
import pe.edu.upeu.strategy.OperationSubstract;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //new MainGUI();
        //new MenuOpciones().login();
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(100, 10));
    }
}
