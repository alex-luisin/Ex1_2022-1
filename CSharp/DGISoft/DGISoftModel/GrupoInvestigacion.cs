using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DGISoftModel
{
    public class GrupoInvestigacion
    {

        private int _idGrupoInvestigacion;
        private BindingList<MiembroPUCP> _integrantes;
        private Seccion _seccion;
        private String _nombre;
        private String _siglas;
        private String _anhoFundacion;
        private bool _interdisciplinario;
        private String _descripcion;
        private byte[] _foto;
        private byte[] _archivoAdicionalPDF;
        private bool _activo;

        public int IdGrupoInvestigacion { get => _idGrupoInvestigacion; set => _idGrupoInvestigacion = value; }
        public Seccion Seccion { get => _seccion; set => _seccion = value; }
        public string Nombre { get => _nombre; set => _nombre = value; }
        public string Siglas { get => _siglas; set => _siglas = value; }
        public string AnhoFundacion { get => _anhoFundacion; set => _anhoFundacion = value; }
        public bool Interdisciplinario { get => _interdisciplinario; set => _interdisciplinario = value; }
        public string Descripcion { get => _descripcion; set => _descripcion = value; }
        public byte[] Foto { get => _foto; set => _foto = value; }
        public byte[] ArchivoAdicionalPDF { get => _archivoAdicionalPDF; set => _archivoAdicionalPDF = value; }
        public bool Activo { get => _activo; set => _activo = value; }
        public BindingList<MiembroPUCP> Integrantes { get => _integrantes; set => _integrantes = value; }
    }
}