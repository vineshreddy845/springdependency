
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class vinesh {
     public static void main(String args[])
     {
    	 //family fam= new family(); // we are doing  hard coding. we don't have to do that. because everytime.
    	// fam.number= 888;// we want to change number. we have to go to source code. so, spring will create 
    	 //fam.dogname= "simbha";// object for us.
    	 //fam.names();
    	/* see below how to installize dependency literals values of vinesh class.*/
    	 ApplicationContext com= new ClassPathXMLApplicationContext("dependent.xml");
    	family obj=com.getBean("fam",family.class);
    	obj.names();
     }
}
