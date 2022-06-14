package br.utfpr.gof.AAExerc2.n2;

public class Relatorio {
    public void imprime(Iterator iterator, String descricao) {
        System.out.println("-------"+descricao+"--------");
        while (iterator.hasNext()) {
            Sala sala = (Sala) iterator.next();
            System.out.println(sala.getDescricao());
        }
    }

    public void imprimeSubsalas(Iterator iterator) {
        ComponentesSubsalas salasGerais = new Subsalas("SALAS");
        ComponentesSubsalas salasA = new Subsalas("SALA A");
        ComponentesSubsalas salasB = new Subsalas("SALA B");
        ComponentesSubsalas salasB1 = new Subsalas("SALA B 1");

        while (iterator.hasNext()) {
            Sala sala = (Sala) iterator.next();
            if ("Sala A".equals(sala.getSubsala())) {
                salasA.add(sala);
            } else if ("Sala B".equals(sala.getSubsala())) {
                salasB.add(sala);
            }else if ("Sala B 1".equals(sala.getSubsala())) {
                salasB1.add(sala);
            } else {
                salasGerais.add(sala);
            }
        }
        salasGerais.add(salasA);
        salasB.add(salasB1);
        salasGerais.add(salasB);

        salasGerais.print("-");
    }

}
