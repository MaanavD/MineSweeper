
import javax.swing.*; //imports
import java.awt.event.*;
import java.awt.*;
import java.util.Arrays;

/**
 * Maanav Dalal, July 26th, 2017. Minesweeper - Final Project U4A3 - GUI Game Demonstrates use of (most) course content
 * and aptitude with java ICS4U Summer School
 */
public class gameScreen extends javax.swing.JFrame {

    int gridXVal = 9; //Grid size
    int gridYVal = 9;
    int userMineNum; //Amount of mines user thinks they've found via flags
    int mineNum; //Real number of mines
    int wins = 0; //Total user wins
    int difficulty = 1; //difficulty of gmae, used as a modifier for number of mines
    int mineField[][] = new int[gridXVal][gridYVal]; //grid based on size
    JButton mines[] = new JButton[gridXVal * gridYVal]; //JButton array for the grid
    Color tiles = new Color(68, 75, 92);
    Color bg = new Color(224, 176, 106);

    public gameScreen() {
        for (int i = 0; i < mines.length; i++) { //initialize mines with an action and mouse listener
            mines[i] = new JButton("");
            mines[i].setActionCommand("" + i);
            mines[i].setBackground(tiles);
            mines[i].addActionListener(listener);
            mines[i].addMouseListener(mouse);
            ImageIcon icon = new ImageIcon("resources/0.png"); //add blank picture
            mines[i].setIcon(icon);
            mines[i].setBorder(null);
            mines[i].setBorderPainted(false);
        }
        fieldDraw(mineField);
        initComponents();
        getContentPane().setBackground(bg);
    }

    gameScreen(MineSweeper in) { //as a go-between for intro screen and gameScreen
        MineSweeper intro = in; //for future imports of objects
    }

    //This method is called from within the constructor to initialize the form. 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ctText = new javax.swing.JLabel();
        bombNum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        mineGrid = new javax.swing.JPanel();
        winNum = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newGameBtn = new javax.swing.JMenuItem();
        resetMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        instMenu = new javax.swing.JMenuItem();
        flagBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ctText.setText("BombCount:");

        bombNum.setText("000");

        jLabel1.setText("Wins:");

        resetBtn.setText("Reset");
        resetBtn.setBackground(tiles);
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        mineGrid.setLayout(new java.awt.GridLayout(1, 0));
        mineGrid.setLayout(new java.awt.GridLayout(gridXVal,gridYVal));
        for (int i = 0 ; i < mines.length ; i++)
        {
            mineGrid.add (mines [i]);
        }

        winNum.setText("0");

        jMenu1.setText("Options");

        newGameBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newGameBtn.setText("New Game");
        newGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameBtnActionPerformed(evt);
            }
        });
        jMenu1.add(newGameBtn);

        resetMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        resetMenu.setText("Reset Game");
        resetMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetMenuActionPerformed(evt);
            }
        });
        jMenu1.add(resetMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Instructions");

        instMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        instMenu.setText("General");
        instMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instMenuActionPerformed(evt);
            }
        });
        jMenu2.add(instMenu);

        flagBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        flagBtn.setText("Flagging");
        flagBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flagBtnActionPerformed(evt);
            }
        });
        jMenu2.add(flagBtn);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ctText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bombNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(winNum)
                .addGap(45, 45, 45))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mineGrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctText)
                    .addComponent(bombNum)
                    .addComponent(jLabel1)
                    .addComponent(resetBtn)
                    .addComponent(winNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mineGrid, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        reset(); //resets game
    }//GEN-LAST:event_resetBtnActionPerformed

    private void newGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameBtnActionPerformed
        this.dispose();//goes back to intro screen
        MineSweeper game = new MineSweeper(this);
        MineSweeper g = new MineSweeper();
        g.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_newGameBtnActionPerformed

    private void resetMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetMenuActionPerformed
        reset(); //resets game
    }//GEN-LAST:event_resetMenuActionPerformed

    private void instMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instMenuActionPerformed
        {//normal instructions
            JOptionPane.showMessageDialog(null, "* * * Minesweeper * * * \n \n"
                    + "In each game, you see a board of squares. Some contain bombs, others don't. If you click a square with a bomb, you lose.\n\n"
                    + "The objective of the game is to isolate all squares containing bombs, and click all squares that do not have bombs.\n"
                    + "Clicking a square that doesn't have a bomb reveals the number of adjacent squares that have bombs.\n\n"
                    + "Using this information, as well as some guess work and understanding of probability, try to avoid the bombs.\n \n", "Starting Instructions", JOptionPane.QUESTION_MESSAGE);
        }
    }//GEN-LAST:event_instMenuActionPerformed

    private void flagBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flagBtnActionPerformed
        {//instructions for the "flag" feature
            JOptionPane.showMessageDialog(null, ""
                    + "To Flag a square as a visual marker for a mine, right click it.\nBe careful though, since you can still left click it!", "Flagging", JOptionPane.QUESTION_MESSAGE);
        }
    }//GEN-LAST:event_flagBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(gameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
	/* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new gameScreen().setVisible(true);
            }
        });
    }
    ActionListener listener = new ActionListener() { //actionlistener for clicks of JButtons
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() instanceof JButton) {
                int clickedTile = Integer.parseInt(e.getActionCommand());
                clickDraw(clickedTile); //drawing method for the tile that was clicked
            }
        }

    };
    MouseListener mouse = new MouseListener() { //mouselistener for right clicks
        public void mouseClicked(MouseEvent e) {
            if (SwingUtilities.isRightMouseButton(e)) {
                for (int i = 0; i < mines.length; i++) {
                    if (e.getSource() == mines[i]) {
                        flagTile(i); //flags the button you right clicked
                    }
                }
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) { //useless methods, but cannot remove without causing errors
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }
    };

    public void flagTile(int a) { //sets right clicked squares to flags
        ImageIcon icon = new ImageIcon("resources/flag.png");
        /*if (icon == mines[a].getIcon()) {                 //WIP method to unflag (doesn't work)
         ImageIcon temp = new ImageIcon("resources/0.png");
         System.out.println("madeit");
         mines[a].setIcon(temp);
         return;
         }*/
        mines[a].setIcon(icon);
        userMineNum--;
        if (userMineNum < 0) {
            bombNum.setText(userMineNum + "!"); //adds a "!" Warning to tell the user that they're above the mine limit
        } else {
            bombNum.setText("" + userMineNum);
        }

    }

    public void fieldDraw(int mineField[][]) { //draw mines on the field
        for (int i = 0; i < mineField.length; i++) { //reset minefield to 0 all valyes
            for (int j = 0; j < mineField[i].length; j++) {
                mineField[i][j] = 0;
            }
        }
        mineNum = 2 * difficulty + (gridXVal * gridYVal) / 10; //calculate number of mines based on size / difficulty
        userMineNum = mineNum; //for user display
        for (int s = 0; s < mineNum; s++) {
            int k = (int) (Math.random() * gridXVal);
            int t = (int) (Math.random() * gridYVal);
            while (mineField[k][t] == 1) { //if random square already has mine, re-randomize until it doesn't
                k = (int) (Math.random() * gridXVal);
                t = (int) (Math.random() * gridYVal);
            }
            mineField[k][t] = 1;
        }
        //System.out.println(Arrays.deepToString(mineField));  //Bugfixing & beta testing feature
    }

    public void clickDraw(int a) {//method to draw clicked square
        int col = a % gridYVal;
        int row = a / gridXVal;
        int mineCounter = 0; //counts adjacent mines for final number of adjacent mines
        if (mineField[row][col] == 1) {//if mine is clicked..
            loseGame();
            return;
        }
        if (!mines[a].isEnabled() || row < 0 || col < 0 || row > gridXVal + 1 || col > gridYVal + 1) { //out of bounds
            return;
        }
        if (row == 0) {
            mineCounter = topRowFix(mineCounter, row, col); //next 4 methods prevent out of bounds
        } else if (row == gridXVal - 1) {
            mineCounter = bottomRowFix(mineCounter, row, col); 
        } else if (col == 0) {
            mineCounter = leftColFix(mineCounter, row, col);
        } else if (col == gridYVal - 1) {
            mineCounter = rightColFix(mineCounter, row, col);
        } else {//if in bounds selection, check how many mines are adjacent and count
            if (mineField[row + 1][col] == 1) {
                mineCounter++;
            }
            if (mineField[row - 1][col] == 1) {
                mineCounter++;
            }
            if (mineField[row][col + 1] == 1) {
                mineCounter++;
            }
            if (mineField[row][col - 1] == 1) {
                mineCounter++;
            }
            if (mineField[row + 1][col + 1] == 1) {
                mineCounter++;
            }
            if (mineField[row + 1][col - 1] == 1) {
                mineCounter++;
            }
            if (mineField[row - 1][col + 1] == 1) {
                mineCounter++;
            }
            if (mineField[row - 1][col - 1] == 1) {
                mineCounter++;
            }
        }
        if (mineCounter == 0) {
            mineCounter = 9;//no adjacent mines = blank image
        }
        if (mineCounter == 9) {
            mines[a].setEnabled(false); //disable a button that has no adjacent mines (For better UI)
        } else {
            ImageIcon icon = new ImageIcon("resources/" + mineCounter + ".png"); //set image based on adjacent mines
            mines[a].setDisabledIcon(icon); //disable so user can't use it after it's disabled
            mines[a].setEnabled(false);
        }

        if (mineCounter == 9) { //no adjacent mines = expansion method
            adjacentDraw(row, col);
        }
        winCondition();//check if game is won
    }

    public int topRowFix(int mc, int row, int col) { //next 4 methods check if it's an in bounds choice and returns value
        if (col == 0) { //if it's top right corner
            if (mineField[row][col + 1] == 1) {
                mc++;
            }
            if (mineField[row + 1][col] == 1) {
                mc++;
            }
            if (mineField[row + 1][col + 1] == 1) {
                mc++;
            }
            return mc;
        } else if (col == gridXVal - 1) { //top left corner
            if (mineField[row][col - 1] == 1) {
                mc++;
            }
            if (mineField[row + 1][col] == 1) {
                mc++;
            }
            if (mineField[row + 1][col - 1] == 1) {
                mc++;
            }
            return mc;
        } else { //all other top row buttons
            if (mineField[row + 1][col] == 1) {
                mc++;
            }
            if (mineField[row][col + 1] == 1) {
                mc++;
            }
            if (mineField[row][col - 1] == 1) {
                mc++;
            }
            if (mineField[row + 1][col + 1] == 1) {
                mc++;
            }
            if (mineField[row + 1][col - 1] == 1) {
                mc++;
            }
        }
        return mc;
    }

    public int bottomRowFix(int mc, int row, int col) { 
        if (col == 0) { //bottom left corner
            if (mineField[row - 1][col] == 1) {
                mc++;
            }
            if (mineField[row][col + 1] == 1) {
                mc++;
            }
            if (mineField[row - 1][col + 1] == 1) {
                mc++;
            }
            return mc;
        } else if (col == gridXVal - 1) { //bottom right corner
            if (mineField[row][col - 1] == 1) {
                mc++;
            }
            if (mineField[row - 1][col] == 1) {
                mc++;
            }
            if (mineField[row - 1][col - 1] == 1) {
                mc++;
            }
            return mc;
        } else { //all other bottom row buttons
            if (mineField[row - 1][col] == 1) {
                mc++;
            }
            if (mineField[row][col + 1] == 1) {
                mc++;
            }
            if (mineField[row][col - 1] == 1) {
                mc++;
            }
            if (mineField[row - 1][col + 1] == 1) {
                mc++;
            }
            if (mineField[row - 1][col - 1] == 1) {
                mc++;
            }
        }
        return mc;
    }

    public int leftColFix(int mc, int row, int col) { // if button press is on the left column
        if (mineField[row + 1][col] == 1) {
            mc++;
        }
        if (mineField[row - 1][col] == 1) {
            mc++;
        }
        if (mineField[row][col + 1] == 1) {
            mc++;
        }
        if (mineField[row + 1][col + 1] == 1) {
            mc++;
        }
        if (mineField[row - 1][col + 1] == 1) {
            mc++;
        }
        return mc;
    }

    public int rightColFix(int mc, int row, int col) {// if button press is on the right column
        if (mineField[row + 1][col] == 1) {
            mc++;
        }
        if (mineField[row - 1][col] == 1) {
            mc++;
        }
        if (mineField[row][col - 1] == 1) {
            mc++;
        }
        if (mineField[row + 1][col - 1] == 1) {
            mc++;
        }
        if (mineField[row - 1][col - 1] == 1) {
            mc++;
        }
        return mc;
    }
    public void adjacentDraw(int row, int col) { //if it's blank, check if the boxes around it are valid.
        checkRight(row * gridXVal + col + 1);
        checkLeft(row * gridXVal + col - 1);
        checkUp(row * gridXVal + col + gridXVal);
        checkDown(row * gridXVal - gridXVal);
    }

    public void checkRight(int a) {//next 4 methods check for in bounds, and if in bounds, call clickDraw
        int col = a % gridXVal;
        int row = a / gridYVal;
        try {
            if (a % gridYVal == 0) {
                return;
            }
            if (!mines[a].isEnabled() || mineField[row][col] == 1) {
                return;
            } else {
                clickDraw(a);
            }
        } catch (ArrayIndexOutOfBoundsException e) { //many insignificant out of bounds errors are caught here
        }

    }

    public void checkLeft(int a) {
        int col = a % gridXVal;
        int row = a / gridYVal;
        try {
            if (a % gridYVal == gridYVal - 1) {
                return;
            }
            if (!mines[a].isEnabled() || mineField[row][col] == 1) {
                return;
            } else {
                clickDraw(a);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    public void checkUp(int a) {
        int col = a % gridXVal;
        int row = a / gridYVal;
        try {
            if (row == 0) {
                return;
            }
            if (!mines[a].isEnabled() || mineField[row][col] == 1) {
                return;
            } else {
                clickDraw(a);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    public void checkDown(int a) {
        int col = a % gridXVal;
        int row = a / gridYVal;
        try {
            if (a / gridYVal == gridXVal - 1) {
                return;
            }
            if (!mines[a].isEnabled() || mineField[row][col] == 1) {
                return;
            } else {
                clickDraw(a);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    public void winCondition() { //check if game is won
        int buttonCounter = 0; //count how many buttons are disabled
        for (int i = 0; i < mines.length; i++) {
            if (!mines[i].isEnabled()) {
                buttonCounter++;
            }
            int checkWin = gridXVal * gridYVal - mineNum; //all buttons minus all disabled buttons
            if (buttonCounter == checkWin) {//if there are only as many enabled buttons as there are mines, win!
                win();
            }
        }
    }

    public void win() { //run if game is won
        wins++; 
        winNum.setText("" + wins); //add to the win counter
        detonate();
        { //win dialog
            JOptionPane.showMessageDialog(null, ""
                    + "Wow! Good job, you Win!!!!!\nPress \"Reset\" to play again, or try intermediate mode!", "Victory!", JOptionPane.QUESTION_MESSAGE);
        }
    }

    public void loseGame() { //game lost
        detonate();
        {//lost dialog
            JOptionPane.showMessageDialog(null, "You Lose!"
                    + " Sorry, you hit a mine! That's game over for you. \nPress \"Reset\" for another chance.", "Game Over", JOptionPane.QUESTION_MESSAGE);
        }
    }

    public void detonate() { //show user where mines were, disable buttons so they can only reset
        ImageIcon icon = new ImageIcon("resources/10.png");
        for (int i = 0; i < mineField.length; i++) {//set the disabled buttons' icons to mines if they were mines 
            for (int j = 0; j < mineField[i].length; j++) {
                if (mineField[i][j] == 1) {
                    mines[i * gridXVal + j].setDisabledIcon(icon); 
                }
                mines[i * gridXVal + j].setEnabled(false); //disable all buttons
            }
        }
    }

    public void reset() { //reset all values to be able to play again
        ImageIcon icon = new ImageIcon("resources/0.png");
        for (int k = 0; k < mines.length; k++) { //go through JButton array to reset all buttons to unpressed 
            mines[k].setIcon(icon);
            mines[k].setDisabledIcon(icon); //reset icons
            mines[k].setEnabled(true);
        }
        fieldDraw(mineField);
        bombNum.setText("" + mineNum); //put up mineNum for the user to see
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel bombNum;
    private javax.swing.JLabel ctText;
    private javax.swing.JMenuItem flagBtn;
    private javax.swing.JMenuItem instMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JPanel mineGrid;
    private javax.swing.JMenuItem newGameBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JMenuItem resetMenu;
    public javax.swing.JLabel winNum;
    // End of variables declaration//GEN-END:variables

}
