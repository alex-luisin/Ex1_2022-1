package pe.edu.pucp.dgisoft.main;

import java.awt.Font;
import javax.swing.JDialog;

public class frmBusquedaGrupos extends javax.swing.JPanel {

    private JDialog formDialogo;
    
    public frmBusquedaGrupos() {
        initComponents();
        dgvGrupos.getTableHeader().setFont(new Font("Microsoft Sans Serif", 1, 11));
    }
    
    public frmBusquedaGrupos(JDialog formDialogo) {
        initComponents();
        dgvGrupos.getTableHeader().setFont(new Font("Microsoft Sans Serif", 1, 11));
        this.formDialogo = formDialogo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspGrupos = new javax.swing.JScrollPane();
        dgvGrupos = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(927, 340));

        dgvGrupos.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        dgvGrupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Grupo", "Siglas", "Nombre del Grupo", "Sección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspGrupos.setViewportView(dgvGrupos);
        if (dgvGrupos.getColumnModel().getColumnCount() > 0) {
            dgvGrupos.getColumnModel().getColumn(0).setResizable(false);
            dgvGrupos.getColumnModel().getColumn(0).setPreferredWidth(90);
            dgvGrupos.getColumnModel().getColumn(1).setResizable(false);
            dgvGrupos.getColumnModel().getColumn(1).setPreferredWidth(120);
            dgvGrupos.getColumnModel().getColumn(2).setResizable(false);
            dgvGrupos.getColumnModel().getColumn(2).setPreferredWidth(400);
            dgvGrupos.getColumnModel().getColumn(3).setResizable(false);
            dgvGrupos.getColumnModel().getColumn(3).setPreferredWidth(220);
        }

        lblNombre.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblNombre.setText("Ingrese el nombre del grupo de investigación:");

        txtNombre.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N

        btnBuscar.setText("Buscar");

        btnSeleccionar.setText("Seleccionar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspGrupos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addComponent(btnSeleccionar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnSeleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JTable dgvGrupos;
    private javax.swing.JScrollPane jspGrupos;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
