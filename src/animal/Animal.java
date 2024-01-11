package animal;

public class Animal {
    protected String name; //名前のフィールド
    protected int age; //年齢のフィールド
  
    //引数なしのコンストラクタ
    public Animal() {
    }

    // 引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //sayメソッド
    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");
    }
    

}
