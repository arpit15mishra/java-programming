 
class ConstructerOverload{
          // overload constructors   
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    ConstructerOverload(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    ConstructerOverload(int i,String n,int s){  
    id = i;  
    name = n;  
    age=s;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){ 
	System.out.println("Program for Constructer Overloading"); 
    ConstructerOverload s1 = new ConstructerOverload(22,"Hemant");  
    ConstructerOverload s2 = new ConstructerOverload(23,"Vihan",20);  
    s1.display();  
    s2.display();  
   }  
}  