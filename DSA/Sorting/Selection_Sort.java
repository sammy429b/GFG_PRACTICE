class Selection_Sort

{
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	
	void selectionSort(int arr[], int n)
	{
	    for(int i =0; i < n; i++){
	        for(int j = 0; j < n-1; j++){
	            if(arr[j]> arr[j+1]) swap(arr, j, j+1);
	        }
	    }
	}
}