class Course{  
  int id;  
  String subject;    
            Course(int id,String subject){  
                this.id=id;  
                this.subject=subject;  
                }  
              void display(){System.out.println(id+" "+subject);}  
                
                 class ThisKeyword{  
                    public static void main(String args[]){  
                    	System.out.println("Program for ThisKeyword");
                     Course c1=new Course(123,"Python");  
                     Course c2=new Course(234,"Java");  
                     c1.display();  
                     c2.display();  
                  }
                  }  