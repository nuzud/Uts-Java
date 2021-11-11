/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Uts {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Uts = new Scanner(System.in);
        double bmi;
        double tbm;
        double bbi_pria;
        double bbi_wanita;
        
        System.out.print("Masukkan nama : ");
        String nama = Uts.next();
        System.out.print("Masukkan Jenis Kelamin (pria/wanita ) : ");
        String jk = Uts.next();        
        System.out.print("Masukkan Berat Badan (kg) : ");
        double bb = Uts.nextInt();
        System.out.print("Masukkan Tinggi Badan (cm) : ");
        double tb = Uts.nextInt();
        tbm = tb/100;
        bmi = bb/(tbm*tbm);
        
        
        
        switch (jk){
            case "pria" :
                System.out.println("--------------------------------------------------------");
                System.out.println("Nama : " +nama);
                System.out.println("--------------------------------------------------------");
                System.out.println("Berat Badan : " +bb +" kg");
                System.out.println("--------------------------------------------------------");
                System.out.println("Tinggi Badan (cm) : " +tb +" cm");
                System.out.println("--------------------------------------------------------");
                System.out.println("Tinggi Badan (m) : " +tbm +" m");
                System.out.println("--------------------------------------------------------");
                System.out.println("Body Mass Index (BMI) : " +bmi);
                
                if (bmi<17.0){
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Status BMI anda adalah : Sangat Kurus");
                    System.out.println("--------------------------------------------------------");
                }else if(bmi>17.0 && bmi<18.5){
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Status BMI anda adalah : Kurus");
                    System.out.println("--------------------------------------------------------");
                }else if (bmi>18.5 && bmi<25.0){
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Status BMI anda adalah : Normal");
                    System.out.println("--------------------------------------------------------");
                }else if (bmi>25.0 && bmi<30.0){
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Status BMI anda adalah : Gemuk");
                    System.out.println("--------------------------------------------------------");
                }else if (bmi> 30.0 && bmi<35.00){
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Status BMI anda adalah : Obesitas");
                    System.out.println("--------------------------------------------------------");
                }else{
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Tidak Ada BMI");
                    System.out.println("--------------------------------------------------------");
                }
                
                bbi_pria = (tb-100)-((tb-100)*0.1);
                System.out.println("Seharusnya Berat Badan Ideal Anda Adalah : " +bbi_pria +" kg");
                System.out.println("--------------------------------------------------------");
                
                if (bb>bbi_pria){
                    double bbi1 = bb-bbi_pria;
                    System.out.println("Anda Terlalu Gemuk");
                    System.out.println("Turunkan berat badan anda " +bbi1 +" kg");
                } else if (bb<bbi_pria){
                    double bbi2 = bb+bbi_pria;
                    System.out.println("Anda Terlalu Kurus");
                    System.out.println("Naikkan berat badan anda " +bbi2 +" kg");
                }else if (bb==bbi_pria){
                    System.out.println("Berat badan anda sudah ideal");
                    System.out.println("Anda harus menjaganya");
                }else{
                    System.out.println("Tidak ada berat badan");
                }
            break;
        
            case "wanita" :
                System.out.println("--------------------------------------------------------");
                System.out.println("Nama : " +nama);
                System.out.println("--------------------------------------------------------");
                System.out.println("Berat Badan : " +bb +" kg");
                System.out.println("--------------------------------------------------------");
                System.out.println("Tinggi Badan (cm) : " +tb +" cm");
                System.out.println("--------------------------------------------------------");
                System.out.println("Tinggi Badan (m) : " +tbm +" m");
                System.out.println("--------------------------------------------------------");
                System.out.println("Body Mass Index (BMI) : " +bmi);
                
                if (bmi<17.0){
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Status BMI anda adalah : Sangat Kurus");
                    System.out.println("--------------------------------------------------------");
                }else if(bmi>17.0 && bmi<18.5){
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Status BMI anda adalah : Kurus");
                    System.out.println("--------------------------------------------------------");
                }else if (bmi>18.5 && bmi<25.0){
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Status BMI anda adalah : Normal");
                    System.out.println("--------------------------------------------------------");
                }else if (bmi>25.0 && bmi<30.0){
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Status BMI anda adalah : Gemuk");
                    System.out.println("--------------------------------------------------------");
                }else if (bmi> 30.0 && bmi<35.00){
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Status BMI anda adalah : Obesitas");
                    System.out.println("--------------------------------------------------------");
                }else{
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Tidak Ada BMI");
                    System.out.println("--------------------------------------------------------");
                }
                bbi_wanita = (tb-100)-((tb-100)*0.15);
                System.out.println("Seharusnya Berat Badan Ideal Anda Adalah : " +bbi_wanita +" kg");
                System.out.println("--------------------------------------------------------");
                
                if (bb>bbi_wanita){
                    double bbi3 = bb-bbi_wanita;
                    System.out.println("Anda Terlalu Gemuk");
                    System.out.println("Turunkan berat badan anda " +bbi3 +" kg");
                } else if (bb<bbi_wanita){
                    double bbi4 = bb+bbi_wanita;
                    System.out.println("Anda Terlalu Kurus");
                    System.out.println("Naikkan berat badan anda " +bbi4 +" kg");
                }else if (bb==bbi_wanita){
                    System.out.println("Berat badan anda sudah ideal");
                    System.out.println("Anda harus menjaganya");
                }else{
                    System.out.println("Tidak ada berat badan");
                }
            break;
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Catatan : \n"
                + "~ Tidak berlaku bagi orang orang yang \n"
                + "  membangun otot seperti olahragawan / atlet \n"
                + "~ Tidak berlaku bagi orang yang kehilangan \n"
                + "  massa ototnya \n"
                + "~ Bukan perhitungan yang akurat untuk \n"
                + "  orang yang berusia lanjut");
        System.out.println("--------------------------------------------------------");
        // TODO code application logic here
    }
    
}
