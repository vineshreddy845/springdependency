

public class family {
      
  //public int number;   These are dependency literals.  The vinesh main class object dependents on family object.
 // public String dogname;
 
  /* In order to installize above dependency object we use "setter" and "constructor" method.*/
  // first we have declare literals with private.
  private int number;
  private String dogname;
  
  public void setNumber(int number,String dogname)// setter method.
  {
	  this.number=number;
	  this.dogname=dogname;
  }
  
  public void names()
  {
	  System.out.println("brothername = "+number+"\ndogname = "+ dogname);
  }
}
