import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Reservation{
  public Reservation(
    String FirstName, String SurName, String Phone, short Type, String Arrival, String Departure
  ){
    this.FirstName_ = FirstName;
    this.SurName_ = SurName;
    this.Phone_ = Phone;
    this.Type_ = Type;
    Arrival_ = LocalDate.parse(Arrival, dtf);
    Departure_ = LocalDate.parse(Departure, dtf);
    calculate_cost();
  }

  private void calculate_cost(){
    System.out.println("Arrival date: " + Arrival_);
    long daysBetween = ChronoUnit.DAYS.between(Arrival_, Departure_);
    System.out.println ("Days: " + daysBetween);
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
  private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
}

public class HelloWorld {
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
      System.out.print("Enter arrival date (dd-mm-yyyy): ");
      String arrival = input.next();
      System.out.print("Enter departure date (dd-mm-yyyy): ");
      String departure = input.next();
      
      
      Reservation r1 = new Reservation("", "", "", (short)2, arrival, departure);
      // Reservation r1 = new Reservation(firstName, surName, phone, type, arrival, departure);
      // r1.get_cost();

      input.close();
    }
}