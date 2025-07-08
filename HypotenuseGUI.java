import javax.swing.JOptionPane;
public class HypotenuseGUI {
    public void accept(){
    
        double x=Double.parseDouble(JOptionPane.showInputDialog("Enter a number : "));
        double y=Double.parseDouble(JOptionPane.showInputDialog("Enter second number : "));
        double max= Math.max(x,y);//tells which is max x or y
        JOptionPane.showMessageDialog(null, "biggest number is : "+max);
    }
    public void math(){
        double a=3.14;
        double b=Math.round(a);//rounds a number
        System.out.println(b);
        double c=Math.ceil(a);//round a number to up
        System.out.println(c);
        double d=Math.floor(a);//round a number to down
        System.out.println(d);
    }
    public static void main(String[] args){
        double base=Double.parseDouble(JOptionPane.showInputDialog("Enter Base length(In cm) :"));
        double per=Double.parseDouble(JOptionPane.showInputDialog("Enter Perpendicular length(In cm) :"));
        double z=Math.sqrt((base*base)+(per*per));
        JOptionPane.showMessageDialog(null , "Hypotenuse of the triangle is "+z);
        hypotenuseMath obj=new hypotenuseMath();     
        obj.accept();
        obj.math();
    }
}

