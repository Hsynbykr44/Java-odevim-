public class Main {
 public static void main(String[]
                                 args) {
  double vize1 = 60.0;
  double vize2 = 70.0;
  double final1 = 75.0;
  double ort = vize1 / 4 + vize2 / 4 + final1 / 2;
  if (ort < 50 || ort >= 50 && ort < 75) {
  System.out.println(ort < 50 ? "Kaldın" : "Geçtin");
 } else {
   System.out.println(ort < 85 ? "Teşekkür Belgesi aldın" : "Takdir Belgesi aldın");
  }
 }
 }