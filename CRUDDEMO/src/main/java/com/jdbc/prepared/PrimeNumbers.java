package com.jdbc.prepared;

public class PrimeNumbers {

	
	public static void main(String[] args) {
		for(int i = 2;i<51;i++) {
				
			int n = i;
			boolean  x = PrimeNumbers.isPrime(n);
			if(x == true) 
				System.out.println(n);
			
		}
	

	}
	private static boolean isPrime(int n) {
		int flag = 0;
				for(int i=2;i<n;i++) {
					if(n%i == 0) {
						flag = 1 ;
						return false ;
					}
					
				}
				if(flag==0)
				return true;
			return false;
	}

}
