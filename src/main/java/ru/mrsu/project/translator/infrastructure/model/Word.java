package ru.mrsu.project.translator.infrastructure.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Word {

    private Long id;
    private String russianWord;
    private String mokshanWord;
    private String erzyanWord;
}
