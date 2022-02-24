package com.tutorial09;
// Belajar Modifier, Public dan Private Keyword
class Player{
    String name;// default, dia akan bisa dibaca dan ditulis dari luar class
    public int exp; // public, dia akan bisa dibaca dan ditulis dari luar class
    private int health; // private, hanya akan bisa dibaca dan ditulis di dalam class saja

    Player(String name, int exp, int health){
        this.name = name;
        this.exp = 0;
        this.health = health;
    }

    // default modifier acces
    void display(){
        tambahExp(); // ini adalah contoh mengakses private acces
        System.out.println("\nName\t: " + this.name);
        System.out.println("exp\t: " + this.exp);
        System.out.println("health\t: " + this.health); // membaca didalam class
    }

    // public
    public void ubahName(String nameBaru){
        this.name = nameBaru;

    }

    private void tambahExp(){
        this.exp += 100;
    }

}
public class Main {
    public static void main(String[] args) {
        
        Player player1 = new Player("Marni",0,100);

        // deafault
        System.out.println("\n" + player1.name); // membaca data
        player1.name = "Surti";
        System.out.println(player1.name); // membaca data

        // public
        System.out.println(player1.exp); // membaca data
        player1.exp = 100;
        System.out.println(player1.exp); // membaca data

        // private (tidak bisa di akses)
        // System.out.println(player1.health); 2/ membaca data
        // player1.health = 200;
        // System.out.println(player1.health); 2/ membaca data

        //methods

        // default
        player1.display();

        //public
        player1.ubahName("Tejo");
        player1.display();

        // private (tidak bisa di akses dari luar)
        // player1.tambahExp();
    }
}
