package assQue3;

public interface Human {
	
	  default void human() {
	  System.out.println("Outside Human cant access property"); 
	  }
	 

}
