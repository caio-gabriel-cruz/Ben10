package br.com.etecia.ben10;

public class alien {
    private String nome;
    private int image;

    public alien(String nome, int image) {
        this.nome = nome;
        this.image = image;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
