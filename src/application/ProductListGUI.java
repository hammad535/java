package application;

import javax.swing.*;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.JMenu;
import java.awt.event.*;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.util.UUID;
import java.util.ArrayList;


@SuppressWarnings("serial")
public class ProductListGUI extends JFrame implements ActionListener {

    JFrame frame = new JFrame("<Shaun MacDonald> : Assesment 2");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Actions");
    JMenuItem m1, m2, m3, m4;
    JLabel productID = new JLabel();
    JLabel name = new JLabel();
    JLabel itemType = new JLabel();
    JLabel quantity = new JLabel();
    JTextField tProduct, tName, tItem, tQuantity;
    JScrollPane scrollPane;
    JButton newItem;
    JButton save;
    JButton delete;
    String productid;
    String rName;
    String rQuantity;
    DefaultListModel<Product> data = new DefaultListModel<Product>();
    JList list = new JList(data);
    

    public void itemButton(){
        newItem = new JButton("New Item");
        newItem.setBounds(100,10,100,20);
        panel3.add(newItem);
        newItem.addActionListener(this);   
    }
    
    public void deleteButton(){
        delete = new JButton("Delete");
        delete.setBounds(600,10,100,20);
        delete.setEnabled(false);
        panel3.add(delete);
    }

    public void saveButton(){
        save = new JButton("Save");
        save.setBounds(300,10,100,20);
        panel3.add(save);
        save.addActionListener(this);        
    }
    
    //ActionListener for buttons
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save){
        String rName = tName.getText()+ "(";
       String rQuantity =  tQuantity.getText()+ ")";
       boolean state = true;
       checkBox.setSelected(state);
        
        data.addElement(new Product("0","Hobby",rName,rQuantity,false));
        
        
        }
        else if (e.getSource() == newItem){
            System.out.println("works");
            
            boolean state = false;
            checkBox.setSelected(state);
            tName.setText(" ");
            tQuantity.setText("");
            
            
            
            
            
            
             
           
            
            
            
            
            
        }
        
        
    }
    
    // Dropdown menu code
    String[] items = {"Select type", "Homeware", "Hobby", "Garden"};
    JComboBox<String> jComboBox = new JComboBox<>(items);
    

    JCheckBox checkBox = new JCheckBox("Available for next day delivery");
    
    
        public ProductListGUI(){


            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            
            panel1.setPreferredSize(new Dimension(550, 640));
            panel2.setPreferredSize(new Dimension(250, 640));
            panel3.setPreferredSize(new Dimension(800, 60));
            
            panel1.setLayout(null);
            panel2.setLayout(null);
            panel3.setLayout(null);

            panel2.setBackground(Color.white);
            
            frame.add(panel1,BorderLayout.CENTER);
            frame.add(panel2,BorderLayout.EAST);
            frame.add(panel3,BorderLayout.SOUTH);

            // MenuBar code 
            m1 = new JMenuItem("About");
            m2 = new JMenuItem("Import Data");
            m3 = new JMenuItem("Inventory");
            m4 = new JMenuItem("Export to CSV");

            menu.add(m1);
            menu.add(m2);
            menu.add(m3);
            menu.add(m4);
            menuBar.add(menu);
            frame.setJMenuBar(menuBar);

            //JLabel code for ProductID
                productID.setText("ProductID");
                productID.setBounds(20,20,100,20);
                panel1.add(productID);

            //JLabel code for Name
                name.setText("Name");
                name.setBounds(20,60,100,20);
                panel1.add(name);
                
            //JLabel code for Item Type
                itemType.setText("Item Type");
                itemType.setBounds(20,100,100,20);
                panel1.add(itemType);

            //JLabel code for Quantity
            quantity.setText("Quantity");
            quantity.setBounds(20,140,100,20);
            panel1.add(quantity);

            // UUID Code 
            
            String productid = UUID.randomUUID().toString();

            // JTextfield code for Product
            tProduct = new JTextField(productid,36);
            tProduct.setBounds(90,20,230,20);
            panel1.add(tProduct);

            // JTextfield code for name
            tName = new JTextField( 36);
            tName.setBounds(90,60,230,20);
            panel1.add(tName);

            // JTextfield code for Item Type
            tItem = new JTextField(36);
            jComboBox.setBounds(90,100,230,20);
            panel1.add(jComboBox);
            tItem.setBounds(90,60,230,20);
            panel1.add(tItem);

            // JTextfield code for Quantity
            tQuantity = new JTextField(36);
            tQuantity.setBounds(90,140,230,20);
            panel1.add(tQuantity);

            checkBox.setBounds(20,200,300,30);
            panel1.add(checkBox);    
            
            // JList code -- panel2
           
            scrollPane = new JScrollPane(list);
            scrollPane.setViewportView(list);
            
            list.setLayoutOrientation(JList.VERTICAL);
            
            scrollPane.setSize(250,650);
            scrollPane.setLocation(0,0);
            scrollPane.setVisible(true);
            panel2.add(scrollPane);
    
            // Show frame        
            frame.setVisible(true);

            
            panel1.setBorder(BorderFactory.createTitledBorder("Product Details")); 
        }
}