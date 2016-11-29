package sorting;

public class TestSorter {

	public static void main(String args[]) {
		String[] array = {"sam","deepa","joe","anny","ted","darry","aitha","zyan"};
		String[] expected = {"aitha", "anny","darry", "deepa", "joe","sam","ted","zyan"};
		
		ArraySorter sorter = new ArraySorter();
		String[] sortedValue = sorter.sortStringArray(array, array.length - 1);
		
		//if(sortedValue.equals(expected)) System.out.println("pass"); else System.out.println("fail");
		
		boolean result = true;
		for(int i = 0; i < array.length; i++) {
			if(expected[i] != sortedValue[i]) result = false;
		}
		
		System.out.println(result);
	}
}
