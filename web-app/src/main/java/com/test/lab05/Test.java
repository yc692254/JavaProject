package com.test.lab05;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mystery(1234);
		int resu=mystery2(5);
		System.out.println();
		System.out.println(resu);
		
		boolean flag=isPalindromeRecursive("43211234");
		System.out.println(flag);
		System.out.println(isPalindrome("43211234"));
		System.out.println(isPalindrome2("43211234"));
		System.out.println(isPalindrome3("ASa"));
		//System.out.println(recursivePalindrome(text, forward, backward));
		//System.out.println(squareRoot(33));
		System.out.println(Math.sqrt(33));
		
	}
	
	public static double squareRootGuess(double x, double g)
	{
		return 0;
		
	}

	
	public static void mystery(int x) {
		System.out.print(x % 10);
		if ((x / 10) != 0)
			mystery(x / 10);
		System.out.print(x % 10);
	}
	
	public static int mystery2(int n) {
		if (n == 0)
			return 1;
		else
			return 3 * mystery2(n - 1);
	}
	
	private static boolean isPalindrome2(String s) {
		System.out.println("****************"+s);
	    int length = s.length();

	    if (length < 2) // If the string only has 1 char or is empty
	        return true;
	    else {
	        // Check opposite ends of the string for equality
	        if (s.charAt(0) != s.charAt(length - 1))
	            return false;
	        // Function call for string with the two ends snipped off
	        else {
	        	
	        	String s2 =s.substring(1, length - 1);
	        	System.out.println(s2+"-------------"+(length-1));
	        	return isPalindrome2(s2);
	        }
	            
	    }
	}
	
	public static boolean isPalindromeRecursive(String text){
	    String clean = text.replaceAll("\\s+", "").toLowerCase();
	    return recursivePalindrome(clean,0,clean.length()-1);
	}

	private static boolean recursivePalindrome(String text, int forward, int backward) {
	    if (forward == backward) {
	        return true;
	    }
	    if ((text.charAt(forward)) != (text.charAt(backward))) {
	        return false;
	    }
	    if (forward < backward + 1) {
	        return recursivePalindrome(text, forward + 1, backward - 1);
	    }

	    return true;
	}
	
	public static boolean isPal(String s) 
	{
        if(s.length() < 2)
            return true; 
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
        	 return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
	
	public static boolean isPalindrome(String str) {
		String clean = str.replaceAll("\\s+", "").toLowerCase();
		int len = clean.length();
		if (len < 2)
			return true;
		if (clean.charAt(0) != clean.charAt(len - 1))
			return false;
		return isPalindrome(clean.substring(1, len - 1));
	}
	
	public static boolean isPalindrome3(String s) {
		return (s.length() <= 1)
				|| (s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome3(s.substring(1, s.length() - 1)));
	}

}
