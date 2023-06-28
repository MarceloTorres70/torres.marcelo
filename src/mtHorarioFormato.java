import java.util.HashSet;

public class mtHorarioFormato {
    String mtNombreAlumno;
    String mtCodigo;
    String mtMateria;
    String mtParalelo;
    String mtAula;
    String mtCreditos;
    String mtObservacion;
    HashSet<Integer> mtHoraLunes = new HashSet<>();
    HashSet<Integer> mtHoraMartes = new HashSet<>();
    HashSet<Integer> mtHoraMiercoles = new HashSet<>();
    HashSet<Integer> mtHoraJueves = new HashSet<>();
    HashSet<Integer> mtHoraViernes = new HashSet<>();
    HashSet<Integer> mtHoraSabado = new HashSet<>();
    public String getMtNombreAlumno() {
        return mtNombreAlumno;
    }
    public void setMtNombreAlumno(String mtNombreAlumno) {
        this.mtNombreAlumno = mtNombreAlumno;
    }
    public String getMtCodigo() {
        return mtCodigo;
    }
    public void setMtCodigo(String mtCodigo) {
        this.mtCodigo = mtCodigo;
    }
    public String getMtMateria() {
        return mtMateria;
    }
    public void setMtMateria(String mtMateria) {
        this.mtMateria = mtMateria;
    }
    public String getMtParalelo() {
        return mtParalelo;
    }
    public void setMtParalelo(String mtParalelo) {
        this.mtParalelo = mtParalelo;
    }
    public String getMtAula() {
        return mtAula;
    }
    public void setMtAula(String mtAula) {
        this.mtAula = mtAula;
    }
    public String getMtCreditos() {
        return mtCreditos;
    }
    public void setMtCreditos(String mtCreditos) {
        this.mtCreditos = mtCreditos;
    }
    public String getMtObservacion() {
        return mtObservacion;
    }
    public void setMtObservacion(String mtObservacion) {
        this.mtObservacion = mtObservacion;
    }
    public HashSet<Integer> getMtHoraLunes() {
        return mtHoraLunes;
    }
    public void setMtHoraLunes(HashSet<Integer> mtHoraLunes) {
        this.mtHoraLunes = mtHoraLunes;
    }
    public HashSet<Integer> getMtHoraMartes() {
        return mtHoraMartes;
    }
    public void setMtHoraMartes(HashSet<Integer> mtHoraMartes) {
        this.mtHoraMartes = mtHoraMartes;
    }
    public HashSet<Integer> getMtHoraMiercoles() {
        return mtHoraMiercoles;
    }
    public void setMtHoraMiercoles(HashSet<Integer> mtHoraMiercoles) {
        this.mtHoraMiercoles = mtHoraMiercoles;
    }
    public HashSet<Integer> getMtHoraJueves() {
        return mtHoraJueves;
    }
    public void setMtHoraJueves(HashSet<Integer> mtHoraJueves) {
        this.mtHoraJueves = mtHoraJueves;
    }
    public HashSet<Integer> getMtHoraViernes() {
        return mtHoraViernes;
    }
    public void setMtHoraViernes(HashSet<Integer> mtHoraViernes) {
        this.mtHoraViernes = mtHoraViernes;
    }
    public HashSet<Integer> getMtHoraSabado() {
        return mtHoraSabado;
    }
    public void setMtHoraSabado(HashSet<Integer> mtHoraSabado) {
        this.mtHoraSabado = mtHoraSabado;
    }

}
