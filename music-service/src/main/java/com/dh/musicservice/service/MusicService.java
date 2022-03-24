package com.dh.musicservice.service;

import com.dh.musicservice.model.Song;

import java.util.List;

public interface MusicService {
	List<Song> getSongsByGenre(String genre);
}
