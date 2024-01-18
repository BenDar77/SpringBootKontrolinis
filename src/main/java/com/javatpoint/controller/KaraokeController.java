package com.javatpoint.controller;
import java.util.List;

import com.javatpoint.service.KaraokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.model.Karaoke;


@RestController
public class KaraokeController
{

@Autowired
static KaraokeService karaokeService;

@GetMapping("/favourites")
private List<Karaoke> getAllSongs()
{
return karaokeService.getAllSongs();
}

@GetMapping("/favourites/{uuid}")
private Karaoke getSongs(@PathVariable("uuid") int uuid)
{
return karaokeService.getSongsById(uuid);
}

@DeleteMapping("/favourites/{uuid}")
public static void deleteSong(@PathVariable("uuid") int uuid)
{
karaokeService.delete(uuid);
}

@PostMapping("/favourites")
private int saveSong(@RequestBody Karaoke karaoke)
{
karaokeService.saveOrUpdate(karaoke);
return karaoke.setUuid();
}

@PutMapping("/favourites")
private Karaoke update(@RequestBody Karaoke karaoke)
{
karaokeService.saveOrUpdate(karaoke);
return karaoke;
}
}
