package com.sapient.week3;

public class FigToWords {
	
	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { 
			"", 		
			"",		
			"Twenty", 	
			"Thirty", 	
			"Forty", 	
			"Fifty", 	
			"Sixty", 	
			"Seventy",	
			"Eighty", 	
			"Ninety" 	
	};
	
	public static void fig_to_words(int n) {
		if (n < 20) {
			System.out.println(units[(int)n]);
		}

		else if (n < 100) {
			System.out.println(tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10]);
		}

		else if (n < 1000) {
			System.out.println(units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100));
		}

		else if (n < 100000) {
			System.out.println(convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000));
		}

		else if (n < 10000000) {
			System.out.println(convert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000));
		}

		else System.out.println(convert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000));
	}
	
	public static String convert(int n) {
		
		if (n < 20) {
			return units[n];
		}

		else if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		else if (n < 1000) {
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}

		else if (n < 100000) {
			return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
		}

		else if (n < 10000000) {
			return convert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
		}

		else return convert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000);
	}

}
