/**
 * Capacity.java 1.1 19-Aug-2017
 * 
 */
//package declaration
package session73;
/**
 * This class will  show how the capacity is changing in StringBuffer or in StringBuilder if we
 * append the string.
 * 
 * @author chhaya yadav
 * 
 * version 1.1
 * 
 * compiled on 19-Aug-2017
 *
 */
//class declaration
public class Capacity {

//main method declaration
	public static void main(String[] args) {
		
//instantiation of the StringBuffer object	with empty string	
		
		StringBuffer bf = new StringBuffer();
		
//invocation of capacity method of StringBuffer class		
		
	    System.out.println("Stringbuffer default capacity  "+ bf +"->"+bf.capacity());  
	    
//invocation of length method of StringBuffer class	    
	    
	    System.out.println("Stringbuffer object length -> " + bf.length());
	    
//appending the argument string to StringBuffer object	    
		
	    bf = bf.append("Yadav");
	    	
	    System.out.println("Stringbuffer capacity after append operation : "+bf +"->"+bf.capacity());
	    
	    System.out.println("Stringbuffer object length -> " + bf.length());
	    
	    System.out.println("---------------------------------------------------------------------------------");
	    
	    
	    
	    
	    
//instantiation of the StringBuffer object	with Non-empty string	    
	    
        StringBuffer bf1 = new StringBuffer("Manoj");
		
        System.out.println("Stringbuffer capacity of "+bf1 +"->"+bf1.capacity());
        
        System.out.println("Stringbuffer object length -> " + bf1.length());
        
//appending the argument string to StringBuffer object        
		
	    bf1 = bf1.append("Suryawanshi");
		
	    System.out.println("Stringbuffer capacity after append operation :  "+bf1 +"->"+bf1.capacity());
	    
	    System.out.println("Stringbuffer object length -> " + bf1.length());
	    
	    System.out.println("---------------------------------------------------------------------------------");
	    
	    
	    
	    
//instantiation of the StringBuilder object	with empty string	    
	    
        StringBuilder bd1 = new StringBuilder();
		
//invocation of capacity method of StringBuilder class  
        
	    System.out.println("StringBuilder default capacity  "+ bd1 +"-> "+ bd1.capacity());
	    
//invocation of length method of StringBuilder class	    
	    
	    System.out.println("Stringbuffer object length -> " + bd1.length());
	    
//appending the argument string to StringBuilder object	    
	    
        bd1 = bd1.append("ChhayaAkshay");
		
        System.out.println("StringBuilder capacity after append operation : "+ bd1 +" ->"+bd1.capacity());
        
        System.out.println("Stringbuffer object length -> " + bd1.length());
	    
        System.out.println("---------------------------------------------------------------------------------");
        
        
        
//instantiation of the StringBuilder object	with Non-empty string        
        
        StringBuilder bd2 = new StringBuilder("ChhayaAkshay");
		
        System.out.println("StringBuilder capacity of "+ bd2 + "->"+ bd2.capacity());
        
        System.out.println("Stringbuffer object length -> " + bd2.length());
        
//appending the argument string to StringBuilder object        
	    
        bd2 = bd2.append("Yadav");
		
        System.out.println("StringBuilder capacity after append operation : "+ bd2 +"->"+bd2.capacity());
        
        System.out.println("Stringbuffer object length -> " + bd2.length());
        
        System.out.println("---------------------------------------------------------------------------------");
	        
	}

}
