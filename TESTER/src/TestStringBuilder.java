/**
 * 
 */

/**
 * @author User
 *
 */
public class TestStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder(args[0]);
		String constant = "studying";
		System.out.println(" Given String:" + sb + " with length :" + sb.length());
		System.out.println(" First three:" + sb.substring(0,3));
		System.out.println(" Given String:" + (sb.substring(sb.length()-3)));
		
		int startOfConstant = sb.indexOf(constant);
		int endOfConstant = startOfConstant + constant.length();
		System.out.println(" Given String:" + (sb.substring(startOfConstant,endOfConstant)));
		
		
		sb.insert((sb.indexOf("am")+2), " nick");
		System.out.println("After Insert :" +sb);
		sb.delete(sb.indexOf("am"), sb.indexOf("am")+2 );
		System.out.println("After Delete:" + sb);
		System.out.println("Reverse:" +sb.reverse());
		

	
		
	}
}


