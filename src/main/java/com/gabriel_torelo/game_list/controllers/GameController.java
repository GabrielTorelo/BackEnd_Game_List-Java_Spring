package com.gabriel_torelo.game_list.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gabriel_torelo.game_list.dto.GameLongDTO;
import com.gabriel_torelo.game_list.dto.GameMinDTO;
import com.gabriel_torelo.game_list.dto.GameShortDTO;
import com.gabriel_torelo.game_list.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> readAll() {
        return gameService.readAll();
    }

    @GetMapping(value = "/{id}")
    public GameShortDTO readID(@PathVariable Long id) {
        return gameService.readID(id);
    }

    @GetMapping(value = "/{id}/more_about")
    public GameLongDTO readMoreID(@PathVariable Long id) {
        return gameService.readMoreID(id);
    }
}
