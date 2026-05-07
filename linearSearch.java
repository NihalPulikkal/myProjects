// linear search

class Main {
    public static int linearSearch(int[] arr, int targetVal) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == targetVal){
                return i;
            }
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        int myarr[] = {3, 7, 2, 9, 5};
        int resultIndex = linearSearch(myarr, 9);
        System.out.println("\n Element found at index: " + resultIndex);
    }
}
