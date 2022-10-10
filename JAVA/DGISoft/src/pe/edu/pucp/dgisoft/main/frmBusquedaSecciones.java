package pe.edu.pucp.dgisoft.main;

import java.awt.Font;
import javax.swing.JDialog;

public class frmBusquedaSecciones extends javax.swing.JPanel {

    /*
    Código:
    Nombre:
    */
    private JDialog formDialogo;
    
    public frmBusquedaSecciones() {
        initComponents();
        dgvSecciones.getTableHeader().setFont(new Font("Microsoft Sans Serif", 1, 11));
    }
    
    public frmBusquedaSecciones(JDialog formDialogo) {
        initComponents();
        this.formDialogo = formDialogo;
        dgvSecciones.getTableHeader().setFont(new Font("Microsoft Sans Serif", 1, 11));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspSecciones = new javax.swing.JScrollPane();
        dgvSecciones = new javax.swing.JTable();
        lblBusqueda = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(627, 275));

        dgvSecciones.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        dgvSecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Sección", "Nombre de la Sección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspSecciones.setViewportView(dgvSecciones);
        if (dgvSecciones.getColumnModel().getColumnCount() > 0) {
            dgvSecciones.getColumnModel().getColumn(0).setResizable(false);
            dgvSecciones.getColumnModel().getColumn(0).setPreferredWidth(100);
            dgvSecciones.getColumnModel().getColumn(1).setResizable(false);
            dgvSecciones.getColumnModel().getColumn(1).setPreferredWidth(400);
        }

        lblBusqueda.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblBusqueda.setText("Ingrese el nombre de la sección:");

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
                    .addComponent(jspSecciones)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(btnSeleccionar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusqueda)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnSeleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspSecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JTable dgvSecciones;
    private javax.swing.JScrollPane jspSecciones;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
