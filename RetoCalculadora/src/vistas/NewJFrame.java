package vistas;

import controladores.operaciones;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        printer = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sumar = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        nueve2 = new javax.swing.JButton();
        igual1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        nueve1 = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        restar = new javax.swing.JButton();

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField1.setText("1");
        jTextField1.setToolTipText("");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField2.setText("1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(157, 179, 238));

        printer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printer.setForeground(new java.awt.Color(11, 22, 64));
        printer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        printer.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        resultado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        resultado.setForeground(new java.awt.Color(11, 22, 64));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(printer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(printer, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 180));

        jPanel3.setBackground(new java.awt.Color(249, 249, 249));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sumar.setBackground(new java.awt.Color(249, 249, 249));
        sumar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sumar.setForeground(new java.awt.Color(102, 102, 102));
        sumar.setText("+");
        sumar.setBorder(null);
        sumar.setContentAreaFilled(false);
        sumar.setFocusPainted(false);
        sumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sumar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });
        jPanel3.add(sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 73, 80));

        siete.setBackground(new java.awt.Color(249, 249, 249));
        siete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        siete.setForeground(new java.awt.Color(102, 102, 102));
        siete.setText("7");
        siete.setBorder(null);
        siete.setContentAreaFilled(false);
        siete.setFocusPainted(false);
        siete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        siete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        jPanel3.add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 73, 80));

        ocho.setBackground(new java.awt.Color(249, 249, 249));
        ocho.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ocho.setForeground(new java.awt.Color(102, 102, 102));
        ocho.setText("8");
        ocho.setBorder(null);
        ocho.setContentAreaFilled(false);
        ocho.setFocusPainted(false);
        ocho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ocho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        jPanel3.add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 73, 80));

        cuatro.setBackground(new java.awt.Color(249, 249, 249));
        cuatro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cuatro.setForeground(new java.awt.Color(102, 102, 102));
        cuatro.setText("4");
        cuatro.setBorder(null);
        cuatro.setContentAreaFilled(false);
        cuatro.setFocusPainted(false);
        cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        jPanel3.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 73, 80));

        uno.setBackground(new java.awt.Color(249, 249, 249));
        uno.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        uno.setForeground(new java.awt.Color(102, 102, 102));
        uno.setText("1");
        uno.setBorder(null);
        uno.setContentAreaFilled(false);
        uno.setFocusPainted(false);
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        jPanel3.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 73, 80));

        cinco.setBackground(new java.awt.Color(249, 249, 249));
        cinco.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cinco.setForeground(new java.awt.Color(102, 102, 102));
        cinco.setText("5");
        cinco.setBorder(null);
        cinco.setContentAreaFilled(false);
        cinco.setFocusPainted(false);
        cinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        jPanel3.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 73, 80));

        seis.setBackground(new java.awt.Color(249, 249, 249));
        seis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        seis.setForeground(new java.awt.Color(102, 102, 102));
        seis.setText("6");
        seis.setBorder(null);
        seis.setContentAreaFilled(false);
        seis.setFocusPainted(false);
        seis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel3.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 73, 80));

        dos.setBackground(new java.awt.Color(249, 249, 249));
        dos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dos.setForeground(new java.awt.Color(102, 102, 102));
        dos.setText("2");
        dos.setBorder(null);
        dos.setContentAreaFilled(false);
        dos.setFocusPainted(false);
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        jPanel3.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 73, 80));

        tres.setBackground(new java.awt.Color(249, 249, 249));
        tres.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tres.setForeground(new java.awt.Color(102, 102, 102));
        tres.setText("3");
        tres.setBorder(null);
        tres.setContentAreaFilled(false);
        tres.setFocusPainted(false);
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        jPanel3.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 73, 80));

        cero.setBackground(new java.awt.Color(249, 249, 249));
        cero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cero.setForeground(new java.awt.Color(102, 102, 102));
        cero.setText("0");
        cero.setBorder(null);
        cero.setContentAreaFilled(false);
        cero.setFocusPainted(false);
        cero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        jPanel3.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 73, 80));

        nueve2.setBackground(new java.awt.Color(249, 249, 249));
        nueve2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nueve2.setForeground(new java.awt.Color(102, 102, 102));
        nueve2.setText("9");
        nueve2.setBorder(null);
        nueve2.setContentAreaFilled(false);
        nueve2.setFocusPainted(false);
        nueve2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nueve2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        nueve2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueve2ActionPerformed(evt);
            }
        });
        jPanel3.add(nueve2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 73, 80));

        igual1.setBackground(new java.awt.Color(249, 249, 249));
        igual1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        igual1.setForeground(new java.awt.Color(102, 102, 102));
        igual1.setText("=");
        igual1.setBorder(null);
        igual1.setContentAreaFilled(false);
        igual1.setFocusPainted(false);
        igual1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        igual1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        igual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igual1ActionPerformed(evt);
            }
        });
        jPanel3.add(igual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 73, 80));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 210, 320));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nueve1.setBackground(new java.awt.Color(249, 249, 249));
        nueve1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nueve1.setForeground(new java.awt.Color(102, 102, 102));
        nueve1.setText("9");
        nueve1.setBorder(null);
        nueve1.setContentAreaFilled(false);
        nueve1.setFocusPainted(false);
        nueve1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nueve1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        nueve1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueve1ActionPerformed(evt);
            }
        });
        jPanel4.add(nueve1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 73, 80));

        multiplicar.setBackground(new java.awt.Color(255, 255, 255));
        multiplicar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        multiplicar.setForeground(new java.awt.Color(102, 102, 102));
        multiplicar.setText("x");
        multiplicar.setActionCommand("");
        multiplicar.setBorder(null);
        multiplicar.setContentAreaFilled(false);
        multiplicar.setFocusPainted(false);
        multiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiplicar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });
        jPanel4.add(multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 73, 80));

        borrar.setBackground(new java.awt.Color(255, 255, 255));
        borrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        borrar.setForeground(new java.awt.Color(102, 102, 102));
        borrar.setText("C");
        borrar.setBorder(null);
        borrar.setContentAreaFilled(false);
        borrar.setFocusPainted(false);
        borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel4.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 73, 80));

        dividir.setBackground(new java.awt.Color(255, 255, 255));
        dividir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dividir.setForeground(new java.awt.Color(102, 102, 102));
        dividir.setText("÷");
        dividir.setBorder(null);
        dividir.setContentAreaFilled(false);
        dividir.setFocusPainted(false);
        dividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dividir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });
        jPanel4.add(dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 73, 80));

        restar.setBackground(new java.awt.Color(255, 255, 255));
        restar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        restar.setForeground(new java.awt.Color(102, 102, 102));
        restar.setText("-");
        restar.setBorder(null);
        restar.setContentAreaFilled(false);
        restar.setFocusPainted(false);
        restar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        restar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });
        jPanel4.add(restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 73, 80));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 70, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public float num1;
    public float num2;
    public String operador;
    

    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed
        num1 = Float.parseFloat(resultado.getText());
        operador = "+";
        addnumber("+");
        resultado.setText("");


    }//GEN-LAST:event_sumarActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        addnumber("7");
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        addnumber("8");
    }//GEN-LAST:event_ochoActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        num1 = Float.parseFloat(resultado.getText());
        operador = "x";
        addnumber("x");
        resultado.setText("");
    }//GEN-LAST:event_multiplicarActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        addnumber("4");
    }//GEN-LAST:event_cuatroActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        addnumber("1");
    }//GEN-LAST:event_unoActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        addnumber("5");
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        addnumber("6");
    }//GEN-LAST:event_seisActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        addnumber("2");
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        addnumber("3");
    }//GEN-LAST:event_tresActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        addnumber("0");
    }//GEN-LAST:event_ceroActionPerformed

    private void nueve1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueve1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nueve1ActionPerformed

    private void nueve2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueve2ActionPerformed
        addnumber("9");
    }//GEN-LAST:event_nueve2ActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        printer.setText("");
        resultado.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        num1 = Float.parseFloat(resultado.getText());
        operador = "÷";
        addnumber("÷");
        resultado.setText("");
    }//GEN-LAST:event_dividirActionPerformed

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
        num1 = Float.parseFloat(resultado.getText());
        operador = "-";
        addnumber("-");
        resultado.setText("");

    }//GEN-LAST:event_restarActionPerformed

    private void igual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igual1ActionPerformed
        try {
             num2 = Float.parseFloat(resultado.getText());
        operaciones ope1 = new operaciones(num1, num2);
        
        switch (operador) {
            case "+":
                resultado.setText(Float.toString(ope1.suma()));
                break;
            case "-":
                resultado.setText(Float.toString(ope1.resta()));
                break;
            case "x":
                resultado.setText(Float.toString(ope1.multiplicacion()));
                break;
            case "÷":
                if (num2 == 0){
                    printer.setText("");
                    resultado.setText("Math Error");
                }else{
                resultado.setText(Float.toString(ope1.division()));}
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "error en operadores");
                break;
        }
        } catch (NumberFormatException e) {
            resultado.setText("");
            JOptionPane.showMessageDialog(rootPane, "ingrese los numeros\ncorrectamente");
        }
        

    }//GEN-LAST:event_igual1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });

    }

    public void addnumber(String digito) {
        printer.setText(printer.getText() + digito);
        resultado.setText(resultado.getText() + digito);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dividir;
    private javax.swing.JButton dos;
    private javax.swing.JButton igual1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton nueve1;
    private javax.swing.JButton nueve2;
    private javax.swing.JButton ocho;
    private javax.swing.JLabel printer;
    private javax.swing.JButton restar;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton sumar;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
