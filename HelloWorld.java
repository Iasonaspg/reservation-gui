import java.util.Scanner;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.*;

class Reservation implements java.io.Serializable{
  public Reservation(
    String FirstName, String SurName, String Phone, short Type, boolean breakfast, String Arrival, String Departure
  ){
    FirstName_ = FirstName;
    SurName_ = SurName;
    Phone_ = Phone;
    Type_ = Type;
    breakfast_ = breakfast;
    Arrival_ = LocalDate.parse(Arrival, dtf);
    Departure_ = LocalDate.parse(Departure, dtf);
    calculate_cost();
  }

  private void calculate_cost(){
    // System.out.println("Arrival date: " + Arrival_);
    int daysBetween = (int) ChronoUnit.DAYS.between(Arrival_, Departure_);
    cost_ = daysBetween * cost_per_day();
    // System.out.println ("Days: " + daysBetween + " and cost: " + cost_);
  }

  private int cost_per_day(){
    int room_cost = 0;
    switch (Type_){
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
    int break_cost = (breakfast_) ? Type_ * breakfast_cost : 0;
    
    return room_cost + break_cost;
  }

  public String get_name(){
    return FirstName_ + "  " + SurName_;
  }
  
  public int get_cost(){
    return cost_;
  }

  private int cost_;
  private String FirstName_, SurName_, Phone_;
  private short Type_;
  private boolean breakfast_;
  private LocalDate Arrival_, Departure_;

  public static final int room_one_cost = 50;
  public static final int room_two_cost = 65;
  public static final int room_three_cost = 75;
  public static final int breakfast_cost = 8;
  private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
}

public class HelloWorld {
  public static final String file_name = "./reservations.ser";
  
  public static ArrayList<Reservation> read(String filename){
    ArrayList<Reservation> in_resvs = new ArrayList<Reservation>();
    
    try {
      FileInputStream fileIn = new FileInputStream(filename);
      ObjectInputStream in = new ObjectInputStream(fileIn);
      in_resvs = (ArrayList<Reservation>) in.readObject();
      in.close();
      fileIn.close();
    } catch (IOException i) {
      System.out.println("Input error");
      i.printStackTrace();
    } catch (ClassNotFoundException c) {
      System.out.println("ArrayList class not found");
      c.printStackTrace();
    }

    return in_resvs;
  }

  public static void write(String filename, ArrayList<Reservation> resvs){
    try { 
      FileOutputStream fout = new FileOutputStream("./reservations.ser", false);
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

      input.close();
    }
}