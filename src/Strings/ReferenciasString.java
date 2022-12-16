package Strings;

public class ReferenciasString {

	public static void main(String[] args) {
		String s1 ="Hola";
		String s2 = "Hola";
		String s3 = "Hol";
		s3 += "a";
		
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s1));

	}

}
