package com.froyo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import com.froyo.domain.GameAction;
import com.froyo.domain.GameCharacter;
import com.froyo.domain.GameModule;

/**
 * Main class.
 */
public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    private static final String CHARACTERS = "characters.yaml";
    private static final String BUILDINGS = "buildings.yaml";

    private GameContext context;
    private RoundManager rMan;
    
    public Main() {

        context = new GameContext();
        rMan = new RoundManager();
    }

    public void initialiseGame() throws IOException {

        initialiseCharacters();
        initialiseModules();
        setupPlayers();
        rMan.initialise();
        
        while (!context.checkEndGameState()) {
            
            rMan.takeTurn();
            
        }
    }

    public void initialiseCharacters() throws IOException {

        try (InputStream is = this.getClass().getResourceAsStream(CHARACTERS)) {

            Constructor c = new Constructor(GameCharacter.class);
            TypeDescription td = new TypeDescription(GameCharacter.class);
            td.putListPropertyType("actions", GameAction.class);
            c.addTypeDescription(td);
            Yaml yaml = new Yaml(c);

            for (Object o : yaml.loadAll(is)) {

                GameCharacter gc = (GameCharacter) o;
                logger.info(gc.toString());
                context.addCharacter(gc);
            }

        } catch (FileNotFoundException e) {
            logger.error("Could not load config ", e);
        }
    }

    public void initialiseModules() throws IOException {

        try (InputStream is = this.getClass().getResourceAsStream(BUILDINGS)) {

            Constructor c = new Constructor(GameCharacter.class);
            TypeDescription td = new TypeDescription(GameModule.class);
            td.putListPropertyType("actions", GameModule.class);
            c.addTypeDescription(td);
            Yaml yaml = new Yaml(c);

            for (Object o : yaml.loadAll(is)) {

                GameModule gc = (GameModule) o;
                logger.info(gc.toString());
            }

        } catch (FileNotFoundException e) {
            logger.error("Could not load config ", e);
        }
    }

    public void setupPlayers() {

    }

    public static void main(String[] args) {

        Main main = new Main();
        try {
            main.initialiseGame();
        } catch (IOException e) {
            logger.info("Could not initialise game", e);
        }
    }
}
