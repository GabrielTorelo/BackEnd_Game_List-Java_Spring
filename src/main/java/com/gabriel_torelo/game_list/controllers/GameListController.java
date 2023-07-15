package com.gabriel_torelo.game_list.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gabriel_torelo.game_list.dto.GameListDTO;
import com.gabriel_torelo.game_list.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> readAll() {
        return gameListService.readAll();
    }

    @GetMapping(value = "/{id}")
    public GameListDTO readID(@PathVariable Long id) {
        return gameListService.readID(id);
    }
}
