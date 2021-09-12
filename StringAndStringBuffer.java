/**
 * Question: 9. Write a program to use methods of String and StringBuffer
 * 		class such as charAt(), indexOf(), setCharAt(), setLength(),
 *		append(), insert, concat(), equals() etc.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

class StringAndStringBuffer {
    public static void main(String []args) {

	String s1 = "Nitish";
	String s2 = "Kumar";
	// Methods of String class
	System.out.println("String s1 = "+s1+" and String s2 = "+s2);
	System.out.println("Character at '4' in String s1 is : "+ s1.charAt(4));
	System.out.println("Position of 't' in String s1 is : "+ s1.indexOf('t'));
	System.out.println("String s1 and s2 are equal? : "+ s1.equals(s2));
	System.out.println("Modified String is : "+ s1.concat(s2));
	
	StringBuffer sb1 = new StringBuffer("Hello");
	StringBuffer sb2 = new StringBuffer("World");
	// Methods of StringBuffer class
	System.out.println("StringBuffer sb1 = "+sb1+" and StringBuffer sb2 = "+sb2);
	sb1.setCharAt(4, '0');
	System.out.println("String now : "+sb1);
	System.out.println(sb1.insert(4, "o_new_"));
	System.out.println("Appended string : "+ sb1.append(sb2));
	sb1.setLength(5);
	System.out.println("Modified string : "+sb1);
    }
}