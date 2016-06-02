
package net.prgarnett.notedatabase;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Swing dialog for editing graph node properties as part of GraphDatabaseForm.
 *
 * @author Katherine Newling
 */
public class PropertyDialog extends javax.swing.JDialog {
    
    private static int dialogSize;
    private static String[] propertyNames;
    public static String[] propertyValues;

    /**
     * Creates new form PropertyDialog
     */
    public PropertyDialog(java.awt.Frame parent, boolean modal, String type, String noderelType, String[] propNames, String[] propValues) {
        super(parent, modal);
        initComponents();
        customInitComponents(type, noderelType, propNames, propValues);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void customInitComponents(String type, String nodeRelType, String[] propNames, String[] propValues){
        
    propertyNames = propNames;
     
     dialogSize = propNames.length;
     
     propertyValues = propValues;    
     
    
       
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        JLabel headingLabel = new javax.swing.JLabel("Update "+type+": "+nodeRelType);
         headingLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
         
        ButtonClearProperties = new javax.swing.JButton("Clear Properties");
        ButtonAddProperties = new javax.swing.JButton("Create Node");
        ButtonExit = new javax.swing.JButton("Exit");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

       
        ButtonClearProperties.setText("Clear Properties");
        ButtonClearProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearPropertiesActionPerformed(evt);
            }
        });

        ButtonAddProperties.setText("Update Properties");
         ButtonAddProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddPropertiesActionPerformed(evt);
            }
        });

        ButtonExit.setText("Exit");
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });
        
        labelList = new ArrayList<>() ;
        textFieldList = new ArrayList<>();

        
        for (int i = 0; i<dialogSize; i++){
            
            //make labels and textFields for each size vales
            labelList.add(new javax.swing.JLabel(propertyNames[i]+" :"));
            textFieldList.add(new javax.swing.JTextField(propertyValues[i]));
            
        }
     
        
        //set basic size of dialog
        
        int verticalLength = 200 + 80*dialogSize;
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, verticalLength, Short.MAX_VALUE)
        );
        
        
    Container contentPane = getContentPane();
    
    //add labels and text fields to dialog
    
    headingLabel.setBounds(100, 10, 200, 30);
    contentPane.add(headingLabel);

    for (int i = 0; i<dialogSize; i++){
            
            //make lables and textFields for each size vales
            JLabel label1 = labelList.get(i);
            label1.setBounds(10,(i+1)*80,200,30);
            contentPane.add(label1);
            JTextField text1 = textFieldList.get(i);
            text1.setBounds(200,(i+1)*80,250,30);
            contentPane.add(text1);
            
        }
    
    ButtonClearProperties.setBounds(50, verticalLength-50,125,40 );
    ButtonAddProperties.setBounds(200, verticalLength-50,125,40);
    ButtonExit.setBounds(350, verticalLength-50,125,40);
 
    contentPane.add(ButtonClearProperties);
    contentPane.add(ButtonAddProperties);
    contentPane.add(ButtonExit);
    
    this.pack();


        
    }
    
    public String[] showDialog(){
          this.setVisible(true);
          return propertyValues;
    }

 
 private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {                                         

      setVisible(false);
        dispose();
    } 
 
 private void ButtonClearPropertiesActionPerformed(java.awt.event.ActionEvent evt) {                                         

     for (int i = 0; i<dialogSize; i++){
            
            textFieldList.get(i).setText("");
            propertyValues[i] = "";
        }

    } 
 
 private void ButtonAddPropertiesActionPerformed(java.awt.event.ActionEvent evt) {                                         

     for (int i = 0; i<dialogSize; i++){
      
            propertyValues[i] = textFieldList.get(i).getText();
           
        }
      setVisible(false);
        dispose();

    } 
    
 
 private List<javax.swing.JLabel> labelList;
  private List<javax.swing.JTextField> textFieldList;
      private javax.swing.JButton ButtonClearProperties;
    private javax.swing.JButton ButtonAddProperties;
    private javax.swing.JButton ButtonExit;
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
