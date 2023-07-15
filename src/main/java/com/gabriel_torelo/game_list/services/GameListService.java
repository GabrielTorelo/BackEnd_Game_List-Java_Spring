package com.gabriel_torelo.game_list.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.gabriel_torelo.game_list.dto.GameListDTO;
import com.gabriel_torelo.game_list.entities.GameList;
import com.gabriel_torelo.game_list.repositories.GameListRepository;

@Service
public class GameListService {
    
    @Autowired
    private GameListRepository gamelistRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> readAll() {
        List<GameList> rGameLists = gamelistRepository.findAll();

        return rGameLists.stream().map(gameListEntity -> new GameListDTO(gameListEntity)).toList();
    }

    @Transactional(readOnly = true)
    public GameListDTO readID(Long id) {
        GameList rGameList = gamelistRepository.findById(id).get();

        return new GameListDTO(rGameList);
    }
}
