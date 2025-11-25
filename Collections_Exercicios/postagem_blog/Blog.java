import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet ;
import java.util.Map;
import java.util.TreeMap ;
public class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        for(Post temp: this.posts) {
            if(temp.compareTo(post) == 0) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        this.posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> result = new TreeSet <>();
        for(Post post: posts) {
            result.add(post.getAutor());
        }
        return result;
    }

    public Set<Post> obterPostsPorAutor (Autor autor) {
        Set<Post> set = new TreeSet<>();
        for (Post post: posts) {
            if (post.getAutor().compareTo(autor) == 0) {
                set.add(post);
            }
        }
        return set;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> result = new TreeMap <>();
        for(Post post: posts) {
            Integer numCat = result.get(post.getCategoria());
            if(numCat == null) {
                result.put(post.getCategoria(), Integer.valueOf(1));
            } else {
                result.put(post.getCategoria(), Integer.valueOf(numCat.intValue() + 1));
            }
        }
        return result;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> result = new TreeSet <>();
        for(Post post: posts) {
            if(post.getCategoria() == categoria) {
                result.add(post);
            }
        }
        return result;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> result = new TreeMap <>();
        for(Post post: posts) {
            Set<Post> set = result.get(post.getCategoria());
            if(set == null) {
                set =  new TreeSet <>();
                set.add(post);
                result.put(post.getCategoria(), set);
            } else {
                set.add(post);
                result.put(post.getCategoria(), set);
            }
        }
        return result;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> result = new TreeMap <>();
        for(Post post: posts) {
            Set<Post> set = result.get(post.getAutor());
            if(set == null) {
                set =  new TreeSet <>();
                set.add(post);
                result.put(post.getAutor(), set);
            } else {
                set.add(post);
                result.put(post.getAutor(), set);
            }
        }
        return result;
    }
}
