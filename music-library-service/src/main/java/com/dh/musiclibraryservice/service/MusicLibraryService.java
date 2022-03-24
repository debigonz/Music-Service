package com.dh.musiclibraryservice.service;

import com.dh.musiclibraryservice.model.SongWS;

import java.util.List;

public interface MusicLibraryService {
	List<SongWS> getSongsByGenre(String genre);
}
