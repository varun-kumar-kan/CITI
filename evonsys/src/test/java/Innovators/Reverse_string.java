package Innovators;

public class Reverse_string {

	public void Method1() {
		 
        String stringToReverse = "This i"
        		+ "s Valuemomentum";
        String[] brokenStringOnSpace = stringToReverse.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        int leng = brokenStringOnSpace.length;
 
        for (int i = leng - 1; i >= 0; i--) {
            sb.append(brokenStringOnSpace[i]);
            sb.append(" ");
        }
        System.out.println("Reversed String " + sb.toString());
    }
	
	
public static void main(String[] args) {
	
	Reverse_string p = new Reverse_string();
	
	 p.Method1(); 
}

	}

