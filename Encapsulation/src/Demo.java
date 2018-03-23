import java.util.*;
import java.io.*;

class Demo{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int count = 0;
            int constant = 0;
            int sum = 0;

            while(count < n){
                if(count == 0){
                    constant = 1;
                    sum = a + (constant*b) + sum;
                    System.out.println("if constant: " + constant);
                }else{
                    System.out.println("else constant: " + constant);
                    constant = constant * 2;
                    sum = (constant * b) + sum;
                }
                System.out.println(sum);
                count += 1;
            }//end while
            System.out.println();




        }
        in.close();
    }
}