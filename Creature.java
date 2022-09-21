/*
インターフェースは自動的にpublicになりabstractになるというルールがある
クラスの仲間で『抽象クラスの親玉でみたいなもの』
インターフェースでは「public static final」だけは宣言が許され、
なおかつ「public static final」は書かなくても補われる。
インターフェースとは『内部実装をいっさい定義しない』という性質がある。（多重継承が許されている）
しかし多重継承は誤用されやすく危険なためやめた方がいい。

同種（クラス同士、インターフェース同士）の継承ならextends（拡張）を使い
異種ならimplements（実装）を使う
＊一緒に利用する場合もある。
*/

public interface Creature {
    void run();
}
