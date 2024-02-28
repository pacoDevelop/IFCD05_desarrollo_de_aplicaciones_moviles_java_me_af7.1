package ejercicio2;

public enum EstadoCivil {
    SOLTERO ("Persona Soltera"),
    CASADO ("Persona Casada"),
    VIUDO ("Persona Viuda"),
    DIVORCIADO ("Persona Divorciada");
    
    private String alias;

    private EstadoCivil(String alias){
        this.alias = alias;
    }

    public String getAlias(){
        return alias;
    }
}
