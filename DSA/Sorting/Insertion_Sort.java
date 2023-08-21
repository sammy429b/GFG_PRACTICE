class Insertion_Sort
{
  public void insertionSort(int arr[], int n)
  {
      for(int i = 1; i < n; i++){
          int temp = arr[i];
          int j = i-1;
          while(j>=0){
              if(arr[j]>temp) arr[j+1] = arr[j];
              else break;
              j--;
          }
          arr[j+1] = temp;
      }
  }
}