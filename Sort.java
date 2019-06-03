class Sort {
	public static void main(String[] args) {
		Number[] array = {0, 0.5, 23, -8, 1.76, 45, -200, -0.35};
		stupidSort(array);
		
		System.out.println();
		for (Number n : array) System.out.print(n + " ");
	}

	public static <T extends Number> void stupidSort(T[] arr) {
		while (!isSorted(arr)) {
			shuffleArray(arr);
			/*
			for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
			System.out.println(); 
			*/
		}
	}
	
	public static <T> void shuffleArray(T[] arr) {
		if ((arr == null) || (arr.length == 1)) return;
		T[] shuffledArr = (T[]) new Object[arr.length]; //compilation warning
		for (int i = 0; i < shuffledArr.length; i++) shuffledArr[i] = null;
		int position;
		
		for (int i = 0; i < arr.length; i++) {
			do {
				position = (int) (Math.random() * shuffledArr.length);
			} while (shuffledArr[position] != null);
				
			shuffledArr[position] = arr[i];	
		}
		
		for (int i = 0; i < arr.length; i++) arr[i] = (T) shuffledArr[i];
	}

	public static <T extends Number> boolean isSorted(T[] arr) {
		if ((arr == null) || (arr.length == 1)) return true;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].doubleValue() < arr[i - 1].doubleValue()) return false;
		}
		
		return true;
	}
}