package pe.edu.pucp.dgisoft.main;

import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

public class frmGestionGrupos extends javax.swing.JPanel {
    
    /*
    Código:
    Nombre:
    */
    
    private File archivoFoto;
    private File archivoPDF;
    private Estado estado;
    
    public frmGestionGrupos() {
        initComponents();
        dgvIntegrantes.getTableHeader().setFont(new Font("Microsoft Sans Serif", 1, 11));
        colocarIconos();
        limpiarComponentes();
        estado = Estado.Inicial;
        establecerEstadoComponentes();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ofdFoto = new javax.swing.JFileChooser();
        bgInterdisciplinario = new javax.swing.ButtonGroup();
        ofdArchivo = new javax.swing.JFileChooser();
        tsMenu = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        tbInformacionGrupo = new javax.swing.JTabbedPane();
        tabDatosGenerales = new javax.swing.JPanel();
        lblNombreGrupo = new javax.swing.JLabel();
        txtNombreGrupo = new javax.swing.JTextField();
        lblSiglas = new javax.swing.JLabel();
        txtSiglas = new javax.swing.JTextField();
        lblAnho = new javax.swing.JLabel();
        dtpAnho = new com.toedter.calendar.JYearChooser();
        lblInterdisciplinario = new javax.swing.JLabel();
        rbSiInterdisciplinario = new javax.swing.JRadioButton();
        rbNoInterdisciplinario = new javax.swing.JRadioButton();
        lblSeccion = new javax.swing.JLabel();
        txtSeccion = new javax.swing.JTextField();
        btnBuscarSeccion = new javax.swing.JButton();
        pbFoto = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jspDescripcion = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnSubirFoto = new javax.swing.JButton();
        lblArchivo = new javax.swing.JLabel();
        txtRutaArchivoPDF = new javax.swing.JTextField();
        btnSubirArchivo = new javax.swing.JButton();
        btnDescargarArchivo = new javax.swing.JButton();
        tbIntegrantes = new javax.swing.JPanel();
        jspIntegrantes = new javax.swing.JScrollPane();
        dgvIntegrantes = new javax.swing.JTable();
        lblCodigoPUCP = new javax.swing.JLabel();
        lblNombreCompleto = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        txtCodigoPUCP = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBuscarIntegrante = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(794, 466));

        tsMenu.setFloatable(false);
        tsMenu.setRollover(true);

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        tsMenu.add(btnNuevo);

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tsMenu.add(btnGuardar);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        tsMenu.add(btnBuscar);

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusable(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        tsMenu.add(btnCancelar);

        lblTitulo.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        lblTitulo.setText("Gestión de Grupos de Investigación PUCP");

        tbInformacionGrupo.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N

        lblNombreGrupo.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblNombreGrupo.setText("Nombre del Grupo:");

        txtNombreGrupo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N

        lblSiglas.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblSiglas.setText("Siglas:");

        txtSiglas.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N

        lblAnho.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblAnho.setText("Año de Fundación:");

        lblInterdisciplinario.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblInterdisciplinario.setText("Interdisciplinario:");

        bgInterdisciplinario.add(rbSiInterdisciplinario);
        rbSiInterdisciplinario.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        rbSiInterdisciplinario.setText("Sí");

        bgInterdisciplinario.add(rbNoInterdisciplinario);
        rbNoInterdisciplinario.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        rbNoInterdisciplinario.setText("No");

        lblSeccion.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblSeccion.setText("Sección:");

        txtSeccion.setEditable(false);
        txtSeccion.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N

        btnBuscarSeccion.setText("...");

        pbFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFoto.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblFoto.setText("Foto del Grupo:");

        lblDescripcion.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblDescripcion.setText("Descripción:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        jspDescripcion.setViewportView(txtDescripcion);

        btnSubirFoto.setText("Subir Foto");
        btnSubirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirFotoActionPerformed(evt);
            }
        });

        lblArchivo.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblArchivo.setText("Archivo PDF Información Adicional:");

        txtRutaArchivoPDF.setEditable(false);
        txtRutaArchivoPDF.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N

        btnSubirArchivo.setText("Subir");
        btnSubirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirArchivoActionPerformed(evt);
            }
        });

        btnDescargarArchivo.setText("Descargar");
        btnDescargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabDatosGeneralesLayout = new javax.swing.GroupLayout(tabDatosGenerales);
        tabDatosGenerales.setLayout(tabDatosGeneralesLayout);
        tabDatosGeneralesLayout.setHorizontalGroup(
            tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDatosGeneralesLayout.createSequentialGroup()
                .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabDatosGeneralesLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInterdisciplinario)
                            .addComponent(lblAnho)
                            .addComponent(lblSiglas)
                            .addComponent(lblNombreGrupo)
                            .addComponent(lblSeccion))
                        .addGap(18, 18, 18)
                        .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreGrupo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabDatosGeneralesLayout.createSequentialGroup()
                                .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabDatosGeneralesLayout.createSequentialGroup()
                                        .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSiglas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtpAnho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabDatosGeneralesLayout.createSequentialGroup()
                                        .addComponent(rbSiInterdisciplinario)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbNoInterdisciplinario)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(tabDatosGeneralesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tabDatosGeneralesLayout.createSequentialGroup()
                                .addComponent(lblFoto)
                                .addGap(121, 121, 121)
                                .addComponent(btnSubirFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jspDescripcion)
                            .addComponent(txtRutaArchivoPDF)
                            .addGroup(tabDatosGeneralesLayout.createSequentialGroup()
                                .addComponent(lblDescripcion)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(tabDatosGeneralesLayout.createSequentialGroup()
                                .addComponent(lblArchivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(btnSubirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDescargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        tabDatosGeneralesLayout.setVerticalGroup(
            tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDatosGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreGrupo)
                    .addComponent(txtNombreGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSiglas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSiglas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnho)
                    .addComponent(dtpAnho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInterdisciplinario)
                    .addComponent(rbSiInterdisciplinario)
                    .addComponent(rbNoInterdisciplinario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeccion)
                    .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarSeccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFoto)
                    .addComponent(btnSubirFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabDatosGeneralesLayout.createSequentialGroup()
                        .addComponent(lblDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jspDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArchivo)
                            .addComponent(btnDescargarArchivo)
                            .addComponent(btnSubirArchivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRutaArchivoPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbInformacionGrupo.addTab("Datos Generales", tabDatosGenerales);

        dgvIntegrantes.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        dgvIntegrantes.setModel(new javax.swing.table.DefaultTableModel(
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
        jspIntegrantes.setViewportView(dgvIntegrantes);
        if (dgvIntegrantes.getColumnModel().getColumnCount() > 0) {
            dgvIntegrantes.getColumnModel().getColumn(0).setResizable(false);
            dgvIntegrantes.getColumnModel().getColumn(0).setPreferredWidth(120);
            dgvIntegrantes.getColumnModel().getColumn(1).setResizable(false);
            dgvIntegrantes.getColumnModel().getColumn(1).setPreferredWidth(100);
            dgvIntegrantes.getColumnModel().getColumn(2).setResizable(false);
            dgvIntegrantes.getColumnModel().getColumn(2).setPreferredWidth(300);
            dgvIntegrantes.getColumnModel().getColumn(3).setResizable(false);
            dgvIntegrantes.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        lblCodigoPUCP.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblCodigoPUCP.setText("Código PUCP:");

        lblNombreCompleto.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        lblNombreCompleto.setText("Nombre Completo:");

        txtNombreCompleto.setEditable(false);
        txtNombreCompleto.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N

        txtCodigoPUCP.setEditable(false);
        txtCodigoPUCP.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N

        btnEliminar.setText("-");

        btnAgregar.setText("+");

        btnBuscarIntegrante.setText("...");

        javax.swing.GroupLayout tbIntegrantesLayout = new javax.swing.GroupLayout(tbIntegrantes);
        tbIntegrantes.setLayout(tbIntegrantesLayout);
        tbIntegrantesLayout.setHorizontalGroup(
            tbIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbIntegrantesLayout.createSequentialGroup()
                .addGroup(tbIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbIntegrantesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jspIntegrantes))
                    .addGroup(tbIntegrantesLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(tbIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombreCompleto)
                            .addComponent(lblCodigoPUCP))
                        .addGap(18, 18, 18)
                        .addGroup(tbIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tbIntegrantesLayout.createSequentialGroup()
                                .addComponent(txtCodigoPUCP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(tbIntegrantesLayout.createSequentialGroup()
                                .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)))))
                .addContainerGap())
        );
        tbIntegrantesLayout.setVerticalGroup(
            tbIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbIntegrantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoPUCP)
                    .addComponent(txtCodigoPUCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIntegrante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreCompleto)
                    .addComponent(btnEliminar)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jspIntegrantes, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbInformacionGrupo.addTab("Integrantes", tbIntegrantes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tsMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbInformacionGrupo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbInformacionGrupo)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarComponentes(){
        txtNombreGrupo.setText("");
        txtSiglas.setText("");
        dtpAnho.setValue(Calendar.getInstance().get(Calendar.YEAR));
        rbSiInterdisciplinario.setSelected(false);
        rbNoInterdisciplinario.setSelected(false);
        txtSeccion.setText("");
        pbFoto.setIcon(null);
        txtDescripcion.setText("");
        txtRutaArchivoPDF.setText("");
        txtCodigoPUCP.setText("");
        txtNombreCompleto.setText("");
        /*
        this.grupoInvestigacion = new GrupoInvestigacion();
        this.grupoInvestigacion.setIntegrantes(new ArrayList<>());
        modeloTblIntegrantes.setRowCount(0);
        */
    }
    public void establecerEstadoComponentes(){
        switch(estado){
            case Inicial:
                btnNuevo.setEnabled(true);
                btnGuardar.setEnabled(false);
                btnBuscar.setEnabled(true);
                btnCancelar.setEnabled(false);
                txtNombreGrupo.setEnabled(false);
                txtNombreGrupo.setEditable(false);
                txtSiglas.setEnabled(false);
                txtSiglas.setEditable(false);
                dtpAnho.setEnabled(false);
                rbSiInterdisciplinario.setEnabled(false);
                rbNoInterdisciplinario.setEnabled(false);
                txtSeccion.setEnabled(false);
                txtNombreGrupo.setEditable(false);
                btnBuscarSeccion.setEnabled(false);
                pbFoto.setEnabled(false);
                btnSubirFoto.setEnabled(false);
                txtDescripcion.setEnabled(false);
                txtDescripcion.setEditable(false);
                lblNombreGrupo.setEnabled(false);
                lblSiglas.setEnabled(false);
                lblAnho.setEnabled(false);
                lblInterdisciplinario.setEnabled(false);
                lblSeccion.setEnabled(false);
                lblFoto.setEnabled(false);
                lblDescripcion.setEnabled(false);
                lblCodigoPUCP.setEnabled(false);
                lblNombreCompleto.setEnabled(false);
                txtCodigoPUCP.setEnabled(false);
                txtCodigoPUCP.setEditable(false);
                txtNombreCompleto.setEnabled(false);
                txtNombreCompleto.setEditable(false);
                lblArchivo.setEnabled(false);
                btnSubirArchivo.setEnabled(false);
                txtRutaArchivoPDF.setEnabled(false);
                txtRutaArchivoPDF.setEditable(false);
                btnDescargarArchivo.setEnabled(false);
                btnBuscarIntegrante.setEnabled(false);
                btnAgregar.setEnabled(false);
                btnEliminar.setEnabled(false);
                dgvIntegrantes.setEnabled(false);
                break;
            case Nuevo:
                btnNuevo.setEnabled(false);
                btnGuardar.setEnabled(true);
                btnBuscar.setEnabled(false);
                btnCancelar.setEnabled(true);
                txtNombreGrupo.setEnabled(true);
                txtNombreGrupo.setEditable(true);
                txtSiglas.setEnabled(true);
                txtSiglas.setEditable(true);
                dtpAnho.setEnabled(true);
                rbSiInterdisciplinario.setEnabled(true);
                rbNoInterdisciplinario.setEnabled(true);
                txtSeccion.setEnabled(true);
                txtSeccion.setEditable(false);
                btnBuscarSeccion.setEnabled(true);
                pbFoto.setEnabled(true);
                btnSubirFoto.setEnabled(true);
                txtDescripcion.setEnabled(true);
                txtDescripcion.setEditable(true);
                lblNombreGrupo.setEnabled(true);
                lblSiglas.setEnabled(true);
                lblAnho.setEnabled(true);
                lblInterdisciplinario.setEnabled(true);
                lblSeccion.setEnabled(true);
                lblFoto.setEnabled(true);
                lblDescripcion.setEnabled(true);
                lblCodigoPUCP.setEnabled(true);
                lblNombreCompleto.setEnabled(true);
                txtCodigoPUCP.setEnabled(true);
                txtCodigoPUCP.setEditable(false);
                txtNombreCompleto.setEnabled(true);
                txtNombreCompleto.setEditable(false);
                lblArchivo.setEnabled(true);
                btnSubirArchivo.setEnabled(true);
                txtRutaArchivoPDF.setEnabled(true);
                txtRutaArchivoPDF.setEditable(false);
                btnDescargarArchivo.setEnabled(false);
                btnBuscarIntegrante.setEnabled(true);
                btnAgregar.setEnabled(true);
                btnEliminar.setEnabled(true);
                dgvIntegrantes.setEnabled(true);
                break;
            case Buscar:
            case Guardar:
                btnNuevo.setEnabled(false);
                btnGuardar.setEnabled(false);
                btnBuscar.setEnabled(false);
                btnCancelar.setEnabled(true);
                txtNombreGrupo.setEnabled(true);
                txtNombreGrupo.setEditable(false);
                txtSiglas.setEnabled(true);
                txtSiglas.setEditable(false);
                dtpAnho.setEnabled(false);
                rbSiInterdisciplinario.setEnabled(false);
                rbNoInterdisciplinario.setEnabled(false);
                txtSeccion.setEnabled(true);
                txtSeccion.setEditable(false);
                btnBuscarSeccion.setEnabled(false);
                pbFoto.setEnabled(true);
                btnSubirFoto.setEnabled(false);
                txtDescripcion.setEnabled(true);
                txtDescripcion.setEditable(false);
                lblNombreGrupo.setEnabled(true);
                lblSiglas.setEnabled(true);
                lblAnho.setEnabled(true);
                lblInterdisciplinario.setEnabled(true);
                lblSeccion.setEnabled(true);
                lblFoto.setEnabled(true);
                lblDescripcion.setEnabled(true);
                lblCodigoPUCP.setEnabled(true);
                lblNombreCompleto.setEnabled(true);
                txtCodigoPUCP.setEnabled(true);
                txtCodigoPUCP.setEditable(false);
                txtNombreCompleto.setEnabled(true);
                txtNombreCompleto.setEditable(false);
                lblArchivo.setEnabled(true);
                btnSubirArchivo.setEnabled(false);
                txtRutaArchivoPDF.setEnabled(false);
                txtRutaArchivoPDF.setEditable(false);
                btnDescargarArchivo.setEnabled(true);
                btnBuscarIntegrante.setEnabled(false);
                btnAgregar.setEnabled(false);
                btnEliminar.setEnabled(false);
                dgvIntegrantes.setEnabled(true);
                break;
        }
    }
    
    private void btnSubirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirFotoActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG","PNG","jpg","png");
        ofdFoto.setFileFilter(filtro);
        int resultado = ofdFoto.showOpenDialog(null);
        if(resultado == JFileChooser.APPROVE_OPTION){
            try{
                archivoFoto = ofdFoto.getSelectedFile();
                Image img = new ImageIcon(archivoFoto.toString()).getImage();
                Image newImg = img.getScaledInstance(pbFoto.getWidth(), pbFoto.getHeight(), java.awt.Image.SCALE_SMOOTH);
                pbFoto.setIcon(new ImageIcon(newImg));
                //Para asociar la foto utilice:
                //grupoInvestigacion.setFoto(Files.readAllBytes(archivoFoto.toPath()));
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSubirFotoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        estado = Estado.Nuevo;
        limpiarComponentes();
        establecerEstadoComponentes();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        /*Para mostrar la foto
        Image img = new ImageIcon(grupoInvestigacion.getFoto()).getImage();
        Image newImg = img.getScaledInstance(pbFoto.getWidth(), pbFoto.getHeight(), java.awt.Image.SCALE_SMOOTH);
        pbFoto.setIcon(new ImageIcon(newImg));
        */
        estado = Estado.Buscar;
        establecerEstadoComponentes();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnDescargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarArchivoActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("PDF","pdf");
        ofdArchivo.setFileFilter(filtro);
        int resultado = ofdArchivo.showOpenDialog(null);
        //Si ha seleccionado una ruta y nombre
        if(resultado == JFileChooser.APPROVE_OPTION){
            File archivoGenerar = ofdArchivo.getSelectedFile();
            try{
                FileOutputStream fos = new FileOutputStream(archivoGenerar);
                //Esto permitirá escribir el archivo en el disco duro
                //fos.write(this.grupoInvestigacion.getArchivoAdicionalPDF());
                fos.flush();
                fos.close();
                JOptionPane.showMessageDialog(null, "Se ha generado el archivo PDF","Mensaje de Confirmación",JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al momento de generar el PDF","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnDescargarArchivoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        estado = Estado.Inicial;
        limpiarComponentes();
        establecerEstadoComponentes();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSubirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirArchivoActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("PDF","pdf");
        ofdArchivo.setFileFilter(filtro);
        int resultado = ofdArchivo.showOpenDialog(null);
        //Si ha seleccionado un archivo
        if(resultado == JFileChooser.APPROVE_OPTION){
            //Asignamos el archivo a la variable
            this.archivoPDF = ofdArchivo.getSelectedFile();
            //Convertimos el archivo a byte[] y lo asignamos al objeto Articulo
            try{
                //Esto permite asociar el archivo con el objeto:
                //this.grupoInvestigacion.setArchivoAdicionalPDF(Files.readAllBytes(this.archivoPDF.toPath()));
                //Asimismo colocamos la ruta en el campo
                txtRutaArchivoPDF.setText(this.archivoPDF.getPath());
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "El archivo seleccionado no existe","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
                System.out.println("Error al momento de convertir el archivo a byte[]");
            }
        }
    }//GEN-LAST:event_btnSubirArchivoActionPerformed

    public void colocarIconos(){
        URL iconUrl = this.getClass().getResource("/pe/edu/pucp/dgisoft/img/nuevo.png");
        Image img = new ImageIcon(iconUrl).getImage();
        Image newimg = img.getScaledInstance(15, 17,  java.awt.Image.SCALE_SMOOTH ) ;
        btnNuevo.setIcon(new ImageIcon(newimg));
        btnNuevo.setHorizontalTextPosition(SwingConstants.RIGHT);
        iconUrl = this.getClass().getResource("/pe/edu/pucp/dgisoft/img/guardar.png");
        img = new ImageIcon(iconUrl).getImage();
        newimg = img.getScaledInstance(18, 17,  java.awt.Image.SCALE_SMOOTH ) ;
        btnGuardar.setIcon(new ImageIcon(newimg));
        btnGuardar.setHorizontalTextPosition(SwingConstants.RIGHT);
        iconUrl = this.getClass().getResource("/pe/edu/pucp/dgisoft/img/buscar.png");
        img = new ImageIcon(iconUrl).getImage();
        newimg = img.getScaledInstance(18, 17,  java.awt.Image.SCALE_SMOOTH ) ;
        btnBuscar.setIcon(new ImageIcon(newimg));
        btnBuscar.setHorizontalTextPosition(SwingConstants.RIGHT);
        iconUrl = this.getClass().getResource("/pe/edu/pucp/dgisoft/img/cancelar.png");
        img = new ImageIcon(iconUrl).getImage();
        newimg = img.getScaledInstance(18, 17,  java.awt.Image.SCALE_SMOOTH ) ;
        btnCancelar.setIcon(new ImageIcon(newimg));
        btnCancelar.setHorizontalTextPosition(SwingConstants.RIGHT);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgInterdisciplinario;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarIntegrante;
    private javax.swing.JButton btnBuscarSeccion;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDescargarArchivo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSubirArchivo;
    private javax.swing.JButton btnSubirFoto;
    private javax.swing.JTable dgvIntegrantes;
    private com.toedter.calendar.JYearChooser dtpAnho;
    private javax.swing.JScrollPane jspDescripcion;
    private javax.swing.JScrollPane jspIntegrantes;
    private javax.swing.JLabel lblAnho;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JLabel lblCodigoPUCP;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblInterdisciplinario;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JLabel lblNombreGrupo;
    private javax.swing.JLabel lblSeccion;
    private javax.swing.JLabel lblSiglas;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JFileChooser ofdArchivo;
    private javax.swing.JFileChooser ofdFoto;
    private javax.swing.JLabel pbFoto;
    private javax.swing.JRadioButton rbNoInterdisciplinario;
    private javax.swing.JRadioButton rbSiInterdisciplinario;
    private javax.swing.JPanel tabDatosGenerales;
    private javax.swing.JTabbedPane tbInformacionGrupo;
    private javax.swing.JPanel tbIntegrantes;
    private javax.swing.JToolBar tsMenu;
    private javax.swing.JTextField txtCodigoPUCP;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtNombreGrupo;
    private javax.swing.JTextField txtRutaArchivoPDF;
    private javax.swing.JTextField txtSeccion;
    private javax.swing.JTextField txtSiglas;
    // End of variables declaration//GEN-END:variables
}
