// finding largest number in an array

class Main {
    public static void main(String[] args) {
        int[] myArr = {3, 7, 2, 9, 1};
        for (int i=0; i<myArr.length; i++) {
            System.out.print("\t" + myArr[i]);
        }
        int largestNum = myArr[0];
        for (int i=0; i<myArr.length; i++) {
            if (largestNum < myArr[i]) {
                largestNum = myArr[i];
            }
        }
        System.out.print("\n\n\t");
        System.out.println("largest number: " + largestNum);
    }
}
