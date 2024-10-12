public class Livro {
    private String name;
    private String author;
    private boolean available;

    public Livro(String name, String author) {
        this.setName(name);
        this.setAuthor(author);
        this.setAvailable(true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Livro: \n"+
                "Titulo: "+ name +
                "\nAutor: "+ author +
                "\nDisponibilidade: " + available;

    }
}
