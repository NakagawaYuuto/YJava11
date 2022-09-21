
public abstract class Character {
    String name;
    int hp;
    // 逃げる
    public void run(){
        System.out.println(this.name + "は逃げ出した。");
    }
    // 戦う
//    public void attack(Matango m) {
//    }
    public abstract void attack(Matango m);
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

            ２つ目の不具合
         クラスには２つの利用方法があり開発者はそれぞれを自由に選ぶことが出来る。
*/

//        m.hp -= ??;
//        System.out.println("敵に？？ポイントのダメージを与えた。");

//        コメントとしてAttackメソッドを作成する際にコメントとして空にしていることを書いておく。
        /*
    心配事　１
    オーバーライドし忘れる。
    解決策：詳細未定なメソッドを抽象メソッドとして宣言すれば、未来の開発者にオーバーライドを
    強制できる。
    （先に心配事２と３を実行しているとコンパイルエラーになる。そうすると対処は２つしかない。
    Dancerクラスの宣言にabstractを付けて抽象クラスにする。
    Dancerクラス内部の『未確定部分』をなくす。）


    心配事　２
    「本当に何もしない」区別がつかない。
    解決策：Javaには「詳細未定のメソッド」を記述する専用の構文が準備されている。
           public abstract 戻り値の型 メソッド名（引数リスト）;

    心配事　３
    意図せずに new して利用されてします
    解決策：Javaでは「未完成部分（抽象メソッド）を一つでも含むクラス」は、次の構文に従って宣言しなければならない。
    public abstract class クラス名{}
    抽象クラスは、newによるインスタンス化が禁止される。
 */

/*
詳細未確定な部分が残っているクラスはインスタンス化されてはならない。
 */
