package jp.ac.uryukyu.ie.e215710;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {

    /**
     * getterメソッド
     * hitPointを取得する
     * @return hitPoint //敵のHP
     */
    public int getHitPoint() {
        return this.hitPoint ;
    }

    /**
     * getterメソッド
     * attackを取得する
     * @return attack //敵の攻撃力
     */
    public int getAttack() {
        return this.attack ;
    }

    /**
     * setterメソッド
     * nameを変更したい時に使う
     * @param name //敵の名前
     */
    public void setName(String name) {
        this.name = name ;
    }

    /**
     * setterメソッド
     * hitPointを変更したい時に使う
     * @param hitPoint //敵のHP
     */
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint ;
    }

    /**
     * setterメソッド
     * attackを変更したい時に使う
     * @param attack //敵の攻撃力
     */
    public void setAttack(int attack) {
        this.attack = attack ;
    }

    /**
     * setterメソッド
     * deadを変更したい時に使う
     * @param dead //敵の生死状態
     */
    public void setDead(boolean dead) {
        this.dead = dead ;
    }

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack) ;
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}