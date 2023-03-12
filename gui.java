import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author iasonas
 */
public class gui extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public gui() {
        initComponents();
        myInitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jShowRecButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSearchFName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSearchArr = new javax.swing.JTextField();
        jSearchCrit = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jSearchLName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSearchDep = new javax.swing.JTextField();
        jSearchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jShowRecButton.setText("Show records");
        jShowRecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowRecButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("First Name");

        jSearchFName.setColumns(5);
        jSearchFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchFNameActionPerformed(evt);
            }
        });

        jLabel10.setText("Arrival");

        jSearchArr.setColumns(5);
        jSearchArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchArrActionPerformed(evt);
            }
        });

        jSearchCrit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Date" }));

        jLabel8.setText("Last Name");

        jSearchLName.setColumns(5);

        jLabel11.setText("Departure");

        jSearchDep.setColumns(5);
        jSearchDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchDepActionPerformed(evt);
            }
        });

        jSearchButton.setText("Search");
        jSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(515, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel10))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSearchFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addComponent(jSearchArr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSearchLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jSearchDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSearchButton)
                            .addComponent(jSearchCrit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jShowRecButton)
                        .addGap(93, 93, 93))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jShowRecButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSearchButton)
                .addGap(3, 3, 3)
                .addComponent(jSearchCrit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearchFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearchLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearchDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearchArr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jShowRecButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        
    }                                              

    private void jSearchArrActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jSearchFNameActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jSearchDepActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void display_results(ArrayList<Reservation> results){
     // Frame initialization
        JFrame f = new JFrame();
 
        // Frame Title
        f.setTitle("Reservations found");
 
        // Data to be displayed in the JTable
        String[][] data = {
            { "Kundan Kumar Jha", "4031", "CSE" },
            { "Anand Jha", "6014", "IT" }
        };
 
        // Column Names
        String[] columnNames = { "First Name", "Last Name", "Phone", "Room type",
            "Breakfast", "Arrival", "Departure", "Total cost"
        };
        
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        
        for (Reservation resv : results){
            String firstName = resv.getFirstName();
            String lastName = resv.getLastName();
            String phone = resv.getPhone();
            String roomType = resv.getRoomType();
            boolean breakfast = resv.getBreakfast();
            String arrival = resv.getArrival();
            String departure = resv.getDeparture();
            int cost = resv.get_cost();
            
            Object[] row = {firstName, lastName, phone, roomType, breakfast, arrival, departure, cost};
            tableModel.addRow(row);
        }
        
        JTable j = new JTable(tableModel);
 
        // Initializing the JTable
        j.setBounds(30, 40, 600, 300);
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(600, 200);
        // Frame Visible = true
        f.setVisible(true); 
    }
    
    private void jSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        String searchCriterion = jSearchCrit.getItemAt(jSearchCrit.getSelectedIndex());
        
        ArrayList<Reservation> found;
        if (searchCriterion.equals("Name")){
            String firstName = jSearchFName.getText();
            String lastName = jSearchLName.getText();
            found = Reservation.searchByName(Reservation.file_name, firstName, lastName);
        }else{
            LocalDate arrival = LocalDate.parse(jSearchArr.getText(), Reservation.dtf);
            LocalDate departure = LocalDate.parse(jSearchDep.getText(), Reservation.dtf);
            found = Reservation.searchByDate(Reservation.file_name, arrival, departure);
        }
        
        for (Reservation res : found){
          System.out.println("Name: " + res.get_name() + "  cost: " + res.get_cost());
        }
        
        display_results(found);
    }                                             

    private void myInitComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRoomBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jBreakBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jArrival = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDeparture = new javax.swing.JTextField();
        jButtonInsert = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Telephone");

        jLabel4.setText("Room type");

        jRoomBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple" }));
        jRoomBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRoomBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Breakfast");

        jBreakBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        jLabel6.setText("Arrival (dd-mm-yyyy)");

        jArrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jArrivalActionPerformed(evt);
            }
        });

        jLabel7.setText("Departure (dd-mm-yyyy)");

        jButtonInsert.setText("Save record");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButton1.setText("Add new record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4)
                                            .addComponent(jRoomBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jBreakBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jDeparture, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jArrival, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(37, 37, 37))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1533, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRoomBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBreakBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jArrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonInsert)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
        
        jLabel1.setVisible(false);
        jFirstName.setVisible(false);
        jLabel2.setVisible(false);
        jLastName.setVisible(false);
        jLabel3.setVisible(false);
        jPhone.setVisible(false);
        jLabel4.setVisible(false);
        jRoomBox.setVisible(false);
        jLabel5.setVisible(false);
        jBreakBox.setVisible(false);
        jLabel6.setVisible(false);
        jArrival.setVisible(false);
        jLabel7.setVisible(false);
        jDeparture.setVisible(false);
        jButtonInsert.setVisible(false);
    }// </editor-fold>                        

    private void jArrivalActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        String firstName = jFirstName.getText();
        String lastName = jLastName.getText();
        String phone = jPhone.getText();
        String roomType = jRoomBox.getItemAt(jRoomBox.getSelectedIndex());
        String breakfast = jBreakBox.getItemAt(jBreakBox.getSelectedIndex());
        String arrival = jArrival.getText();
        String departure = jDeparture.getText();
        
        boolean breakfastBoolean = (breakfast.equals("Yes")) ? true : false;
        
        ArrayList<Reservation> resvs = new ArrayList<Reservation>();
        resvs.add(new Reservation(firstName, lastName, phone, roomTypeNumber(roomType), breakfastBoolean, arrival, departure) );
        Reservation.append(Reservation.file_name, resvs);
        
        jFirstName.setText("");
        jLastName.setText("");
        jPhone.setText("");
        jArrival.setText("");
        jDeparture.setText("");
        
//        ArrayList<Reservation> in_resvs = Reservation.read(Reservation.file_name);
//        for (Reservation res : in_resvs){
//          System.out.println("Name: " + res.get_name() + "  cost: " + res.get_cost());
//        }
    }                                             

    private void jRoomBoxActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jLabel1.setVisible(true);
        jFirstName.setVisible(true);
        jLabel2.setVisible(true);
        jLastName.setVisible(true);
        jLabel3.setVisible(true);
        jPhone.setVisible(true);
        jLabel4.setVisible(true);
        jRoomBox.setVisible(true);
        jLabel5.setVisible(true);
        jBreakBox.setVisible(true);
        jLabel6.setVisible(true);
        jArrival.setVisible(true);
        jLabel7.setVisible(true);
        jDeparture.setVisible(true);
        jButtonInsert.setVisible(true);
    }                                        

    private short roomTypeNumber(String roomType){
        short type = 0;
        switch (roomType){
            case "Single":
                type = 1;
                break;
            case "Double":
                type = 2;
                break;
            case "Triple":
                type = 3;
        }
        return type;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField jArrival;
    private javax.swing.JComboBox<String> jBreakBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JTextField jDeparture;
    private javax.swing.JTextField jFirstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jLastName;
    private javax.swing.JTextField jPhone;
    private javax.swing.JComboBox<String> jRoomBox;
    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jSearchArr;
    private javax.swing.JButton jSearchButton;
    private javax.swing.JComboBox<String> jSearchCrit;
    private javax.swing.JTextField jSearchDep;
    private javax.swing.JTextField jSearchFName;
    private javax.swing.JTextField jSearchLName;
    private javax.swing.JButton jShowRecButton;
    // End of variables declaration                   
}
