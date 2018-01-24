
public class complexcal {
	 
	
		    int r;
		    int im;

		    complexcal(int real, int imag)
		    {
		        r=real;
		        im= imag;
		    }
		    public complexcal()
			{
				r=0;
				im=0;
			}
		    void display()	
		    {
		    	System.out.println("Complex number:"+r+"+"+im+"i");
		    }
		    complexcal plus( complexcal a)
			{
				complexcal n= new complexcal();
				n.r=r+a.r;
				n.im=im+a.im;
				return n;
			}
		    complexcal multiply( complexcal a)
			{
				
					complexcal n= new complexcal();
					n.r=r*a.r-im*a.im;
					n.im=r*a.im+im*a.r;
					return n;
				}
		    public static void main(String[] args)
		    {
		    	complexcal c1=new complexcal(6,3);
		    	complexcal c2=new complexcal(2,6);
				complexcal add=new complexcal();
				complexcal multiply=new complexcal();
				
				add= c1.plus(c2);
				multiply=c1.multiply(c2);
				
		    	c1.display();
		    	c2.display();
		    	System.out.println("\n after Addition ");
		    	add.display();
		    	System.out.println("\n after Multiplication ");
		    	multiply.display();
		    	
		    	
		    
		    }
	}


