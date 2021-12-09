package jp.ac.uryukyu.ie.e215710;

/**
 * Warriorクラス。
 *  String name; //Warriorの名前
 *  int hitPoint; //WarriorのHP
 *  int attack; //Warriorの攻撃力
 *  boolean dead; //Warriorの生死状態。true=死亡。
 */
public class Warrior extends Hero {

    /**
     * attackの150%を固定ダメージとして
     * 与えるメソッド。
     * @param o 攻撃対象
     */
    public void attackWithWeponSkill(LivingThing o) {
        int result = (int) (attack * 1.5) ;
        if (hitPoint > 0) {
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, o.getName(), result) ;
            o.wounded(result);
        }
    }

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name Warrior名
     * @param maximumHP WarriorのHP
     * @param attack Warriorの攻撃力
     */
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack) ;
    }
}