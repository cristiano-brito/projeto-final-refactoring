package br.com.infnet.projetofinal.empresaAcme.vendedor;

import java.util.*;

public class EntradaDeDadosVendedor {
    DadosVendedor vendedor = new DadosVendedor();
    private List<Map<String, Integer>> cursos = new ArrayList<>();

    public DadosVendedor start() {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("==========================================================================");
            System.out.println("Digite a matricula");
            vendedor.setMatricula(entrada.nextLong());

            System.out.println("Digite a quantidade de vendas");
            vendedor.setQuantidadeDeVendas(entrada.nextLong());

            capturaDadosDoCurso(entrada);

            System.out.println("Meta batida? true or false");
            vendedor.isPlatinumEBateuMeta(entrada.nextBoolean());

            vendedor.calculaBonus();
            return vendedor;
        } catch (final Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            entrada.close();
        }
    }

    private void capturaDadosDoCurso(Scanner entrada) {
        Integer adicionar = adicionarCurso(entrada);
        do {
            System.out.println("Digite o nome do curso");
            String nomeCurso = entrada.next();
            System.out.println("Digite a nota do curso");
            Integer notaCurso = entrada.nextInt();

            createdCourseList(nomeCurso, notaCurso);
            adicionar = adicionarCurso(entrada);
        } while (adicionar.equals(1));
    }

    private void createdCourseList(final String nomeCurso, final Integer notaCurso) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put(nomeCurso, notaCurso);
        cursos.add(map);
        vendedor.setCursos(cursos);
    }

    private Integer adicionarCurso(Scanner entrada) {
        System.out.println("(1)Adicionar curso  (0)Sair");
        return entrada.nextInt();
    }

    public void imprimirDados() {
        System.out.println("Matricula: " + vendedor.getMatricula());
        System.out.println("Quantidade De Vendas: " + vendedor.getQuantidadeDeVendas());
        System.out.println("Bonus: " + vendedor.getBonus());

        for (Map<String, Integer> curso : vendedor.getCursos()) {
            System.out.println("Cursos: " + curso.toString());
        }
    }

    public void startVendedor() {
        EntradaDeDadosVendedor vendedor = new EntradaDeDadosVendedor();
        start();
        imprimirDados();
    }
}
