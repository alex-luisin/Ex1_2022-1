
namespace DGISoft
{
    partial class frmGestionGrupos
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmGestionGrupos));
            this.tsMenu = new System.Windows.Forms.ToolStrip();
            this.btnNuevo = new System.Windows.Forms.ToolStripButton();
            this.btnGuardar = new System.Windows.Forms.ToolStripButton();
            this.btnBuscar = new System.Windows.Forms.ToolStripButton();
            this.btnCancelar = new System.Windows.Forms.ToolStripButton();
            this.lblTitulo = new System.Windows.Forms.Label();
            this.tbDatosGenerales = new System.Windows.Forms.TabControl();
            this.tpDatosGenerales = new System.Windows.Forms.TabPage();
            this.btnDescargarArchivo = new System.Windows.Forms.Button();
            this.btnSubirArchivo = new System.Windows.Forms.Button();
            this.txtRutaArchivoPDF = new System.Windows.Forms.TextBox();
            this.lblArchivo = new System.Windows.Forms.Label();
            this.btnSubirFoto = new System.Windows.Forms.Button();
            this.lblDescripcion = new System.Windows.Forms.Label();
            this.txtDescripcion = new System.Windows.Forms.TextBox();
            this.lblFoto = new System.Windows.Forms.Label();
            this.pbFoto = new System.Windows.Forms.PictureBox();
            this.btnBuscarSeccion = new System.Windows.Forms.Button();
            this.txtSeccion = new System.Windows.Forms.TextBox();
            this.lblSeccion = new System.Windows.Forms.Label();
            this.rbNoInterdisciplinario = new System.Windows.Forms.RadioButton();
            this.rbSiInterdisciplinario = new System.Windows.Forms.RadioButton();
            this.lblInterdisciplinario = new System.Windows.Forms.Label();
            this.lblAnho = new System.Windows.Forms.Label();
            this.dtpAnho = new System.Windows.Forms.DateTimePicker();
            this.txtSiglas = new System.Windows.Forms.TextBox();
            this.lblSiglas = new System.Windows.Forms.Label();
            this.txtNombreGrupo = new System.Windows.Forms.TextBox();
            this.lblNombreGrupo = new System.Windows.Forms.Label();
            this.tbIntegrantes = new System.Windows.Forms.TabPage();
            this.btnEliminar = new System.Windows.Forms.Button();
            this.btnAgregar = new System.Windows.Forms.Button();
            this.btnBuscarIntegrante = new System.Windows.Forms.Button();
            this.txtNombreCompleto = new System.Windows.Forms.TextBox();
            this.txtCodigoPUCP = new System.Windows.Forms.TextBox();
            this.lblNombreCompleto = new System.Windows.Forms.Label();
            this.lblCodigoPUCP = new System.Windows.Forms.Label();
            this.dgvIntegrantes = new System.Windows.Forms.DataGridView();
            this.CodigoPUCP = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Tipo = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.NombreCompleto = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.InfoAdicional = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ofdFoto = new System.Windows.Forms.OpenFileDialog();
            this.sfdArchivo = new System.Windows.Forms.SaveFileDialog();
            this.ofdArchivo = new System.Windows.Forms.OpenFileDialog();
            this.tsMenu.SuspendLayout();
            this.tbDatosGenerales.SuspendLayout();
            this.tpDatosGenerales.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbFoto)).BeginInit();
            this.tbIntegrantes.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvIntegrantes)).BeginInit();
            this.SuspendLayout();
            // 
            // tsMenu
            // 
            this.tsMenu.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btnNuevo,
            this.btnGuardar,
            this.btnBuscar,
            this.btnCancelar});
            this.tsMenu.Location = new System.Drawing.Point(0, 0);
            this.tsMenu.Name = "tsMenu";
            this.tsMenu.Size = new System.Drawing.Size(778, 25);
            this.tsMenu.TabIndex = 0;
            this.tsMenu.Text = "toolStrip1";
            // 
            // btnNuevo
            // 
            this.btnNuevo.Image = ((System.Drawing.Image)(resources.GetObject("btnNuevo.Image")));
            this.btnNuevo.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnNuevo.Name = "btnNuevo";
            this.btnNuevo.Size = new System.Drawing.Size(62, 22);
            this.btnNuevo.Text = "&Nuevo";
            this.btnNuevo.Click += new System.EventHandler(this.btnNuevo_Click);
            // 
            // btnGuardar
            // 
            this.btnGuardar.Image = ((System.Drawing.Image)(resources.GetObject("btnGuardar.Image")));
            this.btnGuardar.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnGuardar.Name = "btnGuardar";
            this.btnGuardar.Size = new System.Drawing.Size(69, 22);
            this.btnGuardar.Text = "&Guardar";
            // 
            // btnBuscar
            // 
            this.btnBuscar.Image = ((System.Drawing.Image)(resources.GetObject("btnBuscar.Image")));
            this.btnBuscar.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnBuscar.Name = "btnBuscar";
            this.btnBuscar.Size = new System.Drawing.Size(62, 22);
            this.btnBuscar.Text = "&Buscar";
            this.btnBuscar.Click += new System.EventHandler(this.btnBuscar_Click);
            // 
            // btnCancelar
            // 
            this.btnCancelar.Image = ((System.Drawing.Image)(resources.GetObject("btnCancelar.Image")));
            this.btnCancelar.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnCancelar.Name = "btnCancelar";
            this.btnCancelar.Size = new System.Drawing.Size(73, 22);
            this.btnCancelar.Text = "&Cancelar";
            this.btnCancelar.Click += new System.EventHandler(this.btnCancelar_Click);
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTitulo.Location = new System.Drawing.Point(12, 31);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(300, 16);
            this.lblTitulo.TabIndex = 1;
            this.lblTitulo.Text = "Gestión de Grupos de Investigación PUCP";
            // 
            // tbDatosGenerales
            // 
            this.tbDatosGenerales.Controls.Add(this.tpDatosGenerales);
            this.tbDatosGenerales.Controls.Add(this.tbIntegrantes);
            this.tbDatosGenerales.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tbDatosGenerales.Location = new System.Drawing.Point(15, 61);
            this.tbDatosGenerales.Name = "tbDatosGenerales";
            this.tbDatosGenerales.SelectedIndex = 0;
            this.tbDatosGenerales.Size = new System.Drawing.Size(751, 357);
            this.tbDatosGenerales.TabIndex = 5;
            // 
            // tpDatosGenerales
            // 
            this.tpDatosGenerales.BackColor = System.Drawing.SystemColors.Control;
            this.tpDatosGenerales.Controls.Add(this.btnDescargarArchivo);
            this.tpDatosGenerales.Controls.Add(this.btnSubirArchivo);
            this.tpDatosGenerales.Controls.Add(this.txtRutaArchivoPDF);
            this.tpDatosGenerales.Controls.Add(this.lblArchivo);
            this.tpDatosGenerales.Controls.Add(this.btnSubirFoto);
            this.tpDatosGenerales.Controls.Add(this.lblDescripcion);
            this.tpDatosGenerales.Controls.Add(this.txtDescripcion);
            this.tpDatosGenerales.Controls.Add(this.lblFoto);
            this.tpDatosGenerales.Controls.Add(this.pbFoto);
            this.tpDatosGenerales.Controls.Add(this.btnBuscarSeccion);
            this.tpDatosGenerales.Controls.Add(this.txtSeccion);
            this.tpDatosGenerales.Controls.Add(this.lblSeccion);
            this.tpDatosGenerales.Controls.Add(this.rbNoInterdisciplinario);
            this.tpDatosGenerales.Controls.Add(this.rbSiInterdisciplinario);
            this.tpDatosGenerales.Controls.Add(this.lblInterdisciplinario);
            this.tpDatosGenerales.Controls.Add(this.lblAnho);
            this.tpDatosGenerales.Controls.Add(this.dtpAnho);
            this.tpDatosGenerales.Controls.Add(this.txtSiglas);
            this.tpDatosGenerales.Controls.Add(this.lblSiglas);
            this.tpDatosGenerales.Controls.Add(this.txtNombreGrupo);
            this.tpDatosGenerales.Controls.Add(this.lblNombreGrupo);
            this.tpDatosGenerales.Location = new System.Drawing.Point(4, 22);
            this.tpDatosGenerales.Name = "tpDatosGenerales";
            this.tpDatosGenerales.Padding = new System.Windows.Forms.Padding(3);
            this.tpDatosGenerales.Size = new System.Drawing.Size(743, 331);
            this.tpDatosGenerales.TabIndex = 0;
            this.tpDatosGenerales.Text = "Datos Generales";
            // 
            // btnDescargarArchivo
            // 
            this.btnDescargarArchivo.Location = new System.Drawing.Point(652, 272);
            this.btnDescargarArchivo.Name = "btnDescargarArchivo";
            this.btnDescargarArchivo.Size = new System.Drawing.Size(85, 23);
            this.btnDescargarArchivo.TabIndex = 32;
            this.btnDescargarArchivo.Text = "Descargar";
            this.btnDescargarArchivo.UseVisualStyleBackColor = true;
            this.btnDescargarArchivo.Click += new System.EventHandler(this.btnDescargarArchivo_Click);
            // 
            // btnSubirArchivo
            // 
            this.btnSubirArchivo.Location = new System.Drawing.Point(573, 272);
            this.btnSubirArchivo.Name = "btnSubirArchivo";
            this.btnSubirArchivo.Size = new System.Drawing.Size(77, 23);
            this.btnSubirArchivo.TabIndex = 31;
            this.btnSubirArchivo.Text = "Subir";
            this.btnSubirArchivo.UseVisualStyleBackColor = true;
            this.btnSubirArchivo.Click += new System.EventHandler(this.btnSubirArchivo_Click);
            // 
            // txtRutaArchivoPDF
            // 
            this.txtRutaArchivoPDF.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtRutaArchivoPDF.Location = new System.Drawing.Point(271, 297);
            this.txtRutaArchivoPDF.Name = "txtRutaArchivoPDF";
            this.txtRutaArchivoPDF.Size = new System.Drawing.Size(466, 20);
            this.txtRutaArchivoPDF.TabIndex = 30;
            // 
            // lblArchivo
            // 
            this.lblArchivo.AutoSize = true;
            this.lblArchivo.Location = new System.Drawing.Point(269, 277);
            this.lblArchivo.Name = "lblArchivo";
            this.lblArchivo.Size = new System.Drawing.Size(208, 13);
            this.lblArchivo.TabIndex = 29;
            this.lblArchivo.Text = "Archivo PDF Información Adicional:";
            // 
            // btnSubirFoto
            // 
            this.btnSubirFoto.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnSubirFoto.Location = new System.Drawing.Point(223, 297);
            this.btnSubirFoto.Name = "btnSubirFoto";
            this.btnSubirFoto.Size = new System.Drawing.Size(29, 23);
            this.btnSubirFoto.TabIndex = 28;
            this.btnSubirFoto.Text = "...";
            this.btnSubirFoto.UseVisualStyleBackColor = true;
            this.btnSubirFoto.Click += new System.EventHandler(this.btnSubirFoto_Click);
            // 
            // lblDescripcion
            // 
            this.lblDescripcion.AutoSize = true;
            this.lblDescripcion.Location = new System.Drawing.Point(266, 170);
            this.lblDescripcion.Name = "lblDescripcion";
            this.lblDescripcion.Size = new System.Drawing.Size(78, 13);
            this.lblDescripcion.TabIndex = 27;
            this.lblDescripcion.Text = "Descripción:";
            // 
            // txtDescripcion
            // 
            this.txtDescripcion.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtDescripcion.Location = new System.Drawing.Point(269, 192);
            this.txtDescripcion.Multiline = true;
            this.txtDescripcion.Name = "txtDescripcion";
            this.txtDescripcion.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.txtDescripcion.Size = new System.Drawing.Size(468, 71);
            this.txtDescripcion.TabIndex = 26;
            // 
            // lblFoto
            // 
            this.lblFoto.AutoSize = true;
            this.lblFoto.Location = new System.Drawing.Point(11, 149);
            this.lblFoto.Name = "lblFoto";
            this.lblFoto.Size = new System.Drawing.Size(95, 13);
            this.lblFoto.TabIndex = 25;
            this.lblFoto.Text = "Foto del Grupo:";
            // 
            // pbFoto
            // 
            this.pbFoto.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.pbFoto.Location = new System.Drawing.Point(12, 170);
            this.pbFoto.Name = "pbFoto";
            this.pbFoto.Size = new System.Drawing.Size(240, 150);
            this.pbFoto.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbFoto.TabIndex = 24;
            this.pbFoto.TabStop = false;
            // 
            // btnBuscarSeccion
            // 
            this.btnBuscarSeccion.Location = new System.Drawing.Point(438, 118);
            this.btnBuscarSeccion.Name = "btnBuscarSeccion";
            this.btnBuscarSeccion.Size = new System.Drawing.Size(29, 23);
            this.btnBuscarSeccion.TabIndex = 23;
            this.btnBuscarSeccion.Text = "...";
            this.btnBuscarSeccion.UseVisualStyleBackColor = true;
            this.btnBuscarSeccion.Click += new System.EventHandler(this.btnBuscarSeccion_Click);
            // 
            // txtSeccion
            // 
            this.txtSeccion.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtSeccion.Location = new System.Drawing.Point(136, 120);
            this.txtSeccion.Name = "txtSeccion";
            this.txtSeccion.ReadOnly = true;
            this.txtSeccion.Size = new System.Drawing.Size(296, 20);
            this.txtSeccion.TabIndex = 22;
            // 
            // lblSeccion
            // 
            this.lblSeccion.AutoSize = true;
            this.lblSeccion.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblSeccion.Location = new System.Drawing.Point(72, 123);
            this.lblSeccion.Name = "lblSeccion";
            this.lblSeccion.Size = new System.Drawing.Size(57, 13);
            this.lblSeccion.TabIndex = 21;
            this.lblSeccion.Text = "Sección:";
            // 
            // rbNoInterdisciplinario
            // 
            this.rbNoInterdisciplinario.AutoSize = true;
            this.rbNoInterdisciplinario.Location = new System.Drawing.Point(187, 94);
            this.rbNoInterdisciplinario.Name = "rbNoInterdisciplinario";
            this.rbNoInterdisciplinario.Size = new System.Drawing.Size(41, 17);
            this.rbNoInterdisciplinario.TabIndex = 20;
            this.rbNoInterdisciplinario.TabStop = true;
            this.rbNoInterdisciplinario.Text = "No";
            this.rbNoInterdisciplinario.UseVisualStyleBackColor = true;
            // 
            // rbSiInterdisciplinario
            // 
            this.rbSiInterdisciplinario.AutoSize = true;
            this.rbSiInterdisciplinario.Location = new System.Drawing.Point(136, 94);
            this.rbSiInterdisciplinario.Name = "rbSiInterdisciplinario";
            this.rbSiInterdisciplinario.Size = new System.Drawing.Size(38, 17);
            this.rbSiInterdisciplinario.TabIndex = 19;
            this.rbSiInterdisciplinario.TabStop = true;
            this.rbSiInterdisciplinario.Text = "Sí";
            this.rbSiInterdisciplinario.UseVisualStyleBackColor = true;
            // 
            // lblInterdisciplinario
            // 
            this.lblInterdisciplinario.AutoSize = true;
            this.lblInterdisciplinario.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblInterdisciplinario.Location = new System.Drawing.Point(25, 96);
            this.lblInterdisciplinario.Name = "lblInterdisciplinario";
            this.lblInterdisciplinario.Size = new System.Drawing.Size(104, 13);
            this.lblInterdisciplinario.TabIndex = 18;
            this.lblInterdisciplinario.Text = "Interdisciplinario:";
            // 
            // lblAnho
            // 
            this.lblAnho.AutoSize = true;
            this.lblAnho.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblAnho.Location = new System.Drawing.Point(16, 68);
            this.lblAnho.Name = "lblAnho";
            this.lblAnho.Size = new System.Drawing.Size(114, 13);
            this.lblAnho.TabIndex = 17;
            this.lblAnho.Text = "Año de Fundación:";
            // 
            // dtpAnho
            // 
            this.dtpAnho.CustomFormat = "yyyy";
            this.dtpAnho.Format = System.Windows.Forms.DateTimePickerFormat.Custom;
            this.dtpAnho.Location = new System.Drawing.Point(136, 65);
            this.dtpAnho.Name = "dtpAnho";
            this.dtpAnho.ShowUpDown = true;
            this.dtpAnho.Size = new System.Drawing.Size(97, 20);
            this.dtpAnho.TabIndex = 16;
            // 
            // txtSiglas
            // 
            this.txtSiglas.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtSiglas.Location = new System.Drawing.Point(136, 39);
            this.txtSiglas.Name = "txtSiglas";
            this.txtSiglas.Size = new System.Drawing.Size(134, 20);
            this.txtSiglas.TabIndex = 15;
            // 
            // lblSiglas
            // 
            this.lblSiglas.AutoSize = true;
            this.lblSiglas.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblSiglas.Location = new System.Drawing.Point(85, 42);
            this.lblSiglas.Name = "lblSiglas";
            this.lblSiglas.Size = new System.Drawing.Size(45, 13);
            this.lblSiglas.TabIndex = 14;
            this.lblSiglas.Text = "Siglas:";
            // 
            // txtNombreGrupo
            // 
            this.txtNombreGrupo.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtNombreGrupo.Location = new System.Drawing.Point(136, 13);
            this.txtNombreGrupo.Name = "txtNombreGrupo";
            this.txtNombreGrupo.Size = new System.Drawing.Size(601, 20);
            this.txtNombreGrupo.TabIndex = 13;
            // 
            // lblNombreGrupo
            // 
            this.lblNombreGrupo.AutoSize = true;
            this.lblNombreGrupo.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblNombreGrupo.Location = new System.Drawing.Point(16, 16);
            this.lblNombreGrupo.Name = "lblNombreGrupo";
            this.lblNombreGrupo.Size = new System.Drawing.Size(113, 13);
            this.lblNombreGrupo.TabIndex = 12;
            this.lblNombreGrupo.Text = "Nombre del Grupo:";
            // 
            // tbIntegrantes
            // 
            this.tbIntegrantes.BackColor = System.Drawing.SystemColors.Control;
            this.tbIntegrantes.Controls.Add(this.btnEliminar);
            this.tbIntegrantes.Controls.Add(this.btnAgregar);
            this.tbIntegrantes.Controls.Add(this.btnBuscarIntegrante);
            this.tbIntegrantes.Controls.Add(this.txtNombreCompleto);
            this.tbIntegrantes.Controls.Add(this.txtCodigoPUCP);
            this.tbIntegrantes.Controls.Add(this.lblNombreCompleto);
            this.tbIntegrantes.Controls.Add(this.lblCodigoPUCP);
            this.tbIntegrantes.Controls.Add(this.dgvIntegrantes);
            this.tbIntegrantes.Location = new System.Drawing.Point(4, 22);
            this.tbIntegrantes.Name = "tbIntegrantes";
            this.tbIntegrantes.Padding = new System.Windows.Forms.Padding(3);
            this.tbIntegrantes.Size = new System.Drawing.Size(743, 331);
            this.tbIntegrantes.TabIndex = 1;
            this.tbIntegrantes.Text = "Integrantes";
            // 
            // btnEliminar
            // 
            this.btnEliminar.Location = new System.Drawing.Point(708, 42);
            this.btnEliminar.Name = "btnEliminar";
            this.btnEliminar.Size = new System.Drawing.Size(29, 23);
            this.btnEliminar.TabIndex = 24;
            this.btnEliminar.Text = "-";
            this.btnEliminar.UseVisualStyleBackColor = true;
            // 
            // btnAgregar
            // 
            this.btnAgregar.Location = new System.Drawing.Point(678, 42);
            this.btnAgregar.Name = "btnAgregar";
            this.btnAgregar.Size = new System.Drawing.Size(29, 23);
            this.btnAgregar.TabIndex = 23;
            this.btnAgregar.Text = "+";
            this.btnAgregar.UseVisualStyleBackColor = true;
            // 
            // btnBuscarIntegrante
            // 
            this.btnBuscarIntegrante.Location = new System.Drawing.Point(258, 14);
            this.btnBuscarIntegrante.Name = "btnBuscarIntegrante";
            this.btnBuscarIntegrante.Size = new System.Drawing.Size(29, 23);
            this.btnBuscarIntegrante.TabIndex = 18;
            this.btnBuscarIntegrante.Text = "...";
            this.btnBuscarIntegrante.UseVisualStyleBackColor = true;
            this.btnBuscarIntegrante.Click += new System.EventHandler(this.btnBuscarIntegrante_Click);
            // 
            // txtNombreCompleto
            // 
            this.txtNombreCompleto.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtNombreCompleto.Location = new System.Drawing.Point(123, 44);
            this.txtNombreCompleto.Name = "txtNombreCompleto";
            this.txtNombreCompleto.ReadOnly = true;
            this.txtNombreCompleto.Size = new System.Drawing.Size(425, 20);
            this.txtNombreCompleto.TabIndex = 22;
            // 
            // txtCodigoPUCP
            // 
            this.txtCodigoPUCP.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtCodigoPUCP.Location = new System.Drawing.Point(123, 15);
            this.txtCodigoPUCP.Name = "txtCodigoPUCP";
            this.txtCodigoPUCP.ReadOnly = true;
            this.txtCodigoPUCP.Size = new System.Drawing.Size(132, 20);
            this.txtCodigoPUCP.TabIndex = 19;
            // 
            // lblNombreCompleto
            // 
            this.lblNombreCompleto.AutoSize = true;
            this.lblNombreCompleto.Location = new System.Drawing.Point(7, 47);
            this.lblNombreCompleto.Name = "lblNombreCompleto";
            this.lblNombreCompleto.Size = new System.Drawing.Size(110, 13);
            this.lblNombreCompleto.TabIndex = 21;
            this.lblNombreCompleto.Text = "Nombre Completo:";
            // 
            // lblCodigoPUCP
            // 
            this.lblCodigoPUCP.AutoSize = true;
            this.lblCodigoPUCP.Location = new System.Drawing.Point(30, 19);
            this.lblCodigoPUCP.Name = "lblCodigoPUCP";
            this.lblCodigoPUCP.Size = new System.Drawing.Size(87, 13);
            this.lblCodigoPUCP.TabIndex = 20;
            this.lblCodigoPUCP.Text = "Código PUCP:";
            // 
            // dgvIntegrantes
            // 
            this.dgvIntegrantes.AllowUserToAddRows = false;
            this.dgvIntegrantes.AllowUserToDeleteRows = false;
            this.dgvIntegrantes.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvIntegrantes.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.CodigoPUCP,
            this.Tipo,
            this.NombreCompleto,
            this.InfoAdicional});
            this.dgvIntegrantes.Location = new System.Drawing.Point(8, 74);
            this.dgvIntegrantes.Name = "dgvIntegrantes";
            this.dgvIntegrantes.ReadOnly = true;
            this.dgvIntegrantes.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvIntegrantes.Size = new System.Drawing.Size(729, 248);
            this.dgvIntegrantes.TabIndex = 17;
            // 
            // CodigoPUCP
            // 
            this.CodigoPUCP.HeaderText = "Código PUCP";
            this.CodigoPUCP.Name = "CodigoPUCP";
            this.CodigoPUCP.ReadOnly = true;
            this.CodigoPUCP.Width = 120;
            // 
            // Tipo
            // 
            this.Tipo.HeaderText = "Tipo";
            this.Tipo.Name = "Tipo";
            this.Tipo.ReadOnly = true;
            // 
            // NombreCompleto
            // 
            this.NombreCompleto.HeaderText = "Nombre Completo";
            this.NombreCompleto.Name = "NombreCompleto";
            this.NombreCompleto.ReadOnly = true;
            this.NombreCompleto.Width = 300;
            // 
            // InfoAdicional
            // 
            this.InfoAdicional.HeaderText = "Categoría/CRAEST";
            this.InfoAdicional.Name = "InfoAdicional";
            this.InfoAdicional.ReadOnly = true;
            this.InfoAdicional.Width = 150;
            // 
            // ofdFoto
            // 
            this.ofdFoto.FileName = "ofdFoto";
            // 
            // ofdArchivo
            // 
            this.ofdArchivo.FileName = "ofdArchivo";
            // 
            // frmGestionGrupos
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(778, 427);
            this.Controls.Add(this.tbDatosGenerales);
            this.Controls.Add(this.lblTitulo);
            this.Controls.Add(this.tsMenu);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.Name = "frmGestionGrupos";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Formulario de Gestión de Grupos de Investigación";
            this.tsMenu.ResumeLayout(false);
            this.tsMenu.PerformLayout();
            this.tbDatosGenerales.ResumeLayout(false);
            this.tpDatosGenerales.ResumeLayout(false);
            this.tpDatosGenerales.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pbFoto)).EndInit();
            this.tbIntegrantes.ResumeLayout(false);
            this.tbIntegrantes.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvIntegrantes)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ToolStrip tsMenu;
        private System.Windows.Forms.ToolStripButton btnNuevo;
        private System.Windows.Forms.ToolStripButton btnGuardar;
        private System.Windows.Forms.ToolStripButton btnBuscar;
        private System.Windows.Forms.ToolStripButton btnCancelar;
        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.TabControl tbDatosGenerales;
        private System.Windows.Forms.TabPage tpDatosGenerales;
        private System.Windows.Forms.Button btnBuscarSeccion;
        private System.Windows.Forms.TextBox txtSeccion;
        private System.Windows.Forms.Label lblSeccion;
        private System.Windows.Forms.RadioButton rbNoInterdisciplinario;
        private System.Windows.Forms.RadioButton rbSiInterdisciplinario;
        private System.Windows.Forms.Label lblInterdisciplinario;
        private System.Windows.Forms.Label lblAnho;
        private System.Windows.Forms.DateTimePicker dtpAnho;
        private System.Windows.Forms.TextBox txtSiglas;
        private System.Windows.Forms.Label lblSiglas;
        private System.Windows.Forms.TextBox txtNombreGrupo;
        private System.Windows.Forms.Label lblNombreGrupo;
        private System.Windows.Forms.TabPage tbIntegrantes;
        private System.Windows.Forms.Button btnEliminar;
        private System.Windows.Forms.Button btnAgregar;
        private System.Windows.Forms.Button btnBuscarIntegrante;
        private System.Windows.Forms.TextBox txtNombreCompleto;
        private System.Windows.Forms.TextBox txtCodigoPUCP;
        private System.Windows.Forms.Label lblNombreCompleto;
        private System.Windows.Forms.Label lblCodigoPUCP;
        private System.Windows.Forms.DataGridView dgvIntegrantes;
        private System.Windows.Forms.Button btnSubirFoto;
        private System.Windows.Forms.Label lblDescripcion;
        private System.Windows.Forms.TextBox txtDescripcion;
        private System.Windows.Forms.Label lblFoto;
        private System.Windows.Forms.PictureBox pbFoto;
        private System.Windows.Forms.Button btnDescargarArchivo;
        private System.Windows.Forms.Button btnSubirArchivo;
        private System.Windows.Forms.TextBox txtRutaArchivoPDF;
        private System.Windows.Forms.Label lblArchivo;
        private System.Windows.Forms.OpenFileDialog ofdFoto;
        private System.Windows.Forms.SaveFileDialog sfdArchivo;
        private System.Windows.Forms.OpenFileDialog ofdArchivo;
        private System.Windows.Forms.DataGridViewTextBoxColumn CodigoPUCP;
        private System.Windows.Forms.DataGridViewTextBoxColumn Tipo;
        private System.Windows.Forms.DataGridViewTextBoxColumn NombreCompleto;
        private System.Windows.Forms.DataGridViewTextBoxColumn InfoAdicional;
    }
}

