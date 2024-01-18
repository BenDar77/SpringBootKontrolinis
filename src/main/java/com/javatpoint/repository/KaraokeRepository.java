package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;

import com.javatpoint.model.Karaoke;
public interface KaraokeRepository extends CrudRepository<Karaoke, Integer>
{
}
