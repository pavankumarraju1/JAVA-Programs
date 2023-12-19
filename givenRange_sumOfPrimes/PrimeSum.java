import java.util.Scanner;
class PrimeSum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the range second number: ");
        int num2 = in.nextInt();
        System.out.println("Result: "+primeRange(num1,num2));
        in.close();
    }

    static int primeRange(int x,int y){
        int sum = 0;
        for(int i=x;i<=y;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }

    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        if(num==2 || num==3){
            return true;
        }
        if(num%2==0 || num%3==0){
            return false;
        }
        for(int i=5;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        
        return true;
    }
    
}