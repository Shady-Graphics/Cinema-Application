
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class seat extends javax.swing.JFrame {

    int count = 0;
    int numTickets = sale.myTicket.getNumTickets();
    int row[] = new int[numTickets];
    int seat[] = new int[numTickets];

    int scr = 0;

    /** Creates new form seat */
    public seat() {
        initComponents();
        setLocationRelativeTo(this);
        updateLabels(odeon.rb);
        
        int mId = sale.myTicket.getMovieId();

        Movie m = (Movie) admin.movies.get(mId);

        scr = m.getScreen();


        lblNoTicket.setText(Integer.toString(numTickets));
        lblScreenNum.setText(Integer.toString(scr));

        JToggleButton btns[][] = {
            {btn1R1, btn2R1, btn3R1, btn4R1, btn5R1, btn6R1, btn7R1, btn8R1, btn9R1, btn10R1, btn11R1, btn12R1},
            {btn1R2, btn2R2, btn3R2, btn4R2, btn5R2, btn6R2, btn7R2, btn8R2, btn9R2, btn10R2, btn11R2, btn12R2},
            {btn1R3, btn2R3, btn3R3, btn4R3, btn5R3, btn6R3, btn7R3, btn8R3, btn9R3, btn10R3, btn11R3, btn12R3},
            {btn1R4, btn2R4, btn3R4, btn4R4, btn5R4, btn6R4, btn7R4, btn8R4, btn9R4, btn10R4, btn11R4, btn12R4},
            {btn1R5, btn2R5, btn3R5, btn4R5, btn5R5, btn6R5, btn7R5, btn8R5, btn9R5, btn10R5, btn11R5, btn12R5},
            {btn1R6, btn2R6, btn3R6, btn4R6, btn5R6, btn6R6, btn7R6, btn8R6, btn9R6, btn10R6, btn11R6, btn12R6},
            {btn1R7, btn2R7, btn3R7, btn4R7, btn5R7, btn6R7, btn7R7, btn8R7, btn9R7, btn10R7, btn11R7, btn12R7},
            {btn1R8, btn2R8, btn3R8, btn4R8, btn5R8, btn6R8, btn7R8, btn8R8, btn9R8, btn10R8, btn11R8, btn12R8},
            {btn1R9, btn2R9, btn3R9, btn4R9, btn5R9, btn6R9, btn7R9, btn8R9, btn9R9, btn10R9, btn11R9, btn12R9},
            {btn1R10, btn2R10, btn3R10, btn4R10, btn5R10, btn6R10, btn7R10, btn8R10, btn9R10, btn10R10, btn11R10, btn12R10}};



        

        switch (scr) {
            case 1:
                for (int i = 0; i < btns.length; i++) {
                    for (int j = 0; j < btns[i].length; j++) {
                        if (seatsS1[i][j] == 1) {
                            btns[i][j].setSelected(true);
                            btns[i][j].setEnabled(false);
                        }
                    }
                }
                break;

            case 2:
                for (int i = 0; i < btns.length; i++) {
                    for (int j = 0; j < btns[i].length; j++) {
                        if (seatsS2[i][j] == 1) {
                            btns[i][j].setSelected(true);
                            btns[i][j].setEnabled(false);
                        }
                    }
                }
                break;

            case 3:
                for (int i = 0; i < btns.length; i++) {
                    for (int j = 0; j < btns[i].length; j++) {
                        if (seatsS3[i][j] == 1) {
                            btns[i][j].setSelected(true);
                            btns[i][j].setEnabled(false);
                        }
                    }
                }
                break;

            case 4:
                for (int i = 0; i < btns.length; i++) {
                    for (int j = 0; j < btns[i].length; j++) {
                        if (seatsS4[i][j] == 1) {
                            btns[i][j].setSelected(true);
                            btns[i][j].setEnabled(false);
                        }
                    }
                }
                break;

            case 5:
                for (int i = 0; i < btns.length; i++) {
                    for (int j = 0; j < btns[i].length; j++) {
                        if (seatsS5[i][j] == 1) {
                            btns[i][j].setSelected(true);
                            btns[i][j].setEnabled(false);
                        }
                    }
                }
                break;

            case 6:
                for (int i = 0; i < btns.length; i++) {
                    for (int j = 0; j < btns[i].length; j++) {
                        if (seatsS6[i][j] == 1) {
                            btns[i][j].setSelected(true);
                            btns[i][j].setEnabled(false);
                        }
                    }
                }
                break;

            case 7:
                for (int i = 0; i < btns.length; i++) {
                    for (int j = 0; j < btns[i].length; j++) {
                        if (seatsS7[i][j] == 1) {
                            btns[i][j].setSelected(true);
                            btns[i][j].setEnabled(false);
                        }
                    }
                }
                break;

            case 8:
                for (int i = 0; i < btns.length; i++) {
                    for (int j = 0; j < btns[i].length; j++) {
                        if (seatsS8[i][j] == 1) {
                            btns[i][j].setSelected(true);
                            btns[i][j].setEnabled(false);
                        }
                    }
                }
                break;
        }


        lblDateTime.setText(odeon.today);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDate = new javax.swing.JLabel();
        lblDateTime = new javax.swing.JLabel();
        lblChooseSeat = new javax.swing.JLabel();
        pnlRows = new javax.swing.JPanel();
        lblRow1 = new javax.swing.JLabel();
        lblRow2 = new javax.swing.JLabel();
        lblRow3 = new javax.swing.JLabel();
        lblRow4 = new javax.swing.JLabel();
        lblRow5 = new javax.swing.JLabel();
        lblRow6 = new javax.swing.JLabel();
        lblRow7 = new javax.swing.JLabel();
        lblRow8 = new javax.swing.JLabel();
        lblRow9 = new javax.swing.JLabel();
        lblRow10 = new javax.swing.JLabel();
        pnlRow1 = new javax.swing.JPanel();
        btn1R1 = new javax.swing.JToggleButton();
        btn2R1 = new javax.swing.JToggleButton();
        btn3R1 = new javax.swing.JToggleButton();
        btn4R1 = new javax.swing.JToggleButton();
        btn5R1 = new javax.swing.JToggleButton();
        btn6R1 = new javax.swing.JToggleButton();
        btn7R1 = new javax.swing.JToggleButton();
        btn8R1 = new javax.swing.JToggleButton();
        btn9R1 = new javax.swing.JToggleButton();
        btn10R1 = new javax.swing.JToggleButton();
        btn11R1 = new javax.swing.JToggleButton();
        btn12R1 = new javax.swing.JToggleButton();
        pnlRow2 = new javax.swing.JPanel();
        btn1R2 = new javax.swing.JToggleButton();
        btn2R2 = new javax.swing.JToggleButton();
        btn3R2 = new javax.swing.JToggleButton();
        btn4R2 = new javax.swing.JToggleButton();
        btn5R2 = new javax.swing.JToggleButton();
        btn6R2 = new javax.swing.JToggleButton();
        btn7R2 = new javax.swing.JToggleButton();
        btn8R2 = new javax.swing.JToggleButton();
        btn9R2 = new javax.swing.JToggleButton();
        btn10R2 = new javax.swing.JToggleButton();
        btn11R2 = new javax.swing.JToggleButton();
        btn12R2 = new javax.swing.JToggleButton();
        pnlRow3 = new javax.swing.JPanel();
        btn1R3 = new javax.swing.JToggleButton();
        btn2R3 = new javax.swing.JToggleButton();
        btn3R3 = new javax.swing.JToggleButton();
        btn4R3 = new javax.swing.JToggleButton();
        btn5R3 = new javax.swing.JToggleButton();
        btn6R3 = new javax.swing.JToggleButton();
        btn7R3 = new javax.swing.JToggleButton();
        btn8R3 = new javax.swing.JToggleButton();
        btn9R3 = new javax.swing.JToggleButton();
        btn10R3 = new javax.swing.JToggleButton();
        btn11R3 = new javax.swing.JToggleButton();
        btn12R3 = new javax.swing.JToggleButton();
        pnlRow4 = new javax.swing.JPanel();
        btn1R4 = new javax.swing.JToggleButton();
        btn2R4 = new javax.swing.JToggleButton();
        btn3R4 = new javax.swing.JToggleButton();
        btn4R4 = new javax.swing.JToggleButton();
        btn5R4 = new javax.swing.JToggleButton();
        btn6R4 = new javax.swing.JToggleButton();
        btn7R4 = new javax.swing.JToggleButton();
        btn8R4 = new javax.swing.JToggleButton();
        btn9R4 = new javax.swing.JToggleButton();
        btn10R4 = new javax.swing.JToggleButton();
        btn11R4 = new javax.swing.JToggleButton();
        btn12R4 = new javax.swing.JToggleButton();
        pnlRow5 = new javax.swing.JPanel();
        btn1R5 = new javax.swing.JToggleButton();
        btn2R5 = new javax.swing.JToggleButton();
        btn3R5 = new javax.swing.JToggleButton();
        btn4R5 = new javax.swing.JToggleButton();
        btn5R5 = new javax.swing.JToggleButton();
        btn6R5 = new javax.swing.JToggleButton();
        btn7R5 = new javax.swing.JToggleButton();
        btn8R5 = new javax.swing.JToggleButton();
        btn9R5 = new javax.swing.JToggleButton();
        btn10R5 = new javax.swing.JToggleButton();
        btn11R5 = new javax.swing.JToggleButton();
        btn12R5 = new javax.swing.JToggleButton();
        pnlRow6 = new javax.swing.JPanel();
        btn1R6 = new javax.swing.JToggleButton();
        btn2R6 = new javax.swing.JToggleButton();
        btn3R6 = new javax.swing.JToggleButton();
        btn4R6 = new javax.swing.JToggleButton();
        btn5R6 = new javax.swing.JToggleButton();
        btn6R6 = new javax.swing.JToggleButton();
        btn7R6 = new javax.swing.JToggleButton();
        btn8R6 = new javax.swing.JToggleButton();
        btn9R6 = new javax.swing.JToggleButton();
        btn10R6 = new javax.swing.JToggleButton();
        btn11R6 = new javax.swing.JToggleButton();
        btn12R6 = new javax.swing.JToggleButton();
        pnlRow7 = new javax.swing.JPanel();
        btn1R7 = new javax.swing.JToggleButton();
        btn2R7 = new javax.swing.JToggleButton();
        btn3R7 = new javax.swing.JToggleButton();
        btn4R7 = new javax.swing.JToggleButton();
        btn5R7 = new javax.swing.JToggleButton();
        btn6R7 = new javax.swing.JToggleButton();
        btn7R7 = new javax.swing.JToggleButton();
        btn8R7 = new javax.swing.JToggleButton();
        btn9R7 = new javax.swing.JToggleButton();
        btn10R7 = new javax.swing.JToggleButton();
        btn11R7 = new javax.swing.JToggleButton();
        btn12R7 = new javax.swing.JToggleButton();
        pnlRow8 = new javax.swing.JPanel();
        btn1R8 = new javax.swing.JToggleButton();
        btn2R8 = new javax.swing.JToggleButton();
        btn3R8 = new javax.swing.JToggleButton();
        btn4R8 = new javax.swing.JToggleButton();
        btn5R8 = new javax.swing.JToggleButton();
        btn6R8 = new javax.swing.JToggleButton();
        btn7R8 = new javax.swing.JToggleButton();
        btn8R8 = new javax.swing.JToggleButton();
        btn9R8 = new javax.swing.JToggleButton();
        btn10R8 = new javax.swing.JToggleButton();
        btn11R8 = new javax.swing.JToggleButton();
        btn12R8 = new javax.swing.JToggleButton();
        pnlRow9 = new javax.swing.JPanel();
        btn1R9 = new javax.swing.JToggleButton();
        btn2R9 = new javax.swing.JToggleButton();
        btn3R9 = new javax.swing.JToggleButton();
        btn4R9 = new javax.swing.JToggleButton();
        btn5R9 = new javax.swing.JToggleButton();
        btn6R9 = new javax.swing.JToggleButton();
        btn7R9 = new javax.swing.JToggleButton();
        btn8R9 = new javax.swing.JToggleButton();
        btn9R9 = new javax.swing.JToggleButton();
        btn10R9 = new javax.swing.JToggleButton();
        btn11R9 = new javax.swing.JToggleButton();
        btn12R9 = new javax.swing.JToggleButton();
        pnlRow10 = new javax.swing.JPanel();
        btn1R10 = new javax.swing.JToggleButton();
        btn2R10 = new javax.swing.JToggleButton();
        btn3R10 = new javax.swing.JToggleButton();
        btn4R10 = new javax.swing.JToggleButton();
        btn5R10 = new javax.swing.JToggleButton();
        btn6R10 = new javax.swing.JToggleButton();
        btn7R10 = new javax.swing.JToggleButton();
        btn8R10 = new javax.swing.JToggleButton();
        btn9R10 = new javax.swing.JToggleButton();
        btn10R10 = new javax.swing.JToggleButton();
        btn11R10 = new javax.swing.JToggleButton();
        btn12R10 = new javax.swing.JToggleButton();
        btnContinue = new javax.swing.JButton();
        lblNumOfTickets = new javax.swing.JLabel();
        lblNoTicket = new javax.swing.JLabel();
        lblScreen = new javax.swing.JLabel();
        lblScreenNum = new javax.swing.JLabel();

        setTitle("Choose Seat");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDate.setText("Date:");

        lblChooseSeat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChooseSeat.setText("Choose a seat");

        lblRow1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRow1.setText("Row 1");

        lblRow2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRow2.setText("Row 2");

        lblRow3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRow3.setText("Row 3");

        lblRow4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRow4.setText("Row 4");

        lblRow5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRow5.setText("Row 5");

        lblRow6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRow6.setText("Row 6");

        lblRow7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRow7.setText("Row 7");

        lblRow8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRow8.setText("Row 8");

        lblRow9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRow9.setText("Row 9");

        lblRow10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRow10.setText("Row 10");

        javax.swing.GroupLayout pnlRowsLayout = new javax.swing.GroupLayout(pnlRows);
        pnlRows.setLayout(pnlRowsLayout);
        pnlRowsLayout.setHorizontalGroup(
            pnlRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRowsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRow2)
                    .addComponent(lblRow10)
                    .addComponent(lblRow9)
                    .addComponent(lblRow8)
                    .addComponent(lblRow7)
                    .addComponent(lblRow6)
                    .addComponent(lblRow5)
                    .addComponent(lblRow4)
                    .addComponent(lblRow3)
                    .addComponent(lblRow1))
                .addGap(34, 34, 34))
        );
        pnlRowsLayout.setVerticalGroup(
            pnlRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRowsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblRow1)
                .addGap(32, 32, 32)
                .addComponent(lblRow2)
                .addGap(31, 31, 31)
                .addComponent(lblRow3)
                .addGap(32, 32, 32)
                .addComponent(lblRow4)
                .addGap(32, 32, 32)
                .addComponent(lblRow5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRow6)
                .addGap(32, 32, 32)
                .addComponent(lblRow7)
                .addGap(31, 31, 31)
                .addComponent(lblRow8)
                .addGap(32, 32, 32)
                .addComponent(lblRow9)
                .addGap(34, 34, 34)
                .addComponent(lblRow10)
                .addContainerGap())
        );

        pnlRow1.setLayout(new java.awt.GridLayout(1, 0));

        btn1R1.setText("1");
        pnlRow1.add(btn1R1);

        btn2R1.setText("2");
        btn2R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2R1ActionPerformed(evt);
            }
        });
        pnlRow1.add(btn2R1);

        btn3R1.setText("3");
        pnlRow1.add(btn3R1);

        btn4R1.setText("4");
        pnlRow1.add(btn4R1);

        btn5R1.setText("5");
        pnlRow1.add(btn5R1);

        btn6R1.setText("6");
        pnlRow1.add(btn6R1);

        btn7R1.setText("7");
        pnlRow1.add(btn7R1);

        btn8R1.setText("8");
        pnlRow1.add(btn8R1);

        btn9R1.setText("9");
        pnlRow1.add(btn9R1);

        btn10R1.setText("10");
        pnlRow1.add(btn10R1);

        btn11R1.setText("11");
        pnlRow1.add(btn11R1);

        btn12R1.setText("12");
        btn12R1.setOpaque(true);
        pnlRow1.add(btn12R1);

        pnlRow2.setLayout(new java.awt.GridLayout(1, 0));

        btn1R2.setText("1");
        pnlRow2.add(btn1R2);

        btn2R2.setText("2");
        pnlRow2.add(btn2R2);

        btn3R2.setText("3");
        pnlRow2.add(btn3R2);

        btn4R2.setText("4");
        pnlRow2.add(btn4R2);

        btn5R2.setText("5");
        pnlRow2.add(btn5R2);

        btn6R2.setText("6");
        pnlRow2.add(btn6R2);

        btn7R2.setText("7");
        pnlRow2.add(btn7R2);

        btn8R2.setText("8");
        pnlRow2.add(btn8R2);

        btn9R2.setText("9");
        pnlRow2.add(btn9R2);

        btn10R2.setText("10");
        pnlRow2.add(btn10R2);

        btn11R2.setText("11");
        pnlRow2.add(btn11R2);

        btn12R2.setText("12");
        btn12R2.setOpaque(true);
        pnlRow2.add(btn12R2);

        pnlRow3.setLayout(new java.awt.GridLayout(1, 0));

        btn1R3.setText("1");
        pnlRow3.add(btn1R3);

        btn2R3.setText("2");
        pnlRow3.add(btn2R3);

        btn3R3.setText("3");
        pnlRow3.add(btn3R3);

        btn4R3.setText("4");
        pnlRow3.add(btn4R3);

        btn5R3.setText("5");
        pnlRow3.add(btn5R3);

        btn6R3.setText("6");
        pnlRow3.add(btn6R3);

        btn7R3.setText("7");
        pnlRow3.add(btn7R3);

        btn8R3.setText("8");
        pnlRow3.add(btn8R3);

        btn9R3.setText("9");
        pnlRow3.add(btn9R3);

        btn10R3.setText("10");
        pnlRow3.add(btn10R3);

        btn11R3.setText("11");
        pnlRow3.add(btn11R3);

        btn12R3.setText("12");
        btn12R3.setOpaque(true);
        pnlRow3.add(btn12R3);

        pnlRow4.setLayout(new java.awt.GridLayout(1, 0));

        btn1R4.setText("1");
        pnlRow4.add(btn1R4);

        btn2R4.setText("2");
        pnlRow4.add(btn2R4);

        btn3R4.setText("3");
        pnlRow4.add(btn3R4);

        btn4R4.setText("4");
        pnlRow4.add(btn4R4);

        btn5R4.setText("5");
        pnlRow4.add(btn5R4);

        btn6R4.setText("6");
        pnlRow4.add(btn6R4);

        btn7R4.setText("7");
        pnlRow4.add(btn7R4);

        btn8R4.setText("8");
        pnlRow4.add(btn8R4);

        btn9R4.setText("9");
        pnlRow4.add(btn9R4);

        btn10R4.setText("10");
        pnlRow4.add(btn10R4);

        btn11R4.setText("11");
        pnlRow4.add(btn11R4);

        btn12R4.setText("12");
        btn12R4.setOpaque(true);
        pnlRow4.add(btn12R4);

        pnlRow5.setLayout(new java.awt.GridLayout(1, 0));

        btn1R5.setText("1");
        pnlRow5.add(btn1R5);

        btn2R5.setText("2");
        pnlRow5.add(btn2R5);

        btn3R5.setText("3");
        pnlRow5.add(btn3R5);

        btn4R5.setText("4");
        pnlRow5.add(btn4R5);

        btn5R5.setText("5");
        pnlRow5.add(btn5R5);

        btn6R5.setText("6");
        pnlRow5.add(btn6R5);

        btn7R5.setText("7");
        pnlRow5.add(btn7R5);

        btn8R5.setText("8");
        pnlRow5.add(btn8R5);

        btn9R5.setText("9");
        pnlRow5.add(btn9R5);

        btn10R5.setText("10");
        pnlRow5.add(btn10R5);

        btn11R5.setText("11");
        pnlRow5.add(btn11R5);

        btn12R5.setText("12");
        btn12R5.setOpaque(true);
        pnlRow5.add(btn12R5);

        pnlRow6.setLayout(new java.awt.GridLayout(1, 0));

        btn1R6.setText("1");
        pnlRow6.add(btn1R6);

        btn2R6.setText("2");
        pnlRow6.add(btn2R6);

        btn3R6.setText("3");
        pnlRow6.add(btn3R6);

        btn4R6.setText("4");
        pnlRow6.add(btn4R6);

        btn5R6.setText("5");
        pnlRow6.add(btn5R6);

        btn6R6.setText("6");
        pnlRow6.add(btn6R6);

        btn7R6.setText("7");
        pnlRow6.add(btn7R6);

        btn8R6.setText("8");
        pnlRow6.add(btn8R6);

        btn9R6.setText("9");
        pnlRow6.add(btn9R6);

        btn10R6.setText("10");
        pnlRow6.add(btn10R6);

        btn11R6.setText("11");
        pnlRow6.add(btn11R6);

        btn12R6.setText("12");
        btn12R6.setOpaque(true);
        pnlRow6.add(btn12R6);

        pnlRow7.setLayout(new java.awt.GridLayout(1, 0));

        btn1R7.setText("1");
        pnlRow7.add(btn1R7);

        btn2R7.setText("2");
        pnlRow7.add(btn2R7);

        btn3R7.setText("3");
        pnlRow7.add(btn3R7);

        btn4R7.setText("4");
        pnlRow7.add(btn4R7);

        btn5R7.setText("5");
        pnlRow7.add(btn5R7);

        btn6R7.setText("6");
        pnlRow7.add(btn6R7);

        btn7R7.setText("7");
        pnlRow7.add(btn7R7);

        btn8R7.setText("8");
        pnlRow7.add(btn8R7);

        btn9R7.setText("9");
        pnlRow7.add(btn9R7);

        btn10R7.setText("10");
        pnlRow7.add(btn10R7);

        btn11R7.setText("11");
        pnlRow7.add(btn11R7);

        btn12R7.setText("12");
        btn12R7.setOpaque(true);
        pnlRow7.add(btn12R7);

        pnlRow8.setLayout(new java.awt.GridLayout(1, 0));

        btn1R8.setText("1");
        pnlRow8.add(btn1R8);

        btn2R8.setText("2");
        pnlRow8.add(btn2R8);

        btn3R8.setText("3");
        pnlRow8.add(btn3R8);

        btn4R8.setText("4");
        pnlRow8.add(btn4R8);

        btn5R8.setText("5");
        pnlRow8.add(btn5R8);

        btn6R8.setText("6");
        pnlRow8.add(btn6R8);

        btn7R8.setText("7");
        pnlRow8.add(btn7R8);

        btn8R8.setText("8");
        pnlRow8.add(btn8R8);

        btn9R8.setText("9");
        pnlRow8.add(btn9R8);

        btn10R8.setText("10");
        pnlRow8.add(btn10R8);

        btn11R8.setText("11");
        pnlRow8.add(btn11R8);

        btn12R8.setText("12");
        btn12R8.setOpaque(true);
        pnlRow8.add(btn12R8);

        pnlRow9.setLayout(new java.awt.GridLayout(1, 0));

        btn1R9.setText("1");
        pnlRow9.add(btn1R9);

        btn2R9.setText("2");
        pnlRow9.add(btn2R9);

        btn3R9.setText("3");
        pnlRow9.add(btn3R9);

        btn4R9.setText("4");
        pnlRow9.add(btn4R9);

        btn5R9.setText("5");
        pnlRow9.add(btn5R9);

        btn6R9.setText("6");
        pnlRow9.add(btn6R9);

        btn7R9.setText("7");
        pnlRow9.add(btn7R9);

        btn8R9.setText("8");
        pnlRow9.add(btn8R9);

        btn9R9.setText("9");
        pnlRow9.add(btn9R9);

        btn10R9.setText("10");
        pnlRow9.add(btn10R9);

        btn11R9.setText("11");
        pnlRow9.add(btn11R9);

        btn12R9.setText("12");
        btn12R9.setOpaque(true);
        pnlRow9.add(btn12R9);

        pnlRow10.setLayout(new java.awt.GridLayout(1, 0));

        btn1R10.setText("1");
        pnlRow10.add(btn1R10);

        btn2R10.setText("2");
        pnlRow10.add(btn2R10);

        btn3R10.setText("3");
        pnlRow10.add(btn3R10);

        btn4R10.setText("4");
        pnlRow10.add(btn4R10);

        btn5R10.setText("5");
        pnlRow10.add(btn5R10);

        btn6R10.setText("6");
        pnlRow10.add(btn6R10);

        btn7R10.setText("7");
        pnlRow10.add(btn7R10);

        btn8R10.setText("8");
        pnlRow10.add(btn8R10);

        btn9R10.setText("9");
        pnlRow10.add(btn9R10);

        btn10R10.setText("10");
        pnlRow10.add(btn10R10);

        btn11R10.setText("11");
        pnlRow10.add(btn11R10);

        btn12R10.setText("12");
        btn12R10.setOpaque(true);
        pnlRow10.add(btn12R10);

        btnContinue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnContinue.setText("Continue to Payment");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        lblNumOfTickets.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumOfTickets.setText("No. of Tickets:");

        lblNoTicket.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblScreen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblScreen.setText("Screen:");

        lblScreenNum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlRows, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumOfTickets, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(lblNoTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblScreen)
                        .addGap(18, 18, 18)
                        .addComponent(lblScreenNum, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlRow10, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRow9, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRow8, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRow7, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRow6, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRow5, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRow4, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRow3, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRow2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRow1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblChooseSeat)
                                .addGap(156, 156, 156)
                                .addComponent(btnContinue)
                                .addGap(11, 11, 11)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumOfTickets)
                            .addComponent(lblNoTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnContinue)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblScreenNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(lblChooseSeat))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRows, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(pnlRow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlRow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlRow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlRow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlRow5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlRow6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlRow7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlRow8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlRow9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlRow10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        selectSeats();
    }//GEN-LAST:event_btnContinueActionPerformed

    private void btn1R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1R1ActionPerformed
    }//GEN-LAST:event_btn1R1ActionPerformed

    private void btn10R5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10R5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn10R5ActionPerformed

    private void btn2R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2R1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2R1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new seat().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn10R1;
    private javax.swing.JToggleButton btn10R10;
    private javax.swing.JToggleButton btn10R2;
    private javax.swing.JToggleButton btn10R3;
    private javax.swing.JToggleButton btn10R4;
    private javax.swing.JToggleButton btn10R5;
    private javax.swing.JToggleButton btn10R6;
    private javax.swing.JToggleButton btn10R7;
    private javax.swing.JToggleButton btn10R8;
    private javax.swing.JToggleButton btn10R9;
    private javax.swing.JToggleButton btn11R1;
    private javax.swing.JToggleButton btn11R10;
    private javax.swing.JToggleButton btn11R2;
    private javax.swing.JToggleButton btn11R3;
    private javax.swing.JToggleButton btn11R4;
    private javax.swing.JToggleButton btn11R5;
    private javax.swing.JToggleButton btn11R6;
    private javax.swing.JToggleButton btn11R7;
    private javax.swing.JToggleButton btn11R8;
    private javax.swing.JToggleButton btn11R9;
    private javax.swing.JToggleButton btn12R1;
    private javax.swing.JToggleButton btn12R10;
    private javax.swing.JToggleButton btn12R2;
    private javax.swing.JToggleButton btn12R3;
    private javax.swing.JToggleButton btn12R4;
    private javax.swing.JToggleButton btn12R5;
    private javax.swing.JToggleButton btn12R6;
    private javax.swing.JToggleButton btn12R7;
    private javax.swing.JToggleButton btn12R8;
    private javax.swing.JToggleButton btn12R9;
    private javax.swing.JToggleButton btn1R1;
    private javax.swing.JToggleButton btn1R10;
    private javax.swing.JToggleButton btn1R2;
    private javax.swing.JToggleButton btn1R3;
    private javax.swing.JToggleButton btn1R4;
    private javax.swing.JToggleButton btn1R5;
    private javax.swing.JToggleButton btn1R6;
    private javax.swing.JToggleButton btn1R7;
    private javax.swing.JToggleButton btn1R8;
    private javax.swing.JToggleButton btn1R9;
    private javax.swing.JToggleButton btn2R1;
    private javax.swing.JToggleButton btn2R10;
    private javax.swing.JToggleButton btn2R2;
    private javax.swing.JToggleButton btn2R3;
    private javax.swing.JToggleButton btn2R4;
    private javax.swing.JToggleButton btn2R5;
    private javax.swing.JToggleButton btn2R6;
    private javax.swing.JToggleButton btn2R7;
    private javax.swing.JToggleButton btn2R8;
    private javax.swing.JToggleButton btn2R9;
    private javax.swing.JToggleButton btn3R1;
    private javax.swing.JToggleButton btn3R10;
    private javax.swing.JToggleButton btn3R2;
    private javax.swing.JToggleButton btn3R3;
    private javax.swing.JToggleButton btn3R4;
    private javax.swing.JToggleButton btn3R5;
    private javax.swing.JToggleButton btn3R6;
    private javax.swing.JToggleButton btn3R7;
    private javax.swing.JToggleButton btn3R8;
    private javax.swing.JToggleButton btn3R9;
    private javax.swing.JToggleButton btn4R1;
    private javax.swing.JToggleButton btn4R10;
    private javax.swing.JToggleButton btn4R2;
    private javax.swing.JToggleButton btn4R3;
    private javax.swing.JToggleButton btn4R4;
    private javax.swing.JToggleButton btn4R5;
    private javax.swing.JToggleButton btn4R6;
    private javax.swing.JToggleButton btn4R7;
    private javax.swing.JToggleButton btn4R8;
    private javax.swing.JToggleButton btn4R9;
    private javax.swing.JToggleButton btn5R1;
    private javax.swing.JToggleButton btn5R10;
    private javax.swing.JToggleButton btn5R2;
    private javax.swing.JToggleButton btn5R3;
    private javax.swing.JToggleButton btn5R4;
    private javax.swing.JToggleButton btn5R5;
    private javax.swing.JToggleButton btn5R6;
    private javax.swing.JToggleButton btn5R7;
    private javax.swing.JToggleButton btn5R8;
    private javax.swing.JToggleButton btn5R9;
    private javax.swing.JToggleButton btn6R1;
    private javax.swing.JToggleButton btn6R10;
    private javax.swing.JToggleButton btn6R2;
    private javax.swing.JToggleButton btn6R3;
    private javax.swing.JToggleButton btn6R4;
    private javax.swing.JToggleButton btn6R5;
    private javax.swing.JToggleButton btn6R6;
    private javax.swing.JToggleButton btn6R7;
    private javax.swing.JToggleButton btn6R8;
    private javax.swing.JToggleButton btn6R9;
    private javax.swing.JToggleButton btn7R1;
    private javax.swing.JToggleButton btn7R10;
    private javax.swing.JToggleButton btn7R2;
    private javax.swing.JToggleButton btn7R3;
    private javax.swing.JToggleButton btn7R4;
    private javax.swing.JToggleButton btn7R5;
    private javax.swing.JToggleButton btn7R6;
    private javax.swing.JToggleButton btn7R7;
    private javax.swing.JToggleButton btn7R8;
    private javax.swing.JToggleButton btn7R9;
    private javax.swing.JToggleButton btn8R1;
    private javax.swing.JToggleButton btn8R10;
    private javax.swing.JToggleButton btn8R2;
    private javax.swing.JToggleButton btn8R3;
    private javax.swing.JToggleButton btn8R4;
    private javax.swing.JToggleButton btn8R5;
    private javax.swing.JToggleButton btn8R6;
    private javax.swing.JToggleButton btn8R7;
    private javax.swing.JToggleButton btn8R8;
    private javax.swing.JToggleButton btn8R9;
    private javax.swing.JToggleButton btn9R1;
    private javax.swing.JToggleButton btn9R10;
    private javax.swing.JToggleButton btn9R2;
    private javax.swing.JToggleButton btn9R3;
    private javax.swing.JToggleButton btn9R4;
    private javax.swing.JToggleButton btn9R5;
    private javax.swing.JToggleButton btn9R6;
    private javax.swing.JToggleButton btn9R7;
    private javax.swing.JToggleButton btn9R8;
    private javax.swing.JToggleButton btn9R9;
    private javax.swing.JButton btnContinue;
    private javax.swing.JLabel lblChooseSeat;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblNoTicket;
    private javax.swing.JLabel lblNumOfTickets;
    private javax.swing.JLabel lblRow1;
    private javax.swing.JLabel lblRow10;
    private javax.swing.JLabel lblRow2;
    private javax.swing.JLabel lblRow3;
    private javax.swing.JLabel lblRow4;
    private javax.swing.JLabel lblRow5;
    private javax.swing.JLabel lblRow6;
    private javax.swing.JLabel lblRow7;
    private javax.swing.JLabel lblRow8;
    private javax.swing.JLabel lblRow9;
    private javax.swing.JLabel lblScreen;
    private javax.swing.JLabel lblScreenNum;
    private javax.swing.JPanel pnlRow1;
    private javax.swing.JPanel pnlRow10;
    private javax.swing.JPanel pnlRow2;
    private javax.swing.JPanel pnlRow3;
    private javax.swing.JPanel pnlRow4;
    private javax.swing.JPanel pnlRow5;
    private javax.swing.JPanel pnlRow6;
    private javax.swing.JPanel pnlRow7;
    private javax.swing.JPanel pnlRow8;
    private javax.swing.JPanel pnlRow9;
    private javax.swing.JPanel pnlRows;
    // End of variables declaration//GEN-END:variables
    
    public static int[][] seatsS1 = new int[10][12];
    public static int[][] seatsS2 = new int[10][12];
    public static int[][] seatsS3 = new int[10][12];
    public static int[][] seatsS4 = new int[10][12];
    public static int[][] seatsS5 = new int[10][12];
    public static int[][] seatsS6 = new int[10][12];
    public static int[][] seatsS7 = new int[10][12];
    public static int[][] seatsS8 = new int[10][12];


    public void selectSeats() {

        int selSeats = 0;

        JToggleButton btns[][] = {
            {btn1R1, btn2R1, btn3R1, btn4R1, btn5R1, btn6R1, btn7R1, btn8R1, btn9R1, btn10R1, btn11R1, btn12R1},
            {btn1R2, btn2R2, btn3R2, btn4R2, btn5R2, btn6R2, btn7R2, btn8R2, btn9R2, btn10R2, btn11R2, btn12R2},
            {btn1R3, btn2R3, btn3R3, btn4R3, btn5R3, btn6R3, btn7R3, btn8R3, btn9R3, btn10R3, btn11R3, btn12R3},
            {btn1R4, btn2R4, btn3R4, btn4R4, btn5R4, btn6R4, btn7R4, btn8R4, btn9R4, btn10R4, btn11R4, btn12R4},
            {btn1R5, btn2R5, btn3R5, btn4R5, btn5R5, btn6R5, btn7R5, btn8R5, btn9R5, btn10R5, btn11R5, btn12R5},
            {btn1R6, btn2R6, btn3R6, btn4R6, btn5R6, btn6R6, btn7R6, btn8R6, btn9R6, btn10R6, btn11R6, btn12R6},
            {btn1R7, btn2R7, btn3R7, btn4R7, btn5R7, btn6R7, btn7R7, btn8R7, btn9R7, btn10R7, btn11R7, btn12R7},
            {btn1R8, btn2R8, btn3R8, btn4R8, btn5R8, btn6R8, btn7R8, btn8R8, btn9R8, btn10R8, btn11R8, btn12R8},
            {btn1R9, btn2R9, btn3R9, btn4R9, btn5R9, btn6R9, btn7R9, btn8R9, btn9R9, btn10R9, btn11R9, btn12R9},
            {btn1R10, btn2R10, btn3R10, btn4R10, btn5R10, btn6R10, btn7R10, btn8R10, btn9R10, btn10R10, btn11R10, btn12R10}};


        //check how many seats is selected
        //if more than sold tickets -> display message

        for (int i = 0; i < btns.length; i++) {
            for (int j = 0; j < btns[i].length; j++) {
                if (btns[i][j].isSelected() && btns[i][j].isEnabled()) {
                    selSeats++;
                }
            }
        }

        //staff can select only that many seats as many tickets were sold
        //we use count to count how many seats were selected
        //if count>tickets sold -> automaticaly deselect extra seats
        if (selSeats > numTickets) {
            JOptionPane.showMessageDialog(this, odeon.rb.getString("ERROR TOO MANY")+"\n"+odeon.rb.getString("ERROR PLEASE SELECT")+ "  " + numTickets +"  "+ odeon.rb.getString("SEATS"));
        } 
        else if(selSeats < numTickets){
            JOptionPane.showMessageDialog(this, odeon.rb.getString("ERROR NOT ENOUGH")+"\n"+odeon.rb.getString("ERROR PLEASE SELECT")+ "  " +numTickets+ "  " +odeon.rb.getString("SEATS"));
        }
        else {
            for (int i = 0; i < btns.length; i++) {
                for (int j = 0; j < btns[0].length; j++) {
                    
                    if (btns[i][j].isSelected() && btns[i][j].isEnabled()) {


                        switch (scr) {
                            case 1:
                                seatsS1[i][j] = 1;
                                row[count] = i+1;
                                seat[count] = j+1;
                                count++;
                                break;

                            case 2:
                                seatsS2[i][j] = 1;
                                row[count] = i+1;
                                seat[count] = j+1;
                                count++;
                                break;

                            case 3:
                                seatsS3[i][j] = 1;
                                row[count] = i+1;
                                seat[count] = j+1;
                                count++;
                                break;

                            case 4:
                                seatsS4[i][j] = 1;
                                row[count] = i+1;
                                seat[count] = j+1;
                                count++;
                                break;

                            case 5:
                                seatsS5[i][j] = 1;
                                row[count] = i+1;
                                seat[count] = j+1;
                                count++;
                                break;

                            case 6:
                                seatsS6[i][j] = 1;
                                row[count] = i+1;
                                seat[count] = j+1;
                                count++;
                                break;

                            case 7:
                                seatsS7[i][j] = 1;
                                row[count] = i;
                                seat[count] = j;
                                count++;
                                break;

                            case 8:
                                seatsS8[i][j] = 1;
                                row[count] = i+1;
                                seat[count] = j+1;
                                count++;
                                break;
                        }
                    }
                }
            }

            sale.myTicket.setRow(row);
            sale.myTicket.setSeat(seat);

            new payment().setVisible(true);
            this.setVisible(false);

        }
    }
    
    
    public void updateLabels(ResourceBundle rb){
        lblDate.setText(rb.getString("DATE"));
        
        lblNumOfTickets.setText(rb.getString("NUMBER OF TICKETS"));
        lblScreen.setText(rb.getString("SCREEN"));
        lblChooseSeat.setText(rb.getString("CHOOSE SEAT"));
        btnContinue.setText("CONTINUE TO PAYMENT");
        lblRow1.setText(rb.getString("ROW1"));
        lblRow2.setText(rb.getString("ROW2"));
        lblRow3.setText(rb.getString("ROW3"));
        lblRow4.setText(rb.getString("ROW4"));
        lblRow5.setText(rb.getString("ROW5"));
        lblRow6.setText(rb.getString("ROW6"));
        lblRow7.setText(rb.getString("ROW7"));
        lblRow8.setText(rb.getString("ROW8"));
        lblRow9.setText(rb.getString("ROW9"));
        lblRow10.setText(rb.getString("ROW10"));
    }
}
