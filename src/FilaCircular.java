
public class FilaCircular {
	public static int iTAM = 5;
	public static int iFila[] = new int[iTAM];
	public static int iSPos = 0;
	public static int iRPos = 0;
	public static boolean bQueueFull = false;

	public static void main(String[] args) {
		enQueueC(5);
		enQueueC(10);
		enQueueC(15);
		enQueueC(20);
		enQueueC(25);
		for (int i = 0; i < iFila.length; i++) {
			System.out.println("Posição[" + i + "]" + iFila[i]);
		}
	}

	public static boolean isOver() {
		if (iSPos == iRPos && bQueueFull)
			return true;
		return false;
	}

	public static void enQueueC(int iC) {
		iFila[iSPos++] = iC;
		if (iSPos >= iFila.length)
			iSPos = 0;
		if (iSPos == iRPos)
			bQueueFull = true;
	}

	public static int deQueueC() {
		int iIndice = iRPos++;
		if (iRPos >= iFila.length)
			iRPos = 0;
		bQueueFull = false;
		return iFila[iIndice];
	}
}
