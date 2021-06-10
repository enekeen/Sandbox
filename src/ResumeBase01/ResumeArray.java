package ResumeBase01;

import java.util.Arrays;
import java.util.Scanner;

/*
    Create methods:
        save - OK
        get - OK
        delete - OK
        clear,
        getAll OK
        size - OK
 */

public class ResumeArray {
    private int arrayLength = 3;
    private String[] arrayOfStrings = new String[arrayLength];
    //private String resume;

    // save (add)
    public void save() {
        System.out.println("Enter your resume: ");

        do {
            Scanner scan = new Scanner(System.in);
            String resume = scan.nextLine();

            for (int i = 0; i < arrayLength; i++) {
                if (arrayOfStrings[i] == null) {
                    arrayOfStrings[i] = resume;
                    break;
                }
            }
        } while (size() < arrayLength);
    }

    // get resume array size
    public int size() {
        int count = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (arrayOfStrings[i] != null) {
                count++;
            }
        }
        return count;
    }

    // get (print)
    public void get(int resumeId) {
        System.out.println("\nAmount of resumes is: " + size() + "\n");
        System.out.println("You choose #" + (resumeId + 1) + ": " + arrayOfStrings[resumeId]);
    }

    public void getAll() {
        System.out.println("\nPrint whole Array without nulls: " + Arrays.toString(arrayOfStrings));
    }

    public void delete() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter index of array element to delete: ");
        int index = scan.nextInt();
        System.out.println("Delete array element with index: " + index);
        scan.close();

        // check if you can delete element
        if (arrayOfStrings == null || index < 0 || index == arrayLength || index > arrayLength) {
            System.out.println("You cannot delete element with index = " + index + ".");
        } else {
            String[] shortArray = new String[arrayLength - 1];

            for (int i = 0, j = 0; i < arrayLength; i++) {
                if (i == index) {
                    continue;
                }
                shortArray[j++] = arrayOfStrings[i];
            }
            System.out.println("\nNew short array is: " + Arrays.toString(shortArray));
        }
    }
}