import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Transacao {
    private String descricao;
    private double valor;
    private LocalDateTime dataTransacao;

    public Transacao(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataTransacao = LocalDateTime.now();
    }

}
