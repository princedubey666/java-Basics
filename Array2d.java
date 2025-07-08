import java.util.*;

class array2d{
    int[][] marks= new int[2][2]; //declaration of an 2d array of 3*3 
    
    Scanner sc=new Scanner(System.in);
    //storing values in array elements
    public void Accept(){
    
    
    System.out.println("Enter your marks in Mathematics: ");
    marks[0][0]=sc.nextInt();
    System.out.println("Enter your marks in chemistry: ");
    marks[0][1]=sc.nextInt();
    System.out.println("Enter your marks in Physics");
    marks[0][2]=sc.nextInt();
    System.out.println("Enter your marks in English");
    marks[1][0]=sc.nextInt();
    System.out.println("Enter the amount you spent on your study");
    marks[1][1]=sc.nextInt();
}
public void display(){
     
        System.out.println("Marks entered:");
        System.out.println("Mathematics: " + marks[0][0]);
        System.out.println("Chemistry: " + marks[0][1]);
        System.out.println("Physics: " + marks[0][1]);
        System.out.println("English: " + marks[1][1]);
}
public void result(){
    System.out.println("Enter maximum marks: ");
    int max=sc.nextInt();
    int per=(marks[0][0]+marks[0][1]+marks[0][1]+marks[1][1])*100/max;
    System.out.println("Percentage="+per);
}
public static void main(String[] args){
    array2d obj= new array2d();
obj.Accept();
obj.display();
obj.result();
}  
}
