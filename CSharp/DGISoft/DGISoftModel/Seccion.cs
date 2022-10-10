using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DGISoftModel
{
    public class Seccion
    {
        private int _idSeccion;
        private String _nombre;
        private bool _activo;

        public int IdSeccion { get => _idSeccion; set => _idSeccion = value; }
        public string Nombre { get => _nombre; set => _nombre = value; }
        public bool Activo { get => _activo; set => _activo = value; }
    }
}
