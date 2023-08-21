class Merge_Sort
{
    void merge(int arr[], int s, int m, int e) {
        int sizeOfArr1 = m - s + 1;
        int sizeOfArr2 = e - m;
        int[] arr1 = new int[sizeOfArr1];
        int[] arr2 = new int[sizeOfArr2];
        int mainIndex = s;

        for (int i = 0; i < sizeOfArr1; i++) {
            arr1[i] = arr[mainIndex++];
        }

        mainIndex = m + 1;

        for (int i = 0; i < sizeOfArr2; i++) {
            arr2[i] = arr[mainIndex++];
        }

        mainIndex = s;
        int index1 = 0;
        int index2 = 0;

        while (index1 < sizeOfArr1 && index2 < sizeOfArr2) {
            if (arr1[index1] < arr2[index2]) {
                arr[mainIndex++] = arr1[index1++];
            } else {
                arr[mainIndex++] = arr2[index2++];
            }
        }

        while (index1 < sizeOfArr1) {
            arr[mainIndex++] = arr1[index1++];
        }

        while (index2 < sizeOfArr2) {
            arr[mainIndex++] = arr2[index2++];
        }
    }

    void mergeSort(int arr[], int s, int e) {
        if (s >= e) return;
        int m = s + (e - s) / 2;
        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);
        merge(arr, s, m, e);
    }
}
