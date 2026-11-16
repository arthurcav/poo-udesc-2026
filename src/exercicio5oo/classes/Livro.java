package exercicio5oo.classes;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean emprestado;

    public Livro() {
    }

    public Livro(String titulo, String autor, String genero, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        setEmprestado(emprestado);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean getEmprestado() {
        return this.emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        if (emprestado && estaDisponivel()) {
            this.emprestado = true;
        } else if (!emprestado && !estaDisponivel()) {
            this.emprestado = false;
        }
    }

    public void emprestar() {
        setEmprestado(true);
    }

    public void devolver() {
        setEmprestado(false);
    }

    public boolean estaDisponivel() {
        return !this.emprestado;
    }

    @Override
    public String toString() {
        return "Livro{titulo='" + this.titulo + "', autor='" + this.autor
                + "', genero='" + this.genero + "', emprestado=" + this.emprestado + "}";
    }
}
