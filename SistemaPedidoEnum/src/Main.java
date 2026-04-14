void main() {
    Pedido pedido = new Pedido(123, "arthur", StatusPedido.AGUARDANDO_PAGAMENTO);

    pedido.avancarStatus(pedido);
    IO.println(pedido.getStatus());

    pedido.avancarStatus(pedido);
    IO.println(pedido.getStatus());

    pedido.cancelarPedido(pedido);
    IO.println(pedido.getStatus());
}
