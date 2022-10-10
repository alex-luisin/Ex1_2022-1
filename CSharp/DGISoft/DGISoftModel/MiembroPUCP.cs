using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DGISoftModel
{
    public class MiembroPUCP
    {
        private int _idMiembroPUCP;
        private char _tipoMiembro;
        private String _codigoPUCP;
        private String _DNI;
        private String _nombres;
        private String _apellido_paterno;
        private String _apellido_materno;
        private char _genero;
        private DateTime _fechaNacimiento;
        public int IdMiembroPUCP { get => _idMiembroPUCP; set => _idMiembroPUCP = value; }
        public char TipoMiembro { get => _tipoMiembro; set => _tipoMiembro = value; }
        public string CodigoPUCP { get => _codigoPUCP; set => _codigoPUCP = value; }
        public string DNI { get => _DNI; set => _DNI = value; }
        public string Nombres { get => _nombres; set => _nombres = value; }
        public string Apellido_paterno { get => _apellido_paterno; set => _apellido_paterno = value; }
        public string Apellido_materno { get => _apellido_materno; set => _apellido_materno = value; }
        public char Genero { get => _genero; set => _genero = value; }
        public DateTime FechaNacimiento { get => _fechaNacimiento; set => _fechaNacimiento = value; }
    }
}