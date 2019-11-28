package projeto.com.apoio;

import java.text.DecimalFormat;
import javax.swing.JTable;

/**
 *
 * @author Douglas
 */
public class Calcular {

    public static int calcularMDC(int n1, int n2) {
        int mdc = 1;
        int menor = Math.min(n1, n2);
        for (int d = 2; d <= menor; d++) {
            if (n1 % d == 0 && n2 % d == 0) {
                mdc = d;
            }
        }
        return mdc;
    }

    public static int calculaFatorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static double calculaArea(double comprimento, double largura) {

        return comprimento * largura;

    }

    public static double calcularPerimetro(double comprimento, double largura) {

        return (2 * comprimento) + (2 * largura);

    }

    public static String arredondar(double num) {

        DecimalFormat df = new DecimalFormat("#.0000");

        return df.format(num);
    }

    public static Double somarColuna(JTable table, int coluna) {

        double count = 0;
        for (int i = 0; i <= table.getRowCount() - 1; i++) {
            count += Double.parseDouble(table.getValueAt(i, coluna).toString());
        }
        return count;
    }

    public static Double arredondar(double valor, int casas, int ceilOrFloor) {
        double arredondado = valor;
        arredondado *= (Math.pow(10, casas));
        if (ceilOrFloor == 0) {
            arredondado = Math.ceil(arredondado);
        } else {
            arredondado = Math.floor(arredondado);
        }
        arredondado /= (Math.pow(10, casas));
        return arredondado;
    }

}
