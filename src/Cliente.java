import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    private String nome;
    private Long cpf;
    private String endereco;
    private String telefone;
    private String email;
}
