import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int res = 0, elec;
        
        do {

            String operaciones[] = {
                "Suma",
                "Resta",
                "Multiplicacion",
                "Division",
                "Elevado",
                "Porcentaje"
            };

            String resp = (String) JOptionPane.showInputDialog(null, "Seleccione la operacion a realizar", "Operaciones", JOptionPane.DEFAULT_OPTION, null, operaciones, operaciones[0]);
            
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
            
            if (resp == operaciones[0]) {
                res = num1 + num2;
            }
            if (resp == operaciones[1]) {
                res = num1 - num2;
            }
            if (resp == operaciones[2]) {
                res = num1 * num2;
            }
            if (resp == operaciones[3]) {
                res = num1 / num2;
            }
            if (resp == operaciones[4]) {
                res = (int) Math.pow(num1,num2);
            }
            if (resp == operaciones[5]) {
                res = (int) (num1 * (num2 / 100.0));
            }

            JOptionPane.showMessageDialog(null,"El resultado es " + res, "Resultado",JOptionPane.INFORMATION_MESSAGE);
            
            elec = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operacion?", "Operaciones", JOptionPane.YES_NO_OPTION);
            
        } while (elec != 1);
        //1 = No, 0 = Si
    }
}
