package gugudan.edu;

public class GugudanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dan = 2;
		int gugudanResult = 0;
		
		System.out.println("[ " + dan + "단 ]");
		
		for (int i = 1; i <= 9; i++) {
			gugudanResult = dan * i;
			System.out.println(dan + " * " + i + " = " + gugudanResult);
		}
		System.out.println();
	}

}
