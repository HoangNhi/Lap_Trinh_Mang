package ltm_06042024.Bai05_MVC;

import javax.swing.*;

public class RunProgram {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(view, model);
        view.setVisible(true);
    }
}
