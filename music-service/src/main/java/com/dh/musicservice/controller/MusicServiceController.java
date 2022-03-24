package com.dh.musicservice.controller;

import com.dh.musicservice.model.Song;
import com.dh.musicservice.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/music")
public class MusicServiceController {
	private MusicService musicService;

	@Autowired
	public MusicServiceController(MusicService musicService) {
		this.musicService = musicService;
	}

	@GetMapping("/{genre}")
	public List<Song> getSongsByGenre(@PathVariable String genre) {
		return musicService.getSongsByGenre(genre);
	}
}
