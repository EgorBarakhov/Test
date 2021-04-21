package ru.itis.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.demo.models.Tag;
import ru.itis.demo.repositories.TagsRepository;

import java.util.List;

@Service
public class TagsServiceImpl implements TagsService {

    @Autowired
    private TagsRepository tagsRepository;

    @Override
    public List<Tag> getAllTags() {
        return tagsRepository.findAll();
    }
}
