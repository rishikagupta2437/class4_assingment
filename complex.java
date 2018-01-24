
public class complex {
	int real;
    int imaginary;

    complex(int r,int ima)
    {
        real=r;
        imaginary=ima;
    }
    void display()	
    {
    	System.out.println("Complex number:"+real+"+"+imaginary+"i");
    	
    }
    
    public static void main(String[] args)
    {
    	complex com=new complex(2,5);
    	com.display();
    
    }

}
