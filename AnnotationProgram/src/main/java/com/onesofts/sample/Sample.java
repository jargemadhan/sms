package com.onesofts.sample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	@GetMapping(value = "/Hi")
	public String getHi() {
		return "Hello World";
	}

	@GetMapping(value = "/sum/{a}/{b}")
	public int addval(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	@GetMapping(value = "/OddOrEven/{a}")
	public String oddOrEven(@PathVariable int a) {
		if (a % 2 == 0) {
			return a + "It is a Even Number";
		} else {
			return a + "It is a Odd Number";
		}
	}

	@GetMapping(value = "/Voter/{age}")
	public String findVoteAge(@PathVariable int age) {
		if (age > 18) {
			return age + "Eligible For Vote";
		} else {
			return age + "Note Eligible For Vote";
		}
	}

	@GetMapping(value = "/Even/{val}")
	public List<Integer> findEven(@PathVariable int val) {
		List<Integer> n = new ArrayList<>();
		for (int i = 0; i < val; i++) {
			if (i % 2 == 0) {
				n.add(i);
			}

		}

		return n;
	}

	@GetMapping(value = "/palindrom/{word}")
	public String findPalindrom(@PathVariable String word) {
		String temp = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			temp = temp + word.charAt(i);
		}
		if (word.equalsIgnoreCase(temp)) {
			return "It is a Palindrome";
		} else {
			return "It is Not a Palindrome";
		}
	}

	@GetMapping(value = "/PrimeOrNot/{num}")
	public String findPrimeOrNot(@PathVariable int num) {
		boolean a = true;
		for (int i = 2; i < num; i++) {
			if (i % num == 0) {
				a = false;
			}
		}
		if (a == true) {
			return "Is Prime Number";

		} else {
			return "Is Not Prime Number";
		}
	}

	@GetMapping(value = "/Square/{val}")
	public String findSquare(@PathVariable int val) {
		boolean a = false;
		for (int i = 1; i <= val; i++) {
			if (i * i == val) {
				a = true;
			}
		}
		if (a == true) {
			return val + " Is a Square Value";
		} else {
			return val + " Is Not Square Value";
		}
	}

	@GetMapping(value = "/Prime/{num}")
	public List<Integer> findPrime(@PathVariable int num) {
		List<Integer> n = new ArrayList<>();
		int count = 0;
		for (int j = 2; j <= num; j++) {
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				n.add(j);
			}
		}
		return n;
	}

	@GetMapping(value = "/Fibnacci/{val}")
	public List<Integer> findFibno(@PathVariable int val ) {
		List<Integer> l=new ArrayList<>();
		int a=0,b=1,c;
		l.add(a);
		l.add(b);
		for(int i=2;i<val;i++) {
			c=a+b;
			a=b;
			b=c;
			l.add(c);
		
		}
	
	return l;
	}
}
