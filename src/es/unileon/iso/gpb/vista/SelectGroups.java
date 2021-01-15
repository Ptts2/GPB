package es.unileon.iso.gpb.vista;

import static es.unileon.iso.gpb.controller.Controller.listGroups;
import static es.unileon.iso.gpb.controller.Controller.findGroup;
import static es.unileon.iso.gpb.controller.Controller.listSubjectHave;
import static es.unileon.iso.gpb.controller.Controller.assignStuGroup;
import es.unileon.iso.gpb.modelo.sets.Subject;
import es.unileon.iso.gpb.modelo.users.User;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto
 */
public class SelectGroups extends javax.swing.JFrame {

    private User user;
    /**
     * Creates new form MyAccount
     */
    public SelectGroups() {
        this.user=null;
        init();
    }
    public SelectGroups(User user){
        this.user=user;
        init();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        subjectsComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        groupsComboBox = new javax.swing.JComboBox<>();
        selectButton = new javax.swing.JButton();
        currentGroupLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GBP My Account");
        setResizable(false);

        backButton.setText("←");
        backButton.setFocusable(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setText("Select Group");

        subjectsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subjects" }));

        jLabel6.setText("Subject:");

        jLabel7.setText("Groups:");

        groupsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Groups" }));

        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        currentGroupLabel.setText("(Current: )");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentGroupLabel))
                    .addComponent(jLabel6)
                    .addComponent(subjectsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(groupsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectButton)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subjectsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(currentGroupLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectButton))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        
        String subject = String.valueOf(subjectsComboBox.getSelectedItem());
        String group = String.valueOf(groupsComboBox.getSelectedItem());
        
        if(javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to select group "+group+" of subject "+subject+"?",
                    "Choose group?",JOptionPane.INFORMATION_MESSAGE) == javax.swing.JOptionPane.YES_OPTION){
        
            if(assignStuGroup(this.user.getID(), subject, group)){
                javax.swing.JOptionPane.showMessageDialog(this, "Joined " +subject+":"+group+" successfully!", 
                    "Join success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else{
                javax.swing.JOptionPane.showMessageDialog(this, "There was an error joining the group!", 
                    "Error!", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_selectButtonActionPerformed
    
    private void init(){
        
        initComponents();
        initListeners();
        java.awt.Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2); 
        java.awt.Toolkit t = java.awt.Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("./logo.png")));
        
        DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>( listSubjectHave(this.user.getID()).toArray(new String[0]) );
        subjectsComboBox.setModel(model2);
        
        DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>( listGroups(String.valueOf(subjectsComboBox.getSelectedItem()) ).toArray(new String[0]) );
        groupsComboBox.setModel(model1);
    }
    
    private void initListeners(){
        subjectsComboBox.addItemListener(new java.awt.event.ItemListener() {
            
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                String subject = String.valueOf(subjectsComboBox.getSelectedItem());

                DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>( listGroups(subject).toArray(new String[0]) );
                groupsComboBox.setModel(model1); 
                currentGroupLabel.setText("(Current: )"+findGroup(user.getID(), subject));
                    
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel currentGroupLabel;
    private javax.swing.JComboBox<String> groupsComboBox;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton selectButton;
    private javax.swing.JComboBox<String> subjectsComboBox;
    // End of variables declaration//GEN-END:variables
}
