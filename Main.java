public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("Hora da Estrela", "Clarice Lispector");
        livro1.emprestar();
        livro1.emprestar();
        livro2.emprestar();
        livro2.emprestar();
    }
}
