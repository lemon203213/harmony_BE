package com.example.harmony.domain.gallery.service;

import com.example.harmony.domain.gallery.repository.GalleryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GalleryCommentService {

    private final GalleryRepository galleryRepository;
}