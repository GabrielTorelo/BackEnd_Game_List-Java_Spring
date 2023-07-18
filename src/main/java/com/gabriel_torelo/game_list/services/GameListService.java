package com.gabriel_torelo.game_list.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.gabriel_torelo.game_list.dto.GameListDTO;
import com.gabriel_torelo.game_list.entities.GameList;
import com.gabriel_torelo.game_list.projections.GameMinProjection;
import com.gabriel_torelo.game_list.repositories.GameListRepository;
import com.gabriel_torelo.game_list.repositories.GameRepository;

@Service
public class GameListService {
    
    @Autowired
    private GameListRepository gamelistRepository;

    @Autowired
    private GameRepository gameRepository;

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

    @Transactional
    public void moveGame(Long listID, int currentIndex, int newIndex) {
        List<GameMinProjection> rGameListProj = gameRepository.readListID(listID);
        GameMinProjection rGameRemvd = rGameListProj.remove(currentIndex);
        
        rGameListProj.add(newIndex, rGameRemvd);

        int startRange = currentIndex < newIndex ? currentIndex : newIndex;
        int endRange = currentIndex > newIndex ? currentIndex : newIndex;

        for (int i = startRange; i <= endRange; i++) {
            gamelistRepository.moveGameInList(listID, rGameListProj.get(i).getId(), i);
        }
    }
}
