class Leaders_in_an_array{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        int large = arr[n-1];
        ArrayList<Integer> a = new ArrayList<>();
        a.add(large);
        for(int i = n-2; i>=0;i--){
            if(arr[i]>=large){
                large = arr[i];
                a.add(large);
            }
        }
        Collections.reverse(a);
        return a;
    }
}