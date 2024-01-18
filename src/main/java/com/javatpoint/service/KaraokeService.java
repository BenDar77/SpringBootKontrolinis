package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;

import com.javatpoint.model.Karaoke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.repository.KaraokeRepository;

@Service
public class KaraokeService
{
@Autowired
KaraokeRepository karaokeRepository;

public List<Karaoke> getAllSongs()
{
List<Karaoke> songs = new ArrayList<Karaoke>();
karaokeRepository.findAll().forEach(songs::add);
return songs;
}

public Karaoke getSongsById(int id)
{
return karaokeRepository.findById(id).get();
}

public void saveOrUpdate(Karaoke karaoke)
{
karaokeRepository.save(karaoke);
}

public void delete(int id) 
{
karaokeRepository.deleteById(id);
}

public void update(Karaoke karaoke, int uuid)
{
karaokeRepository.save(karaoke);
}
}