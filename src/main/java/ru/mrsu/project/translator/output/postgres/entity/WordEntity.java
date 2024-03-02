package ru.mrsu.project.translator.output.postgres.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.mrsu.project.translator.infrastructure.model.Word;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "words")
public class WordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "russianword")
    private String russianWord;

    @Column(name = "mokshanword")
    private String mokshanWord;

    @Column(name = "erzyanword")
    private String erzyanWord;

    public Word toModel() {
        return new Word(id, russianWord, mokshanWord, erzyanWord);
    }
}
