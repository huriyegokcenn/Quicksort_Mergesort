package SiralamaAlgoritmalari;

public class QuickSort {

	 // dizideki iki elemanýn yerini deðiþtiren fonksiyon
    static void swap(int[] dizi, int i, int j)
    {
        int temp = dizi[i];
        dizi[i] = dizi[j];
        dizi[j] = temp;
    }
 
    // Bu fonksiyon son elemaný pivot olarak alýr, pivot elemanýný sýralanmýþ dizide doðru konuma yerleþtirir 
    //ve tüm küçük elemanlarý pivotun soluna ve tüm büyük elemanlarý pivotun saðýna yerleþtirir.
    
    static int partition(int[] dizi, int ilkIndeks, int sonIndeks)
    {
        // pivotu seçme
        int pivot = dizi[sonIndeks];
 
        // Daha küçük öðenin dizini ve þu ana kadar bulunan pivotun doðru konumunu gösterir
        int i = (ilkIndeks - 1);
 
        for (int j = ilkIndeks; j <= sonIndeks - 1; j++) {
 
            // mevcut eleman pivottan küçükse yer deðiþme yap
            if (dizi[j] < pivot) {
 
                // küçük elemanýn indeksini bir arttýr ve yer deðiþ
                i++;
                swap(dizi, i, j);
            }
        }
        swap(dizi, i + 1, sonIndeks);
        return (i + 1);
    }
 
    // Quick Sort'un ana fonksiyonu
    // dizi[] --> sýralanacak dizi,
    // ilkIndeks --> baþlama indeksi,
    // sonIndeks --> bitiþ indeksi
    static void quickSort(int[] dizi, int ilkIndeks, int sonIndeks)
    {
        if (ilkIndeks < sonIndeks) {
 
            // pi dizi[p] nin bölümleme (potrition) indeksidir.
        	
            int pi = partition(dizi, ilkIndeks, sonIndeks);
 
            // Öðeleri bölümden (pi) önce ve bölümden sonra ayrý ayrý sýralayýn
            
            quickSort(dizi, ilkIndeks, pi - 1);
            quickSort(dizi, pi + 1, sonIndeks);
        }
    }
    // dizi yazdýrma
    public static void printdizi(int[] dizi)
    {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
 
    public static void main(String[] args)
    {
        int[] dizi = { 10, 7, 8, 9, 1, 5 };
        int N = dizi.length;
 
        // fonksiyon çaðýrma
        quickSort(dizi, 0, N - 1);
        System.out.println("Sorted diziay:");
        printdizi(dizi);
    }

}
