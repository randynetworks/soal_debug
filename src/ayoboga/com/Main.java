package ayoboga.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah siswa : ");
        int siswa = sc.nextInt();
        System.out.print("Masukan jumlah Soal : ");
        int  soal = sc.nextInt();


        int[][] counter = new int[siswa][soal];

        for(int i=0; i<siswa;i++)
        {
            for(int j=0; j<soal;j++)
            {
                System.out.print("Masukan nilai siswa ke-" + (j + 1) + " : ");
                counter[i][j]=sc.nextInt();
            }
        }


        System.out.println(max(counter));
    }

    static int max(int[][] counter) {
        // siswa_id_nilai = tidak boleh array kosong!
        int soal = counter[0].length;

        int[] counter100 = new int[soal];
        int max = 0;
        int id_nilai_100 = -1;

        for (int[] siswaId_nilai : counter) {
            for (int i = 0; i < soal; i++) {
                if (siswaId_nilai[i] == 100) {
                    counter100[i]++;
                    if (counter100[i] > max) {
                        max = counter100[i];
                        id_nilai_100 = i;
                    }
                }
            }
        }

        return ++id_nilai_100;
    }

}

