import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) throws Exception {
        int choice;
        double number1, number2, result;
        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "------PILIH OPERATOR------\n1. Penjumlahan \n2. Pengurangan\n3. Perkalian\n4.Pembagian")); // converting joptionpane return dari string ke integer 
        switch(choice){
            case 1:
            number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input angka pertama"));
            number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input angka Kedua"));
            result = number1 + number2;
            JOptionPane.showMessageDialog(null, "Hasilnya = "+result, "Thank you", choice, null);
            break;

            case 2:
            number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input angka pertama"));
            number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input angka Kedua"));
            result = number1 - number2;
            JOptionPane.showMessageDialog(null, "Hasilnya = "+result, "Thank you", choice, null);
            break;

            case 3:
            number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input angka pertama"));
            number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input angka Kedua"));
            result = number1 * number2;
            JOptionPane.showMessageDialog(null, "Hasilnya = "+result, "Thank you", choice, null);
            break;

            case 4:
            number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input angka pertama"));
            number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input angka Kedua"));
            result = number1 / number2;
            JOptionPane.showMessageDialog(null, "Hasilnya = "+result, "Thank you", choice, null);
            break;

            default:
            JOptionPane.showMessageDialog(null, "ERROR!!", null, choice, null);
        }
    }
}
