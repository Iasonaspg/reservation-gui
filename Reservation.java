import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Reservation implements java.io.Serializable{
  // Constructor. Check that phone number has 10 digits, dates are valid and names are not empty.
  public Reservation(
    String FirstName, String SurName, String Phone, short Type, boolean breakfast, String Arrival, String Departure
  ){
    if ((FirstName.length() == 0) || (SurName.length() == 0)){
      errorDialog("Please enter First and Last name");
      validReservation_ = false;
    }
    else{
      firstName_ = FirstName;
      lastName_ = SurName;
    }
    
    if (Phone.length() != 10){
      errorDialog("Please enter a 10 digit number");
      validReservation_ = false;
    }
    else{
      phone_ = Phone;
    }

    type_ = Type;
    breakfast_ = breakfast;
    
    try{
      arrival_ = LocalDate.parse(Arrival, dtf);
      departure_ = LocalDate.parse(Departure, dtf);
      calculate_cost();
    }
    catch (DateTimeParseException x){
      errorDialog("Please enter a valid date");
      validReservation_ = false;
    }
  }

  private void calculate_cost(){
    int daysBetween = (int) ChronoUnit.DAYS.between(arrival_, departure_); // Cost per day
    cost_ = daysBetween * cost_per_day(); // Total cost
    
    if (daysBetween < 0){
      errorDialog("Departure date must follow arival date");
      validReservation_ = false;
    }
  }

  // Calculate cost per day based on room type and breakfast option.
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
    }
    int break_cost = (breakfast_) ? type_ * breakfast_cost : 0;
    
    return room_cost + break_cost;
  }

  // Load file data as an ArrayList and search the entries by name
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

  // Load file data as an ArrayList and search the entries by date
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

  // Load file data as an ArrayList
  public static ArrayList<Reservation> read(String filename){
    ArrayList<Reservation> in_resvs = new ArrayList<Reservation>();
    
    try {
      FileInputStream fileIn = new FileInputStream(filename); // Open the file
      ObjectInputStream in = new ObjectInputStream(fileIn); // Search the file for Objects
      in_resvs = (ArrayList<Reservation>) in.readObject(); // Load the next object
      in.close();
      fileIn.close();
    } catch (IOException i) {

    } catch (ClassNotFoundException c) {
      System.out.println("ArrayList class not found");
      c.printStackTrace();
    }

    return in_resvs;
  }

  // Write an ArrayList to a file
  public static void write(String filename, ArrayList<Reservation> resvs){
    try { 
      FileOutputStream fout = new FileOutputStream(filename, false); // Create the file
      ObjectOutputStream oos = new ObjectOutputStream(fout); // Prepare to write objects
      oos.writeObject(resvs); // Write an object
      oos.close();
      fout.close();
    }
    catch (IOException i) {
      i.printStackTrace();
    }
  }

  // Append an ArrayList to a file
  public static void append(String filename, ArrayList<Reservation> resvs){
    if (resvs.size() == 0) return; // Return if an empty list is going to be written
    ArrayList<Reservation> stored = read(filename); // Read the stored file data
    stored.addAll(resvs); // Merge stored data and the new entries
    write(filename, stored); // Save the data to the file
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
  
  public int get_cost(){
    return cost_;
  }
  
  public boolean isValid(){
      return validReservation_;
  }
  
  // Create a windows to display error messages
  public static void errorDialog(String error){
    // Create a frame
    JFrame f = new JFrame();
    f.setTitle("Error!");
    // Create a text field
    JTextField tf = new JTextField(error);
    tf.setBounds(50,50,250,50);
    // Add the textfield to the frame
    f.add(tf);
    f.setBounds(400, 400, 300, 150);
    f.setVisible(true); 
  }

  private int cost_;
  private String firstName_, lastName_, phone_;
  private short type_;
  private boolean breakfast_;
  private LocalDate arrival_, departure_;
  private boolean validReservation_ = true;

  public static final int room_one_cost = 50;
  public static final int room_two_cost = 65;
  public static final int room_three_cost = 75;
  public static final int breakfast_cost = 8;
  public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // The format of input dates.
  public static final String file_name = "/home/iasonas/Desktop/reservations.ser";
}