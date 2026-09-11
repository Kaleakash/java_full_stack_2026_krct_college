package static_concept;
class Employee {

    private int id;
    private String name;

    private final static String company="Abc Company";		// only one static memory.
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCompany() {
		return company;
	}

//	public static void setCompany(String company) {
//		Employee.company = company;
//	}

	void display() {
    	System.out.println("Id is "+id);
    	System.out.println("name is "+name);
    	System.out.println("Company is "+company);
    }
}

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();		// heap memory id,name part of 1st HM
		Employee emp2 = new Employee();		// heap memory id,name, part of 2nd HM
		emp1.display();
		emp2.display();
		emp1.setId(100);
		emp1.setName("Raj");
		//emp1.setCompany("Abc Company");
		emp1.display();
		emp2.display();
		emp2.setId(200);
		emp2.setName("Ram");
		//emp2.setCompany("Xyz Company");
		emp1.display();
		emp2.display();
	}

}




