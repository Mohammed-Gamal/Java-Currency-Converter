/*
    Date: 12:25:45 PM 12/30/2021
    Project Idea: Currency Converter Project
    Author: Mohamed Gamal
*/

public class Converter extends javax.swing.JFrame {
        double Dollar = 15.6614;
        double Euro = 17.760;
        double Pund_Sterling = 20.9330;
        double Yin = 13.7236;
        double Riyal = 4.1733;
        double Dinar = 51.5904;
        double Dirham = 4.2633;
        double Yuan = 2.4594;

        // Creates new form - 'Constructor'
        public Converter() {
                initComponents();
        }

        // initComponents function - 'called by the constructor'
        private void initComponents() {

                // Header 'Currency Converter'
                jLabel1 = new javax.swing.JLabel();

                // Amount
                jLabel3 = new javax.swing.JLabel();
                jTextFieldAmount = new javax.swing.JTextField();

                // From
                jLabel4 = new javax.swing.JLabel();
                jComboBoxFrom = new javax.swing.JComboBox<>();

                // To
                jLabel5 = new javax.swing.JLabel();
                jComboBoxTo = new javax.swing.JComboBox<>();

                // Close
                jClose = new javax.swing.JButton();
                jConvert = new javax.swing.JButton();

                // Reset
                jReset = new javax.swing.JButton();

                // Result
                jLabel2 = new javax.swing.JLabel();
                jTextFieldResult = new javax.swing.JLabel();

                // used to control the window-closing operation
                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                // Header appearance
                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36));
                jLabel1.setForeground(new java.awt.Color(20, 128, 136));
                jLabel1.setText("Currency Converter");
                jLabel1.setName("");

                // From section appearance
                jComboBoxFrom.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jComboBoxFrom
                                .setModel(new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Choose One...", "Egyptian Pound" }));
                jComboBoxFrom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

                // To section appearance
                jComboBoxTo.setFont(new java.awt.Font("Segoe UI", 0, 18));
                jComboBoxTo.setModel(
                                new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "Dollar", "Euro",
                                                "Pound Sterling", "Yin", "Riyal", "Dinar", "Dirham", "Yuan" }));
                jComboBoxTo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

                // Result section appearance
                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36));
                jLabel2.setText("Result:");

                // Result field label
                jTextFieldResult.setFont(new java.awt.Font("Segoe UI", 1, 24));
                jTextFieldResult.setForeground(new java.awt.Color(255, 0, 0));

                // Close button appearance
                jClose.setFont(new java.awt.Font("Segoe UI", 1, 20));
                jClose.setForeground(new java.awt.Color(209, 0, 41));
                jClose.setText("Close");
                jClose.setToolTipText("");
                jClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jClose.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCloseActionPerformed(evt);
                        }
                });

                // Convert button appearance
                jConvert.setFont(new java.awt.Font("Segoe UI", 1, 20));
                jConvert.setForeground(new java.awt.Color(0, 204, 204));
                jConvert.setText("Convert");
                jConvert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jConvert.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jConvertActionPerformed(evt);
                        }
                });

                // Reset button appearance
                jReset.setFont(new java.awt.Font("Segoe UI", 1, 20));
                jReset.setForeground(new java.awt.Color(0, 204, 204));
                jReset.setText("Reset");
                jReset.setToolTipText("");
                jReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jReset.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jResetActionPerformed(evt);
                        }
                });

                // Amount label
                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18));
                jLabel3.setText("Amount:");
                jLabel3.setToolTipText("");

                // From label
                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18));
                jLabel4.setText("From:");
                jLabel4.setToolTipText("");

                // To label
                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18));
                jLabel5.setText("To:");
                jLabel5.setToolTipText("");

                /* Start Layout section */
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);

                // Horizontal
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jTextFieldAmount,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                198,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                169,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                80,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jComboBoxFrom,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                232,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                169,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel5,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                169,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxTo,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                215,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap())
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(49, 49, 49)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                373,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                130,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jTextFieldResult,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                452,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(21, 21, 21)
                                                                                                .addComponent(jClose,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                91,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jConvert,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                128,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jReset,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                128,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(24, 24, 24)));

                // Vertical
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                59,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                38,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                38,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel5,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                38,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jTextFieldAmount)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jComboBoxFrom,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                49,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jComboBoxTo,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                49,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(58, 58, 58)
                                                                                                .addComponent(jLabel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                45,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jTextFieldResult,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                37,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                69,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jConvert,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jReset,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jClose))
                                                                .addGap(24, 24, 24)));

                pack();
        }

        // Close button action
        private void jCloseActionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
        }

        // Reset button action
        private void jResetActionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAmount.setText(null);
                jTextFieldResult.setText(null);
                jComboBoxFrom.setSelectedIndex(0);
                jComboBoxTo.setSelectedIndex(0);
        }

        // Convert button action
        private void jConvertActionPerformed(java.awt.event.ActionEvent evt) {
                // get the value and convert it to double
                double Egyptian_Pound = Double.parseDouble(jTextFieldAmount.getText());

                if (Egyptian_Pound < 0 || Egyptian_Pound == 0)
                        jTextFieldResult.setText("Error, enter a positive value!");
                else if (jComboBoxFrom.getSelectedIndex() == 0 || jComboBoxTo.getSelectedIndex() == 0)
                        jTextFieldResult.setText("Please, select a specific currency first!");
                else {
                        int getCurrency = jComboBoxTo.getSelectedIndex();

                        switch (getCurrency) {
                                // Dollar
                                case 1: {
                                        String ConvertedValue = String.format("%.2f", Egyptian_Pound * Dollar);
                                        jTextFieldResult.setText(ConvertedValue + " Dollar(s)");
                                        break;
                                }
                                // Euro
                                case 2: {
                                        String ConvertedValue = String.format("%.2f", Egyptian_Pound * Euro);
                                        jTextFieldResult.setText(ConvertedValue + " Euro(s)");
                                        break;
                                }
                                // Pound Sterling
                                case 3: {
                                        String ConvertedValue = String.format("%.2f", Egyptian_Pound * Pund_Sterling);
                                        jTextFieldResult.setText(ConvertedValue + " Pound(s) Sterling");
                                        break;
                                }
                                // Yin
                                case 4: {
                                        String ConvertedValue = String.format("%.2f", Egyptian_Pound * Yin);
                                        jTextFieldResult.setText(ConvertedValue + " Yin(s)");
                                        break;
                                }
                                // Riyal​
                                case 5: {
                                        String ConvertedValue = String.format("%.2f", Egyptian_Pound * Riyal);
                                        jTextFieldResult.setText(ConvertedValue + " Riyal(s)");
                                        break;
                                }
                                // Dinar​
                                case 6: {
                                        String ConvertedValue = String.format("%.2f", Egyptian_Pound * Dinar);
                                        jTextFieldResult.setText(ConvertedValue + " Dinar(s)");
                                        break;
                                }
                                // Dirham​
                                case 7: {
                                        String ConvertedValue = String.format("%.2f", Egyptian_Pound * Dirham);
                                        jTextFieldResult.setText(ConvertedValue + " Dirham(s)");
                                        break;
                                }
                                // Yuan​
                                case 8: {
                                        String ConvertedValue = String.format("%.2f", Egyptian_Pound * Yuan);
                                        jTextFieldResult.setText(ConvertedValue + " Yuan(s)");
                                        break;
                                }
                                default: {
                                        jTextFieldResult.setText("");
                                        break;
                                }
                        }
                }
        }

        // Main function
        public static void main(String args[]) {
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Converter.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Converter.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Converter.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Converter.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }

                // Create and display the form
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Converter().setVisible(true);
                        }
                });
        }

        // Variables declaration
        private javax.swing.JButton jClose;
        private javax.swing.JComboBox<String> jComboBoxFrom;
        private javax.swing.JComboBox<String> jComboBoxTo;
        private javax.swing.JButton jConvert;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JButton jReset;
        private javax.swing.JTextField jTextFieldAmount;
        private javax.swing.JLabel jTextFieldResult;
}