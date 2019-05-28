class Sort {
	public static void main(String[] args) {
		double[] array = {0, 0.5, 23, -8, 1.76, 45, -200, -0.35};
		stupidSort(array);
		
		for (double d : array) System.out.print(d + " ");
	}

	public static void stupidSort(double[] arr) {
		while (!isSorted(arr)) {
			shuffleArray(arr);
			for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
			System.out.println();
		}
	}
	
	public static void shuffleArray(double[] arr) {
		if ((arr == null) || (arr.length == 1)) return;
		double[] shuffledArr = new double[arr.length];
		for (int i = 0; i < shuffledArr.length; i++) shuffledArr[i] = Double.POSITIVE_INFINITY;
		int position;
		
		for (int i = 0; i < arr.length; i++) {
			do {
				position = (int) (Math.random() * shuffledArr.length);
			} while (shuffledArr[position] != Double.POSITIVE_INFINITY);
				
			shuffledArr[position] = arr[i];	
		}
		
		for (int i = 0; i < arr.length; i++) arr[i] = shuffledArr[i];
	}

	public static boolean isSorted(double[] arr) {
		if ((arr == null) || (arr.length == 1)) return true;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) return false;
		}
		
		return true;
	}
}