package Innovators;

/*import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicate{

	public static void main(String[] args) {
		String str = "bharat";
        Map<Character,Integer > Dup = new HashMap<Character,Integer>();
        char[] char1 = str.toCharArray();
      // System.out.println(stringToCharArray);
       System.out.println(char1);
       // for(Character ch : stringToCharArray){
        for(Character ch : char1){
            if(Dup.containsKey(ch))
            {
            	System.out.println(Dup.put(ch,1));
            	System.out.println(Dup.get(ch)+1);
            	
            	 System.out.println(Dup.put(ch, Dup.get(ch)+1));
            }else
            {
            	Dup.put(ch, 1);
            }
        }
	
        //printing charcter and duplicate value
        
        Set<Character> keys = Dup.keySet();
        for(Character ch : keys){
            
        if(Dup.get(ch) > 1)
        {
            System.out.println(ch +" is "+ Dup.get(ch) +" Times in String");
        }

	}

	}
}*/






public class duplicate{

	public static void main(String[] args) {
String str = "fasoosaf";
  int cnt = 0;
  char[] inp = str.toCharArray();
  System.out.println("Duplicate Characters are:");
  for (int i = 0; i < str.length(); i++) {
   for (int j = i + 1; j < str.length(); j++) {
    if (inp[i] == inp[j]) {
     System.out.println(inp[j]);
     cnt++;
     break;
    }
    
   }
   
  }
  System.out.println(cnt);
	}
	}

















