import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		
		Random r1 = new Random();
		System.out.println("Cloud QA Team " + r1.nextInt(100));
		
		char c  = (char) (65+r1.nextInt(26));
		System.out.println("Cloud QA Team "+c+ r1.nextInt(100));
		
		c =  (char) (97+r1.nextInt(26));
		System.out.println(c+ "Cloud QA Team "+c+ r1.nextInt(100));
		
		
		c =  (char) (33+r1.nextInt(14));
		System.out.println(c+ "Cloud QA Team "+c+ r1.nextInt(100));
	}
}
