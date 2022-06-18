/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPBO;
import java.util.ArrayList;


/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
	Manusia mns1 = new Manusia("Athallarifky", "215150607111013", false, true);
    Manusia mns2 = new Manusia("Pasha", "215150607111013", true, true);
    Manusia mns3 = new Manusia("Yanuar", "215150607111013", true, false);
    ArrayList<Manusia> output = new ArrayList<Manusia>();
    output.add(mns1);
    output.add(mns2);
    output.add(mns3);

    System.out.println("========== DAFTAR MANUSIA ==========");
        for(int i=0;i<output.size();i++){
            System.out.println(output.get(i).toString());
        }
    System.out.println("=====================================");

    MahasiswaFilkom mhs1 = new MahasiswaFilkom("Athallarifky", "3174082510031001", false, false, "215150607111013", 3.5);
    MahasiswaFilkom mhs2 = new MahasiswaFilkom("Pasha", "3174082510031001", false, true, "215150607111013", 3.0);
    MahasiswaFilkom mhs3 = new MahasiswaFilkom("Yanuar", "3174082510031001", false, false, "215150607111013", 3.7);
    ArrayList<MahasiswaFilkom> output1 = new ArrayList<MahasiswaFilkom>();
    output1.add(mhs1);
    output1.add(mhs2);
    output1.add(mhs3);

    System.out.println();
    System.out.println("====== DAFTAR MAHASISWA FILKOM ======");
        for(int i=0;i<output1.size();i++){
            System.out.println(output1.get(i).toString());
        }
    System.out.println("=====================================");

    Pekerja pkj1 = new Pekerja("Athallarifky", "3174082510031001", false, true, 8, 30, "2312232");
    Pekerja pkj2 = new Pekerja("Pasha", "3174082510031001", true, false, 9, 28, "2312232");
    Pekerja pkj3 = new Pekerja("Yanuar", "3174082510031001", false, true, 10, 26, "2312232");
    ArrayList<Pekerja> output2 = new ArrayList<Pekerja>();
    output2.add(pkj1);
    output2.add(pkj2);
    output2.add(pkj3);

    System.out.println();
    System.out.println("========== DAFTAR PEKERJA ==========");
        for(int i=0;i<output2.size();i++){
            System.out.println(output2.get(i).toString());
        }
    System.out.println("=====================================");

    Manajer mnj1 = new Manajer("yanuarin", "3326134801030063", false, true,9, 25,"3243343", 37891213);
    Manajer mnj2 = new Manajer("salwa", "3326134801030063", false, false,8, 28,"3243343", 37891213);
    Manajer mnj3 = new Manajer("afranita", "3326134801030063", true, true,6, 25,"3243343", 34321232);
    ArrayList<Manajer> output3 = new ArrayList<Manajer>();
    output3.add(mnj1);
    output3.add(mnj2);
    output3.add(mnj3);

    System.out.println();
    System.out.println("=========== DAFTAR MANAJER ==========");
        for(int i=0;i<output3.size();i++){
            System.out.println(output3.get(i).toString());
        }
    System.out.println("=====================================");

    }
}
 
    

