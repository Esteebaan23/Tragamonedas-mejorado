
package tragamonedas;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Tragamonedas1 extends javax.swing.JFrame {
    
int aleatorio1,aleatorio2,aleatorio3; 
double cont1,cont2,cont3,cont4,cont5,cont6,a,b,c;
int apuesta,saldo,gana;
String nombre;
AudioClip sonido;


    Timer temporizador =new Timer(300,new ActionListener()
     {
            public void actionPerformed(ActionEvent e)
            {
                cont1+=3.33;
                if(cont1==9.99)
                {
                    cont1=0;
                    cont2++;
                }
    
               
                aleatorio1=(int)(Math.random()*10+1);

                switch(aleatorio1)
                {
                    case 1: lblimagen4.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: lblimagen4.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: lblimagen4.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: lblimagen4.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: lblimagen4.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: lblimagen4.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: lblimagen4.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: lblimagen4.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
                    case 9: lblimagen4.setIcon(new ImageIcon(this.getClass().getResource("9.png")));
                    break;
                    case 10: lblimagen4.setIcon(new ImageIcon(this.getClass().getResource("10.png")));
                    break;
                }
               
                 if(cont2==4)
                 {
                     temporizador.stop();
                      cont2=0;
                      cont4=0;
                      cont6=0;
                   
                        
                      
    
                     
                     if(aleatorio1!=aleatorio2 && aleatorio2!=aleatorio3 && aleatorio1!=aleatorio3)
                     {
                          sonido=java.applet.Applet.newAudioClip(getClass().getResource("/tragamonedas/mal.wav"));
        sonido.play();
                         JOptionPane.showMessageDialog(null,"Pierdes lo apostado");
                      saldo=saldo-apuesta;
                      txtsaldo.setText(String.valueOf(saldo));
                      
                        
                     }
                     else if(aleatorio1==10 && aleatorio2==10 && aleatorio3==10)
                     {
                          sonido=java.applet.Applet.newAudioClip(getClass().getResource("/tragamonedas/gana3.wav"));
        sonido.play();
                         apuesta=apuesta*3;
                         saldo=saldo+apuesta;
                         JOptionPane.showMessageDialog(null,"Ganas el tiple de lo apostado");
                         txtsaldo.setText(String.valueOf(saldo));
                        
                     }
                     else if(aleatorio1==aleatorio2 && aleatorio3==10)
                     {
                          sonido=java.applet.Applet.newAudioClip(getClass().getResource("/tragamonedas/gana1.wav"));
        sonido.play();
                         saldo=saldo+apuesta;
                         JOptionPane.showMessageDialog(null,"Ganas lo apostado");
                        txtsaldo.setText(String.valueOf(saldo));
                     }
                      else if(aleatorio1==aleatorio3 && aleatorio2==10)
                     {
                          sonido=java.applet.Applet.newAudioClip(getClass().getResource("/tragamonedas/gana1.wav"));
        sonido.play();
                        saldo=saldo+apuesta;
                         JOptionPane.showMessageDialog(null,"Ganas lo apostado");
                        txtsaldo.setText(String.valueOf(saldo));
                        
                     }
                      else if(aleatorio3==aleatorio2 && aleatorio1==10)
                     {
                          sonido=java.applet.Applet.newAudioClip(getClass().getResource("/tragamonedas/gana1.wav"));
        sonido.play();
                         saldo=saldo+apuesta;
                         JOptionPane.showMessageDialog(null,"Ganas lo apostado");
                        txtsaldo.setText(String.valueOf(saldo));
                        
                     }
                     
                     else if(aleatorio1==aleatorio2 && aleatorio2==aleatorio3 && aleatorio1==aleatorio3)
                     {
                          sonido=java.applet.Applet.newAudioClip(getClass().getResource("/tragamonedas/gana2.wav"));
        sonido.play();
                         apuesta=apuesta*2;
                         saldo=saldo+apuesta;
                         JOptionPane.showMessageDialog(null,"Ganas el doble de lo apostado");
                         txtsaldo.setText(String.valueOf(saldo));
                        
                     }
                     
                      else if(aleatorio1==aleatorio2 && aleatorio2!=aleatorio3 && aleatorio1!=aleatorio3)
                     {
                          sonido=java.applet.Applet.newAudioClip(getClass().getResource("/tragamonedas/mal.wav"));
        sonido.play();
                         JOptionPane.showMessageDialog(null,"No ganas nada");
                         txtsaldo.setText(String.valueOf(saldo));
                         
                        
                     }
                     
                      else if(aleatorio3==aleatorio2 && aleatorio2!=aleatorio1 && aleatorio1!=aleatorio3)
                     {
                          sonido=java.applet.Applet.newAudioClip(getClass().getResource("/tragamonedas/mal.wav"));
        sonido.play();
                         JOptionPane.showMessageDialog(null,"No ganas nada");
                         txtsaldo.setText(String.valueOf(saldo));
                         
                     }
                     
                     else if(aleatorio3==aleatorio1 && aleatorio2!=aleatorio1 && aleatorio3!=aleatorio2)
                     {
                          sonido=java.applet.Applet.newAudioClip(getClass().getResource("/tragamonedas/mal.wav"));
        sonido.play();
                         JOptionPane.showMessageDialog(null,"No ganas nada");
                         txtsaldo.setText(String.valueOf(saldo));
                        
                        
                     }
                     
                     btnJugar.setIcon(new ImageIcon(this.getClass().getResource("palanca.png")));
                     
                     saldo=Integer.parseInt(txtsaldo.getText());
                     if(saldo<=0)
                     {
                         sonido=java.applet.Applet.newAudioClip(getClass().getResource("/tragamonedas/endgame.wav"));
        sonido.play();
                        JOptionPane.showMessageDialog(null,"Lo sentimos "+nombre+  " no puedes seguir jugando, te quedaste sin dinero"); 
                        System.exit(0);
                         
                     }
                     
                  
                      
                     
              
                     
                     
                     
                     
                 }
             
            }
           
     });
    
     Timer temporizador2 =new Timer(150,new ActionListener()
     {
            public void actionPerformed(ActionEvent e)
            {
               
                 cont3+=2;
                if(cont3==10)
                {
                    cont3=0;
                    cont4++;
                }
                
                aleatorio2=(int)(Math.random()*10+1);

                switch(aleatorio2)
                {
                    case 1: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
                    case 9: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("9.png")));
                    break;
                    case 10: lblimagen2.setIcon(new ImageIcon(this.getClass().getResource("10.png")));
                    break;
                }
                
              
             if(cont4==2)
             {
                 temporizador2.stop();
             }
            }
             
     });
     
     
     
     Timer temporizador3 =new Timer(50,new ActionListener()
     {
            public void actionPerformed(ActionEvent e)
            {
              cont5+=1;
                if(cont5==10)
                {
                    cont5=0;
                    cont6++;
                }
                aleatorio3=(int)(Math.random()*10+1);

                switch(aleatorio3)
                {
                    case 1: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
                    case 9: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("9.png")));
                    break;
                    case 10: lblimagen3.setIcon(new ImageIcon(this.getClass().getResource("10.png")));
                    break;
                }
                
      if(cont6==1)
      {
          temporizador3.stop();
      }
               
            }
            
            
      
     });
     
    
 

    public Tragamonedas1() {
        initComponents();
        this.getContentPane().setBackground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblimagen1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblapuesta = new javax.swing.JLabel();
        lblacumulado = new javax.swing.JLabel();
        txtsaldo = new javax.swing.JTextField();
        jcbapuesta = new javax.swing.JComboBox<>();
        lblimagen2 = new javax.swing.JLabel();
        lblimagen3 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        lblimagen4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblimagen1.setToolTipText("");

        lblapuesta.setForeground(new java.awt.Color(255, 255, 255));
        lblapuesta.setText("Apuesta");

        lblacumulado.setForeground(new java.awt.Color(255, 255, 255));
        lblacumulado.setText("Acumulado");

        txtsaldo.setText("100");
        txtsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsaldoActionPerformed(evt);
            }
        });

        jcbapuesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20", "50", "100" }));
        jcbapuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbapuestaActionPerformed(evt);
            }
        });

        lblimagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/blanco.png"))); // NOI18N

        lblimagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/blanco.png"))); // NOI18N

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/palanca.png"))); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        lblimagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tragamonedas/blanco.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblacumulado)
                        .addGap(81, 81, 81)
                        .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(lblimagen1))
                                    .addComponent(lblimagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel2))
                                    .addComponent(lblimagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblapuesta)
                                .addGap(98, 98, 98)
                                .addComponent(jcbapuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addComponent(lblimagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblimagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblimagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblimagen1)
                                    .addComponent(jLabel2))))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblapuesta))
                            .addComponent(jcbapuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblacumulado))
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
btnJugar.setIcon(new ImageIcon(this.getClass().getResource("palancainv.png")));
sonido=java.applet.Applet.newAudioClip(getClass().getResource("/tragamonedas/apuesta.wav"));
        sonido.play();
        temporizador.start();
        temporizador2.start();
        temporizador3.start();
       
    saldo=Integer.parseInt(txtsaldo.getText());
     String categoria1 = (String) jcbapuesta.getSelectedItem();
     apuesta=Integer.parseInt(categoria1);
         
        
    }//GEN-LAST:event_btnJugarActionPerformed

    private void jcbapuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbapuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbapuestaActionPerformed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
nombre=JOptionPane.showInputDialog("Ingrese nombre");
    }//GEN-LAST:event_formWindowOpened

    private void txtsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaldoActionPerformed
       
    }//GEN-LAST:event_txtsaldoActionPerformed

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
            java.util.logging.Logger.getLogger(Tragamonedas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tragamonedas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tragamonedas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tragamonedas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tragamonedas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> jcbapuesta;
    private javax.swing.JLabel lblacumulado;
    private javax.swing.JLabel lblapuesta;
    private javax.swing.JLabel lblimagen1;
    private javax.swing.JLabel lblimagen2;
    private javax.swing.JLabel lblimagen3;
    private javax.swing.JLabel lblimagen4;
    private javax.swing.JTextField txtsaldo;
    // End of variables declaration//GEN-END:variables
}
