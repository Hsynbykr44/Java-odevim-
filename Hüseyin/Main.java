import java.util.Scanner;

void main() {
     Scanner input = new
 Scanner(System.in);


System.out.print("Vize 1 notunu giriniz:") ;
double vize1 = input.nextDouble();

System.out.print("Vize 2 notunu giriniz:") ;
double vize2 = input.nextDouble();

System.out.print("Final notunu giriniz:") ;
double finalNotu = input.nextDouble() ;

double ortalama = (vize1/4)+(vize2/4)+(finalNotu/2);

   System.out.println("Universite ortalamaniz:"+ ortalama);
    }