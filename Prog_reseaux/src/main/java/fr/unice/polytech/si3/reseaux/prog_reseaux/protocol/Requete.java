package fr.unice.polytech.si3.reseaux.prog_reseaux.protocol;

import java.io.Serializable;

/**
 * @author Elie Baroghel
 */
public class Requete implements Serializable {
	private static final long serialVersionUID = -3978544806684841938L;
	
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
                "type='" + type + '\'' +
                ", data=" + data.toString() +
                '}';
    }
}
