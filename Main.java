package ArrayContainingElement;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {78,58,45,65,78,25,1,4,12,36,25,14,15,89,32,15};
        System.out.println("Enter the number you wish to find: ");
        int item = sc.nextInt();

        boolean found = false;
        int times =0;
        for (int i: num) {
            if (item==i){
                found = true;
                times++;
            }
        }

        if (found) {
            System.out.println("We found it "+times+" times");
        }else {
            System.out.println("We found NOTHING!!!");
        }
    }
}
