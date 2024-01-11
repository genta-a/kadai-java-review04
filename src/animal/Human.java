package animal;

public class Human extends Animal implements Thinkable{
    protected String hobby; //趣味のフィールド

    //引数なしのコンストラクタ
    public Human() {
    }

    //引数ありのコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    //thinkメソッド
    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }



}
