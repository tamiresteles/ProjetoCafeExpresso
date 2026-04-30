public class Pedido {

    private List<Produto> itens = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        itens.add(produto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Produto p : itens) {
            total += p.getPreco();
        }

        return total;
    }
}