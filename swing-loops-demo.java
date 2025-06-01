import javax.swing.*;
import javax.swing.DefaultListModel;

public class MyForm extends javax.swing.JFrame {
    private DefaultListModel<String> mdl = new DefaultListModel<>();
    
    /**
     * Creates new form MyForm
     */
    public MyForm() {
        initComponents();
        hasil.setModel(mdl);
    }
    
    private void initComponents() {
        jscrollPanel = new javax.swing.JScrollPane();
        hasil = new javax.swing.JList<>();
        bdowhile = new javax.swing.JButton();
        bfor = new javax.swing.JButton();
        bwhile = new javax.swing.JButton();
        jlabell = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Demo Perulangan Java");

        hasil.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Hasil akan muncul di sini" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jscrollPanel.setViewportView(hasil);

        bdowhile.setText("Do-While Loop");
        bdowhile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdowhileActionPerformed(evt);
            }
        });

        bfor.setText("For Loop");
        bfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bforActionPerformed(evt);
            }
        });

        bwhile.setText("While Loop");
        bwhile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bwhileActionPerformed(evt);
            }
        });

        jlabell.setText("Demo Perulangan dengan Java Swing");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bdowhile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bfor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bwhile)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jlabell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.JList.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdowhile)
                    .addComponent(bfor)
                    .addComponent(bwhile))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void bdowhileActionPerformed(java.awt.event.ActionEvent evt) {
        mdl.removeAllElements();
        int i = 0;
        do {
            mdl.addElement("Do-While: " + i);
            i++;
        } while (i <= 10);
    }

    private void bforActionPerformed(java.awt.event.ActionEvent evt) {
        mdl.removeAllElements();
        for (int i = 0; i <= 10; i++) {
            mdl.addElement("For: " + i);
        }
    }

    private void bwhileActionPerformed(java.awt.event.ActionEvent evt) {
        mdl.removeAllElements();
        int i = 0;
        while (i <= 10) {
            mdl.addElement("While: " + i);
            i++;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyForm().setVisible(true);
            }
        });
    }
    
    // Deklarasi komponen GUI
    private javax.swing.JButton bdowhile;
    private javax.swing.JButton bfor;
    private javax.swing.JButton bwhile;
    private javax.swing.JList<String> hasil;
    private javax.swing.JLabel jlabell;
    private javax.swing.JScrollPane jscrollPanel;
}
