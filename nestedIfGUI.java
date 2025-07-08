import javax.swing.JOptionPane;
public class nestedIfGUI {
    public static void main(String[] args){
        
        int rows=Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows: "));
        
        int columns=Integer.parseInt(JOptionPane.showInputDialog("Enter number of columns"));
        char symbol = JOptionPane.showInputDialog("Enter any letter or symbol:").charAt(0);
        for(int i=1;i<=rows;i++){
            System.out.println(); //to change the line after completing a row
            for(int j=1;j<=columns;j++){
                System.out.print(symbol);
            }
        }
    }
}
