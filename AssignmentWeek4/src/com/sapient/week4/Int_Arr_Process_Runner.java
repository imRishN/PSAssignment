package com.sapient.week4;

public class Int_Arr_Process_Runner {

	public static void main(String[] args) {
		Int_Arr_Process int_Arr_Process = new Int_Arr_Process(3);
		int_Arr_Process.read_array();
		int_Arr_Process.displayArrayHorizontally();
		int_Arr_Process.displayArrayVertically();
		int_Arr_Process.sortArray();
		int_Arr_Process.max();
		int_Arr_Process.min();
		int_Arr_Process.sum();
		int_Arr_Process.second_biggest();
	}

}
