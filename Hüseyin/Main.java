import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] sehirler = {
                "İstanbul",
                "Ankara",
                "İzmir",
                "Bursa",
                "Adana",
                "Antalya",
                "Konya",
                "Trabzon",
                "Samsun",
                "Eskişehir",
                "Gaziantep",
                "Erzurum",
                "Kayseri",
                "Mersin",
                "Muğla"
        };

        Arrays.sort(sehirler);

        System.out.println("Türkiye'deki Bazı Şehirler:");

        for (int i = 0; i < sehirler.length; i++) {
            System.out.println(sehirler[i]);
        }
    }
}