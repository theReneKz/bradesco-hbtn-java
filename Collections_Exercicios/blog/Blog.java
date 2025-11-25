import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
public class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        this.posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> result = new HashSet<>();
        for(Post post: posts) {
            result.add(post.getAutor());
        }
        return result;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> result = new HashMap<>();
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
}
