using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DGISoft
{
    public partial class frmGestionGrupos : Form
    {
        private Estado _estado;
        private string _rutaFoto = "";
        private string _rutaArchivoPDF = "";
        public frmGestionGrupos()
        {
            InitializeComponent();
            limpiarComponentes();
            _estado = Estado.Inicial;
            establecerEstadoComponentes();
        }

        public void limpiarComponentes()
        {
            txtNombreGrupo.Text = "";
            txtSiglas.Text = "";
            dtpAnho.Value = DateTime.Now;
            rbSiInterdisciplinario.Checked = false;
            rbNoInterdisciplinario.Checked = false;
            txtSeccion.Text = "";
            pbFoto.Image = null;
            txtDescripcion.Text = "";
            txtRutaArchivoPDF.Text = "";
            txtCodigoPUCP.Text = "";
            txtNombreCompleto.Text = "";
            //this._grupoInvestigacion = new GrupoInvestigacion();
            //this._grupoInvestigacion.Integrantes = new BindingList<MiembroPUCP>();
            //dgvIntegrantes.DataSource = this._grupoInvestigacion.Integrantes;
        }

        public void establecerEstadoComponentes()
        {
            switch (_estado)
            {
                case Estado.Inicial:
                    btnNuevo.Enabled = true;
                    btnGuardar.Enabled = false;
                    btnBuscar.Enabled = true;
                    btnCancelar.Enabled = false;
                    txtNombreGrupo.Enabled = false;
                    txtNombreGrupo.ReadOnly = true;
                    txtSiglas.Enabled = false;
                    txtSiglas.ReadOnly = true;
                    dtpAnho.Enabled = false;
                    rbSiInterdisciplinario.Enabled = false;
                    rbNoInterdisciplinario.Enabled = false;
                    txtSeccion.Enabled = false;
                    txtNombreGrupo.ReadOnly = true;
                    btnBuscarSeccion.Enabled = false;
                    pbFoto.Enabled = false;
                    btnSubirFoto.Enabled = false;
                    txtDescripcion.Enabled = false;
                    txtDescripcion.ReadOnly = true;
                    lblNombreGrupo.Enabled = false;
                    lblSiglas.Enabled = false;
                    lblAnho.Enabled = false;
                    lblInterdisciplinario.Enabled = false;
                    lblSeccion.Enabled = false;
                    lblFoto.Enabled = false;
                    lblDescripcion.Enabled = false;
                    lblCodigoPUCP.Enabled = false;
                    lblNombreCompleto.Enabled = false;
                    txtCodigoPUCP.Enabled = false;
                    txtCodigoPUCP.ReadOnly = true;
                    txtNombreCompleto.Enabled = false;
                    txtNombreCompleto.ReadOnly = true;
                    lblArchivo.Enabled = false;
                    btnSubirArchivo.Enabled = false;
                    txtRutaArchivoPDF.Enabled = false;
                    txtRutaArchivoPDF.ReadOnly = true;
                    btnDescargarArchivo.Enabled = false;
                    btnBuscarIntegrante.Enabled = false;
                    btnAgregar.Enabled = false;
                    btnEliminar.Enabled = false;
                    dgvIntegrantes.Enabled = false;
                    break;
                case Estado.Nuevo:
                    btnNuevo.Enabled = false;
                    btnGuardar.Enabled = true;
                    btnBuscar.Enabled = false;
                    btnCancelar.Enabled = true;
                    txtNombreGrupo.Enabled = true;
                    txtNombreGrupo.ReadOnly = false;
                    txtSiglas.Enabled = true;
                    txtSiglas.ReadOnly = false;
                    dtpAnho.Enabled = true;
                    rbSiInterdisciplinario.Enabled = true;
                    rbNoInterdisciplinario.Enabled = true;
                    txtSeccion.Enabled = true;
                    txtSeccion.ReadOnly = true;
                    btnBuscarSeccion.Enabled = true;
                    pbFoto.Enabled = true;
                    btnSubirFoto.Enabled = true;
                    txtDescripcion.Enabled = true;
                    txtDescripcion.ReadOnly = false;
                    lblNombreGrupo.Enabled = true;
                    lblSiglas.Enabled = true;
                    lblAnho.Enabled = true;
                    lblInterdisciplinario.Enabled = true;
                    lblSeccion.Enabled = true;
                    lblFoto.Enabled = true;
                    lblDescripcion.Enabled = true;
                    lblCodigoPUCP.Enabled = true;
                    lblNombreCompleto.Enabled = true;
                    txtCodigoPUCP.Enabled = true;
                    txtCodigoPUCP.ReadOnly = true;
                    txtNombreCompleto.Enabled = true;
                    txtNombreCompleto.ReadOnly = true;
                    lblArchivo.Enabled = true;
                    btnSubirArchivo.Enabled = true;
                    txtRutaArchivoPDF.Enabled = true;
                    txtRutaArchivoPDF.ReadOnly = true;
                    btnDescargarArchivo.Enabled = false;
                    btnBuscarIntegrante.Enabled = true;
                    btnAgregar.Enabled = true;
                    btnEliminar.Enabled = true;
                    dgvIntegrantes.Enabled = true;
                    break;
                case Estado.Guardar:
                case Estado.Buscar:
                    btnNuevo.Enabled = false;
                    btnGuardar.Enabled = false;
                    btnBuscar.Enabled = false;
                    btnCancelar.Enabled = true;
                    txtNombreGrupo.Enabled = true;
                    txtNombreGrupo.ReadOnly = true;
                    txtSiglas.Enabled = true;
                    txtSiglas.ReadOnly = true;
                    dtpAnho.Enabled = false;
                    rbSiInterdisciplinario.Enabled = false;
                    rbNoInterdisciplinario.Enabled = false;
                    txtSeccion.Enabled = true;
                    txtSeccion.ReadOnly = true;
                    btnBuscarSeccion.Enabled = false;
                    pbFoto.Enabled = true;
                    btnSubirFoto.Enabled = false;
                    txtDescripcion.Enabled = true;
                    txtDescripcion.ReadOnly = true;
                    lblNombreGrupo.Enabled = true;
                    lblSiglas.Enabled = true;
                    lblAnho.Enabled = true;
                    lblInterdisciplinario.Enabled = true;
                    lblSeccion.Enabled = true;
                    lblFoto.Enabled = true;
                    lblDescripcion.Enabled = true;
                    lblCodigoPUCP.Enabled = true;
                    lblNombreCompleto.Enabled = true;
                    txtCodigoPUCP.Enabled = true;
                    txtCodigoPUCP.ReadOnly = true;
                    txtNombreCompleto.Enabled = true;
                    txtNombreCompleto.ReadOnly = true;
                    lblArchivo.Enabled = true;
                    btnSubirArchivo.Enabled = false;
                    txtRutaArchivoPDF.Enabled = false;
                    txtRutaArchivoPDF.ReadOnly = false;
                    btnDescargarArchivo.Enabled = true;
                    btnBuscarIntegrante.Enabled = false;
                    btnAgregar.Enabled = false;
                    btnEliminar.Enabled = false;
                    dgvIntegrantes.Enabled = true;
                    break;
            }
        }

        private void btnNuevo_Click(object sender, EventArgs e)
        {
            _estado = Estado.Nuevo;
            limpiarComponentes();
            establecerEstadoComponentes();
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            _estado = Estado.Inicial;
            limpiarComponentes();
            establecerEstadoComponentes();
        }

        private void btnBuscarIntegrante_Click(object sender, EventArgs e)
        {

        }

        private void btnBuscarSeccion_Click(object sender, EventArgs e)
        {

        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            /*Para mostrar la foto
            MemoryStream ms1 = new MemoryStream(_grupoInvestigacion.Foto);
            pbFoto.Image = new Bitmap(ms1);
            */
            _estado = Estado.Buscar;
            establecerEstadoComponentes();
        }

        private void btnSubirFoto_Click(object sender, EventArgs e)
        {
            try
            {
                if (ofdFoto.ShowDialog() == DialogResult.OK)
                {
                    _rutaFoto = ofdFoto.FileName;
                    pbFoto.Image = Image.FromFile(_rutaFoto);
                    /*
                    FileStream fs = new FileStream(_rutaFoto, FileMode.Open, FileAccess.Read);
                    BinaryReader br = new BinaryReader(fs);
                    _grupoInvestigacion.Foto = br.ReadBytes((int)fs.Length);
                     */
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("El archivo seleccionado no es un tipo de imagen válido");
            }
        }

        private void btnSubirArchivo_Click(object sender, EventArgs e)
        {
            try
            {
                if (ofdArchivo.ShowDialog() == DialogResult.OK)
                {
                    _rutaArchivoPDF = ofdArchivo.FileName;
                    txtRutaArchivoPDF.Text = _rutaArchivoPDF;
                    FileStream fs = new FileStream(_rutaArchivoPDF, FileMode.Open, FileAccess.Read);
                    BinaryReader br = new BinaryReader(fs);
                    //Asignamos el archivo al objeto
                    //this._grupoInvestigacion.ArchivoAdicionalPDF = br.ReadBytes((int)fs.Length);
                    br.Close();
                    fs.Close();
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Ocurrió un error al seleccionar el archivo", "Mensaje de Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void btnDescargarArchivo_Click(object sender, EventArgs e)
        {
            if (sfdArchivo.ShowDialog() == DialogResult.OK)
            {
                try
                {
                    String archivoGenerar = sfdArchivo.FileName;
                    //Convertimos el arreglo de Bytes a archivo
                    //File.WriteAllBytes(archivoGenerar, this._grupoInvestigacion.ArchivoAdicionalPDF);
                    MessageBox.Show("Se ha guardado el archivo", "Mensaje de Confirmación", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Se ha generado un error al momento de guardar el archivo", "Mensaje de Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }
    }
}
