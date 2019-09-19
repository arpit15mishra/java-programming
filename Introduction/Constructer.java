  
class Constructer{ 
    // java constructer 
    int id;  
    String name; 
    Constructer(int i,String n){  
    id = i;  
    name = n;  
    }  
    void display(){
                    System.out.println(id+" "+name);
                  }  
   
    public static void main(String args[]){   
	System.out.println("Program for Constructer");
    Constructer s1 = new Constructer(178047,"Hemant");  
    Constructer s2 = new Constructer(178054,"Madhav");    
    s1.display();  
    s2.display();  
   }  
}  