
namespace DGISoft
{
    partial class frmBusquedaMiembrosPUCP
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle2 = new System.Windows.Forms.DataGridViewCellStyle();
            this.dgvMiembrosPUCP = new System.Windows.Forms.DataGridView();
            this.CodigoPUCP = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Tipo = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.NombreCompleto = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.CategoriaCraest = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.lblNombreCodigo = new System.Windows.Forms.Label();
            this.txtNombreCodigo = new System.Windows.Forms.TextBox();
            this.btnBuscar = new System.Windows.Forms.Button();
            this.btnSeleccionar = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dgvMiembrosPUCP)).BeginInit();
            this.SuspendLayout();
            // 
            // dgvMiembrosPUCP
            // 
            this.dgvMiembrosPUCP.AllowUserToAddRows = false;
            this.dgvMiembrosPUCP.AllowUserToDeleteRows = false;
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle1.BackColor = System.Drawing.SystemColors.Control;
            dataGridViewCellStyle1.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle1.ForeColor = System.Drawing.SystemColors.WindowText;
            dataGridViewCellStyle1.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle1.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle1.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.dgvMiembrosPUCP.ColumnHeadersDefaultCellStyle = dataGridViewCellStyle1;
            this.dgvMiembrosPUCP.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvMiembrosPUCP.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.CodigoPUCP,
            this.Tipo,
            this.NombreCompleto,
            this.CategoriaCraest});
            dataGridViewCellStyle2.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle2.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle2.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle2.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle2.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle2.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle2.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.dgvMiembrosPUCP.DefaultCellStyle = dataGridViewCellStyle2;
            this.dgvMiembrosPUCP.Location = new System.Drawing.Point(12, 44);
            this.dgvMiembrosPUCP.Name = "dgvMiembrosPUCP";
            this.dgvMiembrosPUCP.ReadOnly = true;
            this.dgvMiembrosPUCP.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvMiembrosPUCP.Size = new System.Drawing.Size(748, 201);
            this.dgvMiembrosPUCP.TabIndex = 0;
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
            // CategoriaCraest
            // 
            this.CategoriaCraest.HeaderText = "Categoría/CRAEST";
            this.CategoriaCraest.Name = "CategoriaCraest";
            this.CategoriaCraest.ReadOnly = true;
            this.CategoriaCraest.Width = 150;
            // 
            // lblNombreCodigo
            // 
            this.lblNombreCodigo.AutoSize = true;
            this.lblNombreCodigo.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblNombreCodigo.Location = new System.Drawing.Point(12, 16);
            this.lblNombreCodigo.Name = "lblNombreCodigo";
            this.lblNombreCodigo.Size = new System.Drawing.Size(265, 13);
            this.lblNombreCodigo.TabIndex = 1;
            this.lblNombreCodigo.Text = "Ingrese el nombre/código del Miembro PUCP:";
            // 
            // txtNombreCodigo
            // 
            this.txtNombreCodigo.Location = new System.Drawing.Point(283, 13);
            this.txtNombreCodigo.Name = "txtNombreCodigo";
            this.txtNombreCodigo.Size = new System.Drawing.Size(190, 20);
            this.txtNombreCodigo.TabIndex = 2;
            // 
            // btnBuscar
            // 
            this.btnBuscar.Location = new System.Drawing.Point(479, 11);
            this.btnBuscar.Name = "btnBuscar";
            this.btnBuscar.Size = new System.Drawing.Size(75, 23);
            this.btnBuscar.TabIndex = 3;
            this.btnBuscar.Text = "Buscar";
            this.btnBuscar.UseVisualStyleBackColor = true;
            // 
            // btnSeleccionar
            // 
            this.btnSeleccionar.Location = new System.Drawing.Point(673, 11);
            this.btnSeleccionar.Name = "btnSeleccionar";
            this.btnSeleccionar.Size = new System.Drawing.Size(87, 23);
            this.btnSeleccionar.TabIndex = 4;
            this.btnSeleccionar.Text = "Seleccionar";
            this.btnSeleccionar.UseVisualStyleBackColor = true;
            // 
            // frmBusquedaMiembrosPUCP
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(772, 257);
            this.Controls.Add(this.btnSeleccionar);
            this.Controls.Add(this.btnBuscar);
            this.Controls.Add(this.txtNombreCodigo);
            this.Controls.Add(this.lblNombreCodigo);
            this.Controls.Add(this.dgvMiembrosPUCP);
            this.Name = "frmBusquedaMiembrosPUCP";
            this.Text = "Formulario de Búsqueda de Miembros PUCP";
            ((System.ComponentModel.ISupportInitialize)(this.dgvMiembrosPUCP)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dgvMiembrosPUCP;
        private System.Windows.Forms.Label lblNombreCodigo;
        private System.Windows.Forms.TextBox txtNombreCodigo;
        private System.Windows.Forms.Button btnBuscar;
        private System.Windows.Forms.Button btnSeleccionar;
        private System.Windows.Forms.DataGridViewTextBoxColumn CodigoPUCP;
        private System.Windows.Forms.DataGridViewTextBoxColumn Tipo;
        private System.Windows.Forms.DataGridViewTextBoxColumn NombreCompleto;
        private System.Windows.Forms.DataGridViewTextBoxColumn CategoriaCraest;
    }
}