import java.util.Scanner;
public class Numberinword {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number");
            int n=sc.nextInt();
            int n1=n,n2=n;
            int b=n1%10,a=n2/10; //  n1/10 means last digit is removed and n2%10 means last digit by modulus

            String[] single_digits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
            if(a==1)
            {
                System.out.println(single_digits[b]);
            }
        }
    }


