package com.dh.musiclibraryservice.controller;

import com.dh.musiclibraryservice.model.SongWS;
import com.dh.musiclibraryservice.service.MusicLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/playlist")
public class MusicLibraryServiceController {
	private MusicLibraryService musicLibraryService;

	@Autowired
	public MusicLibraryServiceController(MusicLibraryService musicLibraryService) {
		this.musicLibraryService = musicLibraryService;
	}

	@GetMapping("/{genre}")
	public List<SongWS> getPlaylistByGenre(@PathVariable String genre) {
		return musicLibraryService.getSongsByGenre(genre);
	}
}
