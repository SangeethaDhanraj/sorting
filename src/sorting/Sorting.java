package sorting;

public class Sorting {
		
		
	public static void main(String[] args) {
		Sorting s=new Sorting();
		String[] array={"sam","deepa","joe","anny","ted","darry","aitha","zyan"};
		int len = array.length-1;
	    String[] ss=s.sort(array, 0, len);
		for(String a:ss)
		{
		  System.out.println(a);
		}
		
		}
	public static String[] sort(String[] array, int start, int end)
	{
	if (start < end)
	{
	  sort(array, start+1, end);
	  if((array[start].compareTo(array[end]))<0)
	  {
	    sort(array, start, end-1);
	  }
	  else if((array[start].compareTo(array[end]))>0)
	  {
	    String temp = array[start];
	    array[start] = array[end];
	    array[end] = temp;
	    sort(array, start, end-1);
	  }
	}
	
	
	else if(start == end){
	  return array;
	}
  return array;
	}
	
	
}
	
	


