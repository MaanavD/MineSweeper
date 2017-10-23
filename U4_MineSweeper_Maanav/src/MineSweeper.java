
import java.awt.Color; //imports
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;
/**
Maanav Dalal, July 26th, 2017.
Minesweeper - Final Project U4A3 - GUI Game
Demonstrates use of (most) course content and aptitude with java
ICS4U Summer School 
All images were created independently, except for the mine and flag images, located at:
* http://clipartist.net/svg/sea-mine-super-duper-svg/ and
* http://www.clipartpanda.com/clipart_images/downloads-2511225
 */
public class MineSweeper extends javax.swing.JFrame { //main class
    public MineSweeper() {
        initComponents();
        Color bg = new Color(224, 176, 106); //set background to mach color scheme
        getContentPane().setBackground(bg);
    }

    MineSweeper(gameScreen aThis) { //for "new game" option (to go back to splash)
        initComponents();
    }
    MineSweeper(gameScreen2 aThis) { //for "new game" option (to go back to splash)
        initComponents();
    }


    //This method is called from within the constructor to initialize the form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        normGame = new javax.swing.JLabel();
        nineByNine = new javax.swing.JButton();
        sixteenBySixteen = new javax.swing.JButton();
        instBtn = new javax.swing.JLabel();
        genInstBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        instMenu = new javax.swing.JMenu();
        instMenuBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(224, 176, 106));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TitleR.png"))); // NOI18N
        title.setAutoscrolls(true);

        normGame.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        normGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        normGame.setText("Normal Game:");

        nineByNine.setBackground(new java.awt.Color(120, 164, 162));
        nineByNine.setText("Beginner");
        nineByNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineByNineActionPerformed(evt);
            }
        });

        sixteenBySixteen.setBackground(new java.awt.Color(120, 164, 162));
        sixteenBySixteen.setText("Intermediate");
        sixteenBySixteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixteenBySixteenActionPerformed(evt);
            }
        });

        instBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        instBtn.setText("Instructions:");

        genInstBtn.setBackground(new java.awt.Color(120, 164, 162));
        genInstBtn.setText("General ");
        genInstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genInstBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(120, 164, 162));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        instMenu.setText("Instructions");

        instMenuBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        instMenuBtn.setText("General");
        instMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instMenuBtnActionPerformed(evt);
            }
        });
        instMenu.add(instMenuBtn);

        jMenuBar1.add(instMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addComponent(nineByNine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(sixteenBySixteen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(normGame, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genInstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(instBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(title)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instBtn)
                    .addComponent(normGame))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genInstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nineByNine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sixteenBySixteen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exitBtn)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genInstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genInstBtnActionPerformed
        instructions();
    }//GEN-LAST:event_genInstBtnActionPerformed

    private void nineByNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineByNineActionPerformed
        this.dispose(); //start gameScreen (the 9 by 9 grid)
        gameScreen intro = new gameScreen(this);
        gameScreen g = new gameScreen();
        g.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_nineByNineActionPerformed

    private void instMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instMenuBtnActionPerformed
        instructions();       //instructions popup
    }//GEN-LAST:event_instMenuBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);        //Close window
    }//GEN-LAST:event_exitBtnActionPerformed

    private void sixteenBySixteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixteenBySixteenActionPerformed
        this.dispose();     //start gameScreen2 (the 16 by 16 grid)
        gameScreen2 intro = new gameScreen2(this);
        gameScreen2 g = new gameScreen2();
        g.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_sixteenBySixteenActionPerformed

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
            java.util.logging.Logger.getLogger(MineSweeper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MineSweeper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MineSweeper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MineSweeper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MineSweeper().setVisible(true);
            }
        });
    }

    public void instructions() { //Show user how to play MineSweeper
        JOptionPane.showMessageDialog(null, "* * * MineSweeper * * * \n \n"
                + "In each game, you see a board of squares. Some contain bombs, others don't. If you click a square with a bomb, you lose.\n\n"
                + "The objective of the game is to isolate all squares containing bombs, and click all squares that do not have bombs.\n"
                + "Clicking a square that doesn't have a bomb reveals the number of adjacent squares that have bombs.\n\n"
                + "Using this information, as well as some guess work and understanding of probability, try to avoid the bombs.\n \n", "Starting Instructions", JOptionPane.QUESTION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton genInstBtn;
    private javax.swing.JLabel instBtn;
    private javax.swing.JMenu instMenu;
    private javax.swing.JMenuItem instMenuBtn;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton nineByNine;
    private javax.swing.JLabel normGame;
    private javax.swing.JButton sixteenBySixteen;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
