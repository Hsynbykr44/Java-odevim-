void main() {
 int ortalama = 86;
 String sonuc;
 if (ortalama>=85) {
    sonuc= "Takdir Belgesi aldın.";
 }else if  (ortalama>=75) {
    sonuc= "Teşekkür Belgesi aldın.";
 } else if (ortalama >= 50) {
    sonuc= "Sınıfı geçtin.";
 } else {
    sonuc= "Sınıfta kaldın.";
 }
 System.out.println(sonuc);
}