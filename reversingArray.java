// reverse an array 

class Main {
    public static void main(String[] args) {
        int myArr[] = {1, 2, 3, 4};
        int len = myArr.length;
        int myArrRev[] = new int[len];
        for (int i=0; i<myArr.length; i++) {
            myArrRev[i] = myArr[myArr.length-1-i];
        }
        for (int i=0; i<myArr.length; i++) {
            System.out.println("\t" + myArr[i] + "\t" + myArrRev[i]);
        }
    }
}
