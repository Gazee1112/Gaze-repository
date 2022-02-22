package com.tutorial05;

class Mahasiswa{
    // Data member
    String nama;
    String NIM;

    // constructor
    Mahasiswa (String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show (){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }
    
    // method tanpa return dan dengan parameter
    void setNama(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // method dengan return dan tanpa parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    // method dengan return dan dengan parameter
    String sayHI(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }

}
public class Main05 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Mahda","215150700111038");
        mahasiswa1.show();
        
        mahasiswa1.setNama("Dhani","215150700111040");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        System.out.println(mahasiswa1.sayHI("ganteng"));



    }
}
