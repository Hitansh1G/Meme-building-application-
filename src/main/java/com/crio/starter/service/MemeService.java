package com.crio.starter.service;

import com.crio.starter.exchange.MemeDto;
import com.crio.starter.exchange.MemeRequestDto;

import java.util.List;

public interface MemeService {
    boolean isDuplicateMeme(MemeRequestDto memeRequestDto);
    String addMeme(MemeRequestDto memeRequestDto);
    List<MemeDto> getMemes();

    MemeDto getMemeById(String id);
}