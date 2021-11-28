package jp.ac.uryukyu.ie.e215710;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /**
    * attackWithWeponSkillを3回実行し、
    * 3回ともattackの150％ダメージになっていることを検証。
    * （１）ヒーローと敵を準備。ヒーローはWarrior型とする
    * （２）ヒーローが攻撃し、敵が攻撃する。
    * （３）ヒーローの攻撃力は3回ともattackの150％になっていることを期待。
    */
    @Test
    void attackWithWeponSkillTest() {
        int defaultHeroHp = 100 ;
        int defaultEnemyHp = 100 ;
        int attackHero = 10 ;
        int attackEnemy = 10 ;
        Warrior superHero = new Warrior("スーパーヒーロー", defaultHeroHp, attackHero) ;
        Enemy lucifer = new Enemy("ルシファー", defaultEnemyHp, attackEnemy) ;

        for(int i=0; i<3; i++) {
            int enemyHp = lucifer.getHitPoint() ;
            superHero.attackWithWeponSkill(lucifer) ;
            lucifer.attack(superHero) ;
            int takenEnemyHp = lucifer.getHitPoint() ;
            int result = enemyHp - takenEnemyHp ;
            assertEquals((int)(attackHero*1.5), result);
        }
    }
}