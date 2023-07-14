package com.gabriel_torelo.game_list.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gabriel_torelo.game_list.dto.GameMinDTO;
import com.gabriel_torelo.game_list.entities.Game;
import com.gabriel_torelo.game_list.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> readAll() {
        List<Game> rGames = gameRepository.findAll();

        return rGames.stream().map(gameEntity -> new GameMinDTO(gameEntity)).toList();
    }
}
