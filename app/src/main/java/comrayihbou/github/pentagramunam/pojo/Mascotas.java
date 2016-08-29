package comrayihbou.github.pentagramunam.pojo;

/**
 * Created by rayih on 11/06/2016.
 */
public class Mascotas {

    private String Nombre;
    private int Likes;
    private int Foto;

    public Mascotas(int Foto, String Nombre, int Likes){
        this.Foto       = Foto;
        this.Nombre     = Nombre;
        this.Likes      = Likes;
    }

    public int getFoto() {
        return Foto;
    }

    public void setFoto(int foto) {
        Foto = foto;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int likes) {
        Likes = likes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


}
