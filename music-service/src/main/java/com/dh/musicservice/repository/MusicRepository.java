package com.dh.musicservice.repository;

import com.dh.musicservice.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends JpaRepository<Song, Integer> {
	List<Song> findAllByGenre(String genre);
}
