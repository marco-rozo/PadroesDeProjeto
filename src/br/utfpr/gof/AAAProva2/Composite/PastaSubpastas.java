package br.utfpr.gof.AAAProva2.Composite;

import java.util.ArrayList;

public class PastaSubpastas {
    private ArrayList<Arquivo> arquivoArrayList;

    public PastaSubpastas() {
        arquivoArrayList = new ArrayList<Arquivo>();
        addArquivo("foto.jpeg",  "FOTOS", "50kb");
        addArquivo("imagem.png",  "FOTOS", "128kb");
        addArquivo("trabalho.word",  "DOCUMENTOS", "12mb");
        addArquivo("prova.pdf",  "DOCUMENTOS", "24gb");
    }
    
    public void addArquivo(String nome, String subastas, String tamanho) {
        Arquivo arquivo = new Arquivo(nome, subastas, tamanho);
        arquivoArrayList.add(arquivo);
    }

//    public void addInfoArquivos(String tamanho, String subastas) {
//        Arquivo arquivo = new Arquivo(tamanho, subastas);
//        pastaArrayList.add(arquivo);
//    }
    
    public ArrayList<Arquivo> getPastas() {
        return arquivoArrayList;
    }
    
    public Iterator createIterator() {
        return new PastaIterator(arquivoArrayList);
    }
}
