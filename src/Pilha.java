
public class Pilha {
	public static int iTAM = 5;
	public static int iPilha[] = new int[iTAM];
	public static int iPos = 0;

	public static void main(String[] args) {
		push(5);
		push(10);
		push(15);
		push(20);
		push(25);
		for (int i = 0; i < iPilha.length; i++) {
			System.out.println("Posição[" + i + "]" + iPilha[i]);
		}
		
	}

	public static int size() {
		return iPos;
	}

	public static int top() {
		return iPilha[iPos - 1];
	}

	public static int push(int iC) {
		if (iPos >= iTAM)
			return 0;
		return iPilha[iPos++] = iC;
	}

	public static int pop() {
		if (iPos == 0)
			return 0;
		return iPilha[--iPos];
	}
}
