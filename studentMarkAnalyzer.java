// student mark analyzer

import java.util.Scanner;

class Main {
    public static void countPassAndFail(int myArr[]) {
        int passCount, failCount;
        passCount = 0;
        failCount = 0;
        for (int i=0; i<myArr.length; i++) {
            if (myArr[i] >= 50)
                passCount++;
            else
                failCount++;
        }
        System.out.println();
        System.out.println("Passed students: " + passCount);
        System.out.println("Failed students: " + failCount);
    }
    
    public static char markGradingSystem(int mark) {
        if (!(mark > 100 || mark < 0)) {
            if (mark >= 90) {
                return 'A';
            } else if (mark >= 80) {
                return 'B';
            } else if (mark >= 70) {
                return 'C';
            } else if (mark >= 50) {
                return 'D';
            } else if (mark >= 0) {
                return 'F';
            }
        }
        return 'X';
    }
    
    
    public static void studentMarkAnalyzer(int myArr[], int n) {
        int totalMark, minMark, maxMark;
        double avgMark;
        totalMark = 0;
        minMark = myArr[0];
        maxMark = myArr[0];
        System.out.println("\nMarks Entered: ");
        for (int i=0; i<n; i++) {
            System.out.print("\t" + myArr[i]);
            totalMark += myArr[i];
            if (minMark > myArr[i])
                minMark = myArr[i];
            if (maxMark < myArr[i])
                maxMark = myArr[i];
        }
        System.out.println();
        avgMark = (double) totalMark / myArr.length;
        for (int i=0; i<n; i++) {
            System.out.print("\t" + markGradingSystem(myArr[i]));
        }
        countPassAndFail(myArr);
        System.out.println("class total: " + totalMark);
        System.out.println("class average: " + avgMark);
        System.out.println("least scored mark: " + minMark);
        System.out.println("most scored mark: " + maxMark);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] myArr = new int[n];
        System.out.println("Enter the marks: ");
        for (int i=0; i<n; i++) {
            myArr[i] = sc.nextInt();
        }
        studentMarkAnalyzer(myArr, n);
    }
}
