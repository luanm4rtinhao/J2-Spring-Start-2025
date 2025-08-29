package application.model;

import jakarta.persistence.Entity;
import Jakarta.persistence.id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@NoArgsConstructor
@Entity
public class Tarefa {
    @id
    private long id;
    private String nome;

    public Tarefa(long id, String nome){
        this.setId(id);
        this.setNome(nome);
    }
}