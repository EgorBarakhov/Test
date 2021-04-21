package ru.itis.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.demo.models.Tag;

public interface TagsRepository extends JpaRepository<Tag, Long> {
}
