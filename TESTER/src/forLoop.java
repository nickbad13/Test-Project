/**
 * 
 */

/**
 * @author User
 *
 */
public class forLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(10);
		sb.append("Nothing");
		System.out.println("sb:" + sb);
		
		// TODO Auto-generated method stub
		for (int i =1; i <= 10; ++i) {
			System.out.println("sb at line "+ i +" with value " +sb+"'_'");
			sb.append( "-" + i);
		}

	}

}
