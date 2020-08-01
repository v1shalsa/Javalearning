package com.lambda;

public class MyMath {
	
	boolean checker(PerformOperation po,int num) {
		return po.check(num);		
	}

	PerformOperation isOdd() {
		PerformOperation op = (int i)->{
			return (i % 2==0)?false:true;
			};
		return op;
	}
	
	PerformOperation isPrime() {
		PerformOperation op = (int i)->{
			boolean flag = true;		
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag = false;
					break;
				}						
			}
			return flag;
		};
		return op;
	}
	
	PerformOperation isPalindrome() {
		PerformOperation op = (int i)-> {
			int rev = 0;
			int orig = i;
			while(i!=0) {
				int j = i % 10;
				rev = rev * 10 +j;
				i /= 10;
			}
			return orig==rev;
		};
		return op;
	}
}
	/*PerformOperation callPrint() {
		PerformOperation op = new PerformOperation() {
			
			@Override
			public int checkNumber(int i) {
				return i++;
			}
		};
		return op;
	}*/

