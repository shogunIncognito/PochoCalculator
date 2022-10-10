import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int elec;

        String operaciones[] = {
            "Suma",
            "Resta",
            "Multiplicacion",
            "Division",
            "Elevado",
            "Porcentaje"
        };

        do {
            int num1 = 9823167, num2 = 9823167;

            String resp = (String) JOptionPane.showInputDialog(null, "Seleccione la operacion a realizar", "Operaciones", JOptionPane.DEFAULT_OPTION, null, operaciones, operaciones[0]); 
            
            //verify if choice is empty or null value
            do {
                try {
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Dato incorrecto o campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (num1 == 9823167 || num2 == 9823167);

            operar(num1, num2, resp, operaciones);

            elec = confirmElec();
            
        } while (elec == JOptionPane.YES_OPTION);
    }

    public static void operar(int num1, int num2, String op_num, String[] operaciones) {

        int res = 0;

        if (op_num == operaciones[0]) {
            res = num1 + num2;
        }
        if (op_num == operaciones[1]) {
            res = num1 - num2;
        }
        if (op_num == operaciones[2]) {
            res = num1 * num2;
        }
        if (op_num == operaciones[3]) {
            res = num1 / num2;
        }
        if (op_num == operaciones[4]) {
            res = (int) Math.pow(num1,num2);
        }
        if (op_num == operaciones[5]) {
            res = (int) (num1 * (num2 / 100.0));
        }

        JOptionPane.showMessageDialog(null,"El resultado es " + res, "Resultado",JOptionPane.INFORMATION_MESSAGE);
    }

    public static int confirmElec() {
        return JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operacion?",
         "Operaciones", JOptionPane.YES_NO_OPTION);
    }
}
