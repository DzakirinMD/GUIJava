package uncle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Uncle extends JFrame implements ActionListener {
    
    private JLabel lbltotal , lblamount ,lblset , lbltax , lblinst1 , lblinst2 , lblbalance , lblblank1 , lblblank2 , lblblank0 , lblblank3 , lblblank4 , lblblank5 , lblblank6 , lblblank7 , lblblank8 ,lblblank9 ;
    private JTextField txttotal , txttax , txtamountoftax , txtbalance , txtset;
    private JCheckBox cbxcomboA , cbxcomboB , cbxcomboC ;
    private JComboBox cbopakage ;
    private JButton btnexit , btncalculate;
    private JScrollBar hgk;
    public Uncle () {
        
        super ( " Uncle Jack  " );
        
        Container cont ;
        cont = getContentPane();
        cont.setLayout ( new GridLayout ( 11 , 3 ) ) ;
        
        lblinst1 = new JLabel ( " Please select your menu : " );
        lblinst2 = new JLabel ( " Ala Carte or Set Combo(with drinks and mashed potato) : " ) ;
        lblamount = new JLabel ( " Amount Of Tax : " ) ;
        lblset = new JLabel ( " Set : " ) ;
        lbltax = new JLabel ( " Tax : " ) ;
        lbltotal = new JLabel ( " Price : " ) ;
        lblbalance = new JLabel ( " Total Price : " ) ;
        hgk = new JScrollBar();
        lblblank0 = new JLabel ( "  " ) ;
        lblblank1 = new JLabel ( "  " ) ;
        lblblank2 = new JLabel ( "  " ) ;
        lblblank3 = new JLabel ( "  " ) ;
        lblblank4 = new JLabel ( "  " ) ;
        lblblank5 = new JLabel ( "  " ) ;
        lblblank6 = new JLabel ( "  " ) ;
        lblblank7 = new JLabel ( "  " ) ;
        lblblank8 = new JLabel ( "  " ) ;
        lblblank9 = new JLabel ( "  " ) ;
        txtset = new JTextField ( 10 );
        txttotal = new JTextField ( 10 ) ;
        txttax = new JTextField ( 10 ) ;
        txtamountoftax = new JTextField ( 10 ) ;
        txtbalance = new JTextField ( 10 ) ;
        
        cbxcomboA = new JCheckBox ( " Chicken Chop With Rice " ) ;
        cbxcomboB = new JCheckBox ( " Fried Chicken With Rice " ) ;
        cbxcomboC = new JCheckBox ( " Chicken Nugget With Rice " ) ;
        
        btnexit = new JButton ( " Exit " ) ;
        btncalculate = new JButton ( " Calculate " ) ;
        cbopakage = new JComboBox ( new String [] { " Ala Carte " , " Set Combo " } ) ;
   
        cont.add ( lblinst1 ) ;
        cont.add ( lblblank1 ) ;
        cont.add ( lblblank2 ) ;
        cont.add ( cbxcomboA ) ;
        cont.add ( cbxcomboB ) ;
        cont.add ( cbxcomboC ) ;
        cont.add ( lblinst2 ) ;
        cont.add ( cbopakage ) ;
        cont.add ( lblblank3 ) ;
        cont.add ( lblset ) ;   
        cont.add ( txtset ) ;
        cont.add ( btncalculate ) ;
        cont.add ( lbltotal ) ;
        cont.add ( lblblank4 ) ;
        cont.add ( txttotal ) ;
        cont.add ( lbltax ) ;
        cont.add ( lblblank5 ) ;
        cont.add ( txttax ) ;
        cont.add ( lblamount ) ;
        cont.add ( lblblank6 ) ;
        cont.add ( txtamountoftax ) ;
        cont.add ( lblbalance ) ;
        cont.add ( lblblank7 ) ;
        cont.add ( txtbalance ) ;
        cont.add ( lblblank8 ) ;
        cont.add ( lblblank9 ) ;
        cont.add ( btnexit ) ;
        
        btncalculate.addActionListener ( this ) ;
        btnexit.addActionListener ( this ) ;

        setSize ( 1000 , 500 ) ;
        setVisible ( true ) ; //open
        
    }
    /**public void keyReleased(KeyEvent e) {
         
        // Trap all non-valid numbers
        try {
            Integer.parseInt(txtset.getText());
        }
        catch (NumberFormatException fe) {
            txtset.setText("0");
        }
         
        refreshPrice();
    }**/
     
    /**
     * Method to calculate and refresh the price display
     **/
    /**private void refreshPrice() {
         
        // Local variables used to accumulate total price
        
    }**/
     
    public void actionPerformed ( ActionEvent event ) {
        
        if ( event.getSource () == btncalculate ) {
            
            double tax = 0.1 ; 
            double total = 0.0 ;
            double totaltax = 0.0 ;
            double totalprice = 0.0;
            double price = 0;
            int Amount = Integer.parseInt(txtset.getText());
            
            if ( cbxcomboA.isSelected() ) {
                
                if   ( cbopakage.getSelectedItem().toString().equals(" Ala Carte ") ) {
                    
                    double alacarte1 = 10.00 ;
                    total += alacarte1*Amount ;
                    totaltax = total * tax ;
                    totalprice = totaltax + total;
                    
                    
                }
                
                else if ( cbopakage.getSelectedItem().toString().equals (" Set Combo " ) ) {
                    
                    double setcombo1 = 12.60 ;
                    total += setcombo1*Amount ;
                    totaltax = total * tax ;
                    totalprice = totaltax + total;
                    
                }
            }
        
            if ( cbxcomboB.isSelected() ) {
                
                if ( cbopakage.getSelectedItem().toString().equals(" Ala Carte ") ) {
                    
                    double alacarte2= 8.00 ;
                    total += alacarte2*Amount ;
                    totaltax = total * tax ;
                    totalprice = totaltax + total;
                    
                }
                
                else if ( cbopakage.getSelectedItem().toString().equals (" Set Combo " ) ) {
                    
                    double setcombo2 = 14.60 ;
                    total += setcombo2*Amount ;
                    totaltax = total * tax ;
                    totalprice = totaltax + total;
                    
                }
            }
            
            if ( cbxcomboC.isSelected() ) {
                
                if ( cbopakage.getSelectedItem().toString().equals(" Ala Carte ") ) {
                    
                    double alacarte3 = 6.80 ;
                    total += alacarte3*Amount ;
                    totaltax = total * tax ;
                    totalprice = totaltax + total;
                    
                }
                
               else if ( cbopakage.getSelectedItem().toString().equals (" Set Combo " ) ) {
                    
                    double setcombo3 = 16.00 ;
                    total = setcombo3*Amount ;
                    totaltax = total * tax ;
                    totalprice = totaltax + total;      
                }
                
            }
                
            txttotal.setText ( " RM " + total ) ;
            txttax.setText (   "" + tax + "%") ;
            txtamountoftax.setText ( " RM " + totaltax ) ;
            txtbalance.setText ( " RM " + totalprice ) ;
            
        }
        
        if ( event.getSource () == btnexit )
            System.exit ( 0 ) ;
    }

   
    public static void main(String[] args) {
        
        Uncle Jack = new Uncle () ;
        
    }
}

