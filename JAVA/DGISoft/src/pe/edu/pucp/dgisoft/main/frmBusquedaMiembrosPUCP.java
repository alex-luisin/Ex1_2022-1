package pe.edu.pucp.dgisoft.main;

import java.awt.Font;
import javax.swing.JDialog;

public class frmBusquedaMiembrosPUCP extends javax.swing.JPanel {

    private JDialog formDialogo;
    
    public frmBusquedaMiembrosPUCP() {
        initComponents();
        dgvMiembrosPUCP.getTableHeader().setFont(new Font("Microsoft Sans Serif", 1, 11));
    }
    
    public frmBusquedaMiembrosPUCP(JDialog formDialogo) {
        initComponents();
        this.formDialogo = formDialogo;
        dgvMiembrosPUCP.getTableHeader().setFont(new Font("Microsoft Sans Serif", 1, 11));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspMiembrosPUCP = new javax.swing.JScrollPane();
        dgvMiembrosPUCP = new javax.swing.JTable();
        lblNombreCodigo = new javax.swing.JLabel();
        txtNombreCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(768, 296));

        dgvMiembrosPUCP.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        dgvMiembrosPUCP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código PUCP", "Tipo", "Nombre Completo", "Categoría/CRAEST"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspMiembrosPUCP.setViewportView(dgvMiembrosPUCP);
        if (dgvMiembrosPUCP.getColumnModel().getColumnCount() > 0) {
            dgvMiembrosPUCP.getColumnModel().getColumn(0).setResizable(false);
            dgvMiembrosPUCP.getColumnModel().getColumn(0).setPreferredWidth(120);
            dgvMiembrosPUCP.getColumnModel().getColumn(1).setResizable(false);
            dgvMiembrosPUCP.getColumnModel().getColumn(1).setPreferredWidth(100);
            dgvMiembrosPUCP.getColumnModel().getColumn(2).setResizable(false);
            dgvMiembrosPUCP.getColumnModel().getColumn(2).setPreferredWidth(300);
            dgvMiembrosPUCP.getColumnModel().getColumn(3).setResizable(false);
            dgvMiembrosPUCP.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        lblNombreCodigo.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblNombreCodigo.setText("Ingrese el nombre/código del Miembro PUCP:");

        txtNombreCodigo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N

        btnBuscar.setText("Buscar");

        btnSeleccionar.setText("Seleccionar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspMiembrosPUCP)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(btnSeleccionar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCodigo)
                    .addComponent(txtNombreCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnSeleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspMiembrosPUCP, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JTable dgvMiembrosPUCP;
    private javax.swing.JScrollPane jspMiembrosPUCP;
    private javax.swing.JLabel lblNombreCodigo;
    private javax.swing.JTextField txtNombreCodigo;
    // End of variables declaration//GEN-END:variables
}
