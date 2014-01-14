spacecorp
=========

Overview
--------

* Luna - currency for spending within the game
* Module - unit that makes up a spacestation

Aim of the game is to construct a spacestation with a number of modules
Once that happens

Resources
---------

SnakeYaml Reference - http://code.google.com/p/snakeyaml/wiki/Documentation#Type_safe_collections

* Main - manages the game state (start, in-progress, end)
* RoundManager - manages the individual player turns, deals with other events during that time
* GameContext - manages the context of the game, where the character are, buildings and current players
* Player - contains a list of buildings and data related to the player (points etc...)

Main -> GameContext
Main -> RoundManager -> Gamecontext 

Game Rules - how they are represented
* http://www.slideshare.net/ecspike/game-programming-with-groovy
* Slick 2D Game Library - http://slick.ninjacave.com/
* Tiled Map Editor - http://www.mapeditor.org/
* LWJGL - http://lwjgl.org/