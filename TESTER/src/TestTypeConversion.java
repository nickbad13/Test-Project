public class TestTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Double salaryDbl = new Double(args[0]);
		if (salaryDbl.isNaN()) {
			System.out.println("Salaryis not valid:" + salaryDbl);
		} 
		
		else {
			
		double salary = salaryDbl.doubleValue();
	
		String salaryStr = String.valueOf(salary);
		
		System.out.println(salaryStr);
		
	}

}}