package objetos;

public class Medicamento {
    private String nombreMedicamento;
    private String fabricanteMedicamento;
    private String viadeAdm;

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getFabricanteMedicamento() {
        return fabricanteMedicamento;
    }

    public void setFabricanteMedicamento(String fabricanteMedicamento) {
        this.fabricanteMedicamento = fabricanteMedicamento;
    }

    public String getViadeAdm() {
        return viadeAdm;
    }

    public void setViadeAdm(String viadeAdm) {
        this.viadeAdm = viadeAdm;
    }
  
 public class Posologia{
     private String usuarios;
     private Integer dosis;
     private Integer periodo;
     private String recomendaciones;

        public Posologia() {
        }

        public String getUsuarios() {
            return usuarios;
        }

        public void setUsuarios(String usuarios) {
            this.usuarios = usuarios;
        }

        public Integer getDosis() {
            return dosis;
        }

        public void setDosis(Integer dosis) {
            this.dosis = dosis;
        }

        public Integer getPeriodo() {
            return periodo;
        }

        public void setPeriodo(Integer periodo) {
            this.periodo = periodo;
        }

        public String getRecomendaciones() {
            return recomendaciones;
        }

        public void setRecomendaciones(String recomendaciones) {
            this.recomendaciones = recomendaciones;
        }
        //metodo imprimir
        public void imprimir(){
        System.out.println("Usuarios: " + usuarios);
        System.out.println("Dosis: " + dosis + " mg");
        System.out.println("Periodo: " + periodo + " horas");
        System.out.println("Recomendaciones: " + recomendaciones);
        }
    }

    public Medicamento() {
    }

   
    
    
    //metodos
    public void imprimir(){
    System.out.println("Nombre del medicamento: " + nombreMedicamento );
    System.out.println("Fabricante del medicamento: " + fabricanteMedicamento);
    System.out.println("Via de administracion: " + viadeAdm);
    }
 
}
