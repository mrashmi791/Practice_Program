package com.rashmi.exception;

class Person extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public Person(String arg0, Throwable arg1) {
		
		//save information in db ...
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public Person(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public Person(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
		
	}
	public void setPerson(String name) {
		this.name = name;
	}
}

 class ExceptionDemo {

	public static void main(String[] args) throws Person {
		Person obj = new Person();
		
		try {
		
			String name = obj.name;
			obj.setPerson("Ram");
			System.out.println(obj.getName());
			
			
		} catch(NullPointerException e){
//			System.out.println("object null  "+e);
			throw new Person("object is null",e);
		}
		
		

	}

}
