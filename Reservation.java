package mygroup.test;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class Reservation implements java.io.Serializable{
  public Reservation(
    String FirstName, String SurName, String Phone, short Type, boolean breakfast, String Arrival, String Departure
  ){
    firstName_ = FirstName;
    lastName_ = SurName;
    phone_ = Phone;
    type_ = Type;
    breakfast_ = breakfast;
    arrival_ = LocalDate.parse(Arrival, dtf);
    departure_ = LocalDate.parse(Departure, dtf);
    calculate_cost();
  }

  private void calculate_cost(){
    // System.out.println("Arrival date: " + arrival_);
    int daysBetween = (int) ChronoUnit.DAYS.between(arrival_, departure_);
    cost_ = daysBetween * cost_per_day();
    // System.out.println ("Days: " + daysBetween + " and cost: " + cost_);
  }

  private int cost_per_day(){
    int room_cost = 0;
    switch (type_){
      case 1:
        room_cost = room_one_cost;
        break;
      case 2:
        room_cost = room_two_cost;
        break;
      case 3:
        room_cost = room_three_cost;
        break;
      default:
       // exception
    }
    int break_cost = (breakfast_) ? type_ * breakfast_cost : 0;
    
    return room_cost + break_cost;
  }

  public static ArrayList<Reservation> searchByName(String filename, String firstName, String lastName){
    ArrayList<Reservation> resvs = read(filename);
    ArrayList<Reservation> found = new ArrayList<Reservation>();
    for (Reservation resv : resvs){
      if ( (resv.firstName_.equals(firstName)) && (resv.lastName_.equals(lastName)) ){
        found.add(resv);
      }
    }
    return found;
  }

  public static ArrayList<Reservation> searchByDate(String filename, LocalDate arrival, LocalDate departure){
    ArrayList<Reservation> resvs = read(filename);
    ArrayList<Reservation> found = new ArrayList<Reservation>();
    for (Reservation resv : resvs){
      if ( (resv.arrival_.equals(arrival)) && (resv.departure_.equals(departure)) ){
        found.add(resv);
      }
    }
    return found;
  }

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
  
  public String getFirstName(){
      return firstName_;
  }
  
  public String getLastName(){
      return lastName_;
  }
  
  public String getPhone(){
      return phone_;
  }
  
  public String getRoomType(){
      String type = "";
        switch (type_){
            case 1:
                type = "single";
                break;
            case 2:
                type = "double";
                break;
            case 3:
                type = "triple";
        }
        return type;
  }
  
  public boolean getBreakfast(){
      return breakfast_;
  }
  
  public String getArrival(){
      return dtf.format(arrival_);
  }
  
  public String getDeparture(){
      return dtf.format(departure_);
  }
  
  public String get_name(){
    return firstName_ + "  " + lastName_;
  }
  
  public int get_cost(){
    return cost_;
  }

  private int cost_;
  private String firstName_, lastName_, phone_;
  private short type_;
  private boolean breakfast_;
  private LocalDate arrival_, departure_;

  public static final int room_one_cost = 50;
  public static final int room_two_cost = 65;
  public static final int room_three_cost = 75;
  public static final int breakfast_cost = 8;
  public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // TODO: na ginei private
  public static final String file_name = "/home/iasonas/Desktop/reservations.ser";
}