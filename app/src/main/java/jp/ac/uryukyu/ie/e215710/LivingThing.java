package jp.ac.uryukyu.ie.e215710;


/**
 *  LivingThingクラス。
 *  String name; //LivingThingの名前
 *  int hitPoint; //LivingThingのHP
 *  int attack; //LivingThingの攻撃力
 *  boolean dead; //LivingThingの生死状態。true=死亡。
 */

public class LivingThing {
    String name ;
    int hitPoint ;
    int attack ;
    boolean dead ;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name LivingThing名
     * @param maximumHP LivingThingのHP
     * @param attack LivingThingの攻撃力
     */
    public LivingThing(String name, int maximumHP, int attaack) {
        this.name = name ;
        hitPoint = maximumHP ;
        this.attack = attaack ;
        dead = false ;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attaack) ;
    }

    /**
     * getterメソッド
     * deadを取得する
     * @return dead
     */
    public boolean isDead() {
        return this.dead ;
    }

    /**
     * getterメソッド
     * nameを取得する
     * @return name
     */
    public String getName() {
        return this.name ;
    }

    /**
     * getterメソッド
     * hitPointを取得する
     * @return hitPoint
     */
    public int getHitPoint() {
        return this.hitPoint ;
    }

    /**
      * getterメソッド
      * attackを取得する
      * @return attack
      */
      public int getAttack() {
        return this.attack ;
    }

    /**
      * setterメソッド
      * nameを変更したい時に使う
      * @param name
      */
      public void setName(String name) {
        this.name = name ;
    }

    /**
      * setterメソッド
      * hitPointを変更したい時に使う
      * @param hitPoint
      */
      public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint ;
    }

    /**
      * setterメソッド
      * attackを変更したい時に使う
      * @param attack
      */
      public void setAttack(int attack) {
        this.attack = attack ;
    }

    /**
      * setterメソッド
      * deadを変更したい時に使う
      * @param dead
      */
      public void setDead(boolean dead) {
        this.dead = dead ;
    }
    /**
     * LivingThingへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent) {
        int damage = (int)(Math.random() * attack) ;
        if (hitPoint > 0) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage ;
        if (hitPoint <= 0) {
            dead = true ;
            System.out.printf("%sは倒れた。\n", name) ;
        }
    }
}
