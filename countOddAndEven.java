// count odd & even Number

class Main {
    public static void main(String[] args) {
        int myArr[] = {1, 2, 3, 4, 5};
        int oddCount=0, evenCount=0;
        for (int i=0; i<myArr.length; i++) {
            if (myArr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println();
        System.out.println("Odd Count: "+ oddCount + "\nEven Count: " + evenCount);
    }
}
