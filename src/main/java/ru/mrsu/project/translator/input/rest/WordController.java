package ru.mrsu.project.translator.input.rest;

import org.springframework.web.bind.annotation.*;
import ru.mrsu.project.translator.infrastructure.model.Word;
import ru.mrsu.project.translator.infrastructure.service.WordService;
import ru.mrsu.project.translator.input.rest.body.request.CreateWordRequestBody;

import java.util.List;

@RestController
@RequestMapping("/words")
public class WordController {
    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @PutMapping
    public Word create(@RequestBody CreateWordRequestBody requestBody){
        return wordService.create(requestBody.russianWord, requestBody.mokshanWord, requestBody.erzyanWord);
    }


    @GetMapping
    public List<Word> getAll() {
        return wordService.getAll();
    }

    @GetMapping("/rus")
    public Word getByRussianWord(@RequestParam String russianWord){
        return wordService.getByRussianWord(russianWord);
    }
}
