package ru.mrsu.project.translator.output.postgres;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.mrsu.project.translator.output.postgres.entity.WordEntity;

public interface WordRepository extends JpaRepository<WordEntity, Integer> {}
