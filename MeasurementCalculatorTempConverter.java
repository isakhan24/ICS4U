/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 335687505
 */
public class KhanIsaMethodsJFrame extends javax.swing.JFrame {

    /**
     * Creates new form KhanIsaMethodsJFrame
     */
    public KhanIsaMethodsJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        Quit = new javax.swing.JButton();
        FahrenheitInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        calculateFToC = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        celciusOutput = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        conversionClear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CelciusInput = new javax.swing.JTextField();
        calculateCToF = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        conversionClear2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        hInput = new javax.swing.JTextField();
        wInput = new javax.swing.JTextField();
        lInput = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Calculate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        sARP = new javax.swing.JLabel();
        vRP = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        radiusInput = new javax.swing.JTextField();
        heightInput = new javax.swing.JTextField();
        caluculateCylinder = new javax.swing.JButton();
        clearCylinder = new javax.swing.JButton();
        csA = new javax.swing.JLabel();
        cV = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Isa's Calculator & Converter");
        setBackground(new java.awt.Color(240, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(850, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Temperature Converter");

        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });

        FahrenheitInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FahrenheitInputActionPerformed(evt);
            }
        });

        jLabel2.setText("Fahrenheit:");

        calculateFToC.setText("Calculate");
        calculateFToC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateFToCActionPerformed(evt);
            }
        });

        jLabel3.setText("Celcius:");

        jLabel5.setText("          ");

        conversionClear.setText("Clear");
        conversionClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversionClearActionPerformed(evt);
            }
        });

        jLabel6.setText("Celcius:");

        CelciusInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelciusInputActionPerformed(evt);
            }
        });

        calculateCToF.setText("Calculate");
        calculateCToF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateCToFActionPerformed(evt);
            }
        });

        jLabel7.setText("Fahrenheit:");

        conversionClear2.setText("Clear");
        conversionClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversionClear2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Surface Area and Volume Calculator");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Shape:");

        jLabel11.setText("Rectangular Prism:");

        jLabel12.setText("L:");

        jLabel13.setText("W:");

        jLabel14.setText("H:");

        hInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hInputActionPerformed(evt);
            }
        });

        lInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lInputActionPerformed(evt);
            }
        });

        jLabel15.setText("Surface Area:");

        jLabel16.setText("Volume:");

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Cylinder:");

        jLabel17.setText("Radius:");

        jLabel18.setText("Height:");

        radiusInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiusInputActionPerformed(evt);
            }
        });

        caluculateCylinder.setText("Calculate");
        caluculateCylinder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caluculateCylinderActionPerformed(evt);
            }
        });

        clearCylinder.setText("Clear");
        clearCylinder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCylinderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Quit)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celciusOutput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CelciusInput, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FahrenheitInput, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calculateFToC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calculateCToF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(caluculateCylinder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(conversionClear2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(conversionClear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(sARP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vRP)
                                            .addComponent(jLabel16)
                                            .addComponent(cV)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(csA)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel9))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(lInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radiusInput)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(hInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(106, 106, 106)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(heightInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(122, 122, 122)
                                        .addComponent(clearCylinder)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(1, 1, 1)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(wInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(hInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calculate)
                    .addComponent(jLabel11)
                    .addComponent(jButton1)
                    .addComponent(sARP)
                    .addComponent(vRP))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(radiusInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caluculateCylinder)
                    .addComponent(clearCylinder)
                    .addComponent(csA)
                    .addComponent(cV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FahrenheitInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculateFToC)
                    .addComponent(jLabel3)
                    .addComponent(conversionClear)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(celciusOutput)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CelciusInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculateCToF)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(conversionClear2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Quit)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QuitActionPerformed

    private void FahrenheitInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FahrenheitInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FahrenheitInputActionPerformed

    private void calculateFToCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateFToCActionPerformed
        // TODO add your handling code here:
        String input = FahrenheitInput.getText();
        double f = Double.parseDouble(input);
        String output = fahrenheitToCelcius(f);
        double rounded = Double.parseDouble(output);
        rounded = Math.round(rounded * 100) / 100.0;
        jLabel5.setText(String.valueOf(rounded) +"\u00B0C");
    }//GEN-LAST:event_calculateFToCActionPerformed

    private void conversionClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversionClearActionPerformed
        // TODO add your handling code here:
        FahrenheitInput.setText("");
        FahrenheitInput.grabFocus();
        jLabel5.setText("");
    }//GEN-LAST:event_conversionClearActionPerformed

    private void CelciusInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelciusInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelciusInputActionPerformed

    private void calculateCToFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateCToFActionPerformed
        // TODO add your handling code here:
        String input = CelciusInput.getText();
        double c = Double.parseDouble(input);
        String output = celciusToFahrenheit(c);
        double rounded = Double.parseDouble(output);
        rounded = Math.round(rounded * 100) / 100.0;
        jLabel8.setText(String.valueOf(rounded) +"\u00B0F");
    }//GEN-LAST:event_calculateCToFActionPerformed

    private void conversionClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversionClear2ActionPerformed
        // TODO add your handling code here:
        CelciusInput.setText("");
        CelciusInput.grabFocus();
        jLabel8.setText("");
    }//GEN-LAST:event_conversionClear2ActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        String len = lInput.getText(); String width = wInput.getText(); String height = hInput.getText();
        double l = Double.parseDouble(len); double w = Double.parseDouble(len); double h = Double.parseDouble(height);
        
        String outputV = RPVolume(w,h,l);
        double roundedV = Double.parseDouble(outputV);
        roundedV = Math.round(roundedV * 100) / 100.0;
        vRP.setText(String.valueOf(roundedV) +"u\u00B3");
        
        String outputSA = RPSurfaceArea(w,h, l);
        double roundedSA = Double.parseDouble(outputSA);
        roundedSA = Math.round(roundedSA * 100) / 100.0;
        sARP.setText(String.valueOf(roundedSA) +"u\u00B2");
    }//GEN-LAST:event_CalculateActionPerformed

    private void lInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lInputActionPerformed

    private void hInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        lInput.setText("");
        lInput.grabFocus();
        hInput.setText("");
        wInput.setText("");
        sARP.setText("");
        vRP.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radiusInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiusInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiusInputActionPerformed

    private void caluculateCylinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caluculateCylinderActionPerformed
        // TODO add your handling code here:
        String radius = radiusInput.getText(); String height = heightInput.getText();
        double r = Double.parseDouble(radius); double h = Double.parseDouble(height);
        
        String outputsA = cSurfaceArea(r,h);
        double roundedsA = Double.parseDouble(outputsA);
        roundedsA = Math.round(roundedsA * 100) / 100.0;
        csA.setText(String.valueOf(roundedsA)+"u\u00B2");
        
        String outputV = cVolume(r,h);
        double roundedV = Double.parseDouble(outputV);
        roundedV = Math.round(roundedV * 100) / 100.0;
        cV.setText(String.valueOf(roundedV) +"u\u00B3");
    }//GEN-LAST:event_caluculateCylinderActionPerformed

    private void clearCylinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCylinderActionPerformed
        // TODO add your handling code here: 
        radiusInput.setText("");
        radiusInput.grabFocus();
        heightInput.setText("");

        csA.setText("");
        cV.setText("");
    }//GEN-LAST:event_clearCylinderActionPerformed
    public static String fahrenheitToCelcius (double f) {
        double c = (f - 32) * 5 / 9;
        String celcius = String.valueOf(c);
        return celcius;
    }
     
    public static String celciusToFahrenheit (double c) {
        double f = c * 9 / 5 + 32;
        String fahrenheit = String.valueOf(f);
        return fahrenheit;
    }
        public static String RPSurfaceArea (double w, double l, double h) {
        double sA = 2*((w*l)+(h*l)+(h*w));
        String surfaceArea = String.valueOf(sA);
        return surfaceArea;
}
        public static String RPVolume (double w, double l, double h) {
        double V = l*w*h;
        String volume = String.valueOf(V);
        return volume;
}
        public static String cSurfaceArea (double r, double h) {
        double sA = (2 * Math.PI * r * h)+(2 * Math.PI * Math.pow(r, 2));
        String surfaceArea = String.valueOf(sA);
        return surfaceArea;
    }
        public static String cVolume (double r, double h) {
        double v = Math.PI * Math.pow(r, 2) * h;
        String volume = String.valueOf(v);
        return volume;
    }
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
            java.util.logging.Logger.getLogger(KhanIsaMethodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhanIsaMethodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhanIsaMethodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhanIsaMethodsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhanIsaMethodsJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JTextField CelciusInput;
    private javax.swing.JTextField FahrenheitInput;
    private javax.swing.JButton Quit;
    private javax.swing.JLabel cV;
    private javax.swing.JButton calculateCToF;
    private javax.swing.JButton calculateFToC;
    private javax.swing.JButton caluculateCylinder;
    private javax.swing.JLabel celciusOutput;
    private javax.swing.JButton clearCylinder;
    private javax.swing.JButton conversionClear;
    private javax.swing.JButton conversionClear2;
    private javax.swing.JLabel csA;
    private javax.swing.JTextField hInput;
    private javax.swing.JTextField heightInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lInput;
    private javax.swing.JTextField radiusInput;
    private javax.swing.JLabel sARP;
    private javax.swing.JLabel vRP;
    private javax.swing.JTextField wInput;
    // End of variables declaration//GEN-END:variables
}
