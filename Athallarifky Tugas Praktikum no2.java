import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
   
        Scanner saldo = new Scanner(System.in);
        double saldoAwal = saldo.nextDouble();
        double saldoSetor = saldo.nextDouble();
        System.out.println( saldoT ( saldoAwal, saldoSetor ));
    }
    static double biayaAdmin( double saldoAwal, double saldoSetor ){
        
        double saldo = saldoAwal + saldoSetor;
        double admin = saldo - 7000;
        return admin;
    }
    
    static double saldoT(double saldoAwal, double saldoSetor){
        
        double bonus = 0.0005;
        double saldoAkhir = biayaAdmin(saldoAwal,saldoSetor) * bonus;
        double saldoTotal = biayaAdmin(saldoAwal,saldoSetor) + saldoAkhir;
        return saldoTotal;
    }
}
    
