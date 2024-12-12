import java.util.Scanner;

public class Nomor1 {
    static int FizzBuzz(N){
        for (int i = 0; i < FizzBuzz(N); i++) {
        if(i % 3 == 0){
        System.out.print("Fizz");
        } else if(i % 5 == 0){
            System.out.println("Buzz");
        } else if (i % 3 ==0 && i % 5 == 0){
            System.out.println("FizzBuzz");
        } else 
        System.out.println("i");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
            System.out.print("Masukkan Bilangan N");
         int FizzBuzz = input.nextInt();
        

        /* Pekerjaan anda mulai dari sini */

        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
}

