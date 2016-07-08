package practice02;

import java.util.Scanner;

class Add {
	int a;
	int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a + b;
	}
}

class Sub {
	int a;
	int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return a - b;
	}
}

class Mul {
	int a;
	int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return a * b;
	}
}

class Div {
	int a;
	int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	double calculate() {
		return a / b;
	}
}

public class CalcApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			Add add = new Add();
			Sub sub = new Sub();
			Mul mul = new Mul();
			Div div = new Div();

			System.out.print(">>");
			String input = scanner.nextLine();
			if (input.equals("quit") == true) {
				break;
			}
			String[] inputs = input.split(" ");

			for (int i = 0; i < inputs.length; i++) {
				if (inputs[i] == "quit") {
					System.out.println();
				}
			}

			int left = Integer.parseInt(inputs[0]);
			int right = Integer.parseInt(inputs[2]);


			switch (inputs[1]) {
			case "+":
				add.setValue(left, right);
				System.out.println(add.calculate());
				break;
			case "-":
				sub.setValue(left, right);
				System.out.println(sub.calculate());
				break;
			case "*":
				mul.setValue(left, right);
				System.out.println(mul.calculate());
				break;
			case "/":
				div.setValue(left, right);
				System.out.println(div.calculate());
				break;
			default:
				break;
			}

		}
	}
}
