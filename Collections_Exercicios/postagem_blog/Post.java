public class Post implements Comparable<Post>{
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post (Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public Categorias getCategoria() {
        return this.categoria;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int compareTo(Post o) {
        return getTitulo().compareTo(o.getTitulo());
    }

    @Override
    public String toString() {
        return this.titulo;
    }
}
