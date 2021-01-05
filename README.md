# soal_debug
Pemecahan Problem di Algoritma menggunakan Java

## Soal : 

Seorang dosen membuat 5 soal dan diberikan kepada N mahasiswa. Untuk setiap nomor, maksimum nilai yang dapat dicapai oleh masing-masing mahasiswa adalah 100, dan minimum nilai adalah 0. Buatlah sebuah program dengan spesifikasi input dan output sebagai berikut:Input: Baris pertama input adalah sebuah bilangan bulat N yang menyatakan jumlah mahasiswa.N baris berikutnya masing-masing berisi 5 bilangan bulat yang merupakan nilai untuk setiap nomor (setiap baris berisi input nilai nomor 1 – 5 dari mahasiswa ke 1)Output:Nomor soal dimana paling banyak mahasiswa yang mendapat nilai 100. Jika tidak ada yang mendapat nilai 100, keluarkan hasil 0, dan jika ada lebih dari satu soal dengan jumlah nilai 100 yang sama, keluarkan nomor soal yang lebih kecil.

Contoh (bagian atas sebelum garis: input, bagian bawah setelah garis: output)

 siswanya 5 orang, 
 100 100 80 20 100
 100 80 80 80 80
 100 100 100 100 100
 60 50 40 80 100
 60 80 100 50 100
 _________________________________
 Outputnya harus 5

Source code nya :
package ayoboga.com;

                import java.util.Scanner;

                public class Main {
                    public static void main(String[] args){
                        Scanner sc = new Scanner(System.in);
                        int[] counter = new int[5];
                        System.out.print("Masukan jumlah siswa : ");
                        int nilai, n = sc.nextInt();
                        for(int i = 0; i < 5; i++){
                            for(int j = 0; j < n; j++) {
                                System.out.print("Masukan nilai siswa ke-" + (j + 1) + " : ");
                                nilai = sc.nextInt();
                                if(nilai == 100) {
                                    counter[j]++;
                                }
                            }
                        }

                        System.out.println(max(counter));
                    }


                    public static int max(int[] counter){
                        int max = 0;
                        for(int i = 0; i < 5; i++){
                            if(counter[i] < counter[max]) {
                                max = i;
                            }
                        }
                        return max;
                    }

                }
                
                
## Penyelesaian

1. Array tempat menginput, harus dibuat 2D. 
2. Array 1D di function max,  counter untuk mengingat soal ke-n ada berapa yang dapat nilai 100.
3. Lalu dari array inilah kita cari mana yg tertinggi counternya, namun yang counternya > 0, dan jika ada, catat nomor indexnya. 
4. Pencatat nomor index, awalnya di set -1, utk berjaga-jaga sekiranya hasil perolehan dosen ternyata tidak ada satu siswa pun yg bernilai 100.  

