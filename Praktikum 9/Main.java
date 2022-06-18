/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo8;
import java.util.ArrayList;

/**
 *
 * @author pasha
 */

  public class Main {
    public static void main(String[] args) {
        PegawaiTetap pt1 = new PegawaiTetap("Athalla", "3174082510031002", 8500000);
        PegawaiTetap pt2 = new PegawaiTetap("rifky", "3174082510031003", 6500000);
        PegawaiTetap pt3 = new PegawaiTetap("Pasha", "3174082510031004", 8700000);
        System.out.println("======== Daftar Pegawai Tetap ========");
        System.out.println(pt1.toString());
        System.out.println(pt2.toString());
        System.out.println(pt3.toString());
        System.out.println("======================================\n");

        PegawaiHarian ph1 = new PegawaiHarian("Yanuar", "3174082510031009", 40000, 40);
        PegawaiHarian ph2 = new PegawaiHarian("Jihan", "3174082510031034", 15000, 25);
        PegawaiHarian ph3 = new PegawaiHarian("Shifa", "3174082510031045", 12000, 20);
        System.out.println("========== Daftar Pegawai Harian =========");
        System.out.println(ph1.toString());
        System.out.println(ph2.toString());
        System.out.println(ph3.toString());
        System.out.println("=====================================\n");

        Sales sales1 = new Sales("Faudzia", "1371040208100004", 75, 980000);
        Sales sales2 = new Sales("Lebron", "1371041905120002", 40, 85000);
        Sales sales3 = new Sales("Michael", "1371041708920003", 100, 20000);
        System.out.println("=========== Daftar Sales ============");
        System.out.println(sales1.toString());
        System.out.println(sales2.toString());
        System.out.println(sales3.toString());
        System.out.println("=====================================\n");
    }
}
