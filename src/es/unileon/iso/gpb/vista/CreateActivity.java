package es.unileon.iso.gpb.vista;

import es.unileon.iso.gpb.modelo.users.User;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Roberto
 */
public class CreateActivity extends javax.swing.JFrame {

    private User user;
    private String userType;
    /**
     * Creates new form CreateActivity
     */
    public CreateActivity() {
        init();
    }
    
    public CreateActivity(User user, String userType) {
        this.user = user;
        this.userType = userType;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fechaTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        horaInicioTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        horaFinTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        typeSelector = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        createActivityButton = new javax.swing.JButton();
        colorChooser = new javax.swing.JColorChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentText = new javax.swing.JTextArea();
        groupLabel = new javax.swing.JLabel();
        groupComboBox = new javax.swing.JComboBox<>();
        classroomLabel = new javax.swing.JLabel();
        classroomTextField = new javax.swing.JTextField();
        studentLabel = new javax.swing.JLabel();
        studentsComboBox = new javax.swing.JComboBox<>();
        teacherLabel = new javax.swing.JLabel();
        teachersComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GPB Create Activity");

        jPanel1.setMinimumSize(new java.awt.Dimension(333, 500));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Activity");
        jLabel1.setAlignmentX(0.5F);

        jLabel2.setText("Name:");

        jLabel3.setText("Date (yyyy-MM-dd)");

        fechaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Start hour: (hh:mm:ss)");

        horaInicioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaInicioTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("End hour: (hh:mm:ss)");

        jLabel6.setText("Comments (500char):");

        jLabel7.setText("Color:");

        jButton1.setText("←");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        typeSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal Activity", "Lecture", "Tutorship", "Meeting" }));
        typeSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeSelectorActionPerformed(evt);
            }
        });

        jLabel8.setText("Type:");

        createActivityButton.setText("Create activity");
        createActivityButton.setFocusable(false);
        createActivityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActivityButtonActionPerformed(evt);
            }
        });

        commentText.setColumns(20);
        commentText.setRows(5);
        jScrollPane1.setViewportView(commentText);

        groupLabel.setText("Group:");

        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Groups" }));

        classroomLabel.setText("Classroom:");

        studentLabel.setText("Student:");

        studentsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Students" }));

        teacherLabel.setText("Teacher:");

        teachersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teachers" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(classroomLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(fechaTextField)
                                .addComponent(horaInicioTextField)
                                .addComponent(nameTextField))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horaFinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(colorChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(classroomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(createActivityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(typeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(groupLabel)
                                    .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(studentsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(teachersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(teacherLabel))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horaInicioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horaFinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(teacherLabel)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(groupLabel)
                    .addComponent(studentLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teachersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(classroomLabel)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createActivityButton)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classroomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void typeSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeSelectorActionPerformed

    private void createActivityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActivityButtonActionPerformed
        
        String actName= nameTextField.getText().trim();
        String dateS = fechaTextField.getText().trim();
        String sHourS = horaInicioTextField.getText().trim();
        String eHourS = horaFinTextField.getText().trim();
        String comments = commentText.getText().trim();
        java.awt.Color color = colorChooser.getColor();
        String type = String.valueOf(typeSelector.getSelectedItem());
        
        if(actName.length()<5 || actName.length()>50 ){
            javax.swing.JOptionPane.showMessageDialog(this, "Name length must be between 5 and 50!", 
                    "Wrong name!", javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }else if(!dateS.matches("\\d{4}-\\d{2}-\\d{2}")){
            javax.swing.JOptionPane.showMessageDialog(this, "Date format must follow (yyyy-MM-dd)!", 
                    "Wrong date format!", javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }else if(!sHourS.matches("\\d{2}:\\d{2}:\\d{2}") || !eHourS.matches("\\d{2}:\\d{2}:\\d{2}")){
            javax.swing.JOptionPane.showMessageDialog(this, "Time format must follow (hh:mm:ss)!", 
                    "Wrong time format!", javax.swing.JOptionPane.ERROR_MESSAGE);
                        
        }else if(comments.length()>500){
            javax.swing.JOptionPane.showMessageDialog(this, "Comments length must be at most 500!", 
                    "Too long input!", javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }else{
            
            LocalDate date = LocalDate.parse(dateS);
            LocalTime sHour = LocalTime.parse(sHourS);
            LocalTime eHour = LocalTime.parse(eHourS);
            
            if(sHour.compareTo(eHour) >= 0){
                javax.swing.JOptionPane.showMessageDialog(this, "End time must be after Start time!", 
                    "Wrong time!", javax.swing.JOptionPane.ERROR_MESSAGE);
                
            }else if(LocalDate.now().isAfter(date)){
                javax.swing.JOptionPane.showMessageDialog(this, "You can't create activities in the past!", 
                    "Wrong date!", javax.swing.JOptionPane.ERROR_MESSAGE);
            }else{
                //Llamar a la funcion con los datos
                this.dispose();
            }
  
        }
    }//GEN-LAST:event_createActivityButtonActionPerformed

    private void horaInicioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaInicioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaInicioTextFieldActionPerformed
    
    private void init() {
        initComponents();
        initListeners();
        java.awt.Toolkit t = java.awt.Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("./logo.png")));
        java.awt.Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        if(userType.equals("Teacher")){
            String[] ops = {"Lecture", "Meeting", "Tutorship"};
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>( ops );
            typeSelector.setModel(model);
            
            studentLabel.setVisible(false);
            studentsComboBox.setEnabled(false);
            studentsComboBox.setVisible(false);
                    
            teacherLabel.setVisible(false);
            teachersComboBox.setEnabled(false);
            teachersComboBox.setVisible(false);
            
        }
        //If account type Student
        if(userType.equals("Student")){
            String[] ops = {"Personal Activity"};
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>( ops );
            typeSelector.setModel(model);
            
            groupLabel.setVisible(false);
            groupComboBox.setEnabled(false);
            groupComboBox.setVisible(false);
                    
            studentLabel.setVisible(false);
            studentsComboBox.setEnabled(false);
            studentsComboBox.setVisible(false);
              
            teacherLabel.setVisible(false);
            teachersComboBox.setEnabled(false);
            teachersComboBox.setVisible(false);
              
            classroomLabel.setVisible(false);
            classroomTextField.setEnabled(false);
            classroomTextField.setVisible(false);
            
        }
    }
    
    private void initListeners(){
         typeSelector.addItemListener(new java.awt.event.ItemListener() {
            
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                String type = String.valueOf(typeSelector.getSelectedItem());
                
                if(type.equals("Tutorship")){
                   
                    groupLabel.setVisible(false);
                    groupComboBox.setEnabled(false);
                    groupComboBox.setVisible(false);
                    
                    classroomLabel.setVisible(true);
                    classroomTextField.setEnabled(true);
                    classroomTextField.setVisible(true);
                    
                    studentLabel.setVisible(true);
                    studentsComboBox.setEnabled(true);
                    studentsComboBox.setVisible(true);
                    
                    teacherLabel.setVisible(false);
                    teachersComboBox.setEnabled(false);
                    teachersComboBox.setVisible(false);
                    
                }else if(type.equals("Meeting")){
                   
                    groupLabel.setVisible(false);
                    groupComboBox.setEnabled(false);
                    groupComboBox.setVisible(false);
                    
                    classroomLabel.setVisible(true);
                    classroomTextField.setEnabled(true);
                    classroomTextField.setVisible(true);
                    
                    studentLabel.setVisible(false);
                    studentsComboBox.setEnabled(false);
                    studentsComboBox.setVisible(false);
                    
                    teacherLabel.setVisible(true);
                    teachersComboBox.setEnabled(true);
                    teachersComboBox.setVisible(true);
                    
                }else if(type.equals("Lecture")){
                    
                    groupLabel.setVisible(true);
                    groupComboBox.setEnabled(true);
                    groupComboBox.setVisible(true);
                    
                    classroomLabel.setVisible(true);
                    classroomTextField.setEnabled(true);
                    classroomTextField.setVisible(true);
                    
                    studentLabel.setVisible(false);
                    studentsComboBox.setEnabled(false);
                    studentsComboBox.setVisible(false);
                    
                    teacherLabel.setVisible(false);
                    teachersComboBox.setEnabled(false);
                    teachersComboBox.setVisible(false);

                }
                    
            }
        });
         
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classroomLabel;
    private javax.swing.JTextField classroomTextField;
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JTextArea commentText;
    private javax.swing.JButton createActivityButton;
    private javax.swing.JTextField fechaTextField;
    private javax.swing.JComboBox<String> groupComboBox;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JTextField horaFinTextField;
    private javax.swing.JTextField horaInicioTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JComboBox<String> studentsComboBox;
    private javax.swing.JLabel teacherLabel;
    private javax.swing.JComboBox<String> teachersComboBox;
    private javax.swing.JComboBox<String> typeSelector;
    // End of variables declaration//GEN-END:variables
}
