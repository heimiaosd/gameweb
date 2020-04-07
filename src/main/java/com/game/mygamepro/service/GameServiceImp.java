package com.game.mygamepro.service;

import com.game.mygamepro.dao.GameRepository;
import com.game.mygamepro.po.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImp implements GameService {
   @Autowired
   private GameRepository gameRepository;

    @Override
    public Game findName(String name) {
        return gameRepository.findByName(name);
    }
}
