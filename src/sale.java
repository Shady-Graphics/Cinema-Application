
import java.util.ResourceBundle;
import javax.swing.SpinnerNumberModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * sale.java
 *
 * Created on 14-Oct-2011, 10:44:55
 */

public class sale extends javax.swing.JFrame {

    public int selMovieId = -1;
    SpinnerNumberModel snm = new SpinnerNumberModel(1, 1, 10, 1);

    public static MyTicket myTicket = new MyTicket();

    /** Creates new form sale */
    public sale() {
        initComponents();
        setLocationRelativeTo(this);
        updateLabels(odeon.rb);

        lblDateTime.setText(odeon.today);
        txtFldTitle.setEditable(false);

        admin.mList.clear();

        for (int i = 0; i < admin.movies.size(); i++) {
            Movie m = (Movie) admin.movies.get(i);
            admin.mList.add(i, m.getTitle());
        }

        listMovieSelection.setModel(admin.mList);

        rdBtn1pm.setSelected(true);

        if (admin.movies.isEmpty()) {
            lblMsg.setText(odeon.rb.getString("ERROR NO MOVIE"));
        }

        spinnerQty.setModel(snm);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupShowTime = new javax.swing.ButtonGroup();
        pnlSale = new javax.swing.JPanel();
        lblTitleSelected = new javax.swing.JLabel();
        txtFldTitle = new javax.swing.JTextField();
        lblQty = new javax.swing.JLabel();
        spinnerQty = new javax.swing.JSpinner();
        lblShowTime = new javax.swing.JLabel();
        rdBtn1pm = new javax.swing.JRadioButton();
        rdBtn4pm = new javax.swing.JRadioButton();
        rdBtn7pm = new javax.swing.JRadioButton();
        rdBtn10pm = new javax.swing.JRadioButton();
        btnPay = new javax.swing.JButton();
        pnlSelectMovie = new javax.swing.JPanel();
        scrollPnlMovieSelection = new javax.swing.JScrollPane();
        listMovieSelection = new javax.swing.JList();
        lblDate = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();
        lblDateTime = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblStarring = new javax.swing.JLabel();
        lblDirector = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblRelDate = new javax.swing.JLabel();
        lblTitleText = new javax.swing.JLabel();
        lblDirectorText = new javax.swing.JLabel();
        lblDurationText = new javax.swing.JLabel();
        lblRelDateText = new javax.swing.JLabel();
        lblStarringText = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();

        setTitle("Odeon Sales");
        setResizable(false);

        pnlSale.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblTitleSelected.setText("Title");

        lblQty.setText("Quantity");

        lblShowTime.setText("Show Times");

        btnGroupShowTime.add(rdBtn1pm);
        rdBtn1pm.setText("1 pm");

        btnGroupShowTime.add(rdBtn4pm);
        rdBtn4pm.setText("4 pm");

        btnGroupShowTime.add(rdBtn7pm);
        rdBtn7pm.setText("7 pm");

        btnGroupShowTime.add(rdBtn10pm);
        rdBtn10pm.setText("10 pm");

        btnPay.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnPay.setText("Make Secure Payment");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSaleLayout = new javax.swing.GroupLayout(pnlSale);
        pnlSale.setLayout(pnlSaleLayout);
        pnlSaleLayout.setHorizontalGroup(
            pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaleLayout.createSequentialGroup()
                .addGroup(pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSaleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblShowTime)
                            .addComponent(lblTitleSelected))
                        .addGap(22, 22, 22)
                        .addGroup(pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSaleLayout.createSequentialGroup()
                                .addComponent(txtFldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(lblQty)
                                .addGap(18, 18, 18)
                                .addComponent(spinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSaleLayout.createSequentialGroup()
                                .addComponent(rdBtn1pm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdBtn4pm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdBtn7pm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdBtn10pm))))
                    .addGroup(pnlSaleLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        pnlSaleLayout.setVerticalGroup(
            pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaleLayout.createSequentialGroup()
                .addGroup(pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQty)
                    .addComponent(spinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitleSelected)
                    .addComponent(txtFldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(pnlSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdBtn1pm)
                    .addComponent(rdBtn4pm)
                    .addComponent(rdBtn7pm)
                    .addComponent(rdBtn10pm)
                    .addComponent(lblShowTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlSelectMovie.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Movie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        listMovieSelection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMovieSelectionMouseClicked(evt);
            }
        });
        scrollPnlMovieSelection.setViewportView(listMovieSelection);

        javax.swing.GroupLayout pnlSelectMovieLayout = new javax.swing.GroupLayout(pnlSelectMovie);
        pnlSelectMovie.setLayout(pnlSelectMovieLayout);
        pnlSelectMovieLayout.setHorizontalGroup(
            pnlSelectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelectMovieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPnlMovieSelection, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSelectMovieLayout.setVerticalGroup(
            pnlSelectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelectMovieLayout.createSequentialGroup()
                .addComponent(scrollPnlMovieSelection, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblDate.setText("Date:");

        btnAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblTitle.setText("Title");

        lblStarring.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblStarring.setText("Starring");

        lblDirector.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblDirector.setText("Director");

        lblDuration.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblDuration.setText("Duration");

        lblRelDate.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblRelDate.setText("Release Date");

        lblMsg.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblMsg.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMsg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDirector)
                            .addComponent(lblDuration)
                            .addComponent(lblRelDate)
                            .addComponent(lblStarring)
                            .addComponent(lblTitle))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblStarringText, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(lblTitleText, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(lblRelDateText, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(lblDurationText, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(lblDirectorText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle)
                    .addComponent(lblTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblStarring)
                        .addGap(18, 18, 18)
                        .addComponent(lblDirector))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblStarringText, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDirectorText, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDuration)
                    .addComponent(lblDurationText, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRelDate)
                    .addComponent(lblRelDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlSelectMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHome)
                        .addGap(50, 50, 50)
                        .addComponent(btnAdmin)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHome)
                            .addComponent(btnAdmin))
                        .addComponent(lblDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(pnlSelectMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(pnlSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        new admin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void listMovieSelectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMovieSelectionMouseClicked
        if (admin.movies.size() > 0) {
            //clear message label
            lblMsg.setText("");
            //get the id (index) of the selected movie
            selMovieId = listMovieSelection.getSelectedIndex();
//            System.out.println(listMovieSelection.getSelectedIndex());
            retrieveMovie(listMovieSelection.getSelectedIndex());
        } else {
            lblMsg.setText(odeon.rb.getString("ERROR NO MOVIE"));
        }
    }//GEN-LAST:event_listMovieSelectionMouseClicked

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        if (!txtFldTitle.getText().equals("")) {

           int mId = listMovieSelection.getSelectedIndex();
           int numT = (int) snm.getNumber().intValue();

           //hold the show time as a string to be able to display on the final ticket page
           String st = "";


            if (rdBtn1pm.isSelected()) {
                st = "1pm";
            }
            if (rdBtn4pm.isSelected()) {
                st = "4pm";
            }
            if (rdBtn7pm.isSelected()) {
                st = "7pm";
            }
            if (rdBtn10pm.isSelected()) {
                st = "10pm";
            }

           myTicket.setNumTickets(numT);
           myTicket.setShowTime(st);
           myTicket.setMovieId(mId);



            new seat().setVisible(true);
            this.setVisible(false);

        } else {
            lblMsg.setText(odeon.rb.getString("ERROR PICK MOVIE"));
        }

    }//GEN-LAST:event_btnPayActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new odeon().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new sale().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.ButtonGroup btnGroupShowTime;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblDirectorText;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblDurationText;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblRelDate;
    private javax.swing.JLabel lblRelDateText;
    private javax.swing.JLabel lblShowTime;
    private javax.swing.JLabel lblStarring;
    private javax.swing.JLabel lblStarringText;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitleSelected;
    private javax.swing.JLabel lblTitleText;
    private javax.swing.JList listMovieSelection;
    private javax.swing.JPanel pnlSale;
    private javax.swing.JPanel pnlSelectMovie;
    private javax.swing.JRadioButton rdBtn10pm;
    private javax.swing.JRadioButton rdBtn1pm;
    private javax.swing.JRadioButton rdBtn4pm;
    private javax.swing.JRadioButton rdBtn7pm;
    private javax.swing.JScrollPane scrollPnlMovieSelection;
    private javax.swing.JSpinner spinnerQty;
    private javax.swing.JTextField txtFldTitle;
    // End of variables declaration//GEN-END:variables

    public void retrieveMovie(int id) {
//        System.out.println("Movies size is: " + admin.movies.size());
        Movie m = (Movie) admin.movies.get(id);

        lblTitleText.setText(m.getTitle());
        lblDirectorText.setText(m.getDirector());
        lblDurationText.setText(m.getDuration());
        lblRelDateText.setText(m.getRelDate());
        lblStarringText.setText(m.getStaring());

        txtFldTitle.setText(m.getTitle());
    }
    
    public void updateLabels(ResourceBundle rb){
        lblDate.setText(rb.getString("DATE"));
        
        lblTitle.setText(rb.getString("TITLE"));
        lblStarring.setText(rb.getString("STARRING"));
        lblRelDate.setText(rb.getString("RELEASE DATE"));
        lblDuration.setText(rb.getString("DURATION"));
        lblDirector.setText(rb.getString("DIRECTOR"));
        
        btnHome.setText(rb.getString("HOME"));
        btnAdmin.setText(rb.getString("ADMIN"));
        
        lblTitleSelected.setText(rb.getString("TITLE"));
        lblQty.setText(rb.getString("QUANTITY"));
        lblShowTime.setText(rb.getString("SHOW TIMES"));
        btnPay.setText(rb.getString("MAKE SECURE PAYMENT"));
    }

    
}
