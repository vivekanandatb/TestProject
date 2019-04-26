
public class Test {
	
	public static void main(String[] args) {
		try {
	int[][] mynumber = {{1, 3, 5}};
		System.out.println(mynumber[10]);
		}catch(Exception e){
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("Should display");
		}
	}
		  
}

