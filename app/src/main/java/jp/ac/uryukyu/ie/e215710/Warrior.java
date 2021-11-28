package jp.ac.uryukyu.ie.e215710;

public class Warrior extends Hero {
    public void attackWithWeponSkill(LivingThing o) {
        int result = (int) (attack * 1.5) ;
        if (hitPoint > 0) {
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, o.getName(), result) ;
            o.wounded(result);
        }
    }

    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack) ;
    }
}