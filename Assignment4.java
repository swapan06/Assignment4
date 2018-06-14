Que:1 Create a class rectangle & its data members functions and create a member function which display the area of rectangle?
Ans:1
package acadviewdemo1;

public class Rectangle {
    public static void main(String args[]){
        Rectangle rectangle=new Rectangle(8,5);
        rectangle.calculateArea();
    }
    double length;
    double width;
    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public void calculateArea()
    {
        System.out.println("Araea is :"+length*width);
        
        
    }
    
}

Que:2 Create a class complex & its data members & create a member functions which display complex number?
Ans:2
package acadviewdemo;
public class Complex {
   public static void main(String args[]){
        Complex complex=new Complex(7,4);
        complex.displayNumber();
    }
    int real;
    int imaginary;
    Complex(int a,int b)
    {
        this.real=a;
        this.imaginary=b;
    }
    public void displayNumber()
    {
        System.out.println("ComplexNumber is:"+real+"+i"+imaginary);
    }
    
    
        
    }
}

Que:4 W.A.P to print array in a waveform?
Ans:4 
package acadviewdemo;
import java.util.Scanner;
public class ArrayWave1 {
    public static void main(String args[]){
        int temp;
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the elements of array=");
        int arr[]=new int [10];
        int j=1;
        int i;
        for(i=0;i<=9;i++)
        {
            arr[i]=num.nextInt();
        }
        for(i=0;i<arr.length;i+=2)
        {
            for( ;j<=9; )
            {
            temp=arr[i];        
            arr[i]=arr[j];
            arr[j]=temp;
            break;
        }
        j+=2;
    }
    for( i=0;i<=9;i++)
    System.out.print(arr[i]+"");
}

}


