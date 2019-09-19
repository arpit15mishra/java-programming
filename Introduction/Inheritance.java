class MobilePhone{  
			void call()
			{
				System.out.println("Main purpose is calling");
		}    
	}	
		class Smartphones extends MobilePhone{  
			void web()
			{
				System.out.println("Expand your Universe");
			}  
							}  
		class Inheritance
		{  
			public static void main(String args[])
			{  
				System.out.println("Program for Inheritance");
				Smartphones S=new Smartphones();  
				S.call();  
				S.web();  
			}	
		}  