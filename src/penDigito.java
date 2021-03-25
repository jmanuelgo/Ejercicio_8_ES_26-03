import java.util.Scanner;
public class penDigito {
    public static void main (String [] args){
        int num,i=0,pnum;
        Scanner read= new Scanner(System.in);
        do {
            System.out.print("Ingrese un numero mayor a 1000 ");
            num= read.nextInt(); }
        while (num<1000);
        /*while (i>=2){
            num/=10;
            i++;
        }
        System.out.println("el primer digito es: "+num);*/
        pnum=num%100;
        pnum/=10;
        System.out.println("el primer digito es: "+pnum);
    }
}
