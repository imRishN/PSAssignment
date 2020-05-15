package com.sapient.week3;

public class ObjectsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Command_Line1 obj = new Command_Line1();
		obj.setData();
		obj.calData();
		obj.displayData();
		
		KeyRead_Line2 obj2 = new KeyRead_Line2();
		obj2.read();
		obj2.sort();
		obj2.display();
		obj2.find(6);
		
		FigToWords.fig_to_words(32126);

	}
}
