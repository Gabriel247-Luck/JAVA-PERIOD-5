
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
  
System.out.println("What are the value of variable x?");
double x = Input.readInt();
double y = Math.pow(x, 7);
System.out.println("Y equals " + y);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/

System.out.println("What are the value of variable z?");
double z = Input.readInt();
double q = (Math.pow(z, 3) + 5 );
System.out.println("q equals " + q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..  
*/

System.out.println("What are the value of variable t?");
double t = Input.readInt();
System.out.println("What are the value of variable r?");
double r = Input.readInt();
double s = (Math.pow(t, 5) * Math.pow(r+2,4));
System.out.println("s equals " + s);
 
/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
*/

System.out.println("What are the value of variable a?");
double a = Input.readInt();
System.out.println("What are the value of variable b?");
double b = Input.readInt();
double c =Math.sqrt(a + b);
System.out.println("c equals " + c);

/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
System.out.println("What are the value of variable X1?");
double x1 = Input.readInt();
System.out.println("What are the value of variable X2?");
double x2 = Input.readInt();
System.out.println("What are the value of variable Y1?");
double y1 = Input.readInt();
System.out.println("What are the value of variable Y2?");
double y2 = Input.readInt();
double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
System.out.println("d equals " + d);

/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/

System.out.println("What are the value of variable deg?");
double deg = Input.readInt();
double g = Math.sin(Math.toRadians(deg));
System.out.println("g equals " + g);

/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/

System.out.println("What are the value of variable N?");
double n = Input.readInt();
System.out.println("What are the value of variable M?");
double m = Input.readInt();
double k = Math.pow(m, 5) / Math.sqrt(n + 1);
System.out.println("k equals " + k);

/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/


    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}