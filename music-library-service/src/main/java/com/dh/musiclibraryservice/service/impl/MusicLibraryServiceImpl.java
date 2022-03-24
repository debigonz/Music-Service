package com.dh.musiclibraryservice.service.impl;

import com.dh.musiclibraryservice.model.SongWS;
import com.dh.musiclibraryservice.repository.feign.MusicFeignRepository;
import com.dh.musiclibraryservice.service.MusicLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicLibraryServiceImpl implements MusicLibraryService {
	private MusicFeignRepository musicFeignRepository;

	@Autowired
	public MusicLibraryServiceImpl(MusicFeignRepository musicFeignRepository) {
		this.musicFeignRepository = musicFeignRepository;
	}

	@Override
	public List<SongWS> getSongsByGenre(String genre) {
		return musicFeignRepository.getSongsByGenre(genre);
	}
}
