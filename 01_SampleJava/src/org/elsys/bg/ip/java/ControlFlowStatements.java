package org.elsys.bg.ip.java;

public class ControlFlowStatements {

	public static void main(String[] args) {
		// Select statements that should be extracted 
		// to method and press Ctrl+1
		IfExample();
		forExampe();

	}

	private static void forExampe() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
	}

	private static void IfExample() {
		if (true) {
			System.out.println("Primetime");
		}
	}

}
