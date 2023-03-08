import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
  public static final String file_name = "/home/iasonas/Desktop/reservations.ser";
  
  public static ArrayList<Reservation> read(String filename){
    ArrayList<Reservation> in_resvs = new ArrayList<Reservation>();
    
    try {
      FileInputStream fileIn = new FileInputStream(filename);
      ObjectInputStream in = new ObjectInputStream(fileIn);
      in_resvs = (ArrayList<Reservation>) in.readObject();
      in.close();
      fileIn.close();
    } catch (IOException i) {

    } catch (ClassNotFoundException c) {
      System.out.println("ArrayList class not found");
      c.printStackTrace();
    }

    return in_resvs;
  }

  public static void write(String filename, ArrayList<Reservation> resvs){
    try { 
      FileOutputStream fout = new FileOutputStream(filename, false);
      ObjectOutputStream oos = new ObjectOutputStream(fout);
      oos.writeObject(resvs);
      oos.close();
      fout.close();
    }
    catch (IOException i) {
      i.printStackTrace();
    }
  }

  public static void append(String filename, ArrayList<Reservation> resvs){
    if (resvs.size() == 0) return;
    ArrayList<Reservation> stored = read(filename);
    stored.addAll(resvs);
    write(filename, stored);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
          
    // System.out.print("Enter first name: ");
    // String firstName = input.next();
    // System.out.print("Enter sur name: ");
    // String surName = input.next();
    // System.out.print("Enter phone: ");
    // String phone = input.next();
    // System.out.print("Enter room type (1, 2 or 3): ");
    // Short type = input.nextShort();
    // System.out.print("Enter arrival date (dd-mm-yyyy): ");
    // String arrival = input.next();
    // System.out.print("Enter departure date (dd-mm-yyyy): ");
    // String departure = input.next();
    
    // ArrayList<Reservation> resvs = new ArrayList<Reservation>();
    // resvs.add(new Reservation("Kostas", "Doe", "692382712", (short)2, true, "08-11-2022", "11-11-2022"));
    // resvs.add(new Reservation("Mixalis", "Pavlidis", "6945225566", (short)1, false, "10-11-2022", "19-11-2022"));
    // resvs.add(new Reservation("Georgia", "Christi", "232141214", (short)3, true, "28-12-2022", "03-01-2023"));

    // for (Reservation res : resvs){
    //   System.out.println("Name: " + res.get_name() + "  cost: " + res.get_cost());
    // }
    // append(file_name, resvs);

    ArrayList<Reservation> in_resvs = read(file_name);
    for (Reservation res : in_resvs){
      System.out.println("Name: " + res.get_name() + "  cost: " + res.get_cost());
    }

    input.close();
  }
}