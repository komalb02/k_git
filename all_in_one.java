import java.util.Scanner;
public class all_in_one {
    public static void main(String[] args) {
        int n;
        int j=0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the task no :-\n " +
                    "1.string palindrome \n " +
                    "2.check that given phone number is of 8 digit or not. \n " +
                    "3. light bulb on and off task  \n" +
                    "4.array size given by user \n");
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("enter your string:");
                String str = sc.next();
                String b = str;
                String rev = "";
                int len = str.length();
                for (int i = len - 1; i >= 0; i--) {
                    rev = rev + str.charAt(i);
                }
                if (b.equals(rev)) {
                    System.out.println(b + "is palindrome");
                } else {
                    System.out.println(b + "not a palindrome");
                }

            }

            else if (n == 2) {
                int count=0 ;
                System.out.println("phone no.");
                int  phone = sc.nextInt();
                while(phone >0)
                {
                    phone =phone/10;
                    count++;
                }
                if(count == 8)
                {
                    System.out.println("valid");
                }
                else {
                    System.out.println(" in valid");
                }

                    }
            else if (n == 3) {
                do {

                    if (j == 0) {
                        System.out.println("Default state bulb is off");
                    }
                    System.out.println("enter value n");
                    j= sc.nextInt();
                    boolean a1 = false;
                    if (j == 1) {
                        System.out.println(a1);//before
                        a1 = true;
                        System.out.println(a1);//after
                        if (a1 == true) {
                            System.out.println("bulb is on");
                        }
                    } else if (j == 0) {
                        System.out.println(a1);
                        a1 = false;
                        System.out.println(a1);
                        if (a1 == false) {
                            System.out.println("bulb is off");
                        }

                    } else {   break;}

                }
                while(j>0&&j<2);

                        }
            else if (n == 4) {

                        System.out.print("enter the no. of elements you want to store:-");
                        n = sc.nextInt();
                        int[] array = new int[n];
                        System.out.println("Enter the elements of array");
                        for (int i = 0; i < n; i++) {
                            array[i] = sc.nextInt();
                        }
                        System.out.println("Array elements are:-");
                        for (int i = 0; i <n; i++) {
                            System.out.println(array[i]);
                        }

                    }
            else {

                System.out.println("wrong value entered.");
            }
            }

                }
            }

