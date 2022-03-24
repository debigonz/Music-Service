package com.dh.musiclibraryservice.repository.feign;

import com.dh.musiclibraryservice.model.SongWS;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "music-service")
public interface MusicFeignRepository {
	@GetMapping("/music/{genre}")
	List<SongWS> getSongsByGenre(@PathVariable String genre);
}
