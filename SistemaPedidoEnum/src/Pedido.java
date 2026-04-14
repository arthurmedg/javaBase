import java.util.Scanner;

public class Pedido {
    private int id;
    private String cliente;
    private StatusPedido status;

    public Pedido(int id, String cliente, StatusPedido status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }

    Scanner sc = new Scanner(System.in);


    public void avancarStatus(Pedido pedido) {
        IO.println("Status do Pedido");
        if (StatusPedido.AGUARDANDO_PAGAMENTO == pedido.getStatus()) {
            setStatus(StatusPedido.PROCESSANDO);
        } else if (StatusPedido.PROCESSANDO == pedido.getStatus()) {
            setStatus(StatusPedido.ENVIADO);
        } else if (StatusPedido.ENVIADO == pedido.getStatus()) {
            setStatus(StatusPedido.ENTREGUE);
        } else {
            IO.println("O status do pedido não pode ser mais alterado");
        }
    }

    public void cancelarPedido(Pedido pedido){
        if (StatusPedido.ENTREGUE == pedido.getStatus() ){
            IO.println("O pedido não pode ser cancelado pois ja foi entregue!");
        } else {
            setStatus(StatusPedido.CANCELADO);
            IO.println("Status atual: " + status);
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", status=" + status +
                '}';
    }
}
