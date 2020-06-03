package Innovators;

public class substring {

	public static void main(String[] args) {
		String str = "Is the a doing a bad";		
				String Rep = "a";
				String RepWith = "b";
				String[] astr = str.split(Rep);
				//System.out.println(astr);
				StringBuffer strb = new StringBuffer();
				for ( int i = 0; i <= astr.length-1; i++ ) {
					System.out.println(astr[i]);
				strb = strb.append( astr[i] );
				System.out.println(strb);
				
				if (i != astr.length-1) {
				strb = strb.append(RepWith);
				System.out.println(strb);
				}
				}
				System.out.println(strb);

	}

}
