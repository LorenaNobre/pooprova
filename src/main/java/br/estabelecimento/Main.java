package br.estabelecimento;

public class Main {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor();
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        f1.setId(2);
        f1.setNome("Qually");
        f1.setCnpj("15.684.187/0001-00");
        f1.setTelefone("31 3626-2616");

        p1.setId(5);
        p1.setNome("Manteiga");
        p1.setDescricao("Comida");
        p1.setCompra(5.0);
        p1.setVenda(4.8);
        p1.setDesconto(5.9);
        p1.setFabricante("Qually");

        p2.setId(7);
        p2.setNome("Manteiga Aerada");
        p2.setDescricao("Comida");
        p2.setCompra(4.0);
        p2.setVenda(3.8);
        p2.setDesconto(7.9);
        p2.setFabricante("Qually Alimentos");

        System.out.println("Produto 1:");
        System.out.println(p1.getId());
        System.out.println(p1.getNome());
        System.out.println(p1.getDescricao());
        System.out.println(p1.getCompra());
        System.out.println(p1.getVenda());
        System.out.println(p1.getDesconto());
        System.out.println(p1.getFabricante());







    }
}
