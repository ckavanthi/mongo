package datastructure;

 class q7
{
 public boolean searchArray(int[] arr,int toCheckValue)
	{
	 boolean searchArray=false;
	for(int a:arr)
	{
		if(a==toCheckValue)
		{
			searchArray=true;
			break;
		}
	}
	if(searchArray)
	{
		System.out.println(toCheckValue+" Is present");
	}
	else 
	{
		System.out.println("Given element is not present");
	}
	return searchArray;
	}

	public static void main(String[] args) 
	{
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int toCheckValue=19;
	    q7 obj=new q7();
	    obj.searchArray(arr,toCheckValue);
    }

}
