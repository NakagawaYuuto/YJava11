

public class Character {
    String name;
    int hp;
    // 逃げる
    public void run(){
        System.out.println(this.name + "は逃げ出した。");
    }
    // 戦う
    public void attack(Matango m) {
    }
}
//        System.out.println(this.name + "の攻撃。");
/*      　１つ目の不都合。
        Heroであれば１０、Wizardであれば５などのメソッドないで内容を確定できない。
        解決方法
        １：そもそもAttackメソッドを記述しない。
        しかし継承先のクラスにAttackメソッドを書き忘れがあると攻撃できないキャラクターが出来てしまう。
        そのためAttackメソッドは必ず必要になってくる。
        「現実世界の登場人物が持つ操作」であれば、クラスもメソッドも存在須恵器である。（メソッドの処理内容が困難でも）

        対策としては、その職業に適切なAttackメソッドでオーバーライドしてもらう。
        ＝メソッドの中身は空にしておく。
*/

//        m.hp -= ??;
//        System.out.println("敵に？？ポイントのダメージを与えた。");

//        コメントとしてAttackメソッドを作成する際にコメントとして空にしていることを書いておく。
        /*
    心配事　１
    オーバーライドし忘れる。

    心配事　２
    「本当に何もしない」区別がつかない。

    心配事　３
    意図せずに new して利用されてします
 */
