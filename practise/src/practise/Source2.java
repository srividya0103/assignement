package practise;


class Activity{
String string1;
String string2;
String operator;
public Activity(String string1,String string2,String operator){
  this.string1 = string1;
  this.string2 = string2;
  this.operator = operator;
}
public String getString1() {
	return string1;
}
public void setString1(String string1) {
	this.string1 = string1;
}
public String getString2() {
	return string2;
}
public void setString2(String string2) {
	this.string2 = string2;
}
public String getOperator() {
	return operator;
}
public void setOperator(String operator) {
	this.operator = operator;
}
public void docheckOperator(String operator)throws operatorException
{
	if((operator.equalsIgnoreCase("+") || operator.equalsIgnoreCase("-")))
	{
		  
		
	}
	else
	{
		// raised the exception
		throw new operatorException("operator is wrong");
	}
	
}
}


 class operatorException extends Exception{
private String exceptionMsg = "operator is wrong";


public operatorException() {
	super();
	// TODO Auto-generated constructor stub
}

public operatorException(String message) {
	super(message);
	this.exceptionMsg = message;
}

@Override
public String toString() {
	return "low age Exception :- "+exceptionMsg;
}
}



public class Source2{  
	
	
	public static String handleException(Activity a) {
		String string = null;
		  
	if(a.getString1() == null || a.getString2() == null ){
    try {
        throw new Exception("null values found");
    } catch (Exception e) {
    	string = e.getMessage();
        e.printStackTrace();
        System.exit(2);
    	try
    	{
    		
    		a.docheckOperator(a.getOperator());
       	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
}
	return string;
	
}
	public static void main(String[] args) {
		Activity a = new Activity("Hello", "world", "+");
		System.out.println(handleException(a));
		String string1 = new String();
		if()
		string1 = a.getString1().concat(a.getString2());
		
		
	}
	
}