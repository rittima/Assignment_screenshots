package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	private GamingConsol game;
	
	public GameRunner(GamingConsol game) {
		this.game=game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
