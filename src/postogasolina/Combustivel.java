package postogasolina;

public class Combustivel {
    private String tipo;
    private int estoque;
    private int limiteEstoque;

    public Combustivel(String tipo, int limiteEstoque) {
        this.tipo = tipo;
        this.limiteEstoque = limiteEstoque;
        this.estoque = 0;
    }
    
        public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    public int getLimiteEstoque() {
        return limiteEstoque;
    }
    
    public void setLimiteEstoque(int limiteEstoque) {
        this.limiteEstoque = limiteEstoque;
    }

    public int reporEstoque(int quantidade) {
        if (quantidade < 0) {
            return 0;
        }
        
        int total = this.getEstoque() + quantidade;
        
        if (total > this.getLimiteEstoque()) {
            int naoCabe = this.getLimiteEstoque() - total;
            total = total - naoCabe;
            this.setEstoque(total);
        } else {
            this.setEstoque(quantidade);
        }
        return this.getEstoque();
    }

    public int abastecerVeiculo(int quantidade) {
        if (quantidade < 0) {
            return 0;
        }
        if (quantidade <= this.getEstoque()) {
            this.setEstoque(this.getEstoque() - quantidade);
            return quantidade;
        } else {
            int quantidadeDisponivel = this.getEstoque();
            this.setEstoque(0);
            return quantidadeDisponivel;
        }
    }

    public int mostrarEstoque() {
        return this.getEstoque();
    }
}

