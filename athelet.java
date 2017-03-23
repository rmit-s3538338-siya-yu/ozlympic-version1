import java.util.ArrayList;
import java.util.Scanner;

public class athelet extends Participants {
	ArrayList<String> type;

	public athelet(String ID,String name,int age,String state,String type){
	super(ID,name,age,state,type);
	ArrayList<String> type1=new ArrayList<String>();
}

	 public void addType()
	 {
		    type.add("swimmers");  
	        type.add("cyclists");  
	        type.add("sprinters");
	        type.add("superAthletes");
	 }
}