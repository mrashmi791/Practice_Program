package common.practice.program;
public class Test 
{ 
    @SuppressWarnings("unused")
	private String function(String temp, int data, int sum) 
    { 
        return ("GFG"); 
    } 
    @SuppressWarnings("unused")
	private String function(String temp, int data) 
    { 
        return ("GeeksforGeeks"); 
    } 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); 
        System.out.println(obj.function("GFG",  20));     
    } 
}