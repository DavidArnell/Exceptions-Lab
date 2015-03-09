package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

//        if(fullName == null || fullName.length() < 1){
//            throw new IllegalArgumentException();
//        } 
//        // Making sure there's a space in the name
//        else if (!fullName.contains(" ") ){
//            throw new IllegalArgumentException();
//        } 
    
    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = nameService.extractLastName(fullName);
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        
    }
     
}
