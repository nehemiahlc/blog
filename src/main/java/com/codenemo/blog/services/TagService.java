package com.codenemo.blog.services;

import com.codenemo.blog.controller.TagController;
import com.codenemo.blog.domain.entities.Tag;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface TagService {
    List<Tag> getTags();
    List<Tag> createTags(Set<String> tagNames);
    void deleteTag(UUID id);
    Tag getTagByID(UUID id);
    List<Tag> getTagByIDs(Set<UUID> ids);
}
