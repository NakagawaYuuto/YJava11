/*
未来に備えるための継承
高度な継承は『立場が今までの立場とは全く違うことを意識する。
前の章では元になるクラスを作っている内容だったのだが、今回は元になるクラスを使用して
他の開発者が効率よく利用できる軽傷の材料を作ること。
 */

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        Matango m = new Matango();
        h.attack(m);

    }
}
