import java.util.Scanner;

public class Main {

        public static void main(String[] args){
            System.out.println(sum(1,2));
            System.out.println(sumString(2,3));
            System.out.println(fak());
            System.out.println(fak2());
            showSum();
        }


        public static int sum(int a, int b){
            return a+b;
        }

        public static String sumString(int a, int b){
            return "Summe:" + (a+b);
        }

        public static int fak(){
            int erg = 1;
            for(int i = 1; i < 5; i++){
                erg *= i;
            }
            return erg;
        }

    public static int fak2(){
        int erg = 1;
        int i = 1;
        while(i < 5){
            erg *= i;
            i++;
        }
        return erg;
    }

    public static void showSum(){
            Scanner sc = new Scanner(System.in);
        System.out.println("Eingabe erster Summand: ");
        int a = sc.nextInt();
        System.out.println("Eingabe zweiter Summand: ");
        int b = sc.nextInt();
        System.out.println("Summe: " + (a + b));
    }


}
