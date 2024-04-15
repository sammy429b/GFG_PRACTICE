public class Count_the_elements {
    class Solution
{
    public static int countK(int[] a, int k){
        int count = 0;
        int size = a.length;
        for(int i = 0; i < size; i++){
            if(a[i] <= k){
                count++;
            }
        }
        return count;
    }
    
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int[] result = new int[q];
        for(int i = 0; i < query.length; i++){
            int num = query[i];
            int s = a[num];
            int res = countK(b,s);
            result[i] = res;
        }
        
        return result;
    }
}
}
