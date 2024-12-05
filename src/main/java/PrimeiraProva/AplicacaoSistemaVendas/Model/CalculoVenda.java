package PrimeiraProva.AplicacaoSistemaVendas.Model;

public class CalculoVenda {
    private int codigo;
    private int quantidade;
    private float valor;
    private double desconto;
    private float valorTotal;


    public CalculoVenda() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float DefineValor(){
        float  total=0;
        if(this.getCodigo()>0 && this.getCodigo()<=10){
            this.setValor(10);
            total = this.getValor()*this.getQuantidade();
            this.setValorTotal(total);
        } else if (this.getCodigo()>10 && this.getCodigo()<=20) {
            this.setValor(15);
            total = this.getValor()*this.getQuantidade();
            this.setValorTotal(total);
        } else if (this.getCodigo()>20 && this.getCodigo()<=30) {
            this.setValor(20);
            total =this.getValor()*this.getQuantidade();
            this.setValorTotal(total);
        } else if (this.getCodigo()>30 && this.getCodigo()<=40) {
            this.setValor(30);
            total = this.getValor()*this.getQuantidade();
            this.setValorTotal(total);
        }else
            System.out.println("Código inválido");
        return total;
    }
    public double TotalFinal(){
        double totalfinal=0;
        if(this.getValorTotal()<=250){
            this.setDesconto(5.0);
           totalfinal = this.getValorTotal()-(this.getValorTotal()*(this.getDesconto()/100));
        } else if (this.getValorTotal()>250 && this.getValorTotal()<=500) {
            this.setDesconto(10.0);
            totalfinal = this.getValorTotal()-(this.getValorTotal()*(this.getDesconto()/100));
        } else if (this.getValorTotal()>500) {
            this.setDesconto(15.0);
            totalfinal = this.getValorTotal()-(this.getValorTotal()*(this.getDesconto()/100));
        }
        return totalfinal;
    }

}
