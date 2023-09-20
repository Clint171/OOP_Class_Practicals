package marksheet;

public class Marksheet {

	public static void main(String[] args) {
		System.out.println("Welcome to Student Mark List Application");
		String line = new String(new char[80]).replace('\0', '_');
		System.out.println(line);
		System.out.println("Sno Student Name\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal");
		System.out.println(line);
		System.out.println("1\tKathir\t\t10\t20\t30\t40\t50\t150");
		System.out.println("2\tLakshmi\t\t90\t80\t70\t80\t100\t420");
		System.out.println("1\tAishwarya\t\t90\t85\t75\t65\t95\t410");
		System.out.println(line);
		
	}

}
