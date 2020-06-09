package com.evonsys.citi.util.String;

public class StringUtil {
	/**
	 * This function removes spaces from left side and right side of the given string
	 * @param s
	 * @return
	 */
	public String trim(String s){
		String s1 = s.trim();
		System.out.println("Removing spaces from both left side and right side by "+s1);
		return s1;
	}
	/**
	 * This function converts given string into Lower Case
	 * @param s
	 * @return
	 */
	public String toLowerCase(String s){
		System.out.println("Converting "+s+" to lower case");
		return s.toLowerCase();
		}
	
	/**
	 * This function converts given string in to upper case
	 * @param s
	 * @return
	 */
	public String toUpperCase(String s){
		System.out.println("Converting "+s+" to upper case");
		return s.toUpperCase();
	}
	
	/**
	 * This function return expected equals to actual or not without considering case
	 * @param expected
	 * @param actual
	 * @return
	 */
	public boolean equalsIgnoreCase(String expected, String actual){
		if(expected.equalsIgnoreCase(actual)){
			System.out.println(expected+" is equal to the "+actual);
			return true;
		}else{
			System.out.println(expected+" is not equal to the "+actual);
			return false;
		}
	}
	
	/**
	 * This function returns expected equals to actual or not by considering case
	 * @param expected
	 * @param actual
	 */
	public boolean equals(String expected, String actual){
		if(expected.contains(actual)){
			System.out.println(expected+" is equal to the "+actual);
			return true;
		}else{
			System.out.println(expected+" is not equal to the "+actual);
			return false;
		}
	}
	//returns character at the given index(starts from 0) in a String.
	//If index is not in range of String, we will get StringIndexOutOfBoundsException 
	public void charAt(String s, int index){
		s.charAt(index);
		System.out.println(s.charAt(index));
	}
	
	/**
	 * This function returns string[] with given delimeter of regex
	 * @param s
	 * @param regex
	 * @return
	 */
	public String[] split(String s, String regex){
		String[] s1 = s.split(regex);
		for(String s2:s1){
			System.out.println(s2);
		}
		return s1;
	}
	
	/**
	 * This function returns String[] with the limit
	 * @param s
	 * @param regex
	 * @param limit
	 * @return
	 */
	public String[] split(String s, String regex, int limit){
		String[] s1 = s.split(regex, limit);
		for(String s2:s1){
			System.out.println(s2);		
		}
		return s1;
	}
	/**
	 * This function returns true if substring contains in mainstring
	 * @param s
	 * @param subString
	 * @return
	 */
	public boolean contains(String s, String subString){
		if(s.contains(subString)){
			System.out.println(subString +" is present in "+s);
			return true;
		}else{
			System.out.println(subString+" is not present in "+s);
			return false;
		}
	}
	
	/**
	 * This function returns the substring from main string including beginIndex but excluding endIndex
	 * @param s
	 * @param beginIndex
	 * @param endIndex
	 * @return
	 */
	public String subString(String s, int beginIndex, int endIndex){
		String s1= s.substring(beginIndex, endIndex);
		System.out.println("Returns all the characters starting from index "+beginIndex+ " to "+(endIndex-1)+" in "+s+" is: "+s1);
		return s1;
	}
	
	/**
	 * This function returns substring from begin index in main string
	 * @param s
	 * @param beginIndex
	 * @return
	 */
	public String subString(String s, int beginIndex){
		if(beginIndex<s.length()){
			String s1 = s.substring(beginIndex);
			System.out.println("Returns all the characters starting from index "+beginIndex+" in "+s +" is : "+s1);
			return s1;
		}
		else if(beginIndex >= s.length()){
		System.out.println("Returns StringIndexOutOfBoundsException if start index is negative value or end index is lower than starting index.");
		
		}
		return s;
	}
	
	/**
	 * This function replace oldChar with newChar in String 
	 * @param s
	 * @param oldChar
	 * @param newChar
	 * @return
	 */
	public String replace(String s, char oldChar, char newChar){	
		String s1 = s.replace(oldChar, newChar);
		System.out.println("In "+s+" we are replacing  "+oldChar+" with "+newChar+". So the replaced String is: "+s1);
		return s1;
	}
	
	public String replace(String s, CharSequence target, CharSequence replacement){
		String s1 = s.replace(target, replacement);
		System.out.println("In "+s+" replacing "+ target+" with "+replacement+". So the final String is : "+s1);
		return s1;
	}
	/**
	 * This function tells format of object
	 * @param s
	 * @param format
	 * @param o
	 */
	
	public void format(String s, String format, Object o){
		System.out.println(s.format(format, o));
	}
	
	/**
	 * this function concat fromString to toString
	 * @param fromString
	 * @param toString
	 * @return
	 */
	public String concat(String fromString, String toString){
		String s1 = fromString.concat(toString);
		System.out.println("Concat "+fromString +" with "+toString+" and becomes "+s1);
		return s1;
	}
	//public void 
	public static void main(String[] args) {
		StringUtil s1 = new StringUtil();
		//new StringUtil().charAt("Varun", 1);//output: a
		//new StringUtil().charAt("Varun", "varun".length()-1);//n
	//==========format======
		new StringUtil().format("Varun", "He is %s", "varun"); //He is varun; here format with %s is mandatory for Strings
		new StringUtil().format("varun", "value is %f", 13.3);//value is 13.300000; here format with %f is for float
		new StringUtil().format("Varun", "value is %10.3f", 10.3);//value is     10.300
		new StringUtil().format("Varun", "floting point datatype returns Hex output of floating point number :%a", 10.3);//floting point datatype returns Hex output of floating point number :0x1.499999999999ap3
		new StringUtil().format("Varun", "any datatype returns true if object is not null else return false if object is null is: %b", "");//any datatype returns true if object is not null else return false if object is null is: true
		new StringUtil().format("Varun", "any datatype returns true if object is not null else return false if object is null is: %b",null);//any datatype returns true if object is not null else return false if object is null is: false
		new StringUtil().format("Varun", "character datatype return unicode character is: %c",'c');//character datatype of unicode character is: c
		new StringUtil().format("varun", "any Integer(Byte,short,int,long,bigint) return decimal integer is %d", 3);//any Integer(Byte,short,int,long,bigint) value is 3; here 3 is int datatype
		new StringUtil().format("varun", "floating point datatype return decimal number in scientific notation is: %e",3.3);//floating point decimal number in scientific notation is: 3.300000e+00
		new StringUtil().format("Varun", "floating point datatype return decimal number is : %f", 8.8);//floating point datatype with decimal number is : 8.800000
		new StringUtil().format("varun", "floating point detatype return decimal number, possibly in scientific notation depending on the precision and value: %g", 3.3);//floating point detatype with decimal number, possibly in scientific notation depending on the precision and value: 3.30000
		s1.format("v", "any datatype to return Hex String of value from hashCode() method is :%h", 33);//any datatype to return Hex String of value from hashCode() method is :21
		s1.format("varun", "integer(byte, short, int, long, bigint) datatype return Octal Number is: %o", 3);//integer(byte, short, int, long, bigint) datatype return Octal Number is: 3
		s1.format("v", "integer (byte, short, int, long, bigint) datatype returns Hex String is: %x", 2020);//integer (byte, short, int, long, bigint) datatype returns Hex String is: 7e4
//=============== substring==========
		s1.subString("varun", 2);//Returns all the characters starting at 2 position in varun is : run
		s1.subString("varun", 0, 3);
		s1.contains("varun", "s");
		s1.contains("varun", "a");
		s1.concat("varun", "kumar");
		s1.replace("varun kumar", 'a', 'r');
		s1.replace("varun kumar", "a", "u");
//================split============
		s1.split("varun", "a");
		s1.split("Varun Kumar", " ");
		System.out.println("----");
		s1.split("The limit of split is upto 6 only as per the limit of delimeter space in last argument index", "\\s", 6);
	//==========equals============
		s1.equals("varun", "varun");
		s1.equalsIgnoreCase("Varun", "VARUN");
		
	}

}
