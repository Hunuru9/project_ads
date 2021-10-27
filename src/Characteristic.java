public class Characteristic {
    
    private String name;
    private String description;
    private boolean ativa;
    private int n_salas;
    private boolean gestao_aulas;
    private boolean gestao_pedido_sala;
    
    public Characteristic(String name, String description, boolean ativa, int n_salas, boolean gestao_aulas, boolean gestao_pedido_sala) {
        this.name = name;
        this.description = description;
        this.ativa = ativa;
        this.n_salas = n_salas;
        this.gestao_aulas = gestao_aulas;
        this.gestao_pedido_sala = gestao_pedido_sala;
    }
}
