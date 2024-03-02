package ru.mrsu.project.translator.infrastructure.service;

import org.springframework.stereotype.Service;
import ru.mrsu.project.translator.infrastructure.model.Word;
import ru.mrsu.project.translator.output.postgres.WordRepository;
import ru.mrsu.project.translator.output.postgres.entity.WordEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class WordService {
    private final WordRepository wordRepository;

    public WordService(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    public Word create(String russianWord, String mokshanWord, String erzyanWord) {
        WordEntity entity = new WordEntity(null, russianWord, mokshanWord, erzyanWord);
        return wordRepository.save(entity).toModel();
    }

    public List<Word> getAll() {
        return wordRepository.findAll()
                .stream()
                .map(WordEntity::toModel)
                .toList();
    }

    public Word getByRussianWord(String russianWord) {
        return wordRepository.findAll()
                .stream()
                .filter(entity -> Objects.equals(entity.getRussianWord(), russianWord))
                .findFirst()
                .orElseThrow()
                .toModel();
    }
}

