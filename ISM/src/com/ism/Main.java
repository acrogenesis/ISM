/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ism;

/**
 *
 * @author SocialWare
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        triggering = new java.awt.Button();
        triggeringQuestionFrame = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        participantsLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mainBar = new javax.swing.JMenuBar();
        sessionMenu = new javax.swing.JMenu();
        newSession = new javax.swing.JMenuItem();
        openSession = new javax.swing.JMenuItem();
        saveSession = new javax.swing.JMenuItem();
        participantsMenu = new javax.swing.JMenu();
        addParticipant = new javax.swing.JMenuItem();
        editParticipant = new javax.swing.JMenuItem();
        elementsMenu = new javax.swing.JMenu();
        addElement = new javax.swing.JMenuItem();
        editElement = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        triggering.setActionCommand("setTriggering");
        triggering.setLabel("Set Triggering Question");
        triggering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triggeringActionPerformed(evt);
            }
        });

        triggeringQuestionFrame.setClosable(true);
        triggeringQuestionFrame.setTitle("Set Triggering Question");
        triggeringQuestionFrame.setVisible(false);

        javax.swing.GroupLayout triggeringQuestionFrameLayout = new javax.swing.GroupLayout(triggeringQuestionFrame.getContentPane());
        triggeringQuestionFrame.getContentPane().setLayout(triggeringQuestionFrameLayout);
        triggeringQuestionFrameLayout.setHorizontalGroup(
            triggeringQuestionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        triggeringQuestionFrameLayout.setVerticalGroup(
            triggeringQuestionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        participantsLabel.setText("Participants");

        jLabel1.setText("Elements");

        sessionMenu.setText("Session");

        newSession.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newSession.setText("New Session");
        newSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSessionActionPerformed(evt);
            }
        });
        sessionMenu.add(newSession);

        openSession.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openSession.setText("Open Session");
        openSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openSessionActionPerformed(evt);
            }
        });
        sessionMenu.add(openSession);

        saveSession.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveSession.setText("Save Session");
        sessionMenu.add(saveSession);

        mainBar.add(sessionMenu);

        participantsMenu.setText("Participants");

        addParticipant.setText("Add Participant");
        addParticipant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addParticipantActionPerformed(evt);
            }
        });
        participantsMenu.add(addParticipant);

        editParticipant.setText("Edit Participant");
        participantsMenu.add(editParticipant);

        mainBar.add(participantsMenu);

        elementsMenu.setText("Elements");

        addElement.setText("Add Element");
        addElement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addElementActionPerformed(evt);
            }
        });
        elementsMenu.add(addElement);

        editElement.setText("Edit Element");
        editElement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editElementActionPerformed(evt);
            }
        });
        elementsMenu.add(editElement);

        mainBar.add(elementsMenu);

        setJMenuBar(mainBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(triggeringQuestionFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(triggering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(participantsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(triggering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(participantsLabel)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(triggeringQuestionFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSessionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newSessionActionPerformed

    private void openSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openSessionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openSessionActionPerformed

    private void addParticipantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addParticipantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addParticipantActionPerformed

    private void addElementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addElementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addElementActionPerformed

    private void editElementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editElementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editElementActionPerformed

    private void triggeringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triggeringActionPerformed
       // poner visible el triggeringQuestionFrame trigerringQuestionFrame.setVisible(true);
    }//GEN-LAST:event_triggeringActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addElement;
    private javax.swing.JMenuItem addParticipant;
    private javax.swing.JMenuItem editElement;
    private javax.swing.JMenuItem editParticipant;
    private javax.swing.JMenu elementsMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar mainBar;
    private javax.swing.JMenuItem newSession;
    private javax.swing.JMenuItem openSession;
    private javax.swing.JLabel participantsLabel;
    private javax.swing.JMenu participantsMenu;
    private javax.swing.JMenuItem saveSession;
    private javax.swing.JMenu sessionMenu;
    private java.awt.Button triggering;
    private javax.swing.JInternalFrame triggeringQuestionFrame;
    // End of variables declaration//GEN-END:variables

}
