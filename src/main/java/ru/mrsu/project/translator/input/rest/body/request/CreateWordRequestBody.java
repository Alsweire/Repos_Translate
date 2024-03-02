package ru.mrsu.project.translator.input.rest.body.request;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateWordRequestBody {
    public String russianWord;
    public String mokshanWord;
    public String erzyanWord;
}
