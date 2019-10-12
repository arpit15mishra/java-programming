import java.awt.*;
	import java.applet.*;
	public class Calculator extends Applet {
		static final int n = 4;
        Label result;
        Label answer;
        Label statement;
        TextField t;
		public void init(  ) {			// To initialize the applet for 16-cells grid
			setLayout (new GridLayout (3,3));		// To for 4x4 cells grid
			setFont (new Font ("Helvetica",  Font.BOLD, 24 ));   // Font of Helvetica of size 24
            result = new Label("Result:",Label.CENTER);
            answer = new Label(" hlhajfd",Label.RIGHT);
            statement = new Label (" *asdklhflja " , Label.RIGHT );
            add(result);
            add(answer);
            add(statement);
            for(int i = 0; i < 10; i++){
                add(new Button(" "+i));
            }

            //t = new TextField(" ");

            
		} 

		public boolean action(Event e, Object obj) {	       // Overridden event handler
				if (e.target instanceof  Button  ) {	  //  Wait for clicking a button object 
                    statement.setText (obj.getSource().getText() );
                    
                      // Print the value of the Clicked butoon
				}
				return false ;
			}
	}
