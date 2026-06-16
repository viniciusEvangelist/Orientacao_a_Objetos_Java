public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
    public void emprestar(){
        if (disponivel){
            disponivel = false;
            System.out.println("o livro " + titulo + " do autor " + autor + " foi emprestado com sucesso");
        }
        else {
            System.out.println("indisponivel");
        }
    }
    public void devolver(){
        if(!disponivel){
            disponivel = true;
            System.out.println("livro devolvido com sucesso");
        }
        else {
            System.out.println("esse livro não foi emprestado");
        }
    }
}
