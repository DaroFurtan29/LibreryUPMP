package edu.mx.metropoli.libreryupmp;


public class LibreryUPMP {

    public static void main(String[] args) {
        Usuario obj = new Usuario();
        obj.setVisible(true);
        System.out.println("hola");
    }
}
/*
-- __________________________COMPUTADORA___________________________

select * from computadora;

    SELECT ALL computadora, a.Nombre as Nombre, a.Matricula as Matricula, c.Carrera as Carrera, FechaVisita FROM computadora com JOIN alumno a ON com.IDalumno = a.IDalumno JOIN carreras c ON c.idCarreras = a.idCarreras ORDER BY FechaVisita DESC;

    SELECT ALL computadora, a.Nombre as Nombre, a.Matricula as Matricula, c.Carrera as Carrera, FechaVisita FROM computadora com
    JOIN alumno a ON com.IDalumno = a.IDalumno
    JOIN carreras c ON c.idCarreras = a.idCarreras
    ORDER BY FechaVisita DESC;

-- ___________________________VISITAS_____________________________

INSERT INTO visita (IDalumno,FechaVisita) values ((select IDalumno from alumno where Matricula = 2023140013), now());

select * from visita;

    SELECT ALL a.Nombre as Nombre, a.Matricula as Matricula, a.Genero as Genero, c.Carrera as Carrera, FechaVisita FROM visita v JOIN alumno a ON v.IDalumno = a.IDalumno JOIN carreras c ON c.idCarreras = a.idCarreras ORDER BY FechaVisita DESC;

    SELECT ALL a.Nombre as Nombre, a.Matricula as Matricula, a.Genero as Genero, c.Carrera as Carrera, FechaVisita
    FROM visita v JOIN alumno a ON v.IDalumno = a.IDalumno
    JOIN carreras c ON c.idCarreras = a.idCarreras
    ORDER BY FechaVisita DESC;

-- _________________________VISITAS.GENERO___________________________

SELECT a.Genero as alumno, count(a.Genero) as Total FROM visita v
INNER JOIN alumno a ON v.IDalumno = a.IDalumno
WHERE a.Genero = \"H\" or a.Genero = \"M\"
GROUP BY Genero;


-- __________________________AUTOR__________________________________

select * from autor;

select IDautor_tiene_libro, l.Titulo as libro, a.Nombre as autor from autor_tiene_libro al
join autor a on al.IDautor=a.IDautor
join libro l on al.IDlibro=l.IDlibro;

-- ________________________PRESTAMOS__________________________

SELECT * FROM prestamo;
    SELECT a.Nombre as alumno, l.Titulo as libro, FechaInicio, FechaFinal
    FROM prestamo p
    join alumno a on p.IDalumno = a.IDalumno
    join libro l on p.IDlibro = l.IDlibro;

    SELECT a.Nombre as alumno, l.Titulo as libro, FechaInicio, FechaFinal FROM prestamo p join alumno a on p.IDalumno = a.IDalumno join libro l on p.IDlibro = l.IDlibro    

SELECT a.Nombre as Nombre, a.Matricula as Matricula, c.Carrera as Carrera, l.Titulo as Titulo, FechaInicio, FechaFinal, Estatus FROM prestamo p
INNER JOIN alumno a on p.IDalumno = a.IDalumno
JOIN carreras c ON c.idCarreras = a.idCarreras
join libro l on p.IDlibro = l.IDlibro; 

SELECT a.Nombre as Nombre, a.Matricula as Matricula, c.Carrera as Carrera, l.Titulo as Titulo, FechaInicio, FechaFinal, Estatus FROM prestamo p INNER JOIN alumno a on p.IDalumno = a.IDalumno JOIN carreras c ON c.idCarreras = a.idCarreras join libro l on p.IDlibro = l.IDlibro; 

*/








