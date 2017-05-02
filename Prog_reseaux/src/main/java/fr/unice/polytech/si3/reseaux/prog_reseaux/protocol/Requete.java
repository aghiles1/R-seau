package fr.unice.polytech.si3.reseaux.prog_reseaux.protocol;

/**
 * Created by User on 02/05/2017.
 */
public class Requete {
    private String type;
    private Object data;

    public Requete(String type, Object data){
        this.type = type;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Requete{" +
                "type='" + type.toString() + '\'' +
                ", data=" + data.toString() +
                '}';
    }
}
