package br.utfpr.gof.AAAProva2.Composite;

public class Relatorio {

    public void imprimeSubsalas(Iterator iterator) {
        ComponentesSubpastas pastas = new Subpastas("PASTAS");
        ComponentesSubpastas fotos = new Subpastas("FOTOS");
        ComponentesSubpastas documentos = new Subpastas("DOCUMENTOS");
        ComponentesSubpastas salasB1 = new Subpastas("SALA B 1");

        while (iterator.hasNext()) {
            Arquivo arquivo = (Arquivo) iterator.next();
            if ("FOTOS".equals(arquivo.getSubpasta())) {
                fotos.add(arquivo);
            } else if ("DOCUMENTOS".equals(arquivo.getSubpasta())) {
                documentos.add(arquivo);
            } else {
                pastas.add(arquivo);
            }

//            if ("Sala B".equals(pasta.getSubsala())) {
//                salasB.add(pasta);
//            }else if ("Sala B 1".equals(pasta.getSubsala())) {
//                salasB1.add(pasta);
//            } else {
//                salasGerais.add(pasta);
//            }
        }
        pastas.add(fotos);
        pastas.add(documentos);

        pastas.print("-");
    }

}
