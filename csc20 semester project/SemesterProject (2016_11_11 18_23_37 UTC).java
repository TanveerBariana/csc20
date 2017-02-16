import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

  
public class SemesterProject implements ActionListener{
   static CardLayout contentPaneLayout;
   static JButton adrsButton,ldContacts, addNwContacts, srchContacts, srtContacts, vwDltContacts, bckUpContacts, exit, TopMenuAdd, TopMenuView, AdrsCancel, LdCancel, Create, Load, Save, Delete;
   static JTextField mainTxt,addTxt, searchTxt, sortTxt, firstName, lastName, email, address, phone, userNameIn, numContacts, ldTxt;
   static JPanel Base, Main, Adrs, Ldcontact, Addcontact, Srchcontact, Srtcontact, VwDltcontact, MainButton, MainText, AdrsButton, AdrsText, LdcontactButton, LdcontactText, AddcontactButton, AddcontactForm, AddcontactForm1, AddcontactForm2, AddcontactForm3, AddcontactForm4, AddcontactForm5, VwDltcontactButton;
   static JLabel name, nameAdrs, nameLdcontact, nameView;
   static JTable VwContact;
   ArrayList<Contact> Contacts = new ArrayList<Contact>();
   static JFrame frm;
   int count;
   String[][] data;
   static JScrollPane scrollPane = new JScrollPane();
   String[] columnNames;
   Contact info = new Contact() ;
   public static void main(String[] args) {
		ActionListener AL = new SemesterProject();		
		frm = new JFrame("Semester Project Tanveer");
      
      Base = new JPanel();
      Base.setLayout(contentPaneLayout= new CardLayout());
      
      
      Main = new JPanel();
      Main.setLayout(new BorderLayout());
      MainButton = new JPanel();
      MainButton.setLayout(new GridLayout(2,4));
      MainText = new JPanel();
      MainText.setLayout(new FlowLayout());
      
      Adrs = new JPanel();
      Adrs.setLayout(new BorderLayout());
      AdrsButton = new JPanel();
      AdrsButton.setLayout(new FlowLayout());
      AdrsText = new JPanel();
      AdrsText.setLayout(new FlowLayout());
      
      Ldcontact = new JPanel();
      Ldcontact.setLayout(new BorderLayout());
      LdcontactButton = new JPanel();
      LdcontactButton.setLayout(new FlowLayout());
      LdcontactText = new JPanel();
      LdcontactText.setLayout(new FlowLayout());
      
      Addcontact = new JPanel();
      Addcontact.setLayout(new BoxLayout(Addcontact, BoxLayout.Y_AXIS));
      AddcontactButton = new JPanel();
      AddcontactButton.setLayout(new FlowLayout());
      AddcontactForm = new JPanel();
      AddcontactForm.setLayout(new BoxLayout(AddcontactForm, BoxLayout.PAGE_AXIS));
      AddcontactForm1 = new JPanel();
      AddcontactForm2 = new JPanel();
      AddcontactForm3 = new JPanel();
      AddcontactForm4 = new JPanel();
      AddcontactForm5 = new JPanel();
      
      
      
      String[][] data= new String[0][5];
      String[] columnNames = {"First Name","Last Name", "Email Address", "Address", "Phone No."};  
      VwContact = new JTable(data,columnNames);
      JScrollPane tmp = new JScrollPane(VwContact);
      scrollPane.setViewport(tmp.getViewport());
      VwDltcontact = new JPanel();
      VwDltcontact.setLayout(new BorderLayout());
      VwDltcontactButton = new JPanel();
      
      
      adrsButton = new JButton("Create a new adress");
      adrsButton.addActionListener(AL);
      ldContacts = new JButton("Load Contacts");
      ldContacts.addActionListener(AL);
      addNwContacts = new JButton("Add New Contacts");
      addNwContacts.addActionListener(AL);
      srchContacts = new JButton("Search Contacts");
      srchContacts.addActionListener(AL);
      srtContacts = new JButton("Sort Contacts");
      srtContacts.addActionListener(AL);
      vwDltContacts = new JButton("Veiw Delete Contacts");
      vwDltContacts.addActionListener(AL);
      bckUpContacts = new JButton("Back up Contacts");
      bckUpContacts.addActionListener(AL);
      exit = new JButton("Exit");
      exit.addActionListener(AL);
      TopMenuAdd = new JButton("Top Menu");
      TopMenuAdd.addActionListener(AL);
      TopMenuView = new JButton("Top Menu");
      TopMenuView.addActionListener(AL);
      AdrsCancel = new JButton("Cancel");
      AdrsCancel.addActionListener(AL);
      LdCancel = new JButton("Cancel");
      LdCancel.addActionListener(AL);
      Create = new JButton("Create");
      Create.addActionListener(AL);
      Load = new JButton("Load");
      Load.addActionListener(AL);
      Save = new JButton("Save New Contact");
      Save.addActionListener(AL);
      Delete = new JButton("Delete");
      Delete.addActionListener(AL);
      //MAINBUTTON
      MainButton.add(adrsButton); 
      MainButton.add(ldContacts);
      MainButton.add(addNwContacts);
      MainButton.add(srchContacts);
      MainButton.add(srtContacts);
      MainButton.add(vwDltContacts);
      MainButton.add(bckUpContacts);
      MainButton.add(exit);
      //MAINTEXT
      MainText.add(new JLabel("Username: ", JLabel.CENTER));
      mainTxt= new JTextField("",15);
      MainText.add(mainTxt);
      MainText.add(new JLabel("Number of Contacts ", JLabel.CENTER));
      numContacts= new JTextField("",15);
      MainText.add(numContacts);
      //MAIN
      name = new JLabel("<html><font size=5><b>Use Buttons to manage contacts</b></html>", JLabel.CENTER);
      Main.add(name, BorderLayout.NORTH);
      Main.add(MainText, BorderLayout.CENTER);
      Main.add(MainButton,BorderLayout.SOUTH);
      
      //ADRSBUTTON
      AdrsButton.add(Create);
      AdrsButton.add(AdrsCancel);
      //ADRSTEXT
      AdrsText.add(new JLabel("Username: ", JLabel.CENTER));
      userNameIn = new JTextField("",15);
      AdrsText.add(userNameIn); 
      
      //ADRS
      nameAdrs = new JLabel("<html><font size=5><b>Create a New Adressbook</b></html>", JLabel.CENTER);
      Adrs.add(nameAdrs,BorderLayout.NORTH);
      Adrs.add(AdrsText,BorderLayout.CENTER);
      Adrs.add(AdrsButton, BorderLayout.SOUTH);
      
      //LDCONTACTSBUTTON
      LdcontactButton.add(Load);
      LdcontactButton.add(LdCancel);
      //LDCONTACTSTEXT
      ldTxt = new JTextField("",15);   
      LdcontactText.add(new JLabel("Username: ", JLabel.CENTER));
      LdcontactText.add(ldTxt);
      //LDCONTACTS
      nameLdcontact = new JLabel("<html><font size=5><b>Load Contacts From a File</b></html>", JLabel.CENTER);
      Ldcontact.add(nameLdcontact,BorderLayout.NORTH);
      Ldcontact.add(LdcontactText,BorderLayout.CENTER);
      Ldcontact.add(LdcontactButton, BorderLayout.SOUTH);
      
      //ADDCONTACTFORM#s
      AddcontactForm1.add(new JLabel("First Name", JLabel.CENTER));
      firstName = new JTextField("",15);
      AddcontactForm1.add(firstName);
      AddcontactForm2.add(new JLabel("Last Name", JLabel.CENTER));
      lastName = new JTextField("",15);
      AddcontactForm2.add(lastName);
      AddcontactForm3.add(new JLabel("Email Address", JLabel.CENTER));
      email= new JTextField("",15);
      AddcontactForm3.add(email);
      AddcontactForm4.add(new JLabel("Address", JLabel.CENTER));
      address= new JTextField("",15);
      AddcontactForm4.add(address);
      AddcontactForm5.add(new JLabel("Phone No.", JLabel.CENTER));
      phone= new JTextField("",15);
      AddcontactForm5.add(phone); 
      //ADDCONTACTFORM
      AddcontactForm.add(AddcontactForm1);
      AddcontactForm.add(AddcontactForm2);
      AddcontactForm.add(AddcontactForm3);
      AddcontactForm.add(AddcontactForm4);
      AddcontactForm.add(AddcontactForm5);
      //ADDCONTACTBUTTON
      AddcontactButton.add(Save);
      AddcontactButton.add(TopMenuAdd);
      //ADDCONTACT
      Addcontact.add(AddcontactForm);
      Addcontact.add(AddcontactButton);
      //VwDltcontactButton
      VwDltcontactButton.add(Delete);
      VwDltcontactButton.add(TopMenuView);
      
      //VWDLTCONTACT
      nameView = new JLabel("<html><font size=5><b>View Contacts</b></html>", JLabel.CENTER);
      VwDltcontact.add(nameView,BorderLayout.NORTH);
      VwDltcontact.add(scrollPane,BorderLayout.CENTER);
      VwDltcontact.add(VwDltcontactButton,BorderLayout.SOUTH);
      
      Base.add("Main", Main);
      Base.add("Adrs", Adrs);
      Base.add("LdContact", Ldcontact);
      Base.add("Addcontact", Addcontact);
      Base.add("VwDltcontact", VwDltcontact);
      
      contentPaneLayout. show(Base, "Main");
      frm.add(Base);
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frm.setSize(660,220);
      frm.setVisible(true);
      frm.setResizable(false); 		
	}
   //buttons left: bckUpContacts, 
   public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source==adrsButton) contentPaneLayout. show(Base, "Adrs");
      if (source==Create){
         mainTxt.setText(userNameIn.getText());
         userNameIn.setText(""); 
         contentPaneLayout.show(Base, "Main");
       }  
		if (source==AdrsCancel) contentPaneLayout.show(Base, "Main");
      if (source==LdCancel) contentPaneLayout.show(Base, "Main");
      if (source==TopMenuAdd) contentPaneLayout.show(Base, "Main");
      if (source==TopMenuView)contentPaneLayout.show(Base, "Main");
      if (source==ldContacts) contentPaneLayout.show(Base, "LdContact");
      if (source==vwDltContacts){ 
         data = new String[count][5];
         int i = 0;
         for(Contact info:Contacts){
            
            data[i][0]= info.firstName;
            data[i][1]= info.lastName;
            data[i][2]= info.email;
            data[i][3]= info.address;
            data[i][4]= info.phone;
            
            i++;
          }
         
         String[] columnNames = {"First Name","Last Name", "Email Address", "Address", "Phone No."};  
         VwContact = new JTable(data,columnNames);
         JScrollPane tmp = new JScrollPane(VwContact);
         scrollPane.setViewport(tmp.getViewport());
         contentPaneLayout.show(Base, "VwDltcontact");
       }
      if (source==addNwContacts) contentPaneLayout.show(Base, "Addcontact");
      if (source==Save) {
      
         Contact info = new Contact(firstName.getText(), lastName.getText(), email.getText(), address.getText(),phone.getText());
        
         Contacts.add(info);
          firstName.setText("");
          lastName.setText("");
          email.setText("");
          address.setText("");
          phone.setText("");
         count++;
          
      }
      if (source==exit) frm.dispose();
      if (source== bckUpContacts){
         String bckName = mainTxt.getText();
         
        try {	
            FileOutputStream fos = new FileOutputStream (bckName, false);
   			ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Contacts); //oos.writeObject(info); oos.writeObject(info); 
            oos.close(); 
        }catch(FileNotFoundException g){ System.out.println(g.toString());
        } catch(Exception g){ g.printStackTrace();
        }
	      

      }
      if(source==Load){
         String frtName = ldTxt.getText();
         mainTxt.setText(frtName);
         try {
				FileInputStream fis = new FileInputStream (frtName);
				ObjectInputStream ois = new ObjectInputStream(fis);
            Contacts = (ArrayList<Contact>) ois.readObject();
			} catch(EOFException x){
			} catch(Exception x){ x.printStackTrace();}	      
         count = Contacts.size();
         contentPaneLayout.show(Base, "Main");
      }
      if(source==Delete){
        int chop = VwContact.getSelectedRow();
         Contacts.remove(chop);
         count--;
        data = new String[count][5];
         int i = 0;
         for(Contact info:Contacts){
            
            data[i][0]= info.firstName;
            data[i][1]= info.lastName;
            data[i][2]= info.email;
            data[i][3]= info.address;
            data[i][4]= info.phone;
            
            i++;
          }
         
         String[] columnNames = {"First Name","Last Name", "Email Address", "Address", "Phone No."};  
         VwContact = new JTable(data,columnNames);
         JScrollPane tmp = new JScrollPane(VwContact);
         scrollPane.setViewport(tmp.getViewport());
         contentPaneLayout.show(Base, "VwDltcontact");      }
      String num = new String(count+ "");
      numContacts.setText(num);
}

   
public static class Contact implements Serializable {
   public String firstName, lastName,email,address,phone;
   
   public Contact(String fName,String lName,String cEmail,String Caddress,String cPhone)
   {
      firstName = fName;
      lastName = lName;
      email = cEmail;
      address = Caddress;
      phone = cPhone;
   }
   public Contact()
   {
   }
                   
}
}


