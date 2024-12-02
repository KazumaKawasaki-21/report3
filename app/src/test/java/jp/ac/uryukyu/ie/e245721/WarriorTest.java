package jp.ac.uryukyu.ie.e245721;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WarriorTest {
    @Test
    void attackTest() {
        int defaultHeroHp = 100;
        Warrior demoWarrior = new Warrior("デモ戦士", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);

        for(int i = 1; i<=3; i++){
            int slimeMaximumHp = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(demoWarrior.getAttack() * 1.5, slimeMaximumHp - slime.getHitPoint());
        }
    }
    
}
