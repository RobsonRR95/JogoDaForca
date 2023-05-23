package Modelo;

// @author Robson Rosa

public enum EnumDificuldade {
    FAC, MED, DIF;
    
    public String getDescricao() {
        switch(this) {
            case FAC: return "Facil";
            case MED: return "Medio";
            case DIF: return "Dificil";
            default : return "";
        }
    }
}
