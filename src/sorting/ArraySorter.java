package sorting;

public class ArraySorter {
	int i = 0, j = i+1;
	String temp;

	public String[] sortStringArray(String[] array, int length) {
		if (length != 0) {
			if (i <= length) {
				if (j <= length) {
					if (array[i].compareTo(array[j]) < 0) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
						j++;
						sortStringArray(array, length);
					} else if (array[i].compareTo(array[j]) > 0||j==i) {
						j++;
						sortStringArray(array, length);
					}
				} else {
					i++;
					j=0;
					sortStringArray(array, length);
				}
			}

		}
		return array;
	}

	public static void main(String[] args) {
		String[] array = {"sam","deepa","joe","anny","ted","darry","aitha","zyan"};
		ArraySorter sorter = new ArraySorter();
		String[] sortedValue = sorter.sortStringArray(array, array.length - 1);
		for (String s : sortedValue) {
			System.out.println(s);
		}

	}
}
